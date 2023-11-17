package com.medallia.digital.mobilesdk;

import android.os.StatFs;
import com.medallia.digital.mobilesdk.C11195x0;
import java.util.Locale;

/* renamed from: com.medallia.digital.mobilesdk.t1 */
class C11096t1 extends C11034o5<Long> {

    /* renamed from: k */
    private static final int f31925k = 100;

    protected C11096t1(C11017n5 n5Var, C11083s0 s0Var) {
        super(n5Var, s0Var);
    }

    /* renamed from: s */
    private long m40700s() {
        StatFs d = this.f31722g.mo28993d();
        if (d != null) {
            long blockCountLong = d.getBlockCountLong() * d.getBlockSizeLong();
            long availableBlocksLong = blockCountLong - (d.getAvailableBlocksLong() * d.getBlockSizeLong());
            if (availableBlocksLong != 0) {
                return (long) ((((double) availableBlocksLong) / ((double) blockCountLong)) * 100.0d);
            }
        }
        C10735b4.m39111c("StatFs is null");
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public CollectorContract mo28118c() {
        return C11195x0.C11196a.f32197e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public Long mo28122j() {
        long s = m40700s();
        C10735b4.m39109b(String.format(Locale.US, "Collectors > Device free memory: %d", new Object[]{Long.valueOf(s)}));
        return Long.valueOf(s);
    }
}
