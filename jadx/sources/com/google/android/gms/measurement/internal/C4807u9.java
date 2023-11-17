package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4224i1;

/* renamed from: com.google.android.gms.measurement.internal.u9 */
final class C4807u9 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4224i1 f14954d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f14955e;

    C4807u9(AppMeasurementDynamiteService appMeasurementDynamiteService, C4224i1 i1Var) {
        this.f14955e = appMeasurementDynamiteService;
        this.f14954d = i1Var;
    }

    public final void run() {
        this.f14955e.f14177b.mo14856N().mo14797E(this.f14954d, this.f14955e.f14177b.mo14868n());
    }
}
