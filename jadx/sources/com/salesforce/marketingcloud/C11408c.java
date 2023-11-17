package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
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
import androidx.core.app.C0739s;
import androidx.core.app.C0741t;
import com.medallia.digital.mobilesdk.C10749b8;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.salesforce.marketingcloud.c */
abstract class C11408c extends Service {

    /* renamed from: h */
    static final String f33189h = C11461g.m41875a("JobIntentService");

    /* renamed from: i */
    static final Object f33190i = new Object();

    /* renamed from: j */
    static final HashMap<ComponentName, C11417h> f33191j = new HashMap<>();

    /* renamed from: a */
    C11410b f33192a;

    /* renamed from: b */
    C11417h f33193b;

    /* renamed from: c */
    C11409a f33194c;

    /* renamed from: d */
    boolean f33195d;

    /* renamed from: e */
    boolean f33196e;

    /* renamed from: f */
    boolean f33197f;

    /* renamed from: g */
    final ArrayList<C11412d> f33198g;

    @SuppressLint({"StaticFieldLeak"})
    /* renamed from: com.salesforce.marketingcloud.c$a */
    final class C11409a extends AsyncTask<Void, Void, Void> {
        C11409a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            C11413e a;
            try {
                C11461g.m41880a(C11408c.f33189h, "Starting to dequeue work...", new Object[0]);
                while (!isCancelled() && (a = C11408c.this.mo29855a()) != null) {
                    String str = C11408c.f33189h;
                    C11461g.m41880a(str, "Processing next work: %s", a);
                    C11408c.this.mo29549a(a.mo29872b());
                    C11461g.m41880a(str, "Completing work: %s", a);
                    a.mo29871a();
                }
                C11461g.m41880a(C11408c.f33189h, "Done processing work!", new Object[0]);
                return null;
            } catch (Exception e) {
                C11461g.m41885b(C11408c.f33189h, e, "Exception thrown by JobIntentService", new Object[0]);
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            C11408c.this.mo29858e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onCancelled(Void voidR) {
            C11408c.this.mo29858e();
        }
    }

    /* renamed from: com.salesforce.marketingcloud.c$b */
    interface C11410b {
        /* renamed from: a */
        C11413e mo29865a();

        /* renamed from: b */
        IBinder mo29866b();
    }

    /* renamed from: com.salesforce.marketingcloud.c$c */
    static final class C11411c extends C11417h {

        /* renamed from: d */
        private final Context f33200d;

        /* renamed from: e */
        private final PowerManager.WakeLock f33201e;

        /* renamed from: f */
        private final PowerManager.WakeLock f33202f;

        /* renamed from: g */
        boolean f33203g;

        /* renamed from: h */
        boolean f33204h;

        C11411c(Context context, ComponentName componentName) {
            super(componentName);
            this.f33200d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f33201e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f33202f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: a */
        public void mo29867a() {
            synchronized (this) {
                if (this.f33204h) {
                    if (this.f33203g) {
                        this.f33201e.acquire(C10749b8.C10751b.f30743b);
                    }
                    this.f33204h = false;
                    this.f33202f.release();
                }
            }
        }

        /* renamed from: b */
        public void mo29869b() {
            synchronized (this) {
                if (!this.f33204h) {
                    this.f33204h = true;
                    this.f33202f.acquire(600000);
                    this.f33201e.release();
                }
            }
        }

        /* renamed from: c */
        public void mo29870c() {
            synchronized (this) {
                this.f33203g = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo29868a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f33216a);
            C11461g.m41880a(C11408c.f33189h, "Starting service for work: %s", intent);
            if (this.f33200d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f33203g) {
                        this.f33203g = true;
                        if (!this.f33204h) {
                            this.f33201e.acquire(C10749b8.C10751b.f30743b);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.c$d */
    final class C11412d implements C11413e {

        /* renamed from: a */
        final Intent f33205a;

        /* renamed from: b */
        final int f33206b;

        C11412d(Intent intent, int i) {
            this.f33205a = intent;
            this.f33206b = i;
        }

        /* renamed from: a */
        public void mo29871a() {
            C11461g.m41880a(C11408c.f33189h, "Stopping self: #%d", Integer.valueOf(this.f33206b));
            C11408c.this.stopSelf(this.f33206b);
        }

        /* renamed from: b */
        public Intent mo29872b() {
            return this.f33205a;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.c$e */
    interface C11413e {
        /* renamed from: a */
        void mo29871a();

        /* renamed from: b */
        Intent mo29872b();
    }

    /* renamed from: com.salesforce.marketingcloud.c$f */
    static final class C11414f extends JobServiceEngine implements C11410b {

        /* renamed from: d */
        static final String f33208d = C11461g.m41875a("JobServiceEngineImpl");

        /* renamed from: a */
        final C11408c f33209a;

        /* renamed from: b */
        final Object f33210b = new Object();

        /* renamed from: c */
        JobParameters f33211c;

        /* renamed from: com.salesforce.marketingcloud.c$f$a */
        final class C11415a implements C11413e {

            /* renamed from: a */
            final JobWorkItem f33212a;

            C11415a(JobWorkItem jobWorkItem) {
                this.f33212a = jobWorkItem;
            }

            /* renamed from: a */
            public void mo29871a() {
                synchronized (C11414f.this.f33210b) {
                    JobParameters jobParameters = C11414f.this.f33211c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f33212a);
                    }
                }
            }

            /* renamed from: b */
            public Intent mo29872b() {
                return this.f33212a.getIntent();
            }
        }

        C11414f(C11408c cVar) {
            super(cVar);
            this.f33209a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f33209a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new com.salesforce.marketingcloud.C11408c.C11414f.C11415a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.salesforce.marketingcloud.C11408c.C11413e mo29865a() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f33210b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f33211c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                com.salesforce.marketingcloud.c r2 = r3.f33209a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                com.salesforce.marketingcloud.c$f$a r0 = new com.salesforce.marketingcloud.c$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.C11408c.C11414f.mo29865a():com.salesforce.marketingcloud.c$e");
        }

        /* renamed from: b */
        public IBinder mo29866b() {
            return getBinder();
        }

        public boolean onStartJob(JobParameters jobParameters) {
            C11461g.m41880a(f33208d, "onStartJob: %s", jobParameters);
            this.f33211c = jobParameters;
            this.f33209a.mo29856a(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            C11461g.m41880a(f33208d, "onStartJob: %s", jobParameters);
            boolean b = this.f33209a.mo29857b();
            synchronized (this.f33210b) {
                this.f33211c = null;
            }
            return b;
        }
    }

    /* renamed from: com.salesforce.marketingcloud.c$g */
    static final class C11416g extends C11417h {

        /* renamed from: d */
        private final JobInfo f33214d;

        /* renamed from: e */
        private final JobScheduler f33215e;

        C11416g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo29875a(i);
            this.f33214d = new JobInfo.Builder(i, this.f33216a).setOverrideDeadline(0).build();
            this.f33215e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo29868a(Intent intent) {
            C11461g.m41880a(C11408c.f33189h, "Enqueueing work: %s", intent);
            try {
                JobScheduler jobScheduler = this.f33215e;
                JobInfo jobInfo = this.f33214d;
                C0741t.m2791a();
                int unused = jobScheduler.enqueue(jobInfo, C0739s.m2789a(intent));
            } catch (Exception e) {
                C11461g.m41885b(C11408c.f33189h, e, "Unable to enqueue %s for work %s", Integer.valueOf(this.f33218c), intent);
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.c$h */
    static abstract class C11417h {

        /* renamed from: a */
        final ComponentName f33216a;

        /* renamed from: b */
        boolean f33217b;

        /* renamed from: c */
        int f33218c;

        C11417h(ComponentName componentName) {
            this.f33216a = componentName;
        }

        /* renamed from: a */
        public void mo29867a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo29868a(Intent intent);

        /* renamed from: b */
        public void mo29869b() {
        }

        /* renamed from: c */
        public void mo29870c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo29875a(int i) {
            if (!this.f33217b) {
                this.f33217b = true;
                this.f33218c = i;
            } else if (this.f33218c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f33218c);
            }
        }
    }

    public C11408c() {
        this.f33198g = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C11413e mo29855a() {
        C11410b bVar = this.f33192a;
        if (bVar != null) {
            return bVar.mo29865a();
        }
        synchronized (this.f33198g) {
            if (this.f33198g.size() <= 0) {
                return null;
            }
            C11413e remove = this.f33198g.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29549a(Intent intent);

    /* renamed from: b */
    public void mo29550b(boolean z) {
        this.f33195d = z;
    }

    /* renamed from: c */
    public boolean mo29551c() {
        return this.f33196e;
    }

    /* renamed from: d */
    public boolean mo29552d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo29858e() {
        ArrayList<C11412d> arrayList = this.f33198g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f33194c = null;
                ArrayList<C11412d> arrayList2 = this.f33198g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo29856a(false);
                } else if (!this.f33197f) {
                    this.f33193b.mo29867a();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C11410b bVar = this.f33192a;
        if (bVar == null) {
            return null;
        }
        IBinder b = bVar.mo29866b();
        C11461g.m41880a(f33189h, "Returning engine: %s", b);
        return b;
    }

    public void onCreate() {
        super.onCreate();
        C11461g.m41880a(f33189h, "CREATING: %s", this);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f33192a = new C11414f(this);
            this.f33193b = null;
            return;
        }
        this.f33192a = null;
        this.f33193b = m41723a((Context) this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        ArrayList<C11412d> arrayList = this.f33198g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f33197f = true;
                this.f33193b.mo29867a();
            }
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f33198g != null) {
            this.f33193b.mo29870c();
            C11461g.m41880a(f33189h, "Received compat start command #%d: %s", Integer.valueOf(i2), intent);
            synchronized (this.f33198g) {
                ArrayList<C11412d> arrayList = this.f33198g;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new C11412d(intent, i2));
                mo29856a(true);
            }
            return 3;
        }
        C11461g.m41880a(f33189h, "Ignoring start command: %s", intent);
        return 2;
    }

    /* renamed from: a */
    static C11417h m41723a(Context context, ComponentName componentName, boolean z, int i) {
        C11417h hVar;
        HashMap<ComponentName, C11417h> hashMap = f33191j;
        C11417h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C11411c(context, componentName);
        } else if (z) {
            hVar = new C11416g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C11417h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo29857b() {
        C11409a aVar = this.f33194c;
        if (aVar != null) {
            aVar.cancel(this.f33195d);
        }
        this.f33196e = true;
        return mo29552d();
    }

    /* renamed from: a */
    public static void m41724a(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (f33190i) {
                C11417h a = m41723a(context, componentName, true, i);
                a.mo29875a(i);
                a.mo29868a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: a */
    public static void m41725a(Context context, Class cls, int i, Intent intent) {
        m41724a(context, new ComponentName(context, cls), i, intent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo29856a(boolean z) {
        if (this.f33194c == null) {
            this.f33194c = new C11409a();
            C11417h hVar = this.f33193b;
            if (hVar != null && z) {
                hVar.mo29869b();
            }
            C11461g.m41880a(f33189h, "Starting processor: %s", this.f33194c);
            this.f33194c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
