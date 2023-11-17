package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
final class C4639f6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14417d;

    /* renamed from: e */
    final /* synthetic */ String f14418e;

    /* renamed from: f */
    final /* synthetic */ String f14419f;

    /* renamed from: g */
    final /* synthetic */ boolean f14420g;

    /* renamed from: h */
    final /* synthetic */ C4793t6 f14421h;

    C4639f6(C4793t6 t6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f14421h = t6Var;
        this.f14417d = atomicReference;
        this.f14418e = str2;
        this.f14419f = str3;
        this.f14420g = z;
    }

    public final void run() {
        this.f14421h.f14613a.mo14854L().mo14384W(this.f14417d, (String) null, this.f14418e, this.f14419f, this.f14420g);
    }
}
