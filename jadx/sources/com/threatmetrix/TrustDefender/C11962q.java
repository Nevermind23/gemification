package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;
import p585re.C17596m;

/* renamed from: com.threatmetrix.TrustDefender.q */
public class C11962q extends C11935m1 {

    /* renamed from: g */
    private C17596m f35136g = C17596m.NOT_CHECKED;

    public C11962q(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_SELINUX_MODE;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        this.f35136g = C11914j.m43689p();
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            String a = C17590g.SELINUX_MODE.mo45142a();
            C17596m mVar = this.f35136g;
            map.put(a, mVar == null ? null : mVar.mo45165a());
        }
    }
}
