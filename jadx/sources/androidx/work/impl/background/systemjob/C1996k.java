package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C1949a;
import androidx.work.C1954c;
import androidx.work.C2073m;
import androidx.work.C2075n;
import p190o1.C7399v;

/* renamed from: androidx.work.impl.background.systemjob.k */
class C1996k {

    /* renamed from: b */
    private static final String f6017b = C2073m.m8073i("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f6018a;

    /* renamed from: androidx.work.impl.background.systemjob.k$a */
    static /* synthetic */ class C1997a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6019a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.n[] r0 = androidx.work.C2075n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6019a = r0
                androidx.work.n r1 = androidx.work.C2075n.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6019a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.n r1 = androidx.work.C2075n.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6019a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.n r1 = androidx.work.C2075n.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6019a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.n r1 = androidx.work.C2075n.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6019a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.n r1 = androidx.work.C2075n.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.C1996k.C1997a.<clinit>():void");
        }
    }

    C1996k(Context context) {
        this.f6018a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m7833b(C1954c.C1957c cVar) {
        boolean b = cVar.mo6723b();
        C1995j.m7832a();
        return C1994i.m7831a(cVar.mo6722a(), b ? 1 : 0);
    }

    /* renamed from: c */
    static int m7834c(C2075n nVar) {
        int i = C1997a.f6019a[nVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        C2073m e = C2073m.m8071e();
        String str = f6017b;
        e.mo6959a(str, "API version too low. Cannot convert network type value " + nVar);
        return 1;
    }

    /* renamed from: d */
    static void m7835d(JobInfo.Builder builder, C2075n nVar) {
        if (Build.VERSION.SDK_INT < 30 || nVar != C2075n.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m7834c(nVar));
        } else {
            JobInfo.Builder unused = builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JobInfo mo6802a(C7399v vVar, int i) {
        boolean z;
        int i2;
        C1954c cVar = vVar.f21639j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", vVar.f21630a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", vVar.mo21788f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", vVar.mo21793j());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f6018a).setRequiresCharging(cVar.mo6716g()).setRequiresDeviceIdle(cVar.mo6717h()).setExtras(persistableBundle);
        m7835d(extras, cVar.mo6712d());
        boolean z2 = false;
        if (!cVar.mo6717h()) {
            if (vVar.f21641l == C1949a.LINEAR) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            extras.setBackoffCriteria(vVar.f21642m, i2);
        }
        long max = Math.max(vVar.mo21785c() - System.currentTimeMillis(), 0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!vVar.f21646q) {
            JobInfo.Builder unused = extras.setImportantWhileForeground(true);
        }
        if (i3 >= 24 && cVar.mo6713e()) {
            for (C1954c.C1957c b : cVar.mo6711c()) {
                JobInfo.Builder unused2 = extras.addTriggerContentUri(m7833b(b));
            }
            JobInfo.Builder unused3 = extras.setTriggerContentUpdateDelay(cVar.mo6710b());
            JobInfo.Builder unused4 = extras.setTriggerContentMaxDelay(cVar.mo6709a());
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            JobInfo.Builder unused5 = extras.setRequiresBatteryNotLow(cVar.mo6715f());
            JobInfo.Builder unused6 = extras.setRequiresStorageNotLow(cVar.mo6719i());
        }
        if (vVar.f21640k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (max > 0) {
            z2 = true;
        }
        if (i4 >= 31 && vVar.f21646q && !z && !z2) {
            JobInfo.Builder unused7 = extras.setExpedited(true);
        }
        return extras.build();
    }
}
