package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.s0 */
public class C11988s0 extends C11935m1 {

    /* renamed from: g */
    private String f35279g;

    public C11988s0(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_SYSTEM_PROXY;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            this.f35279g = C11914j.m43668S(t1Var.mo32051a());
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.SYSTEM_PROXY.mo45142a(), this.f35279g);
        }
    }
}
