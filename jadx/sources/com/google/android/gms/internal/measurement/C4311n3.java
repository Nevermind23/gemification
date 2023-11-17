package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.n3 */
public final class C4311n3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4311n3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private C4453v9 zzh = C4351p9.m16438p();

    static {
        C4311n3 n3Var = new C4311n3();
        zza = n3Var;
        C4351p9.m16442v(C4311n3.class, n3Var);
    }

    private C4311n3() {
    }

    /* renamed from: C */
    public static C4311n3 m16313C() {
        return zza;
    }

    /* renamed from: A */
    public final int mo13384A() {
        return this.zzh.size();
    }

    /* renamed from: D */
    public final String mo13385D() {
        return this.zzf;
    }

    /* renamed from: E */
    public final List mo13386E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final boolean mo13387F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean mo13388G() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: H */
    public final boolean mo13389H() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: I */
    public final boolean mo13390I() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: J */
    public final int mo13391J() {
        int a = C4294m3.m16253a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C4277l3.f13451a, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C4311n3();
        } else {
            if (i2 == 4) {
                return new C4243j3((C4446v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
