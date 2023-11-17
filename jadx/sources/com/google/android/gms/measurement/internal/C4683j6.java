package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4224i1;

/* renamed from: com.google.android.gms.measurement.internal.j6 */
final class C4683j6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4224i1 f14539d;

    /* renamed from: e */
    final /* synthetic */ AppMeasurementDynamiteService f14540e;

    C4683j6(AppMeasurementDynamiteService appMeasurementDynamiteService, C4224i1 i1Var) {
        this.f14540e = appMeasurementDynamiteService;
        this.f14539d = i1Var;
    }

    public final void run() {
        this.f14540e.f14177b.mo14854L().mo14379R(this.f14539d);
    }
}
