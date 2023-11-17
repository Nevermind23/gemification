package com.threatmetrix.TrustDefender;

import com.salesforce.marketingcloud.C11398b;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.s */
public class C11987s extends C11935m1 {

    /* renamed from: g */
    private String f35277g;

    /* renamed from: h */
    private String f35278h;

    public C11987s(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_SUBSCRIBER;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            this.f35277g = C11914j.m43676c(t1Var.mo32051a());
            this.f35278h = C11914j.m43650A(t1Var.mo32051a());
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            String a = C17590g.SUBSCRIBER_CELL_INFO.mo45142a();
            String str = this.f35277g;
            String str2 = "";
            map.put(a, str == null ? str2 : C11921k0.m43716A(str, C11398b.f33142u));
            String a2 = C17590g.SUBSCRIBER_CELL_ID.mo45142a();
            String str3 = this.f35278h;
            if (str3 != null) {
                str2 = str3;
            }
            map.put(a2, str2);
        }
    }
}
