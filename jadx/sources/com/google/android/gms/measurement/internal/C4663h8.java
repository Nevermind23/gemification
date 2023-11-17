package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4224i1;

/* renamed from: com.google.android.gms.measurement.internal.h8 */
final class C4663h8 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4224i1 f14494d;

    /* renamed from: e */
    final /* synthetic */ String f14495e;

    /* renamed from: f */
    final /* synthetic */ String f14496f;

    /* renamed from: g */
    final /* synthetic */ boolean f14497g;

    /* renamed from: h */
    final /* synthetic */ AppMeasurementDynamiteService f14498h;

    C4663h8(AppMeasurementDynamiteService appMeasurementDynamiteService, C4224i1 i1Var, String str, String str2, boolean z) {
        this.f14498h = appMeasurementDynamiteService;
        this.f14494d = i1Var;
        this.f14495e = str;
        this.f14496f = str2;
        this.f14497g = z;
    }

    public final void run() {
        this.f14498h.f14177b.mo14854L().mo14383V(this.f14494d, this.f14495e, this.f14496f, this.f14497g);
    }
}
