package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4356pe;
import p248s7.C8245b;

/* renamed from: com.google.android.gms.measurement.internal.p6 */
final class C4749p6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C8245b f14762d;

    /* renamed from: e */
    final /* synthetic */ int f14763e;

    /* renamed from: f */
    final /* synthetic */ long f14764f;

    /* renamed from: g */
    final /* synthetic */ boolean f14765g;

    /* renamed from: h */
    final /* synthetic */ C8245b f14766h;

    /* renamed from: i */
    final /* synthetic */ C4793t6 f14767i;

    C4749p6(C4793t6 t6Var, C8245b bVar, int i, long j, boolean z, C8245b bVar2) {
        this.f14767i = t6Var;
        this.f14762d = bVar;
        this.f14763e = i;
        this.f14764f = j;
        this.f14765g = z;
        this.f14766h = bVar2;
    }

    public final void run() {
        this.f14767i.mo14887J(this.f14762d);
        C4793t6.m18335c0(this.f14767i, this.f14762d, this.f14763e, this.f14764f, false, this.f14765g);
        C4356pe.m16469c();
        if (this.f14767i.f14613a.mo14876z().mo14398B((String) null, C4636f3.f14391p0)) {
            C4793t6.m18334b0(this.f14767i, this.f14762d, this.f14766h);
        }
    }
}
