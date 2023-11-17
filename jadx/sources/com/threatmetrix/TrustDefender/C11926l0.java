package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.l0 */
public class C11926l0 extends C11935m1 {

    /* renamed from: g */
    private String f34895g;

    public C11926l0(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_LOCALE_INFO;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (this.f34895g == null) {
            this.f34895g = C11914j.m43699z();
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null && this.f34895g != null) {
            map.put(C17590g.AGENT_LOCALE.mo45142a(), this.f34895g);
        }
    }
}
