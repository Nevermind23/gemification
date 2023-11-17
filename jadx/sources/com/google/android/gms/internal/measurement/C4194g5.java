package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.g5 */
public final class C4194g5 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4194g5 zza;
    private C4453v9 zzd = C4351p9.m16438p();

    static {
        C4194g5 g5Var = new C4194g5();
        zza = g5Var;
        C4351p9.m16442v(C4194g5.class, g5Var);
    }

    private C4194g5() {
    }

    /* renamed from: C */
    public static C4194g5 m15896C() {
        return zza;
    }

    /* renamed from: A */
    public final int mo13146A() {
        return this.zzd.size();
    }

    /* renamed from: D */
    public final List mo13147D() {
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
            return C4351p9.m16441s(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C4228i5.class});
        } else if (i2 == 3) {
            return new C4194g5();
        } else {
            if (i2 == 4) {
                return new C4177f5((C4160e5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
