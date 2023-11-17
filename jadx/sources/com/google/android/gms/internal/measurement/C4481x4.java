package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x4 */
public final class C4481x4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4481x4 zza;
    private int zzd;
    private int zze = 1;
    private C4453v9 zzf = C4351p9.m16438p();

    static {
        C4481x4 x4Var = new C4481x4();
        zza = x4Var;
        C4351p9.m16442v(C4481x4.class, x4Var);
    }

    private C4481x4() {
    }

    /* renamed from: A */
    public static C4448v4 m17133A() {
        return (C4448v4) zza.mo13471i();
    }

    /* renamed from: C */
    static /* synthetic */ void m17135C(C4481x4 x4Var, C4278l4 l4Var) {
        l4Var.getClass();
        C4453v9 v9Var = x4Var.zzf;
        if (!v9Var.mo13068s()) {
            x4Var.zzf = C4351p9.m16439q(v9Var);
        }
        x4Var.zzf.add(l4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", C4465w4.f13778a, "zzf", C4278l4.class});
        } else if (i2 == 3) {
            return new C4481x4();
        } else {
            if (i2 == 4) {
                return new C4448v4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
