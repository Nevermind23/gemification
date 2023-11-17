package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.u1 */
class C11109u1 extends C11034o5<Long> {

    /* renamed from: k */
    private static final int f31947k = 100;

    protected C11109u1(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private long m40736s() {
        ActivityManager.MemoryInfo g = this.f31722g.mo28996g();
        if (g != null) {
            long j = g.totalMem;
            long j2 = j - g.availMem;
            if (j2 == 0) {
                return 0;
            }
            return (long) ((((double) j2) / ((double) j)) * 100.0d);
        }
        C10735b4.m39111c("MemoryInfo is null");
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32198f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Long mo28122j() {
        long s = m40736s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Used memory: %d%%", new Object[]{Long.valueOf(s)}));
        return Long.valueOf(s);
    }
}
