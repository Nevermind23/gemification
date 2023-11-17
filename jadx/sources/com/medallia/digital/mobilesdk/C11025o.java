package com.medallia.digital.mobilesdk;

import android.content.pm.ApplicationInfo;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.o */
class C11025o extends C11034o5<String> {
    protected C11025o(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m40401s() {
        ApplicationInfo a = this.f31722g.mo28990a();
        if (a != null) {
            return a.packageName;
        }
        C10735b4.m39111c("ApplicationInfo is null");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32212t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40401s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > App id : %s", new Object[]{s}));
        return s;
    }
}
