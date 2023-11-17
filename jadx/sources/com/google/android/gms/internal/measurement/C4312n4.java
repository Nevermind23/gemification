package com.google.android.gms.internal.measurement;

import com.github.mikephil.charting.utils.Utils;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
public final class C4312n4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4312n4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;
    /* access modifiers changed from: private */
    public C4453v9 zzj = C4351p9.m16438p();

    static {
        C4312n4 n4Var = new C4312n4();
        zza = n4Var;
        C4351p9.m16442v(C4312n4.class, n4Var);
    }

    private C4312n4() {
    }

    /* renamed from: E */
    public static C4295m4 m16323E() {
        return (C4295m4) zza.mo13471i();
    }

    /* renamed from: J */
    static /* synthetic */ void m16325J(C4312n4 n4Var, String str) {
        str.getClass();
        n4Var.zzd |= 1;
        n4Var.zze = str;
    }

    /* renamed from: K */
    static /* synthetic */ void m16326K(C4312n4 n4Var, String str) {
        str.getClass();
        n4Var.zzd |= 2;
        n4Var.zzf = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m16327L(C4312n4 n4Var) {
        n4Var.zzd &= -3;
        n4Var.zzf = zza.zzf;
    }

    /* renamed from: M */
    static /* synthetic */ void m16328M(C4312n4 n4Var, long j) {
        n4Var.zzd |= 4;
        n4Var.zzg = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m16329N(C4312n4 n4Var) {
        n4Var.zzd &= -5;
        n4Var.zzg = 0;
    }

    /* renamed from: O */
    static /* synthetic */ void m16330O(C4312n4 n4Var, double d) {
        n4Var.zzd |= 16;
        n4Var.zzi = d;
    }

    /* renamed from: P */
    static /* synthetic */ void m16331P(C4312n4 n4Var) {
        n4Var.zzd &= -17;
        n4Var.zzi = Utils.DOUBLE_EPSILON;
    }

    /* renamed from: Q */
    static /* synthetic */ void m16332Q(C4312n4 n4Var, C4312n4 n4Var2) {
        n4Var2.getClass();
        n4Var.m16335Z();
        n4Var.zzj.add(n4Var2);
    }

    /* renamed from: S */
    static /* synthetic */ void m16333S(C4312n4 n4Var, Iterable iterable) {
        n4Var.m16335Z();
        C4146d8.m15688f(iterable, n4Var.zzj);
    }

    /* renamed from: Z */
    private final void m16335Z() {
        C4453v9 v9Var = this.zzj;
        if (!v9Var.mo13068s()) {
            this.zzj = C4351p9.m16439q(v9Var);
        }
    }

    /* renamed from: A */
    public final double mo13392A() {
        return this.zzi;
    }

    /* renamed from: B */
    public final float mo13393B() {
        return this.zzh;
    }

    /* renamed from: C */
    public final int mo13394C() {
        return this.zzj.size();
    }

    /* renamed from: D */
    public final long mo13395D() {
        return this.zzg;
    }

    /* renamed from: G */
    public final String mo13396G() {
        return this.zze;
    }

    /* renamed from: H */
    public final String mo13397H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final List mo13398I() {
        return this.zzj;
    }

    /* renamed from: U */
    public final boolean mo13399U() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: V */
    public final boolean mo13400V() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: W */
    public final boolean mo13401W() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: X */
    public final boolean mo13402X() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: Y */
    public final boolean mo13403Y() {
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
            return C4351p9.m16441s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C4312n4.class});
        } else if (i2 == 3) {
            return new C4312n4();
        } else {
            if (i2 == 4) {
                return new C4295m4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
