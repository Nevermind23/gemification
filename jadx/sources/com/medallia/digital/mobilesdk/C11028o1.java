package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import com.github.mikephil.charting.utils.Utils;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.o1 */
class C11028o1 extends C11034o5<String> {
    protected C11028o1(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private double m40409s() {
        ActivityManager.MemoryInfo g = this.f31722g.mo28996g();
        if (g != null) {
            long j = g.availMem;
            return j == 0 ? Utils.DOUBLE_EPSILON : (double) j;
        }
        C10735b4.m39111c("MemoryInfo is null");
        return Utils.DOUBLE_EPSILON;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32194b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        String b = C11064q1.m40589b(m40409s());
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Device free memory: %s", new Object[]{b}));
        return b;
    }
}
