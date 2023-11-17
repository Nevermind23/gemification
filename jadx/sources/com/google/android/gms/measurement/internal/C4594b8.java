package com.google.android.gms.measurement.internal;

import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.b8 */
final class C4594b8 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C8252f f14228d;

    /* renamed from: e */
    final /* synthetic */ C4630e8 f14229e;

    C4594b8(C4630e8 e8Var, C8252f fVar) {
        this.f14229e = e8Var;
        this.f14228d = fVar;
    }

    public final void run() {
        synchronized (this.f14229e) {
            this.f14229e.f14316a = false;
            if (!this.f14229e.f14318c.mo14396z()) {
                this.f14229e.f14318c.f14613a.mo14551d().mo14674q().mo14615a("Connected to remote service");
                this.f14229e.f14318c.mo14394x(this.f14228d);
            }
        }
    }
}
