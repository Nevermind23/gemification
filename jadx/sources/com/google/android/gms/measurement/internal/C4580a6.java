package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.a6 */
final class C4580a6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ long f14195d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14196e;

    C4580a6(C4793t6 t6Var, long j) {
        this.f14196e = t6Var;
        this.f14195d = j;
    }

    public final void run() {
        this.f14196e.mo14915z(this.f14195d, true);
        this.f14196e.f14613a.mo14854L().mo14380S(new AtomicReference());
    }
}
