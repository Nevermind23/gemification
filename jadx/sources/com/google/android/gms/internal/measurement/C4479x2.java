package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x2 */
public final class C4479x2 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4479x2 zza;
    private int zzd;
    private int zze;
    private C4453v9 zzf = C4351p9.m16438p();
    private C4453v9 zzg = C4351p9.m16438p();
    private boolean zzh;
    private boolean zzi;

    static {
        C4479x2 x2Var = new C4479x2();
        zza = x2Var;
        C4351p9.m16442v(C4479x2.class, x2Var);
    }

    private C4479x2() {
    }

    /* renamed from: I */
    static /* synthetic */ void m17120I(C4479x2 x2Var, int i, C4226i3 i3Var) {
        i3Var.getClass();
        C4453v9 v9Var = x2Var.zzf;
        if (!v9Var.mo13068s()) {
            x2Var.zzf = C4351p9.m16439q(v9Var);
        }
        x2Var.zzf.set(i, i3Var);
    }

    /* renamed from: J */
    static /* synthetic */ void m17121J(C4479x2 x2Var, int i, C4511z2 z2Var) {
        z2Var.getClass();
        C4453v9 v9Var = x2Var.zzg;
        if (!v9Var.mo13068s()) {
            x2Var.zzg = C4351p9.m16439q(v9Var);
        }
        x2Var.zzg.set(i, z2Var);
    }

    /* renamed from: A */
    public final int mo13800A() {
        return this.zze;
    }

    /* renamed from: B */
    public final int mo13801B() {
        return this.zzg.size();
    }

    /* renamed from: C */
    public final int mo13802C() {
        return this.zzf.size();
    }

    /* renamed from: E */
    public final C4511z2 mo13803E(int i) {
        return (C4511z2) this.zzg.get(i);
    }

    /* renamed from: F */
    public final C4226i3 mo13804F(int i) {
        return (C4226i3) this.zzf.get(i);
    }

    /* renamed from: G */
    public final List mo13805G() {
        return this.zzg;
    }

    /* renamed from: H */
    public final List mo13806H() {
        return this.zzf;
    }

    /* renamed from: K */
    public final boolean mo13807K() {
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
            return C4351p9.m16441s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C4226i3.class, "zzg", C4511z2.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C4479x2();
        } else {
            if (i2 == 4) {
                return new C4463w2((C4446v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
