package com.threatmetrix.TrustDefender;

import com.salesforce.marketingcloud.C11398b;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.List;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.t */
public class C11990t extends C11935m1 {

    /* renamed from: g */
    public String f35285g;

    /* renamed from: h */
    public String f35286h;

    public C11990t(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_ROOT_DETECTION;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null && t1Var.mo32060j() != null && !t1Var.mo32060j().f35045y.isEmpty()) {
            List K = C11914j.m43660K(t1Var.mo32051a(), t1Var.mo32060j().f35045y);
            this.f35285g = String.valueOf(K.size());
            this.f35286h = C11921k0.m43743z(K, ";", true);
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.ROOT_DETECTION_PATH_COUNT.mo45142a(), this.f35285g);
            map.put(C17590g.ROOT_DETECTION_PATH_STR.mo45142a(), C11921k0.m43716A(this.f35286h, C11398b.f33142u));
        }
    }
}
