package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r8 */
final class C4773r8 {

    /* renamed from: a */
    private C4762q8 f14838a;

    /* renamed from: b */
    final /* synthetic */ C4817v8 f14839b;

    C4773r8(C4817v8 v8Var) {
        this.f14839b = v8Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo14778a(long j) {
        this.f14838a = new C4762q8(this, this.f14839b.f14613a.mo14548a().mo23594a(), j);
        this.f14839b.f14975c.postDelayed(this.f14838a, 2000);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo14779b() {
        this.f14839b.mo14554h();
        C4762q8 q8Var = this.f14838a;
        if (q8Var != null) {
            this.f14839b.f14975c.removeCallbacks(q8Var);
        }
        this.f14839b.f14613a.mo14849F().f14274r.mo14962a(false);
    }
}
