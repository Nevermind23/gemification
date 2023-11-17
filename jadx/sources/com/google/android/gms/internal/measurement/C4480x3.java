package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
public final class C4480x3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4480x3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4480x3 x3Var = new C4480x3();
        zza = x3Var;
        C4351p9.m16442v(C4480x3.class, x3Var);
    }

    private C4480x3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4480x3();
        } else {
            if (i2 == 4) {
                return new C4464w3((C4328o3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
