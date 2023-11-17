package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
final class C3912n0 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C3915o0 f12492d;

    C3912n0(C3915o0 o0Var) {
        this.f12492d = o0Var;
    }

    public final void run() {
        C3918p0 p0Var = this.f12492d.f12494a;
        p0Var.f12498c.mo11921e(p0Var.f12498c.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
