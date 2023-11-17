package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i5 */
public final class C4228i5 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4228i5 zza;
    private int zzd;
    private String zze = "";
    private C4453v9 zzf = C4351p9.m16438p();

    static {
        C4228i5 i5Var = new C4228i5();
        zza = i5Var;
        C4351p9.m16442v(C4228i5.class, i5Var);
    }

    private C4228i5() {
    }

    /* renamed from: B */
    public final String mo13251B() {
        return this.zze;
    }

    /* renamed from: C */
    public final List mo13252C() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C4347p5.class});
        } else if (i2 == 3) {
            return new C4228i5();
        } else {
            if (i2 == 4) {
                return new C4211h5((C4160e5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
