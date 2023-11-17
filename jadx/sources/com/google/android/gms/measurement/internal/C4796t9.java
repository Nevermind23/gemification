package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4224i1;

/* renamed from: com.google.android.gms.measurement.internal.t9 */
final class C4796t9 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4224i1 f14929d;

    /* renamed from: e */
    final /* synthetic */ String f14930e;

    /* renamed from: f */
    final /* synthetic */ String f14931f;

    /* renamed from: g */
    final /* synthetic */ AppMeasurementDynamiteService f14932g;

    C4796t9(AppMeasurementDynamiteService appMeasurementDynamiteService, C4224i1 i1Var, String str, String str2) {
        this.f14932g = appMeasurementDynamiteService;
        this.f14929d = i1Var;
        this.f14930e = str;
        this.f14931f = str2;
    }

    public final void run() {
        this.f14932g.f14177b.mo14854L().mo14381T(this.f14929d, this.f14930e, this.f14931f);
    }
}
