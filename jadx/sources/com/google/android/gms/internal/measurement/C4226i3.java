package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i3 */
public final class C4226i3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4226i3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C4107b3 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C4226i3 i3Var = new C4226i3();
        zza = i3Var;
        C4351p9.m16442v(C4226i3.class, i3Var);
    }

    private C4226i3() {
    }

    /* renamed from: C */
    public static C4209h3 m16066C() {
        return (C4209h3) zza.mo13471i();
    }

    /* renamed from: F */
    static /* synthetic */ void m16068F(C4226i3 i3Var, String str) {
        i3Var.zzd |= 2;
        i3Var.zzf = str;
    }

    /* renamed from: A */
    public final int mo13226A() {
        return this.zze;
    }

    /* renamed from: B */
    public final C4107b3 mo13227B() {
        C4107b3 b3Var = this.zzg;
        return b3Var == null ? C4107b3.m15533B() : b3Var;
    }

    /* renamed from: E */
    public final String mo13228E() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo13229G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo13230H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final boolean mo13231I() {
        return this.zzj;
    }

    /* renamed from: J */
    public final boolean mo13232J() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: K */
    public final boolean mo13233K() {
        return (this.zzd & 32) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C4226i3();
        } else {
            if (i2 == 4) {
                return new C4209h3((C4446v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
