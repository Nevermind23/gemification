package com.medallia.digital.mobilesdk;

import android.telephony.TelephonyManager;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.b5 */
class C10738b5 extends C11034o5<String> {

    /* renamed from: k */
    private static final String f30696k = "UNKNOWN";

    protected C10738b5(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m39118s() {
        TelephonyManager j = this.f31722g.mo28999j();
        if (j != null) {
            return j.getSimOperatorName() == null ? f30696k : j.getSimOperatorName();
        }
        C10735b4.m39111c("TelephonyManager memory is not available");
        return f30696k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32205m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m39118s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Network carrier : %s", new Object[]{s}));
        return s;
    }
}
