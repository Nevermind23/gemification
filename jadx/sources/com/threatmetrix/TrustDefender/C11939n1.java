package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;
import p585re.C17600q;

/* renamed from: com.threatmetrix.TrustDefender.n1 */
public class C11939n1 extends C11935m1 {

    /* renamed from: g */
    private String f35047g;

    public C11939n1(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_FINGERPRINT_CAPS;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        C17600q p;
        if (t1Var.mo32051a() != null && t1Var.mo32055e() != null && (p = t1Var.mo32055e().mo31975p()) != null) {
            this.f35047g = p.mo45178j(t1Var.mo32051a().f49314a, C11892d1.m43575b());
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.FINGERPRINT_CAPS.mo45142a(), this.f35047g);
        }
    }
}
