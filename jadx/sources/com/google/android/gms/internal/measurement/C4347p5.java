package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.p5 */
public final class C4347p5 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4347p5 zza;
    private int zzd;
    private int zze;
    private C4453v9 zzf = C4351p9.m16438p();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C4347p5 p5Var = new C4347p5();
        zza = p5Var;
        C4351p9.m16442v(C4347p5.class, p5Var);
    }

    private C4347p5() {
    }

    /* renamed from: A */
    public final double mo13442A() {
        return this.zzj;
    }

    /* renamed from: C */
    public final String mo13443C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final String mo13444D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final List mo13445E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final boolean mo13446F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final boolean mo13447G() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: H */
    public final boolean mo13448H() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: I */
    public final boolean mo13449I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final int mo13450J() {
        int a = C4330o5.m16372a(this.zze);
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
            return C4351p9.m16441s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C4313n5.f13548a, "zzf", C4347p5.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C4347p5();
        } else {
            if (i2 == 4) {
                return new C4279l5((C4160e5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
