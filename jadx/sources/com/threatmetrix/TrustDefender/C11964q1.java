package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Locale;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.q1 */
public class C11964q1 extends C11935m1 {

    /* renamed from: i */
    private static final String f35138i = C11907h.m43615j(C11964q1.class);

    /* renamed from: g */
    public long f35139g;

    /* renamed from: h */
    public long f35140h;

    public C11964q1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_APP_INSTALLATION;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null && this.f35139g == 0 && this.f35140h == 0) {
            this.f35139g = C11914j.m43679f(t1Var.mo32051a());
            this.f35140h = C11914j.m43669T(t1Var.mo32051a());
            mo32023i();
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            String a = C17590g.APP_INSTALLATION_TIME.mo45142a();
            long j = this.f35139g;
            String str = null;
            map.put(a, j == 0 ? null : Long.toString(j));
            String a2 = C17590g.APP_MODIFICATION_TIME.mo45142a();
            long j2 = this.f35140h;
            if (j2 != 0) {
                str = Long.toString(j2);
            }
            map.put(a2, str);
        }
    }

    /* renamed from: i */
    public void mo32023i() {
        long j = this.f35139g;
        if (j > this.f35140h) {
            this.f35140h = 0;
            if (j - 0 >= 300) {
                String str = f35138i;
                C11907h.m43607b(str, "App install time is later than modify time: " + String.format(Locale.ENGLISH, "installTime[%d], modifyTime[%d]", new Object[]{Long.valueOf(this.f35139g), Long.valueOf(this.f35140h)}));
                this.f35139g = 0;
            }
        }
    }
}
