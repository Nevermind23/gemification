package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;
import p585re.C17594k;
import p585re.C17600q;

/* renamed from: com.threatmetrix.TrustDefender.i0 */
public class C11912i0 extends C11935m1 {

    /* renamed from: h */
    private static final String f34846h = C11907h.m43615j(C11912i0.class);

    /* renamed from: g */
    private C17594k f34847g = null;

    public C11912i0(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_STRONG_ID;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        String str;
        if (map != null && t1Var.mo32055e() != null && t1Var.mo32051a() != null && t1Var.mo32060j() != null) {
            String str2 = (String) map.get(C17590g.FIREBASE_PUSH_TOKEN.mo45142a());
            String str3 = "";
            if (str2 != null) {
                str3 = str3.concat(str2);
            }
            String str4 = (String) map.get(C17590g.FINGERPRINT_CAPS.mo45142a());
            if (str4 != null) {
                str3 = str3.concat(str4);
            }
            if (!(t1Var.mo32058h() == null || (str = (String) t1Var.mo32058h().get(C17590g.STRONG_AUTH_STATUS.mo45142a())) == null)) {
                str3 = str3.concat(str);
            }
            C17600q p = t1Var.mo32055e().mo31975p();
            if (p != null && p.mo45180l()) {
                this.f34847g = p.mo45179k(t1Var.mo32060j().f35041u, str3, t1Var.mo32051a().f49314a);
            } else if (C12000v0.m44089k(t1Var.mo32051a().f49314a)) {
                this.f34847g = C12000v0.m44084f(t1Var.mo32060j().f35041u, t1Var.mo32051a(), str3);
                C11907h.C11908a.m43624b(f34846h, "Hardware key is available");
            }
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        C17594k kVar;
        if (map != null && (kVar = this.f34847g) != null) {
            map.putAll(kVar.mo45155a());
        }
    }
}
