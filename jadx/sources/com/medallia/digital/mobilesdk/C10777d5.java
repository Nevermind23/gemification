package com.medallia.digital.mobilesdk;

import android.telephony.TelephonyManager;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.d5 */
class C10777d5 extends C11034o5<String> {

    /* renamed from: k */
    private static final String f30866k = "UNKNOWN";

    protected C10777d5(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m39314s() {
        TelephonyManager j = this.f31722g.mo28999j();
        if (j != null) {
            return j.getNetworkOperatorName() == null ? f30866k : j.getNetworkOperatorName();
        }
        C10735b4.m39111c("TelephonyManager memory is not available");
        return f30866k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32204l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m39314s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Network provider : %s", new Object[]{s}));
        return s;
    }
}
