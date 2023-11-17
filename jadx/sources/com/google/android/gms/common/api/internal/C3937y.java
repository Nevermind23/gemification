package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;
import p287v7.C8709a;

/* renamed from: com.google.android.gms.common.api.internal.y */
final class C3937y extends C8709a {

    /* renamed from: b */
    private final WeakReference f12550b;

    C3937y(C3872b0 b0Var) {
        this.f12550b = new WeakReference(b0Var);
    }

    /* renamed from: V */
    public final void mo12151V(zak zak) {
        C3872b0 b0Var = (C3872b0) this.f12550b.get();
        if (b0Var != null) {
            b0Var.f12326a.mo12105n(new C3935x(this, b0Var, b0Var, zak));
        }
    }
}
