package com.medallia.digital.mobilesdk;

import android.os.StatFs;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.n1 */
class C11012n1 extends C11034o5<String> {
    protected C11012n1(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private double m40331s() {
        StatFs d = this.f31722g.mo28993d();
        return (double) (d.getFreeBlocksLong() * d.getBlockSizeLong());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32192a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo28122j() {
        double s = m40331s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Device free memory: %f", new Object[]{Double.valueOf(s)}));
        return C11064q1.m40589b(s);
    }
}
