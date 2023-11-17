package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.b5 */
public final class C4109b5 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4109b5 zza;
    private int zzd;
    private int zze;
    private C4436u9 zzf = C4351p9.m16436n();

    static {
        C4109b5 b5Var = new C4109b5();
        zza = b5Var;
        C4351p9.m16442v(C4109b5.class, b5Var);
    }

    private C4109b5() {
    }

    /* renamed from: D */
    public static C4092a5 m15545D() {
        return (C4092a5) zza.mo13471i();
    }

    /* renamed from: G */
    static /* synthetic */ void m15547G(C4109b5 b5Var, int i) {
        b5Var.zzd |= 1;
        b5Var.zze = i;
    }

    /* renamed from: H */
    static /* synthetic */ void m15548H(C4109b5 b5Var, Iterable iterable) {
        C4436u9 u9Var = b5Var.zzf;
        if (!u9Var.mo13068s()) {
            b5Var.zzf = C4351p9.m16437o(u9Var);
        }
        C4146d8.m15688f(iterable, b5Var.zzf);
    }

    /* renamed from: A */
    public final int mo12905A() {
        return this.zzf.size();
    }

    /* renamed from: B */
    public final int mo12906B() {
        return this.zze;
    }

    /* renamed from: C */
    public final long mo12907C(int i) {
        return this.zzf.mo13150d(i);
    }

    /* renamed from: F */
    public final List mo12908F() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo12909I() {
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
            return C4351p9.m16441s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4109b5();
        } else {
            if (i2 == 4) {
                return new C4092a5((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
