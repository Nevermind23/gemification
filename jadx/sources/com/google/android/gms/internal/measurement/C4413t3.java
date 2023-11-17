package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t3 */
public final class C4413t3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4413t3 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C4413t3 t3Var = new C4413t3();
        zza = t3Var;
        C4351p9.m16442v(C4413t3.class, t3Var);
    }

    private C4413t3() {
    }

    /* renamed from: D */
    static /* synthetic */ void m16654D(C4413t3 t3Var, String str) {
        str.getClass();
        t3Var.zzd |= 1;
        t3Var.zze = str;
    }

    /* renamed from: A */
    public final int mo13551A() {
        return this.zzh;
    }

    /* renamed from: C */
    public final String mo13552C() {
        return this.zze;
    }

    /* renamed from: E */
    public final boolean mo13553E() {
        return this.zzf;
    }

    /* renamed from: F */
    public final boolean mo13554F() {
        return this.zzg;
    }

    /* renamed from: G */
    public final boolean mo13555G() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: H */
    public final boolean mo13556H() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: I */
    public final boolean mo13557I() {
        return (this.zzd & 8) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C4413t3();
        } else {
            if (i2 == 4) {
                return new C4396s3((C4328o3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
