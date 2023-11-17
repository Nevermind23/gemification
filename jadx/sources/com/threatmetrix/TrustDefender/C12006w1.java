package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.w1 */
public class C12006w1 extends C11935m1 {

    /* renamed from: g */
    private String f35354g;

    public C12006w1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_DEVICE_NAME;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            String W = C11914j.m43672W(t1Var.mo32051a());
            this.f35354g = W;
            if (W == null) {
                this.f35354g = "";
            }
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.DEVICE_NAME.mo45142a(), this.f35354g);
        }
    }
}
