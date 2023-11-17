package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.k */
public class C11920k extends C11935m1 {

    /* renamed from: g */
    private String f34869g;

    public C11920k(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_PUSH_TOKEN;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (C11914j.m43662M()) {
            this.f34869g = C11914j.m43677d();
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.FIREBASE_PUSH_TOKEN.mo45142a(), this.f34869g);
        }
    }
}
