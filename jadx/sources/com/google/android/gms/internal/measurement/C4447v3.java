package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
public final class C4447v3 extends C4351p9 implements C4403sa {
    /* access modifiers changed from: private */
    public static final C4447v3 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private C4453v9 zzh = C4351p9.m16438p();
    private C4453v9 zzi = C4351p9.m16438p();
    /* access modifiers changed from: private */
    public C4453v9 zzj = C4351p9.m16438p();
    private String zzk = "";
    private boolean zzl;
    private C4453v9 zzm = C4351p9.m16438p();
    private C4453v9 zzn = C4351p9.m16438p();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    static {
        C4447v3 v3Var = new C4447v3();
        zza = v3Var;
        C4351p9.m16442v(C4447v3.class, v3Var);
    }

    private C4447v3() {
    }

    /* renamed from: E */
    public static C4430u3 m17032E() {
        return (C4430u3) zza.mo13471i();
    }

    /* renamed from: G */
    public static C4447v3 m17034G() {
        return zza;
    }

    /* renamed from: P */
    static /* synthetic */ void m17035P(C4447v3 v3Var, int i, C4413t3 t3Var) {
        t3Var.getClass();
        C4453v9 v9Var = v3Var.zzi;
        if (!v9Var.mo13068s()) {
            v3Var.zzi = C4351p9.m16439q(v9Var);
        }
        v3Var.zzi.set(i, t3Var);
    }

    /* renamed from: A */
    public final int mo13761A() {
        return this.zzm.size();
    }

    /* renamed from: B */
    public final int mo13762B() {
        return this.zzi.size();
    }

    /* renamed from: C */
    public final long mo13763C() {
        return this.zze;
    }

    /* renamed from: D */
    public final C4413t3 mo13764D(int i) {
        return (C4413t3) this.zzi.get(i);
    }

    /* renamed from: H */
    public final String mo13765H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final String mo13766I() {
        return this.zzq;
    }

    /* renamed from: J */
    public final String mo13767J() {
        return this.zzp;
    }

    /* renamed from: K */
    public final String mo13768K() {
        return this.zzo;
    }

    /* renamed from: L */
    public final List mo13769L() {
        return this.zzj;
    }

    /* renamed from: M */
    public final List mo13770M() {
        return this.zzn;
    }

    /* renamed from: N */
    public final List mo13771N() {
        return this.zzm;
    }

    /* renamed from: O */
    public final List mo13772O() {
        return this.zzh;
    }

    /* renamed from: S */
    public final boolean mo13773S() {
        return this.zzl;
    }

    /* renamed from: T */
    public final boolean mo13774T() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: U */
    public final boolean mo13775U() {
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
            return C4351p9.m16441s(zza, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C4512z3.class, "zzi", C4413t3.class, "zzj", C4479x2.class, "zzk", "zzl", "zzm", C4262k5.class, "zzn", C4379r3.class, "zzo", "zzp", "zzq"});
        } else if (i2 == 3) {
            return new C4447v3();
        } else {
            if (i2 == 4) {
                return new C4430u3((C4328o3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
