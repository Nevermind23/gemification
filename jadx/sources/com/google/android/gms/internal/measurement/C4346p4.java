package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p4 */
public final class C4346p4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4346p4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C4142d4 zzg;

    static {
        C4346p4 p4Var = new C4346p4();
        zza = p4Var;
        C4351p9.m16442v(C4346p4.class, p4Var);
    }

    private C4346p4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C4346p4();
        } else {
            if (i2 == 4) {
                return new C4329o4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
