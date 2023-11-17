package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d6 */
final class C4616d6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ AtomicReference f14283d;

    /* renamed from: e */
    final /* synthetic */ String f14284e;

    /* renamed from: f */
    final /* synthetic */ String f14285f;

    /* renamed from: g */
    final /* synthetic */ C4793t6 f14286g;

    C4616d6(C4793t6 t6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f14286g = t6Var;
        this.f14283d = atomicReference;
        this.f14284e = str2;
        this.f14285f = str3;
    }

    public final void run() {
        this.f14286g.f14613a.mo14854L().mo14382U(this.f14283d, (String) null, this.f14284e, this.f14285f);
    }
}
