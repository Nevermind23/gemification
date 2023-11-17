package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.e0 */
public final class C4155e0 extends C4476x {
    protected C4155e0() {
        this.f13791a.add(C4308n0.AND);
        this.f13791a.add(C4308n0.NOT);
        this.f13791a.add(C4308n0.OR);
    }

    /* renamed from: a */
    public final C4358q mo12835a(String str, C4363q4 q4Var, List list) {
        C4308n0 n0Var = C4308n0.ADD;
        int ordinal = C4381r5.m16552e(str).ordinal();
        if (ordinal == 1) {
            C4381r5.m16555h(C4308n0.AND.name(), 2, list);
            C4358q b = q4Var.mo13484b((C4358q) list.get(0));
            if (!b.mo13092v().booleanValue()) {
                return b;
            }
            return q4Var.mo13484b((C4358q) list.get(1));
        } else if (ordinal == 47) {
            C4381r5.m16555h(C4308n0.NOT.name(), 1, list);
            return new C4188g(Boolean.valueOf(!q4Var.mo13484b((C4358q) list.get(0)).mo13092v().booleanValue()));
        } else if (ordinal != 50) {
            return super.mo13799b(str);
        } else {
            C4381r5.m16555h(C4308n0.OR.name(), 2, list);
            C4358q b2 = q4Var.mo13484b((C4358q) list.get(0));
            if (b2.mo13092v().booleanValue()) {
                return b2;
            }
            return q4Var.mo13484b((C4358q) list.get(1));
        }
    }
}
