package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.C3877d;
import p156l6.C6934c0;
import p337z7.C9227g;

/* renamed from: com.google.android.gms.common.api.internal.f1 */
public final class C3887f1 extends C3940z0 {

    /* renamed from: c */
    public final C3877d.C3878a f12390c;

    public C3887f1(C3877d.C3878a aVar, C9227g gVar) {
        super(4, gVar);
        this.f12390c = aVar;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo12040d(C3908m mVar, boolean z) {
    }

    /* renamed from: f */
    public final boolean mo12051f(C3918p0 p0Var) {
        C6934c0 c0Var = (C6934c0) p0Var.mo12141u().get(this.f12390c);
        if (c0Var == null || !c0Var.f20810a.mo12061f()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public final Feature[] mo12052g(C3918p0 p0Var) {
        C6934c0 c0Var = (C6934c0) p0Var.mo12141u().get(this.f12390c);
        if (c0Var == null) {
            return null;
        }
        return c0Var.f20810a.mo12058c();
    }

    /* renamed from: h */
    public final void mo12053h(C3918p0 p0Var) {
        C6934c0 c0Var = (C6934c0) p0Var.mo12141u().remove(this.f12390c);
        if (c0Var != null) {
            c0Var.f20811b.mo12086b(p0Var.mo12140s(), this.f12553b);
            c0Var.f20810a.mo12056a();
            return;
        }
        this.f12553b.mo24887e(Boolean.FALSE);
    }
}
