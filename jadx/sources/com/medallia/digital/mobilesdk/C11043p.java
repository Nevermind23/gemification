package com.medallia.digital.mobilesdk;

import android.content.pm.ApplicationInfo;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.p */
class C11043p extends C11034o5<String> {
    protected C11043p(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m40476s() {
        ApplicationInfo a = this.f31722g.mo28990a();
        if (a != null) {
            int i = a.labelRes;
            if (i != 0) {
                return C10884i4.m39721c().mo28483b().getString(i);
            }
            CharSequence charSequence = a.nonLocalizedLabel;
            if (charSequence != null) {
                return charSequence.toString();
            }
            return null;
        }
        C10735b4.m39111c("Context is null");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32211s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40476s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > App name : %s", new Object[]{s}));
        return s;
    }
}
