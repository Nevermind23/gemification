package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p7 */
final class C4750p7 extends C4720n {

    /* renamed from: e */
    final /* synthetic */ C4641f8 f14768e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4750p7(C4641f8 f8Var, C4737o5 o5Var) {
        super(o5Var);
        this.f14768e = f8Var;
    }

    /* renamed from: c */
    public final void mo14612c() {
        C4641f8 f8Var = this.f14768e;
        f8Var.mo14554h();
        if (f8Var.mo14396z()) {
            f8Var.f14613a.mo14551d().mo14679v().mo14615a("Inactivity, disconnecting from the service");
            f8Var.mo14378Q();
        }
    }
}
