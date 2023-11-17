package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.g3 */
public final class C4192g3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4192g3 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C4192g3 g3Var = new C4192g3();
        zza = g3Var;
        C4351p9.m16442v(C4192g3.class, g3Var);
    }

    private C4192g3() {
    }

    /* renamed from: B */
    public static C4192g3 m15881B() {
        return zza;
    }

    /* renamed from: C */
    public final String mo13134C() {
        return this.zzg;
    }

    /* renamed from: D */
    public final String mo13135D() {
        return this.zzi;
    }

    /* renamed from: E */
    public final String mo13136E() {
        return this.zzh;
    }

    /* renamed from: F */
    public final boolean mo13137F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final boolean mo13138G() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: H */
    public final boolean mo13139H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean mo13140I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo13141J() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: K */
    public final boolean mo13142K() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: L */
    public final int mo13143L() {
        int a = C4175f3.m15799a(this.zze);
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
            return C4351p9.m16441s(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C4158e3.f13206a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C4192g3();
        } else {
            if (i2 == 4) {
                return new C4124c3((C4446v2) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
