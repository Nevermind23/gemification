package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.t3 */
class C11098t3 extends C11034o5<String> {
    protected C11098t3(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m40706s() {
        C11095t0 t0Var = this.f31722g;
        if (t0Var != null) {
            return t0Var.mo28995f().toString();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32206n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40706s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Language : %s", new Object[]{s}));
        return s;
    }
}
