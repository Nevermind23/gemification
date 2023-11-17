package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k5 */
public final class C4262k5 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4262k5 zza;
    private int zzd;
    private C4453v9 zze = C4351p9.m16438p();
    private C4194g5 zzf;

    static {
        C4262k5 k5Var = new C4262k5();
        zza = k5Var;
        C4351p9.m16442v(C4262k5.class, k5Var);
    }

    private C4262k5() {
    }

    /* renamed from: A */
    public final C4194g5 mo13295A() {
        C4194g5 g5Var = this.zzf;
        return g5Var == null ? C4194g5.m15896C() : g5Var;
    }

    /* renamed from: C */
    public final List mo13296C() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C4347p5.class, "zzf"});
        } else if (i2 == 3) {
            return new C4262k5();
        } else {
            if (i2 == 4) {
                return new C4245j5((C4160e5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
