package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.rf */
public final class C4391rf extends C4239j {

    /* renamed from: f */
    private final C4459vf f13648f;

    public C4391rf(C4459vf vfVar) {
        super("internal.registerCallback");
        this.f13648f = vfVar;
    }

    /* renamed from: a */
    public final C4358q mo13126a(C4363q4 q4Var, List list) {
        int i;
        C4381r5.m16555h(this.f13359d, 3, list);
        String c = q4Var.mo13484b((C4358q) list.get(0)).mo13078c();
        C4358q b = q4Var.mo13484b((C4358q) list.get(1));
        if (b instanceof C4341p) {
            C4358q b2 = q4Var.mo13484b((C4358q) list.get(2));
            if (b2 instanceof C4307n) {
                C4307n nVar = (C4307n) b2;
                if (nVar.mo13080g("type")) {
                    String c2 = nVar.mo13084j("type").mo13078c();
                    if (nVar.mo13080g("priority")) {
                        i = C4381r5.m16549b(nVar.mo13084j("priority").mo13091u().doubleValue());
                    } else {
                        i = 1000;
                    }
                    this.f13648f.mo13783a(c, i, (C4341p) b, c2);
                    return C4358q.f13593U2;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
