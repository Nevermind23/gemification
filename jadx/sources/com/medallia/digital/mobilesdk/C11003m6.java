package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.m6 */
class C11003m6 extends C11034o5<String> {
    protected C11003m6(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m40300s() {
        return "4.1.5";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32214v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40300s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > SDK version : %s", new Object[]{s}));
        return s;
    }
}
