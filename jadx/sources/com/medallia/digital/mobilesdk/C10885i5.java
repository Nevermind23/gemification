package com.medallia.digital.mobilesdk;

import android.os.Build;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.i5 */
class C10885i5 extends C11034o5<String> {
    protected C10885i5(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m39726s() {
        return Build.VERSION.RELEASE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32203k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m39726s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Os version : %s", new Object[]{s}));
        return s;
    }
}
