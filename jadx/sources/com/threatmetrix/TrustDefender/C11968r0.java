package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;
import p585re.C17603t;
import p585re.C17604u;

/* renamed from: com.threatmetrix.TrustDefender.r0 */
public class C11968r0 extends C11935m1 {

    /* renamed from: g */
    private String f35160g;

    /* renamed from: h */
    private String f35161h;

    /* renamed from: i */
    private String f35162i;

    /* renamed from: j */
    private String f35163j;

    /* renamed from: k */
    private String f35164k;

    public C11968r0(long j) {
        super(j);
    }

    /* renamed from: i */
    private String m43930i(C11923l lVar, String str, C17603t tVar) {
        String str2 = tVar.f49314a.getApplicationInfo().nativeLibraryDir;
        String m = lVar.mo31972m(str);
        return (!C11921k0.m43732o(str2) || !C11921k0.m43732o(m)) ? "" : str2.concat("/lib".concat(m).concat(".so"));
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_SELF_HASH;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null && t1Var.mo32055e() != null) {
            if (this.f35160g == null) {
                this.f35160g = C11905g1.m43604b(t1Var.mo32051a(), C17604u.MD5);
                this.f35161h = C11905g1.m43604b(t1Var.mo32051a(), C17604u.SHA256);
            }
            String concat = t1Var.mo32051a().f49314a.getApplicationInfo().nativeLibraryDir.concat("/lib".concat("TMXProfiling-6.3-81-jni").concat(".so"));
            String i = m43930i(t1Var.mo32055e(), "MODULE_TYPE_DEVICE_SECURITY", t1Var.mo32051a());
            String i2 = m43930i(t1Var.mo32055e(), "MODULE_TYPE_AUTHENTICATION", t1Var.mo32051a());
            this.f35162i = C11996u0.m44036s().mo32070c(concat);
            this.f35164k = C11996u0.m44036s().mo32070c(i2);
            this.f35163j = C11996u0.m44036s().mo32070c(i);
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.APP_SELF_HASH_MD5.mo45142a(), this.f35160g);
            map.put(C17590g.APP_SELF_HASH_SHA256.mo45142a(), this.f35161h);
            map.put(C17590g.SELF_HASH_BASE_MODULE.mo45142a(), this.f35162i);
            map.put(C17590g.SELF_HASH_AUTH_MODULE.mo45142a(), this.f35164k);
            map.put(C17590g.SELF_HASH_DSH_MODULE.mo45142a(), this.f35163j);
        }
    }
}
