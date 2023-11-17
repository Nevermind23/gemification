package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w */
public final class C4460w extends C4476x {
    public C4460w() {
        this.f13791a.add(C4308n0.BITWISE_AND);
        this.f13791a.add(C4308n0.BITWISE_LEFT_SHIFT);
        this.f13791a.add(C4308n0.BITWISE_NOT);
        this.f13791a.add(C4308n0.BITWISE_OR);
        this.f13791a.add(C4308n0.BITWISE_RIGHT_SHIFT);
        this.f13791a.add(C4308n0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f13791a.add(C4308n0.BITWISE_XOR);
    }

    /* renamed from: a */
    public final C4358q mo12835a(String str, C4363q4 q4Var, List list) {
        C4308n0 n0Var = C4308n0.ADD;
        switch (C4381r5.m16552e(str).ordinal()) {
            case 4:
                C4381r5.m16555h(C4308n0.BITWISE_AND.name(), 2, list);
                return new C4222i(Double.valueOf((double) (C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue()) & C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()))));
            case 5:
                C4381r5.m16555h(C4308n0.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C4222i(Double.valueOf((double) (C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue()) << ((int) (C4381r5.m16551d(q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()) & 31)))));
            case 6:
                C4381r5.m16555h(C4308n0.BITWISE_NOT.name(), 1, list);
                return new C4222i(Double.valueOf((double) (~C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue()))));
            case 7:
                C4381r5.m16555h(C4308n0.BITWISE_OR.name(), 2, list);
                return new C4222i(Double.valueOf((double) (C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue()) | C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()))));
            case 8:
                C4381r5.m16555h(C4308n0.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C4222i(Double.valueOf((double) (C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue()) >> ((int) (C4381r5.m16551d(q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()) & 31)))));
            case 9:
                C4381r5.m16555h(C4308n0.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C4222i(Double.valueOf((double) (C4381r5.m16551d(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue()) >>> ((int) (C4381r5.m16551d(q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()) & 31)))));
            case 10:
                C4381r5.m16555h(C4308n0.BITWISE_XOR.name(), 2, list);
                return new C4222i(Double.valueOf((double) (C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(0)).mo13091u().doubleValue()) ^ C4381r5.m16549b(q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue()))));
            default:
                return super.mo13799b(str);
        }
    }
}
