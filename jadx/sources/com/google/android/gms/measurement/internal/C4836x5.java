package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x5 */
final class C4836x5 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ long f15013d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f15014e;

    C4836x5(C4793t6 t6Var, long j) {
        this.f15014e = t6Var;
        this.f15013d = j;
    }

    public final void run() {
        this.f15014e.f14613a.mo14849F().f14267k.mo14296b(this.f15013d);
        this.f15014e.f14613a.mo14551d().mo14674q().mo14616b("Session timeout duration set", Long.valueOf(this.f15013d));
    }
}
