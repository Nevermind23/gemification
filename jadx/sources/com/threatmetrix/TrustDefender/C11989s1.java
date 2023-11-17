package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.s1 */
public class C11989s1 extends C11935m1 {

    /* renamed from: g */
    private long f35280g;

    /* renamed from: h */
    private long f35281h;

    /* renamed from: i */
    private long f35282i;

    /* renamed from: j */
    private String f35283j;

    /* renamed from: k */
    private String f35284k;

    public C11989s1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_DEVICE_STATE;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            this.f35284k = C11921k0.m43727j(C11914j.m43682i(t1Var.mo32051a()));
            this.f35280g = C11914j.m43663N();
            this.f35281h = C11914j.m43680g();
            this.f35282i = C11914j.m43655F();
            this.f35283j = C11914j.m43651B(this.f35281h, this.f35280g);
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.DEVICE_STATE.mo45142a(), C11921k0.m43719b(this.f35283j));
            String a = C17590g.DEVICE_BOOT_TIME.mo45142a();
            long j = this.f35280g;
            String str = "";
            map.put(a, j == 0 ? str : String.valueOf(j));
            String a2 = C17590g.DEVICE_FREE_SPACE.mo45142a();
            long j2 = this.f35281h;
            map.put(a2, j2 == 0 ? str : String.valueOf(j2));
            String a3 = C17590g.DEVICE_TOTAL_SPACE.mo45142a();
            long j3 = this.f35282i;
            if (j3 != 0) {
                str = String.valueOf(j3);
            }
            map.put(a3, str);
            map.put(C17590g.DEVICE_BATTERY_STATUS.mo45142a(), this.f35284k);
        }
    }
}
