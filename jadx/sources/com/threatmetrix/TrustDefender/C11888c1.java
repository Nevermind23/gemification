package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11935m1;
import com.threatmetrix.TrustDefender.C11969r1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.c1 */
public class C11888c1 extends C11935m1 {

    /* renamed from: h */
    private static final String f34802h = C11907h.m43615j(C11989s1.class);

    /* renamed from: g */
    private String f34803g;

    public C11888c1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_DEVICE;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null && this.f34803g == null) {
            this.f34803g = C11914j.m43693t(t1Var.mo32051a());
            String str = f34802h;
            C11907h.C11908a.m43624b(str, "got agent_app_info: " + this.f34803g);
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.AGENT_OS_VERSION.mo45142a(), C11921k0.m43719b(C11969r1.C11983n.C11984a.f35245a));
            map.put(C17590g.AGENT_SECURITY_PATCH_LEVEL.mo45142a(), C11921k0.m43719b(C11969r1.C11983n.C11984a.f35248d));
            map.put(C17590g.AGENT_LANGUAGE.mo45142a(), C11921k0.m43719b(C11999v.f35322h));
            String a = C17590g.AGENT_BRAND.mo45142a();
            map.put(a, C11921k0.m43719b(C11969r1.C11983n.f35229e + ", " + C11969r1.C11983n.f35237m));
            map.put(C17590g.AGENT_DEVICE.mo45142a(), C11921k0.m43719b(C11969r1.C11983n.f35233i));
            map.put(C17590g.AGENT_MODEL.mo45142a(), C11921k0.m43719b(C11969r1.C11983n.f35234j));
            map.put(C17590g.AGENT_OS.mo45142a(), C11921k0.m43719b(C11914j.m43665P()));
            map.put(C17590g.AGENT_CONF_OS.mo45142a(), C11914j.m43671V());
            map.put(C17590g.AGENT_TYPE.mo45142a(), "agent_mobile");
            map.put(C17590g.AGENT_VERSION.mo45142a(), "6.3-81");
            map.put(C17590g.AGENT_APP_INFO.mo45142a(), this.f34803g);
        }
    }
}
