package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.z0 */
public class C12018z0 extends C11935m1 {

    /* renamed from: g */
    private String f35392g;

    public C12018z0(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_ADVERTISING_ID;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            if (C11921k0.m43732o(t1Var.mo32057g())) {
                this.f35392g = t1Var.mo32057g();
            } else if (C11921k0.m43739v(this.f35392g)) {
                this.f35392g = C11914j.m43653D(t1Var.mo32051a());
            }
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null && C11921k0.m43718a(this.f35392g)) {
            map.put(C17590g.ADVERTISING_ID.mo45142a(), this.f35392g);
        }
    }
}
