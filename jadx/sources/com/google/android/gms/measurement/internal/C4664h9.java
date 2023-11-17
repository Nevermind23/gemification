package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h9 */
final class C4664h9 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4818v9 f14499d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f14500e;

    C4664h9(AppMeasurementDynamiteService appMeasurementDynamiteService, C4818v9 v9Var) {
        this.f14500e = appMeasurementDynamiteService;
        this.f14499d = v9Var;
    }

    public final void run() {
        this.f14500e.f14177b.mo14851I().mo14885H(this.f14499d);
    }
}
