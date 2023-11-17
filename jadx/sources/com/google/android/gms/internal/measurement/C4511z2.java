package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z2 */
public final class C4511z2 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4511z2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C4453v9 zzg = C4351p9.m16438p();
    private boolean zzh;
    private C4192g3 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C4511z2 z2Var = new C4511z2();
        zza = z2Var;
        C4351p9.m16442v(C4511z2.class, z2Var);
    }

    private C4511z2() {
    }

    /* renamed from: C */
    public static C4495y2 m17262C() {
        return (C4495y2) zza.mo13471i();
    }

    /* renamed from: I */
    static /* synthetic */ void m17264I(C4511z2 z2Var, String str) {
        z2Var.zzd |= 2;
        z2Var.zzf = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m17265J(C4511z2 z2Var, int i, C4107b3 b3Var) {
        b3Var.getClass();
        C4453v9 v9Var = z2Var.zzg;
        if (!v9Var.mo13068s()) {
            z2Var.zzg = C4351p9.m16439q(v9Var);
        }
        z2Var.zzg.set(i, b3Var);
    }

    /* renamed from: A */
    public final int mo13847A() {
        return this.zzg.size();
    }

    /* renamed from: B */
    public final int mo13848B() {
        return this.zze;
    }

    /* renamed from: E */
    public final C4107b3 mo13849E(int i) {
        return (C4107b3) this.zzg.get(i);
    }

    /* renamed from: F */
    public final C4192g3 mo13850F() {
        C4192g3 g3Var = this.zzi;
        return g3Var == null ? C4192g3.m15881B() : g3Var;
    }

    /* renamed from: G */
    public final String mo13851G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final List mo13852H() {
        return this.zzg;
    }

    /* renamed from: K */
    public final boolean mo13853K() {
        return this.zzj;
    }

    /* renamed from: L */
    public final boolean mo13854L() {
        return this.zzk;
    }

    /* renamed from: M */
    public final boolean mo13855M() {
        return this.zzl;
    }

    /* renamed from: N */
    public final boolean mo13856N() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: O */
    public final boolean mo13857O() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: P */
    public final boolean mo13858P() {
        return (this.zzd & 64) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C4107b3.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C4511z2();
        } else {
            if (i2 == 4) {
                return new C4495y2((C4446v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
