package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s4 */
public final class C4397s4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4397s4 zza;
    private C4453v9 zzd = C4351p9.m16438p();

    static {
        C4397s4 s4Var = new C4397s4();
        zza = s4Var;
        C4351p9.m16442v(C4397s4.class, s4Var);
    }

    private C4397s4() {
    }

    /* renamed from: A */
    public static C4380r4 m16624A() {
        return (C4380r4) zza.mo13471i();
    }

    /* renamed from: E */
    static /* synthetic */ void m16626E(C4397s4 s4Var, C4431u4 u4Var) {
        u4Var.getClass();
        C4453v9 v9Var = s4Var.zzd;
        if (!v9Var.mo13068s()) {
            s4Var.zzd = C4351p9.m16439q(v9Var);
        }
        s4Var.zzd.add(u4Var);
    }

    /* renamed from: C */
    public final C4431u4 mo13534C(int i) {
        return (C4431u4) this.zzd.get(0);
    }

    /* renamed from: D */
    public final List mo13535D() {
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
            return C4351p9.m16441s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4431u4.class});
        } else if (i2 == 3) {
            return new C4397s4();
        } else {
            if (i2 == 4) {
                return new C4380r4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
