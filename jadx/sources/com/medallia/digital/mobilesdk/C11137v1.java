package com.medallia.digital.mobilesdk;

import android.os.Build;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.v1 */
class C11137v1 extends C11034o5<String> {
    protected C11137v1(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m40802s() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32199g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40802s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Device vendor : %s", new Object[]{s}));
        return s;
    }
}
