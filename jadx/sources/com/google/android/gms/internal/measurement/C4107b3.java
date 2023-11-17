package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b3 */
public final class C4107b3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4107b3 zza;
    private int zzd;
    private C4311n3 zze;
    private C4192g3 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C4107b3 b3Var = new C4107b3();
        zza = b3Var;
        C4351p9.m16442v(C4107b3.class, b3Var);
    }

    private C4107b3() {
    }

    /* renamed from: B */
    public static C4107b3 m15533B() {
        return zza;
    }

    /* renamed from: F */
    static /* synthetic */ void m15534F(C4107b3 b3Var, String str) {
        b3Var.zzd |= 8;
        b3Var.zzh = str;
    }

    /* renamed from: C */
    public final C4192g3 mo12895C() {
        C4192g3 g3Var = this.zzf;
        return g3Var == null ? C4192g3.m15881B() : g3Var;
    }

    /* renamed from: D */
    public final C4311n3 mo12896D() {
        C4311n3 n3Var = this.zze;
        return n3Var == null ? C4311n3.m16313C() : n3Var;
    }

    /* renamed from: E */
    public final String mo12897E() {
        return this.zzh;
    }

    /* renamed from: G */
    public final boolean mo12898G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final boolean mo12899H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean mo12900I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo12901J() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: K */
    public final boolean mo12902K() {
        return (this.zzd & 1) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C4107b3();
        } else {
            if (i2 == 4) {
                return new C4090a3((C4446v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
