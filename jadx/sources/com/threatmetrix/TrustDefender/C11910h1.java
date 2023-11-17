package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.h1 */
public class C11910h1 extends C11935m1 {

    /* renamed from: g */
    private String f34839g;

    /* renamed from: h */
    private String f34840h;

    public C11910h1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_COOKIE;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            if (this.f34839g == null || this.f34840h == null) {
                String a = C11876a0.m43516a(t1Var.mo32051a());
                if (this.f34839g == null) {
                    this.f34839g = C11876a0.m43521f(a);
                }
                if (this.f34840h == null) {
                    this.f34840h = C11876a0.m43517b(t1Var.mo32052b(), a);
                }
            }
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.DEVICE_LOCAL_STORAGE_COOKIE.mo45142a(), C11921k0.m43719b(this.f34839g));
            map.put(C17590g.DEVICE_FLASH_COOKIE.mo45142a(), C11921k0.m43719b(this.f34840h));
        }
    }
}
