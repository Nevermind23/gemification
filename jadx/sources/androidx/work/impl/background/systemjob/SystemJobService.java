package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.PersistableBundle;
import androidx.work.C2073m;
import androidx.work.impl.C2006e;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2060v;
import androidx.work.impl.C2061w;
import java.util.HashMap;
import java.util.Map;
import p190o1.C7386m;

public class SystemJobService extends JobService implements C2006e {

    /* renamed from: g */
    private static final String f6013g = C2073m.m8073i("SystemJobService");

    /* renamed from: d */
    private C2007e0 f6014d;

    /* renamed from: e */
    private final Map f6015e = new HashMap();

    /* renamed from: f */
    private final C2061w f6016f = new C2061w();

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    static class C1984a {
        /* renamed from: a */
        static String[] m7820a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        /* renamed from: b */
        static Uri[] m7821b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    static class C1985b {
        /* renamed from: a */
        static Network m7822a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* renamed from: a */
    private static C7386m m7818a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C7386m(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public void mo6776d(C7386m mVar, boolean z) {
        JobParameters jobParameters;
        C2073m e = C2073m.m8071e();
        String str = f6013g;
        e.mo6959a(str, mVar.mo21770b() + " executed on JobScheduler");
        synchronized (this.f6015e) {
            jobParameters = (JobParameters) this.f6015e.remove(mVar);
        }
        this.f6016f.mo6913b(mVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C2007e0 n = C2007e0.m7860n(getApplicationContext());
            this.f6014d = n;
            n.mo6825p().mo6869g(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C2073m.m8071e().mo6966k(f6013g, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C2007e0 e0Var = this.f6014d;
        if (e0Var != null) {
            e0Var.mo6825p().mo6873n(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006e, code lost:
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r2 < 24) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r3 = new androidx.work.WorkerParameters.C1948a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.C1984a.m7821b(r8) == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        r3.f5878b = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.C1984a.m7821b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        if (androidx.work.impl.background.systemjob.SystemJobService.C1984a.m7820a(r8) == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        r3.f5877a = java.util.Arrays.asList(androidx.work.impl.background.systemjob.SystemJobService.C1984a.m7820a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        if (r2 < 28) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009d, code lost:
        r3.f5879c = androidx.work.impl.background.systemjob.SystemJobService.C1985b.m7822a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        r7.f6014d.mo6834z(r7.f6016f.mo6915d(r0), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            androidx.work.impl.e0 r0 = r7.f6014d
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0015
            androidx.work.m r0 = androidx.work.C2073m.m8071e()
            java.lang.String r3 = f6013g
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            r0.mo6959a(r3, r4)
            r7.jobFinished(r8, r1)
            return r2
        L_0x0015:
            o1.m r0 = m7818a(r8)
            if (r0 != 0) goto L_0x0027
            androidx.work.m r8 = androidx.work.C2073m.m8071e()
            java.lang.String r0 = f6013g
            java.lang.String r1 = "WorkSpec id not found!"
            r8.mo6961c(r0, r1)
            return r2
        L_0x0027:
            java.util.Map r3 = r7.f6015e
            monitor-enter(r3)
            java.util.Map r4 = r7.f6015e     // Catch:{ all -> 0x00b1 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00b1 }
            if (r4 == 0) goto L_0x004e
            androidx.work.m r8 = androidx.work.C2073m.m8071e()     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = f6013g     // Catch:{ all -> 0x00b1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r4.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: "
            r4.append(r5)     // Catch:{ all -> 0x00b1 }
            r4.append(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00b1 }
            r8.mo6959a(r1, r0)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            return r2
        L_0x004e:
            androidx.work.m r2 = androidx.work.C2073m.m8071e()     // Catch:{ all -> 0x00b1 }
            java.lang.String r4 = f6013g     // Catch:{ all -> 0x00b1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r5.<init>()     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = "onStartJob for "
            r5.append(r6)     // Catch:{ all -> 0x00b1 }
            r5.append(r0)     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00b1 }
            r2.mo6959a(r4, r5)     // Catch:{ all -> 0x00b1 }
            java.util.Map r2 = r7.f6015e     // Catch:{ all -> 0x00b1 }
            r2.put(r0, r8)     // Catch:{ all -> 0x00b1 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x00a4
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.C1984a.m7821b(r8)
            if (r4 == 0) goto L_0x0089
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.SystemJobService.C1984a.m7821b(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f5878b = r4
        L_0x0089:
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.C1984a.m7820a(r8)
            if (r4 == 0) goto L_0x0099
            java.lang.String[] r4 = androidx.work.impl.background.systemjob.SystemJobService.C1984a.m7820a(r8)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f5877a = r4
        L_0x0099:
            r4 = 28
            if (r2 < r4) goto L_0x00a5
            android.net.Network r8 = androidx.work.impl.background.systemjob.SystemJobService.C1985b.m7822a(r8)
            r3.f5879c = r8
            goto L_0x00a5
        L_0x00a4:
            r3 = 0
        L_0x00a5:
            androidx.work.impl.e0 r8 = r7.f6014d
            androidx.work.impl.w r2 = r7.f6016f
            androidx.work.impl.v r0 = r2.mo6915d(r0)
            r8.mo6834z(r0, r3)
            return r1
        L_0x00b1:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b1 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f6014d == null) {
            C2073m.m8071e().mo6959a(f6013g, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C7386m a = m7818a(jobParameters);
        if (a == null) {
            C2073m.m8071e().mo6961c(f6013g, "WorkSpec id not found!");
            return false;
        }
        C2073m e = C2073m.m8071e();
        String str = f6013g;
        e.mo6959a(str, "onStopJob for " + a);
        synchronized (this.f6015e) {
            this.f6015e.remove(a);
        }
        C2060v b = this.f6016f.mo6913b(a);
        if (b != null) {
            this.f6014d.mo6814B(b);
        }
        return !this.f6014d.mo6825p().mo6871j(a.mo21770b());
    }
}
