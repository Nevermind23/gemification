package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.q7 */
class C11071q7 extends C11034o5<String> {
    protected C11071q7(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m40605s() {
        try {
            return this.f31722g.mo28991b().getTimeZone().getDisplayName(false, 0);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32207o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40605s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Timezone : %s", new Object[]{s}));
        return s;
    }
}
