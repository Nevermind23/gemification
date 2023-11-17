package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a9 */
abstract class C4583a9 extends C4861z8 {

    /* renamed from: c */
    private boolean f14204c;

    C4583a9(C4719m9 m9Var) {
        super(m9Var);
        this.f15082b.mo14602r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo14301i() {
        if (!mo14303k()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* renamed from: j */
    public final void mo14302j() {
        if (!this.f14204c) {
            mo14304l();
            this.f15082b.mo14597m();
            this.f14204c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo14303k() {
        return this.f14204c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract boolean mo14304l();
}
