package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.i1 */
public class C11913i1 extends C11935m1 {

    /* renamed from: g */
    private int f34848g;

    /* renamed from: h */
    private int f34849h;

    public C11913i1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_DISPLAY;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            C12015y1 y1Var = new C12015y1(t1Var.mo32051a());
            this.f34848g = y1Var.mo32106l();
            this.f34849h = y1Var.mo32107m();
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            String a = C17590g.DEVICE_DISPLAY_RESOLUTION.mo45142a();
            map.put(a, Math.max(this.f34848g, this.f34849h) + "x" + Math.min(this.f34848g, this.f34849h));
            map.put("__orientation", this.f34848g >= this.f34849h ? "landscape" : "portrait");
        }
    }
}
