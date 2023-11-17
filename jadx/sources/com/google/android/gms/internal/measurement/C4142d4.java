package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d4 */
public final class C4142d4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4142d4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C4142d4 d4Var = new C4142d4();
        zza = d4Var;
        C4351p9.m16442v(C4142d4.class, d4Var);
    }

    private C4142d4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C4142d4();
        } else {
            if (i2 == 4) {
                return new C4125c4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
