package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.HashMap;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.k1 */
public class C11922k1 extends C11935m1 {

    /* renamed from: g */
    private final Map f34881g = new HashMap();

    public C11922k1(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_TAMPER_CODE;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null && t1Var.mo32055e() != null && t1Var.mo32060j() != null) {
            int i = mo31965i(t1Var.mo32060j().f35041u);
            this.f34881g.put(C17590g.TAMPER_CODE_BASE_MODULE.mo45142a(), Long.toString(C11996u0.m44036s().mo32086t(i)));
            this.f34881g.put(C17590g.TAMPER_CODE_AUTH_MODULE.mo45142a(), Long.toString(t1Var.mo32055e().mo31969h("MODULE_TYPE_AUTHENTICATION", i).longValue()));
            this.f34881g.put(C17590g.TAMPER_CODE_BB_MODULE.mo45142a(), Long.toString(t1Var.mo32055e().mo31969h("MODULE_TYPE_BIOMETRICS", i).longValue()));
            this.f34881g.put(C17590g.TAMPER_CODE_DSH_MODULE.mo45142a(), Long.toString(t1Var.mo32055e().mo31969h("MODULE_TYPE_DEVICE_SECURITY", i).longValue()));
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            C17590g gVar = C17590g.TAMPER_CODE_BASE_MODULE;
            map.put(gVar.mo45142a(), this.f34881g.get(gVar.mo45142a()));
            C17590g gVar2 = C17590g.TAMPER_CODE_AUTH_MODULE;
            map.put(gVar2.mo45142a(), this.f34881g.get(gVar2.mo45142a()));
            C17590g gVar3 = C17590g.TAMPER_CODE_BB_MODULE;
            map.put(gVar3.mo45142a(), this.f34881g.get(gVar3.mo45142a()));
            C17590g gVar4 = C17590g.TAMPER_CODE_DSH_MODULE;
            map.put(gVar4.mo45142a(), this.f34881g.get(gVar4.mo45142a()));
        }
    }

    /* renamed from: i */
    public int mo31965i(String str) {
        int s = C11921k0.m43736s(str);
        return (s % 20) + ((s % 3) * 21);
    }
}
