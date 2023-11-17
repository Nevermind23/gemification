package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.h4 */
public final class C4210h4 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4210h4 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C4210h4 h4Var = new C4210h4();
        zza = h4Var;
        C4351p9.m16442v(C4210h4.class, h4Var);
    }

    private C4210h4() {
    }

    /* renamed from: C */
    public static C4193g4 m15971C() {
        return (C4193g4) zza.mo13471i();
    }

    /* renamed from: E */
    static /* synthetic */ void m15973E(C4210h4 h4Var, int i) {
        h4Var.zzd |= 1;
        h4Var.zze = i;
    }

    /* renamed from: F */
    static /* synthetic */ void m15974F(C4210h4 h4Var, long j) {
        h4Var.zzd |= 2;
        h4Var.zzf = j;
    }

    /* renamed from: A */
    public final int mo13204A() {
        return this.zze;
    }

    /* renamed from: B */
    public final long mo13205B() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo13206G() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: H */
    public final boolean mo13207H() {
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
            return C4351p9.m16441s(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C4210h4();
        } else {
            if (i2 == 4) {
                return new C4193g4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
