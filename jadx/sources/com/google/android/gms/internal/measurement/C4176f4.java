package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f4 */
public final class C4176f4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4176f4 zza;
    private int zzd;
    private int zze;
    private C4513z4 zzf;
    private C4513z4 zzg;
    private boolean zzh;

    static {
        C4176f4 f4Var = new C4176f4();
        zza = f4Var;
        C4351p9.m16442v(C4176f4.class, f4Var);
    }

    private C4176f4() {
    }

    /* renamed from: B */
    public static C4159e4 m15800B() {
        return (C4159e4) zza.mo13471i();
    }

    /* renamed from: F */
    static /* synthetic */ void m15802F(C4176f4 f4Var, int i) {
        f4Var.zzd |= 1;
        f4Var.zze = i;
    }

    /* renamed from: G */
    static /* synthetic */ void m15803G(C4176f4 f4Var, C4513z4 z4Var) {
        z4Var.getClass();
        f4Var.zzf = z4Var;
        f4Var.zzd |= 2;
    }

    /* renamed from: H */
    static /* synthetic */ void m15804H(C4176f4 f4Var, C4513z4 z4Var) {
        f4Var.zzg = z4Var;
        f4Var.zzd |= 4;
    }

    /* renamed from: I */
    static /* synthetic */ void m15805I(C4176f4 f4Var, boolean z) {
        f4Var.zzd |= 8;
        f4Var.zzh = z;
    }

    /* renamed from: A */
    public final int mo13115A() {
        return this.zze;
    }

    /* renamed from: D */
    public final C4513z4 mo13116D() {
        C4513z4 z4Var = this.zzf;
        return z4Var == null ? C4513z4.m17285G() : z4Var;
    }

    /* renamed from: E */
    public final C4513z4 mo13117E() {
        C4513z4 z4Var = this.zzg;
        return z4Var == null ? C4513z4.m17285G() : z4Var;
    }

    /* renamed from: J */
    public final boolean mo13118J() {
        return this.zzh;
    }

    /* renamed from: K */
    public final boolean mo13119K() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: L */
    public final boolean mo13120L() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: M */
    public final boolean mo13121M() {
        return (this.zzd & 4) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C4176f4();
        } else {
            if (i2 == 4) {
                return new C4159e4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
