package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.google.android.gms.internal.measurement.d5 */
public final class C4143d5 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4143d5 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C4143d5 d5Var = new C4143d5();
        zza = d5Var;
        C4351p9.m16442v(C4143d5.class, d5Var);
    }

    private C4143d5() {
    }

    /* renamed from: D */
    public static C4126c5 m15667D() {
        return (C4126c5) zza.mo13471i();
    }

    /* renamed from: H */
    static /* synthetic */ void m15669H(C4143d5 d5Var, long j) {
        d5Var.zzd |= 1;
        d5Var.zze = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m15670I(C4143d5 d5Var, String str) {
        str.getClass();
        d5Var.zzd |= 2;
        d5Var.zzf = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m15671J(C4143d5 d5Var, String str) {
        str.getClass();
        d5Var.zzd |= 4;
        d5Var.zzg = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m15672K(C4143d5 d5Var) {
        d5Var.zzd &= -5;
        d5Var.zzg = zza.zzg;
    }

    /* renamed from: L */
    static /* synthetic */ void m15673L(C4143d5 d5Var, long j) {
        d5Var.zzd |= 8;
        d5Var.zzh = j;
    }

    /* renamed from: M */
    static /* synthetic */ void m15674M(C4143d5 d5Var) {
        d5Var.zzd &= -9;
        d5Var.zzh = 0;
    }

    /* renamed from: N */
    static /* synthetic */ void m15675N(C4143d5 d5Var, double d) {
        d5Var.zzd |= 32;
        d5Var.zzj = d;
    }

    /* renamed from: O */
    static /* synthetic */ void m15676O(C4143d5 d5Var) {
        d5Var.zzd &= -33;
        d5Var.zzj = Utils.DOUBLE_EPSILON;
    }

    /* renamed from: A */
    public final double mo13030A() {
        return this.zzj;
    }

    /* renamed from: B */
    public final long mo13031B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final long mo13032C() {
        return this.zze;
    }

    /* renamed from: F */
    public final String mo13033F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final String mo13034G() {
        return this.zzg;
    }

    /* renamed from: P */
    public final boolean mo13035P() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: Q */
    public final boolean mo13036Q() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: S */
    public final boolean mo13037S() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: T */
    public final boolean mo13038T() {
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
            return C4351p9.m16441s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C4143d5();
        } else {
            if (i2 == 4) {
                return new C4126c5((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
