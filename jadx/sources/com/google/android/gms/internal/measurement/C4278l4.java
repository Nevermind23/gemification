package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l4 */
public final class C4278l4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4278l4 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        C4278l4 l4Var = new C4278l4();
        zza = l4Var;
        C4351p9.m16442v(C4278l4.class, l4Var);
    }

    private C4278l4() {
    }

    /* renamed from: A */
    public static C4261k4 m16218A() {
        return (C4261k4) zza.mo13471i();
    }

    /* renamed from: C */
    static /* synthetic */ void m16220C(C4278l4 l4Var, String str) {
        str.getClass();
        l4Var.zzd |= 1;
        l4Var.zze = str;
    }

    /* renamed from: D */
    static /* synthetic */ void m16221D(C4278l4 l4Var, long j) {
        l4Var.zzd |= 2;
        l4Var.zzf = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4278l4();
        } else {
            if (i2 == 4) {
                return new C4261k4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
