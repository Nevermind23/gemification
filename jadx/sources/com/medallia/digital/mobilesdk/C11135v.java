package com.medallia.digital.mobilesdk;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.v */
class C11135v extends C11034o5<String> {
    protected C11135v(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m40797s() {
        try {
            PackageManager h = this.f31722g.mo28997h();
            PackageInfo packageInfo = h != null ? h.getPackageInfo(C10884i4.m39721c().mo28483b().getPackageName(), 0) : null;
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException e) {
            C10735b4.m39111c(e.getMessage());
        }
        C10735b4.m39111c("Context is null");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32213u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40797s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > App version : %s", new Object[]{s}));
        return s;
    }
}
