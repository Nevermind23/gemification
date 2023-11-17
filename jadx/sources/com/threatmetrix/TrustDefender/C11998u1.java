package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.u1 */
public class C11998u1 extends C11935m1 {

    /* renamed from: i */
    private static final String f35315i = C11907h.m43615j(C11998u1.class);

    /* renamed from: g */
    private String f35316g;

    /* renamed from: h */
    private String f35317h;

    public C11998u1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_FONT;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (this.f35317h == null || this.f35316g == null) {
            StringBuilder sb = new StringBuilder();
            String r = C11914j.m43691r(sb);
            this.f35316g = r;
            if (r != null) {
                this.f35317h = sb.toString();
            }
            String str = f35315i;
            C11907h.C11908a.m43624b(str, "Got " + this.f35317h + " fonts gives: " + this.f35316g);
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.DEVICE_FONT_COUNT.mo45142a(), this.f35317h);
            map.put(C17590g.DEVICE_FONT_HASH.mo45142a(), C11921k0.m43719b(this.f35316g));
        }
    }
}
