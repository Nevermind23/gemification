package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.x1 */
public class C12009x1 extends C11935m1 {

    /* renamed from: g */
    private int f35360g;

    public C12009x1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_CPU_CORE;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        this.f35360g = C11914j.m43695v();
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.NUM_OF_CPU_CORES.mo45142a(), Integer.toString(this.f35360g));
        }
    }
}
