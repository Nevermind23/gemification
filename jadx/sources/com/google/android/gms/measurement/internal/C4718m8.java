package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzcl;
import com.salesforce.marketingcloud.UrlHandler;
import p182n6.C7264i;
import p248s7.C8271y;

/* renamed from: com.google.android.gms.measurement.internal.m8 */
public final class C4718m8 {

    /* renamed from: a */
    private final Context f14618a;

    public C4718m8(Context context) {
        C7264i.m27902k(context);
        this.f14618a = context;
    }

    /* renamed from: k */
    private final C4746p3 m17913k() {
        return C4791t4.m18288H(this.f14618a, (zzcl) null, (Long) null).mo14551d();
    }

    /* renamed from: a */
    public final int mo14557a(Intent intent, int i, int i2) {
        C4791t4 H = C4791t4.m18288H(this.f14618a, (zzcl) null, (Long) null);
        C4746p3 d = H.mo14551d();
        if (intent == null) {
            d.mo14680w().mo14615a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        H.mo14549b();
        d.mo14679v().mo14617c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            mo14564h(new C4696k8(this, i2, d, intent));
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder mo14558b(Intent intent) {
        if (intent == null) {
            m17913k().mo14675r().mo14615a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new C4704l5(C4719m9.m17937f0(this.f14618a), (String) null);
        }
        m17913k().mo14680w().mo14616b("onBind received unknown action", action);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo14559c(int i, C4746p3 p3Var, Intent intent) {
        if (((C8271y) this.f14618a).mo14263a(i)) {
            p3Var.mo14679v().mo14616b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i));
            m17913k().mo14679v().mo14615a("Completed wakeful intent.");
            ((C8271y) this.f14618a).mo14264b(intent);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo14560d(C4746p3 p3Var, JobParameters jobParameters) {
        p3Var.mo14679v().mo14615a("AppMeasurementJobService processed last upload request.");
        ((C8271y) this.f14618a).mo14265c(jobParameters, false);
    }

    /* renamed from: e */
    public final void mo14561e() {
        C4791t4 H = C4791t4.m18288H(this.f14618a, (zzcl) null, (Long) null);
        C4746p3 d = H.mo14551d();
        H.mo14549b();
        d.mo14679v().mo14615a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void mo14562f() {
        C4791t4 H = C4791t4.m18288H(this.f14618a, (zzcl) null, (Long) null);
        C4746p3 d = H.mo14551d();
        H.mo14549b();
        d.mo14679v().mo14615a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void mo14563g(Intent intent) {
        if (intent == null) {
            m17913k().mo14675r().mo14615a("onRebind called with null intent");
            return;
        }
        m17913k().mo14679v().mo14616b("onRebind called. action", intent.getAction());
    }

    /* renamed from: h */
    public final void mo14564h(Runnable runnable) {
        C4719m9 f0 = C4719m9.m17937f0(this.f14618a);
        f0.mo14552f().mo14776z(new C4707l8(this, f0, runnable));
    }

    /* renamed from: i */
    public final boolean mo14565i(JobParameters jobParameters) {
        C4791t4 H = C4791t4.m18288H(this.f14618a, (zzcl) null, (Long) null);
        C4746p3 d = H.mo14551d();
        String string = jobParameters.getExtras().getString(UrlHandler.ACTION);
        H.mo14549b();
        d.mo14679v().mo14616b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        mo14564h(new C4685j8(this, d, jobParameters));
        return true;
    }

    /* renamed from: j */
    public final boolean mo14566j(Intent intent) {
        if (intent == null) {
            m17913k().mo14675r().mo14615a("onUnbind called with null intent");
            return true;
        }
        m17913k().mo14679v().mo14616b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
