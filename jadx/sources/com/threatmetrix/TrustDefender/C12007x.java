package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11914j;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import java.util.TimeZone;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.x */
public class C12007x extends C11935m1 {

    /* renamed from: g */
    private int f35355g;

    /* renamed from: h */
    private int f35356h;

    /* renamed from: i */
    private String f35357i;

    public C12007x(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_TIMEZONE_INFO;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        this.f35356h = 0;
        this.f35355g = 0;
        this.f35357i = null;
        C11914j.C11915a aVar = new C11914j.C11915a();
        if (C11914j.m43692s(aVar)) {
            this.f35356h = aVar.f34857b;
            this.f35355g = aVar.f34856a;
        }
        this.f35357i = TimeZone.getDefault().getID();
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.TIMEZONE_GMT_OFFSET.mo45142a(), String.valueOf(this.f35355g));
            map.put(C17590g.TIMEZONE_DST_DIFF.mo45142a(), String.valueOf(this.f35356h));
            map.put(C17590g.TIMEZONE_NAME.mo45142a(), this.f35357i);
        }
    }
}
