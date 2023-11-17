package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.medallia.digital.mobilesdk.C10749b8;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: androidx.core.app.n */
public abstract class C0720n extends Service {
    static final boolean DEBUG = false;
    static final String TAG = "JobIntentService";
    static final HashMap<ComponentName, C0729h> sClassWorkEnqueuer = new HashMap<>();
    static final Object sLock = new Object();
    final ArrayList<C0724d> mCompatQueue;
    C0729h mCompatWorkEnqueuer;
    C0721a mCurProcessor;
    boolean mDestroyed = false;
    boolean mInterruptIfStopped = false;
    C0722b mJobImpl;
    boolean mStopped = false;

    /* renamed from: androidx.core.app.n$a */
    final class C0721a extends AsyncTask {
        C0721a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0725e dequeueWork = C0720n.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                C0720n.this.onHandleWork(dequeueWork.getIntent());
                dequeueWork.mo3185b();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            C0720n.this.processorFinished();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            C0720n.this.processorFinished();
        }
    }

    /* renamed from: androidx.core.app.n$b */
    interface C0722b {
        /* renamed from: a */
        IBinder mo3179a();

        /* renamed from: b */
        C0725e mo3180b();
    }

    /* renamed from: androidx.core.app.n$c */
    static final class C0723c extends C0729h {

        /* renamed from: d */
        private final Context f3304d;

        /* renamed from: e */
        private final PowerManager.WakeLock f3305e;

        /* renamed from: f */
        private final PowerManager.WakeLock f3306f;

        /* renamed from: g */
        boolean f3307g;

        /* renamed from: h */
        boolean f3308h;

        C0723c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3304d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3305e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3306f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3181a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f3319a);
            if (this.f3304d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3307g) {
                        this.f3307g = true;
                        if (!this.f3308h) {
                            this.f3305e.acquire(C10749b8.C10751b.f30743b);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo3182c() {
            synchronized (this) {
                if (this.f3308h) {
                    if (this.f3307g) {
                        this.f3305e.acquire(C10749b8.C10751b.f30743b);
                    }
                    this.f3308h = false;
                    this.f3306f.release();
                }
            }
        }

        /* renamed from: d */
        public void mo3183d() {
            synchronized (this) {
                if (!this.f3308h) {
                    this.f3308h = true;
                    this.f3306f.acquire(600000);
                    this.f3305e.release();
                }
            }
        }

        /* renamed from: e */
        public void mo3184e() {
            synchronized (this) {
                this.f3307g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.n$d */
    final class C0724d implements C0725e {

        /* renamed from: a */
        final Intent f3309a;

        /* renamed from: b */
        final int f3310b;

        C0724d(Intent intent, int i) {
            this.f3309a = intent;
            this.f3310b = i;
        }

        /* renamed from: b */
        public void mo3185b() {
            C0720n.this.stopSelf(this.f3310b);
        }

        public Intent getIntent() {
            return this.f3309a;
        }
    }

    /* renamed from: androidx.core.app.n$e */
    interface C0725e {
        /* renamed from: b */
        void mo3185b();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.n$f */
    static final class C0726f extends JobServiceEngine implements C0722b {

        /* renamed from: a */
        final C0720n f3312a;

        /* renamed from: b */
        final Object f3313b = new Object();

        /* renamed from: c */
        JobParameters f3314c;

        /* renamed from: androidx.core.app.n$f$a */
        final class C0727a implements C0725e {

            /* renamed from: a */
            final JobWorkItem f3315a;

            C0727a(JobWorkItem jobWorkItem) {
                this.f3315a = jobWorkItem;
            }

            /* renamed from: b */
            public void mo3185b() {
                synchronized (C0726f.this.f3313b) {
                    JobParameters jobParameters = C0726f.this.f3314c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3315a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f3315a.getIntent();
            }
        }

        C0726f(C0720n nVar) {
            super(nVar);
            this.f3312a = nVar;
        }

        /* renamed from: a */
        public IBinder mo3179a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f3312a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.C0720n.C0726f.C0727a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.C0720n.C0725e mo3180b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f3313b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f3314c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.n r2 = r3.f3312a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.n$f$a r0 = new androidx.core.app.n$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0720n.C0726f.mo3180b():androidx.core.app.n$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f3314c = jobParameters;
            this.f3312a.ensureProcessorRunningLocked(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean doStopCurrentWork = this.f3312a.doStopCurrentWork();
            synchronized (this.f3313b) {
                this.f3314c = null;
            }
            return doStopCurrentWork;
        }
    }

    /* renamed from: androidx.core.app.n$g */
    static final class C0728g extends C0729h {

        /* renamed from: d */
        private final JobInfo f3317d;

        /* renamed from: e */
        private final JobScheduler f3318e;

        C0728g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo3189b(i);
            this.f3317d = new JobInfo.Builder(i, this.f3319a).setOverrideDeadline(0).build();
            this.f3318e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3181a(Intent intent) {
            JobScheduler jobScheduler = this.f3318e;
            JobInfo jobInfo = this.f3317d;
            C0741t.m2791a();
            int unused = jobScheduler.enqueue(jobInfo, C0739s.m2789a(intent));
        }
    }

    /* renamed from: androidx.core.app.n$h */
    static abstract class C0729h {

        /* renamed from: a */
        final ComponentName f3319a;

        /* renamed from: b */
        boolean f3320b;

        /* renamed from: c */
        int f3321c;

        C0729h(ComponentName componentName) {
            this.f3319a = componentName;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo3181a(Intent intent);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3189b(int i) {
            if (!this.f3320b) {
                this.f3320b = true;
                this.f3321c = i;
            } else if (this.f3321c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f3321c);
            }
        }

        /* renamed from: c */
        public void mo3182c() {
        }

        /* renamed from: d */
        public void mo3183d() {
        }

        /* renamed from: e */
        public void mo3184e() {
        }
    }

    public C0720n() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        enqueueWork(context, new ComponentName(context, cls), i, intent);
    }

    static C0729h getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        C0729h hVar;
        HashMap<ComponentName, C0729h> hashMap = sClassWorkEnqueuer;
        C0729h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C0723c(context, componentName);
        } else if (z) {
            hVar = new C0728g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0729h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    public C0725e dequeueWork() {
        C0722b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo3180b();
        }
        synchronized (this.mCompatQueue) {
            if (this.mCompatQueue.size() <= 0) {
                return null;
            }
            C0725e remove = this.mCompatQueue.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean doStopCurrentWork() {
        C0721a aVar = this.mCurProcessor;
        if (aVar != null) {
            aVar.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    /* access modifiers changed from: package-private */
    public void ensureProcessorRunningLocked(boolean z) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new C0721a();
            C0729h hVar = this.mCompatWorkEnqueuer;
            if (hVar != null && z) {
                hVar.mo3183d();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(Intent intent) {
        C0722b bVar = this.mJobImpl;
        if (bVar != null) {
            return bVar.mo3179a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new C0726f(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0724d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.mo3182c();
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void onHandleWork(Intent intent);

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.mo3184e();
        synchronized (this.mCompatQueue) {
            ArrayList<C0724d> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0724d(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public void processorFinished() {
        ArrayList<C0724d> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mCurProcessor = null;
                ArrayList<C0724d> arrayList2 = this.mCompatQueue;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ensureProcessorRunningLocked(false);
                } else if (!this.mDestroyed) {
                    this.mCompatWorkEnqueuer.mo3182c();
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        this.mInterruptIfStopped = z;
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (sLock) {
                C0729h workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.mo3189b(i);
                workEnqueuer.mo3181a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }
}
