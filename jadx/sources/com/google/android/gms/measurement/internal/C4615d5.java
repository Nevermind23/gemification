package com.google.android.gms.measurement.internal;

import p182n6.C7264i;
import p248s7.C8245b;

/* renamed from: com.google.android.gms.measurement.internal.d5 */
final class C4615d5 implements Runnable {

    /* renamed from: d */
    final /* synthetic */ zzq f14281d;

    /* renamed from: e */
    final /* synthetic */ C4704l5 f14282e;

    C4615d5(C4704l5 l5Var, zzq zzq) {
        this.f14282e = l5Var;
        this.f14281d = zzq;
    }

    public final void run() {
        this.f14282e.f14588b.mo14584e();
        C4719m9 T1 = this.f14282e.f14588b;
        zzq zzq = this.f14281d;
        T1.mo14552f().mo14554h();
        T1.mo14586g();
        C7264i.m27898g(zzq.f15117d);
        C8245b b = C8245b.m31053b(zzq.f15138y);
        C8245b V = T1.mo14576V(zzq.f15117d);
        T1.mo14551d().mo14679v().mo14617c("Setting consent, package, consent", zzq.f15117d, b);
        T1.mo14567A(zzq.f15117d, b);
        if (b.mo23436k(V)) {
            T1.mo14606v(zzq);
        }
    }
}
