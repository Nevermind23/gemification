package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.o */
public class C11940o extends C11935m1 {

    /* renamed from: h */
    private static final String f35048h = C11907h.m43615j(C11940o.class);

    /* renamed from: g */
    public int f35049g;

    public C11940o(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: i */
    private int m43829i(C17603t tVar, String str, String str2, String str3) {
        int i;
        String x = C11914j.m43697x();
        if (x != null) {
            String str4 = f35048h;
            C11907h.C11908a.m43623a(str4, "Hooking application detected " + x);
            i = 1;
        } else {
            i = 0;
        }
        if (!C11996u0.m44036s().mo32072e() && C11996u0.m44036s().mo32061A()) {
            i |= 2;
        }
        if (C11921k0.m43718a(str2) && new C11891d0(tVar, str, "SHENASE_A", str2, (String) null, false).mo31941a(tVar)) {
            i |= 4;
        }
        return new C11891d0(tVar, str, "SHENASE_D", str3, C11876a0.m43518c(tVar), true).mo31941a(tVar) ? i | 4 : i;
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_MALICIOUS_APPS;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null && t1Var.mo32055e() != null && map != null && this.f35049g == 0) {
            this.f35049g = m43829i(t1Var.mo32051a(), t1Var.mo32059i(), (String) map.get(C17590g.ADVERTISING_ID.mo45142a()), t1Var.mo32052b());
            if (t1Var.mo32055e().mo31974o()) {
                this.f35049g |= 2;
            }
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null && this.f35049g != 0) {
            map.put(C17590g.MALICIOUS_APP_STATUS.mo45142a(), String.valueOf(this.f35049g));
        }
    }
}
