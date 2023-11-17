package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z4 */
public final class C4513z4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4513z4 zza;
    /* access modifiers changed from: private */
    public C4436u9 zzd = C4351p9.m16436n();
    /* access modifiers changed from: private */
    public C4436u9 zze = C4351p9.m16436n();
    /* access modifiers changed from: private */
    public C4453v9 zzf = C4351p9.m16438p();
    /* access modifiers changed from: private */
    public C4453v9 zzg = C4351p9.m16438p();

    static {
        C4513z4 z4Var = new C4513z4();
        zza = z4Var;
        C4351p9.m16442v(C4513z4.class, z4Var);
    }

    private C4513z4() {
    }

    /* renamed from: E */
    public static C4497y4 m17283E() {
        return (C4497y4) zza.mo13471i();
    }

    /* renamed from: G */
    public static C4513z4 m17285G() {
        return zza;
    }

    /* renamed from: L */
    static /* synthetic */ void m17286L(C4513z4 z4Var, Iterable iterable) {
        C4436u9 u9Var = z4Var.zzd;
        if (!u9Var.mo13068s()) {
            z4Var.zzd = C4351p9.m16437o(u9Var);
        }
        C4146d8.m15688f(iterable, z4Var.zzd);
    }

    /* renamed from: N */
    static /* synthetic */ void m17288N(C4513z4 z4Var, Iterable iterable) {
        C4436u9 u9Var = z4Var.zze;
        if (!u9Var.mo13068s()) {
            z4Var.zze = C4351p9.m16437o(u9Var);
        }
        C4146d8.m15688f(iterable, z4Var.zze);
    }

    /* renamed from: P */
    static /* synthetic */ void m17290P(C4513z4 z4Var, Iterable iterable) {
        C4453v9 v9Var = z4Var.zzf;
        if (!v9Var.mo13068s()) {
            z4Var.zzf = C4351p9.m16439q(v9Var);
        }
        C4146d8.m15688f(iterable, z4Var.zzf);
    }

    /* renamed from: S */
    static /* synthetic */ void m17292S(C4513z4 z4Var, Iterable iterable) {
        C4453v9 v9Var = z4Var.zzg;
        if (!v9Var.mo13068s()) {
            z4Var.zzg = C4351p9.m16439q(v9Var);
        }
        C4146d8.m15688f(iterable, z4Var.zzg);
    }

    /* renamed from: A */
    public final int mo13861A() {
        return this.zzf.size();
    }

    /* renamed from: B */
    public final int mo13862B() {
        return this.zze.size();
    }

    /* renamed from: C */
    public final int mo13863C() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final int mo13864D() {
        return this.zzd.size();
    }

    /* renamed from: H */
    public final List mo13865H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List mo13866I() {
        return this.zze;
    }

    /* renamed from: J */
    public final List mo13867J() {
        return this.zzg;
    }

    /* renamed from: K */
    public final List mo13868K() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C4210h4.class, "zzg", C4109b5.class});
        } else if (i2 == 3) {
            return new C4513z4();
        } else {
            if (i2 == 4) {
                return new C4497y4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
