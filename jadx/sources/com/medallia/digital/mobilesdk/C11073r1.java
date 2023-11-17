package com.medallia.digital.mobilesdk;

import android.os.Build;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C11195x0;

/* renamed from: com.medallia.digital.mobilesdk.r1 */
class C11073r1 extends C11034o5<String> {
    protected C11073r1(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: a */
    private String m40621a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c : charArray) {
            if (!z || !Character.isLetter(c)) {
                if (Character.isWhitespace(c)) {
                    z = true;
                }
                sb.append(c);
            } else {
                sb.append(Character.toUpperCase(c));
                z = false;
            }
        }
        return sb.toString();
    }

    /* renamed from: s */
    private String m40622s() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str2.startsWith(str)) {
            return m40621a(str2);
        }
        return m40621a(str) + " " + str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32195c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40622s();
        C10735b4.m39109b(String.format("Collectors > Model: %s", new Object[]{s}));
        return s;
    }
}
