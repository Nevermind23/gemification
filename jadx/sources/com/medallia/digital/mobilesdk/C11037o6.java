package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Random;

/* renamed from: com.medallia.digital.mobilesdk.o6 */
class C11037o6 extends C11034o5<Object> {

    /* renamed from: l */
    private static final int f31728l = 100;

    /* renamed from: m */
    private static final int f31729m = 10000;

    /* renamed from: n */
    private static final double f31730n = 100.0d;

    /* renamed from: k */
    private C11038a f31731k;

    /* renamed from: com.medallia.digital.mobilesdk.o6$a */
    enum C11038a {
        INTEGER,
        DOUBLE
    }

    protected C11037o6(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: r */
    private Object m40448r() {
        Random random = new Random();
        return this.f31731k == C11038a.DOUBLE ? Double.valueOf(((double) random.nextInt(f31729m)) / f31730n) : Integer.valueOf(random.nextInt(100));
    }

    /* renamed from: a */
    public void mo28862a(C11038a aVar) {
        this.f31731k = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32215w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Object mo28122j() {
        String str;
        C11089s6.C11090a aVar;
        C11089s6 s6Var;
        Object r = m40448r();
        C10735b4.m39109b("SessionCalculatedPercentageCollector value: " + r);
        if (this.f31731k == C11038a.DOUBLE) {
            s6Var = C11089s6.m40668b();
            aVar = C11089s6.C11090a.SESSION_CALCULATED_PERCENTAGE;
            str = String.valueOf(((Double) r).doubleValue());
        } else {
            s6Var = C11089s6.m40668b();
            aVar = C11089s6.C11090a.SESSION_CALCULATED_PERCENTAGE;
            str = String.valueOf(((Integer) r).intValue());
        }
        s6Var.mo28984b(aVar, str);
        C10735b4.m39109b("SessionCalculatedPercentage: " + r + " saved to SharedPreferences");
        return r;
    }
}
