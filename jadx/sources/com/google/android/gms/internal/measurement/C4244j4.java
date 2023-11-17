package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j4 */
public final class C4244j4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4244j4 zza;
    private int zzd;
    /* access modifiers changed from: private */
    public C4453v9 zze = C4351p9.m16438p();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C4244j4 j4Var = new C4244j4();
        zza = j4Var;
        C4351p9.m16442v(C4244j4.class, j4Var);
    }

    private C4244j4() {
    }

    /* renamed from: E */
    public static C4227i4 m16143E() {
        return (C4227i4) zza.mo13471i();
    }

    /* renamed from: J */
    static /* synthetic */ void m16145J(C4244j4 j4Var, int i, C4312n4 n4Var) {
        n4Var.getClass();
        j4Var.m16153V();
        j4Var.zze.set(i, n4Var);
    }

    /* renamed from: K */
    static /* synthetic */ void m16146K(C4244j4 j4Var, C4312n4 n4Var) {
        n4Var.getClass();
        j4Var.m16153V();
        j4Var.zze.add(n4Var);
    }

    /* renamed from: L */
    static /* synthetic */ void m16147L(C4244j4 j4Var, Iterable iterable) {
        j4Var.m16153V();
        C4146d8.m15688f(iterable, j4Var.zze);
    }

    /* renamed from: N */
    static /* synthetic */ void m16149N(C4244j4 j4Var, int i) {
        j4Var.m16153V();
        j4Var.zze.remove(i);
    }

    /* renamed from: O */
    static /* synthetic */ void m16150O(C4244j4 j4Var, String str) {
        str.getClass();
        j4Var.zzd |= 1;
        j4Var.zzf = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m16151P(C4244j4 j4Var, long j) {
        j4Var.zzd |= 2;
        j4Var.zzg = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m16152Q(C4244j4 j4Var, long j) {
        j4Var.zzd |= 4;
        j4Var.zzh = j;
    }

    /* renamed from: V */
    private final void m16153V() {
        C4453v9 v9Var = this.zze;
        if (!v9Var.mo13068s()) {
            this.zze = C4351p9.m16439q(v9Var);
        }
    }

    /* renamed from: A */
    public final int mo13277A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final int mo13278B() {
        return this.zze.size();
    }

    /* renamed from: C */
    public final long mo13279C() {
        return this.zzh;
    }

    /* renamed from: D */
    public final long mo13280D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final C4312n4 mo13281G(int i) {
        return (C4312n4) this.zze.get(i);
    }

    /* renamed from: H */
    public final String mo13282H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List mo13283I() {
        return this.zze;
    }

    /* renamed from: S */
    public final boolean mo13284S() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: T */
    public final boolean mo13285T() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: U */
    public final boolean mo13286U() {
        return (this.zzd & 2) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C4312n4.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C4244j4();
        } else {
            if (i2 == 4) {
                return new C4227i4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
