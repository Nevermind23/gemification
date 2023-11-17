package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z3 */
public final class C4512z3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4512z3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C4512z3 z3Var = new C4512z3();
        zza = z3Var;
        C4351p9.m16442v(C4512z3.class, z3Var);
    }

    private C4512z3() {
    }

    /* renamed from: B */
    public final String mo13859B() {
        return this.zze;
    }

    /* renamed from: C */
    public final String mo13860C() {
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
            return C4351p9.m16441s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4512z3();
        } else {
            if (i2 == 4) {
                return new C4496y3((C4328o3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
