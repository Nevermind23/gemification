package com.threatmetrix.TrustDefender;

import com.salesforce.marketingcloud.C11398b;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.a1 */
public class C11877a1 extends C11935m1 {

    /* renamed from: h */
    private static final String f34681h = C11907h.m43615j(C11877a1.class);

    /* renamed from: g */
    public String f34682g;

    public C11877a1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_CONNECTIONS;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        String str;
        if (t1Var.mo32051a() != null) {
            String f = C11996u0.m44036s().mo32073f(t1Var.mo32051a());
            this.f34682g = f;
            String str2 = f34681h;
            if (f == null) {
                str = "No connections info";
            } else {
                str = "Get connections info" + this.f34682g;
            }
            C11907h.C11908a.m43624b(str2, str);
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.CONNECTIONS_INFO.mo45142a(), C11921k0.m43716A(this.f34682g, C11398b.f33141t));
        }
    }
}
