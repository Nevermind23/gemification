package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q6 */
final class C4760q6 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ boolean f14793d;

    /* renamed from: e */
    final /* synthetic */ C4793t6 f14794e;

    C4760q6(C4793t6 t6Var, boolean z) {
        this.f14794e = t6Var;
        this.f14793d = z;
    }

    public final void run() {
        boolean o = this.f14794e.f14613a.mo14869o();
        boolean n = this.f14794e.f14613a.mo14868n();
        this.f14794e.f14613a.mo14865k(this.f14793d);
        if (n == this.f14793d) {
            this.f14794e.f14613a.mo14551d().mo14679v().mo14616b("Default data collection state already set to", Boolean.valueOf(this.f14793d));
        }
        if (this.f14794e.f14613a.mo14869o() == o || this.f14794e.f14613a.mo14869o() != this.f14794e.f14613a.mo14868n()) {
            this.f14794e.f14613a.mo14551d().mo14681x().mo14617c("Default data collection is different than actual status", Boolean.valueOf(this.f14793d), Boolean.valueOf(o));
        }
        this.f14794e.m18333P();
    }
}
