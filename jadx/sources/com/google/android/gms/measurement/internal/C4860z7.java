package com.google.android.gms.measurement.internal;

import p248s7.C8252f;

/* renamed from: com.google.android.gms.measurement.internal.z7 */
final class C4860z7 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ C8252f f15080d;

    /* renamed from: e */
    final /* synthetic */ C4630e8 f15081e;

    C4860z7(C4630e8 e8Var, C8252f fVar) {
        this.f15081e = e8Var;
        this.f15080d = fVar;
    }

    public final void run() {
        synchronized (this.f15081e) {
            this.f15081e.f14316a = false;
            if (!this.f15081e.f14318c.mo14396z()) {
                this.f15081e.f14318c.f14613a.mo14551d().mo14679v().mo14615a("Connected to service");
                this.f15081e.f14318c.mo14394x(this.f15080d);
            }
        }
    }
}
