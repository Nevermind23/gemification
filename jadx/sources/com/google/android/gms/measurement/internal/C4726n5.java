package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.n5 */
abstract class C4726n5 extends C4715m5 {

    /* renamed from: b */
    private boolean f14673b;

    C4726n5(C4791t4 t4Var) {
        super(t4Var);
        this.f14613a.mo14863i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo14328i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract boolean mo14329j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo14640k() {
        if (!mo14643n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: l */
    public final void mo14641l() {
        if (this.f14673b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!mo14329j()) {
            this.f14613a.mo14861g();
            this.f14673b = true;
        }
    }

    /* renamed from: m */
    public final void mo14642m() {
        if (!this.f14673b) {
            mo14328i();
            this.f14613a.mo14861g();
            this.f14673b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo14643n() {
        return this.f14673b;
    }
}
