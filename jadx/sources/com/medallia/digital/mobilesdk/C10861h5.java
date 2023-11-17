package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.h5 */
class C10861h5 extends C11034o5<String> {

    /* renamed from: k */
    private static final String f31147k = "Android";

    protected C10861h5(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m39637s() {
        return "Android";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32202j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m39637s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Os name: %s", new Object[]{s}));
        return s;
    }
}
