package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s8 */
public final class C4401s8 extends C4239j {

    /* renamed from: f */
    private final C4120c f13669f;

    public C4401s8(C4120c cVar) {
        super("internal.eventLogger");
        this.f13669f = cVar;
    }

    /* renamed from: a */
    public final C4358q mo13126a(C4363q4 q4Var, List list) {
        Map map;
        C4381r5.m16555h(this.f13359d, 3, list);
        String c = q4Var.mo13484b((C4358q) list.get(0)).mo13078c();
        long a = (long) C4381r5.m16548a(q4Var.mo13484b((C4358q) list.get(1)).mo13091u().doubleValue());
        C4358q b = q4Var.mo13484b((C4358q) list.get(2));
        if (b instanceof C4307n) {
            map = C4381r5.m16554g((C4307n) b);
        } else {
            map = new HashMap();
        }
        this.f13669f.mo12963e(c, a, map);
        return C4358q.f13593U2;
    }
}
