package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4224i1;

/* renamed from: com.google.android.gms.measurement.internal.h7 */
final class C4662h7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4224i1 f14490d;

    /* renamed from: e */
    final /* synthetic */ zzaw f14491e;

    /* renamed from: f */
    final /* synthetic */ String f14492f;

    /* renamed from: g */
    final /* synthetic */ AppMeasurementDynamiteService f14493g;

    C4662h7(AppMeasurementDynamiteService appMeasurementDynamiteService, C4224i1 i1Var, zzaw zzaw, String str) {
        this.f14493g = appMeasurementDynamiteService;
        this.f14490d = i1Var;
        this.f14491e = zzaw;
        this.f14492f = str;
    }

    public final void run() {
        this.f14493g.f14177b.mo14854L().mo14386p(this.f14490d, this.f14491e, this.f14492f);
    }
}
