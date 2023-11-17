package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u3 */
abstract class C4801u3 extends C4844y2 {

    /* renamed from: b */
    private boolean f14937b;

    C4801u3(C4791t4 t4Var) {
        super(t4Var);
        this.f14613a.mo14863i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo14922i() {
        if (!mo14925m()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo14923j() {
        if (this.f14937b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo14367n()) {
            this.f14613a.mo14861g();
            this.f14937b = true;
        }
    }

    /* renamed from: k */
    public final void mo14924k() {
        if (!this.f14937b) {
            mo14441l();
            this.f14613a.mo14861g();
            this.f14937b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo14441l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo14925m() {
        return this.f14937b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract boolean mo14367n();
}
