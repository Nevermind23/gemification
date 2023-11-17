package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k */
public abstract /* synthetic */ class C4256k {
    /* renamed from: a */
    public static C4358q m16188a(C4290m mVar, C4358q qVar, C4363q4 q4Var, List list) {
        if (mVar.mo13080g(qVar.mo13078c())) {
            C4358q j = mVar.mo13084j(qVar.mo13078c());
            if (j instanceof C4239j) {
                return ((C4239j) j).mo13126a(q4Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{qVar.mo13078c()}));
        } else if ("hasOwnProperty".equals(qVar.mo13078c())) {
            C4381r5.m16555h("hasOwnProperty", 1, list);
            if (mVar.mo13080g(q4Var.mo13484b((C4358q) list.get(0)).mo13078c())) {
                return C4358q.f13598Z2;
            }
            return C4358q.f13599a3;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{qVar.mo13078c()}));
        }
    }

    /* renamed from: b */
    public static Iterator m16189b(Map map) {
        return new C4273l(map.keySet().iterator());
    }
}
