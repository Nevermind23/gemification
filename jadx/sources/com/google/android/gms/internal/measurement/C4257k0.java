package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
public final class C4257k0 extends C4476x {
    protected C4257k0() {
        this.f13791a.add(C4308n0.ADD);
        this.f13791a.add(C4308n0.DIVIDE);
        this.f13791a.add(C4308n0.MODULUS);
        this.f13791a.add(C4308n0.MULTIPLY);
        this.f13791a.add(C4308n0.NEGATE);
        this.f13791a.add(C4308n0.POST_DECREMENT);
        this.f13791a.add(C4308n0.POST_INCREMENT);
        this.f13791a.add(C4308n0.PRE_DECREMENT);
        this.f13791a.add(C4308n0.PRE_INCREMENT);
        this.f13791a.add(C4308n0.SUBTRACT);
    }

    /* renamed from: a */
    public final C4358q mo12835a(String str, C4363q4 q4Var, List list) {
        C4308n0 n0Var = C4308n0.ADD;
        int ordinal = C4381r5.m16552e(str).ordinal();
        if (ordinal == 0) {
            C4381r5.m16555h(C4308n0.ADD.name(), 2, list);
            C4358q b = q4Var.mo13484b((C4358q) list.get(0));
            C4358q b2 = q4Var.mo13484b((C4358q) list.get(1));
            if (!(b instanceof C4290m) && !(b instanceof C4426u) && !(b2 instanceof C4290m) && !(b2 instanceof C4426u)) {
                return new C4222i(Double.valueOf(b.mo13091u().doubleValue() + b2.mo13091u().doubleValue()));
            }
            return new C4426u(String.valueOf(b.mo13078c()).concat(String.valueOf(b2.mo13078c())));
        } else if (ordinal == 21) {
            C4381r5.m16555h(C4308n0.DIVIDE.name(), 2, list);
            return new C4222i(Double.valueOf(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue() / q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()));
        } else if (ordinal == 59) {
            C4381r5.m16555h(C4308n0.SUBTRACT.name(), 2, list);
            return new C4222i(Double.valueOf(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue() + new C4222i(Double.valueOf(-q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue())).mo13091u().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C4381r5.m16555h(str, 2, list);
            C4358q b3 = q4Var.mo13484b((C4358q) list.get(0));
            q4Var.mo13484b((C4358q) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            C4381r5.m16555h(str, 1, list);
            return q4Var.mo13484b((C4358q) list.get(0));
        } else {
            switch (ordinal) {
                case 44:
                    C4381r5.m16555h(C4308n0.MODULUS.name(), 2, list);
                    return new C4222i(Double.valueOf(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue() % q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()));
                case 45:
                    C4381r5.m16555h(C4308n0.MULTIPLY.name(), 2, list);
                    return new C4222i(Double.valueOf(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue() * q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()));
                case 46:
                    C4381r5.m16555h(C4308n0.NEGATE.name(), 1, list);
                    return new C4222i(Double.valueOf(-q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue()));
                default:
                    return super.mo13799b(str);
            }
        }
    }
}
