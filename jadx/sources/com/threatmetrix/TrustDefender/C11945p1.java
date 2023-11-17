package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.p1 */
public class C11945p1 extends C11935m1 {

    /* renamed from: g */
    private int f35066g = 0;

    /* renamed from: h */
    private String f35067h;

    public C11945p1(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_DEVICE_ENCRYPT_AND_STATUS;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            this.f35066g = C11914j.m43664O(t1Var.mo32051a());
            String j = C11914j.m43683j(t1Var.mo32051a());
            this.f35067h = j;
            if (j != null) {
                this.f35067h = String.valueOf(j.compareTo("1") == 0);
            }
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.DEVICE_ENCRYPTION_STATUS.mo45142a(), String.valueOf(this.f35066g));
            map.put(C17590g.DEVICE_DEV_ENABLED_STATUS.mo45142a(), this.f35067h);
        }
    }
}
