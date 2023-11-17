package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import p182n6.C7264i;
import p248s7.C8243a;
import p248s7.C8245b;

/* renamed from: com.google.android.gms.measurement.internal.g9 */
final class C4653g9 implements Callable {

    /* renamed from: d */
    final /* synthetic */ zzq f14461d;

    /* renamed from: e */
    final /* synthetic */ C4719m9 f14462e;

    C4653g9(C4719m9 m9Var, zzq zzq) {
        this.f14462e = m9Var;
        this.f14461d = zzq;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C8245b V = this.f14462e.mo14576V((String) C7264i.m27902k(this.f14461d.f15117d));
        C8243a aVar = C8243a.ANALYTICS_STORAGE;
        if (V.mo23435i(aVar) && C8245b.m31053b(this.f14461d.f15138y).mo23435i(aVar)) {
            return this.f14462e.mo14573S(this.f14461d).mo14730j0();
        }
        this.f14462e.mo14551d().mo14679v().mo14615a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
