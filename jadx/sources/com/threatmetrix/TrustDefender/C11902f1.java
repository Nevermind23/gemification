package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.f1 */
public class C11902f1 extends C11935m1 {

    /* renamed from: g */
    private String f34829g;

    public C11902f1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_FINGERPRINT;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null && this.f34829g == null) {
            this.f34829g = C11914j.m43688o(t1Var.mo32051a());
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.DEVICE_FINGERPRINT.mo45142a(), C11921k0.m43719b(this.f34829g));
        }
    }
}
