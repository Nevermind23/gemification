package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v5 */
public final /* synthetic */ class C4814v5 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C4793t6 f14965d;

    public /* synthetic */ C4814v5(C4793t6 t6Var) {
        this.f14965d = t6Var;
    }

    public final void run() {
        C4793t6 t6Var = this.f14965d;
        t6Var.mo14554h();
        if (!t6Var.f14613a.mo14849F().f14275s.mo14963b()) {
            long a = t6Var.f14613a.mo14849F().f14276t.mo14295a();
            t6Var.f14613a.mo14849F().f14276t.mo14296b(1 + a);
            t6Var.f14613a.mo14876z();
            if (a >= 5) {
                t6Var.f14613a.mo14551d().mo14680w().mo14615a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                t6Var.f14613a.mo14849F().f14275s.mo14962a(true);
                return;
            }
            t6Var.f14613a.mo14864j();
            return;
        }
        t6Var.f14613a.mo14551d().mo14674q().mo14615a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
