package com.medallia.digital.mobilesdk;

import android.graphics.Point;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.s1 */
class C11084s1 extends C11034o5<String> {
    protected C11084s1(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private String m40651s() {
        Point e = this.f31722g.mo28994e();
        if (e == null) {
            e = new Point();
        }
        return String.format(Locale.US, "%d*%d", new Object[]{Integer.valueOf(e.x), Integer.valueOf(e.y)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32196d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String s = m40651s();
        C10735b4.m39109b(String.format("Collectors > Resolution: %s", new Object[]{s}));
        return s;
    }
}
