package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.C4427u0;
import com.google.android.gms.internal.measurement.C4444v0;
import com.salesforce.marketingcloud.UrlHandler;

/* renamed from: com.google.android.gms.measurement.internal.y8 */
public final class C4850y8 extends C4583a9 {

    /* renamed from: d */
    private final AlarmManager f15054d = ((AlarmManager) this.f14613a.mo14550c().getSystemService("alarm"));

    /* renamed from: e */
    private C4720n f15055e;

    /* renamed from: f */
    private Integer f15056f;

    protected C4850y8(C4719m9 m9Var) {
        super(m9Var);
    }

    /* renamed from: o */
    private final int m18440o() {
        if (this.f15056f == null) {
            this.f15056f = Integer.valueOf("measurement".concat(String.valueOf(this.f14613a.mo14550c().getPackageName())).hashCode());
        }
        return this.f15056f.intValue();
    }

    /* renamed from: p */
    private final PendingIntent m18441p() {
        Context c = this.f14613a.mo14550c();
        return PendingIntent.getBroadcast(c, 0, new Intent().setClassName(c, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), C4427u0.f13711a);
    }

    /* renamed from: q */
    private final C4720n m18442q() {
        if (this.f15055e == null) {
            this.f15055e = new C4839x8(this, this.f15082b.mo14582c0());
        }
        return this.f15055e;
    }

    /* renamed from: r */
    private final void m18443r() {
        JobScheduler jobScheduler = (JobScheduler) this.f14613a.mo14550c().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m18440o());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo14304l() {
        AlarmManager alarmManager = this.f15054d;
        if (alarmManager != null) {
            alarmManager.cancel(m18441p());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m18443r();
        return false;
    }

    /* renamed from: m */
    public final void mo14967m() {
        mo14301i();
        this.f14613a.mo14551d().mo14679v().mo14615a("Unscheduling upload");
        AlarmManager alarmManager = this.f15054d;
        if (alarmManager != null) {
            alarmManager.cancel(m18441p());
        }
        m18442q().mo14611b();
        if (Build.VERSION.SDK_INT >= 24) {
            m18443r();
        }
    }

    /* renamed from: n */
    public final void mo14968n(long j) {
        mo14301i();
        this.f14613a.mo14549b();
        Context c = this.f14613a.mo14550c();
        if (!C4785s9.m18221a0(c)) {
            this.f14613a.mo14551d().mo14674q().mo14615a("Receiver not registered/enabled");
        }
        if (!C4785s9.m18222b0(c, false)) {
            this.f14613a.mo14551d().mo14674q().mo14615a("Service not registered/enabled");
        }
        mo14967m();
        this.f14613a.mo14551d().mo14679v().mo14616b("Scheduling upload, millis", Long.valueOf(j));
        long c2 = this.f14613a.mo14548a().mo23596c() + j;
        this.f14613a.mo14876z();
        if (j < Math.max(0, ((Long) C4636f3.f14410z.mo14346a((Object) null)).longValue()) && !m18442q().mo14614e()) {
            m18442q().mo14613d(j);
        }
        this.f14613a.mo14549b();
        if (Build.VERSION.SDK_INT >= 24) {
            Context c3 = this.f14613a.mo14550c();
            ComponentName componentName = new ComponentName(c3, "com.google.android.gms.measurement.AppMeasurementJobService");
            int o = m18440o();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString(UrlHandler.ACTION, "com.google.android.gms.measurement.UPLOAD");
            C4444v0.m17030a(c3, new JobInfo.Builder(o, componentName).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f15054d;
        if (alarmManager != null) {
            this.f14613a.mo14876z();
            alarmManager.setInexactRepeating(2, c2, Math.max(((Long) C4636f3.f14400u.mo14346a((Object) null)).longValue(), j), m18441p());
        }
    }
}
