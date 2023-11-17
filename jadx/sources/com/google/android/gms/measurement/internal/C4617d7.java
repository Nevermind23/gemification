package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d7 */
final class C4617d7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C4848y6 f14287d;

    /* renamed from: e */
    final /* synthetic */ long f14288e;

    /* renamed from: f */
    final /* synthetic */ C4640f7 f14289f;

    C4617d7(C4640f7 f7Var, C4848y6 y6Var, long j) {
        this.f14289f = f7Var;
        this.f14287d = y6Var;
        this.f14288e = j;
    }

    public final void run() {
        this.f14289f.m17668p(this.f14287d, false, this.f14288e);
        C4640f7 f7Var = this.f14289f;
        f7Var.f14424e = null;
        f7Var.f14613a.mo14854L().mo14391u((C4848y6) null);
    }
}
