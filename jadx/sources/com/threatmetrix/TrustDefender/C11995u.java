package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.u */
public class C11995u extends C11935m1 {

    /* renamed from: g */
    private String f35302g;

    /* renamed from: h */
    private String f35303h;

    /* renamed from: i */
    private String f35304i;

    /* renamed from: j */
    private String f35305j;

    public C11995u(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_LOCATION;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null && t1Var.mo32056f() != null) {
            this.f35302g = String.valueOf(t1Var.mo32056f().f34907a);
            this.f35303h = String.valueOf(t1Var.mo32056f().f34908b);
            this.f35304i = t1Var.mo32056f().f34909c == null ? "" : String.valueOf(t1Var.mo32056f().f34909c);
            int i = C11914j.m43675b(t1Var.mo32051a()) ? 2 : 0;
            if (t1Var.mo32056f().f34910d) {
                i |= 1;
            }
            if (t1Var.mo32056f().f34911e) {
                i |= 4;
            }
            this.f35305j = String.valueOf(i);
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.LOCATION_LATITUDE.mo45142a(), this.f35302g);
            map.put(C17590g.LOCATION_LONGITUDE.mo45142a(), this.f35303h);
            map.put(C17590g.LOCATION_ACCURACY.mo45142a(), this.f35304i);
            map.put(C17590g.LOCATION_MOCK_STATUS.mo45142a(), this.f35305j);
        }
    }
}
