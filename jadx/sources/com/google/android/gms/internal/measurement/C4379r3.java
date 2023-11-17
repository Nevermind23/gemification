package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.r3 */
public final class C4379r3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4379r3 zza;
    private int zzd;
    private String zze = "";
    private C4453v9 zzf = C4351p9.m16438p();
    private boolean zzg;

    static {
        C4379r3 r3Var = new C4379r3();
        zza = r3Var;
        C4351p9.m16442v(C4379r3.class, r3Var);
    }

    private C4379r3() {
    }

    /* renamed from: B */
    public final String mo13515B() {
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
            return C4351p9.m16441s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C4480x3.class, "zzg"});
        } else if (i2 == 3) {
            return new C4379r3();
        } else {
            if (i2 == 4) {
                return new C4362q3((C4328o3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
