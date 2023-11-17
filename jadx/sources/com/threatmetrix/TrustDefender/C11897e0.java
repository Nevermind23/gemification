package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.e0 */
public class C11897e0 extends C11935m1 {

    /* renamed from: g */
    public String f34823g;

    /* renamed from: h */
    public boolean f34824h = false;

    public C11897e0(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_PLUGIN_DETECTION;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            this.f34823g = C11914j.m43666Q(t1Var.mo32051a());
            this.f34824h = true;
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.PLUGIN_PATH_STR.mo45142a(), this.f34824h ? this.f34823g : C12004w0.f35343a);
            this.f34824h = false;
        }
    }
}
