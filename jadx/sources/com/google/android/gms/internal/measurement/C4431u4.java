package com.google.android.gms.internal.measurement;

import com.salesforce.marketingcloud.C11398b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.u4 */
public final class C4431u4 extends C4351p9 implements C4403sa {
    public static final /* synthetic */ int zza = 0;
    /* access modifiers changed from: private */
    public static final C4431u4 zzd;
    private String zzA = "";
    private long zzB;
    private int zzC;
    private String zzD = "";
    private String zzE = "";
    private boolean zzF;
    /* access modifiers changed from: private */
    public C4453v9 zzG = C4351p9.m16438p();
    private String zzH = "";
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL = "";
    private long zzM;
    private long zzN;
    private String zzO = "";
    private String zzP = "";
    private int zzQ;
    private String zzR = "";
    private C4481x4 zzS;
    private C4419t9 zzT = C4351p9.m16435m();
    private long zzU;
    private long zzV;
    private String zzW = "";
    private String zzX = "";
    private int zzY;
    private boolean zzZ;
    private String zzaa = "";
    private boolean zzab;
    private C4346p4 zzac;
    private String zzad = "";
    private C4453v9 zzae = C4351p9.m16438p();
    private String zzaf = "";
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    /* access modifiers changed from: private */
    public C4453v9 zzh = C4351p9.m16438p();
    private C4453v9 zzi = C4351p9.m16438p();
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private int zzs;
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private long zzw;
    private long zzx;
    private String zzy = "";
    private boolean zzz;

    static {
        C4431u4 u4Var = new C4431u4();
        zzd = u4Var;
        C4351p9.m16442v(C4431u4.class, u4Var);
    }

    private C4431u4() {
    }

    /* renamed from: A0 */
    static /* synthetic */ void m16828A0(C4431u4 u4Var, long j) {
        u4Var.zze |= 536870912;
        u4Var.zzM = j;
    }

    /* renamed from: D0 */
    static /* synthetic */ void m16829D0(C4431u4 u4Var, Iterable iterable) {
        u4Var.m16870e1();
        C4146d8.m15688f(iterable, u4Var.zzh);
    }

    /* renamed from: E0 */
    static /* synthetic */ void m16830E0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 8192;
        u4Var.zzad = str;
    }

    /* renamed from: F0 */
    static /* synthetic */ void m16831F0(C4431u4 u4Var) {
        u4Var.zzf &= -8193;
        u4Var.zzad = zzd.zzad;
    }

    /* renamed from: G0 */
    static /* synthetic */ void m16832G0(C4431u4 u4Var, Iterable iterable) {
        C4453v9 v9Var = u4Var.zzae;
        if (!v9Var.mo13068s()) {
            u4Var.zzae = C4351p9.m16439q(v9Var);
        }
        C4146d8.m15688f(iterable, u4Var.zzae);
    }

    /* renamed from: I0 */
    static /* synthetic */ void m16834I0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 16384;
        u4Var.zzaf = str;
    }

    /* renamed from: J0 */
    static /* synthetic */ void m16835J0(C4431u4 u4Var, long j) {
        u4Var.zzf |= 32768;
        u4Var.zzag = j;
    }

    /* renamed from: K0 */
    static /* synthetic */ void m16836K0(C4431u4 u4Var, int i) {
        u4Var.m16870e1();
        u4Var.zzh.remove(i);
    }

    /* renamed from: L0 */
    static /* synthetic */ void m16837L0(C4431u4 u4Var, int i, C4143d5 d5Var) {
        d5Var.getClass();
        u4Var.m16872f1();
        u4Var.zzi.set(i, d5Var);
    }

    /* renamed from: M0 */
    static /* synthetic */ void m16838M0(C4431u4 u4Var, C4143d5 d5Var) {
        d5Var.getClass();
        u4Var.m16872f1();
        u4Var.zzi.add(d5Var);
    }

    /* renamed from: N0 */
    static /* synthetic */ void m16839N0(C4431u4 u4Var, Iterable iterable) {
        u4Var.m16872f1();
        C4146d8.m15688f(iterable, u4Var.zzi);
    }

    /* renamed from: O0 */
    static /* synthetic */ void m16840O0(C4431u4 u4Var, int i) {
        u4Var.m16872f1();
        u4Var.zzi.remove(i);
    }

    /* renamed from: P0 */
    static /* synthetic */ void m16841P0(C4431u4 u4Var, long j) {
        u4Var.zze |= 2;
        u4Var.zzj = j;
    }

    /* renamed from: Q */
    static /* synthetic */ void m16842Q(C4431u4 u4Var) {
        u4Var.zze &= Integer.MAX_VALUE;
        u4Var.zzO = zzd.zzO;
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m16843Q0(C4431u4 u4Var, long j) {
        u4Var.zze |= 4;
        u4Var.zzk = j;
    }

    /* renamed from: R0 */
    static /* synthetic */ void m16844R0(C4431u4 u4Var, long j) {
        u4Var.zze |= 8;
        u4Var.zzl = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m16845S(C4431u4 u4Var, int i) {
        u4Var.zzf |= 2;
        u4Var.zzQ = i;
    }

    /* renamed from: S0 */
    static /* synthetic */ void m16846S0(C4431u4 u4Var, long j) {
        u4Var.zze |= 16;
        u4Var.zzm = j;
    }

    /* renamed from: S1 */
    public static C4414t4 m16847S1() {
        return (C4414t4) zzd.mo13471i();
    }

    /* renamed from: T */
    static /* synthetic */ void m16848T(C4431u4 u4Var, int i, C4244j4 j4Var) {
        j4Var.getClass();
        u4Var.m16870e1();
        u4Var.zzh.set(i, j4Var);
    }

    /* renamed from: T0 */
    static /* synthetic */ void m16849T0(C4431u4 u4Var) {
        u4Var.zze &= -17;
        u4Var.zzm = 0;
    }

    /* renamed from: U */
    static /* synthetic */ void m16851U(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zzf |= 4;
        u4Var.zzR = str;
    }

    /* renamed from: U0 */
    static /* synthetic */ void m16852U0(C4431u4 u4Var, long j) {
        u4Var.zze |= 32;
        u4Var.zzn = j;
    }

    /* renamed from: V */
    static /* synthetic */ void m16853V(C4431u4 u4Var, C4481x4 x4Var) {
        x4Var.getClass();
        u4Var.zzS = x4Var;
        u4Var.zzf |= 8;
    }

    /* renamed from: V0 */
    static /* synthetic */ void m16854V0(C4431u4 u4Var) {
        u4Var.zze &= -33;
        u4Var.zzn = 0;
    }

    /* renamed from: W */
    static /* synthetic */ void m16855W(C4431u4 u4Var, Iterable iterable) {
        int i;
        C4419t9 t9Var = u4Var.zzT;
        if (!t9Var.mo13068s()) {
            int size = t9Var.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            u4Var.zzT = t9Var.mo13500m(i);
        }
        C4146d8.m15688f(iterable, u4Var.zzT);
    }

    /* renamed from: W0 */
    static /* synthetic */ void m16856W0(C4431u4 u4Var, String str) {
        u4Var.zze |= 64;
        u4Var.zzo = "android";
    }

    /* renamed from: X */
    static /* synthetic */ void m16857X(C4431u4 u4Var, C4244j4 j4Var) {
        j4Var.getClass();
        u4Var.m16870e1();
        u4Var.zzh.add(j4Var);
    }

    /* renamed from: X0 */
    static /* synthetic */ void m16858X0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= 128;
        u4Var.zzp = str;
    }

    /* renamed from: Y */
    static /* synthetic */ void m16859Y(C4431u4 u4Var, long j) {
        u4Var.zzf |= 16;
        u4Var.zzU = j;
    }

    /* renamed from: Y0 */
    static /* synthetic */ void m16860Y0(C4431u4 u4Var) {
        u4Var.zze &= -129;
        u4Var.zzp = zzd.zzp;
    }

    /* renamed from: Z */
    static /* synthetic */ void m16861Z(C4431u4 u4Var, long j) {
        u4Var.zzf |= 32;
        u4Var.zzV = j;
    }

    /* renamed from: Z0 */
    static /* synthetic */ void m16862Z0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= C11398b.f33139r;
        u4Var.zzq = str;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m16863a0(C4431u4 u4Var, String str) {
        u4Var.zzf |= 128;
        u4Var.zzX = str;
    }

    /* renamed from: a1 */
    static /* synthetic */ void m16864a1(C4431u4 u4Var) {
        u4Var.zze &= -257;
        u4Var.zzq = zzd.zzq;
    }

    /* renamed from: b1 */
    static /* synthetic */ void m16865b1(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= C11398b.f33140s;
        u4Var.zzr = str;
    }

    /* renamed from: c0 */
    static /* synthetic */ void m16866c0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= C11398b.f33142u;
        u4Var.zzt = str;
    }

    /* renamed from: c1 */
    static /* synthetic */ void m16867c1(C4431u4 u4Var, int i) {
        u4Var.zze |= C11398b.f33141t;
        u4Var.zzs = i;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m16868d0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= C11398b.f33143v;
        u4Var.zzu = str;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m16869e0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= 8192;
        u4Var.zzv = str;
    }

    /* renamed from: e1 */
    private final void m16870e1() {
        C4453v9 v9Var = this.zzh;
        if (!v9Var.mo13068s()) {
            this.zzh = C4351p9.m16439q(v9Var);
        }
    }

    /* renamed from: f0 */
    static /* synthetic */ void m16871f0(C4431u4 u4Var, long j) {
        u4Var.zze |= 16384;
        u4Var.zzw = j;
    }

    /* renamed from: f1 */
    private final void m16872f1() {
        C4453v9 v9Var = this.zzi;
        if (!v9Var.mo13068s()) {
            this.zzi = C4351p9.m16439q(v9Var);
        }
    }

    /* renamed from: g0 */
    static /* synthetic */ void m16873g0(C4431u4 u4Var, long j) {
        u4Var.zze |= 32768;
        u4Var.zzx = 77000;
    }

    /* renamed from: h0 */
    static /* synthetic */ void m16874h0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= 65536;
        u4Var.zzy = str;
    }

    /* renamed from: i0 */
    static /* synthetic */ void m16875i0(C4431u4 u4Var) {
        u4Var.zze &= -65537;
        u4Var.zzy = zzd.zzy;
    }

    /* renamed from: j0 */
    static /* synthetic */ void m16876j0(C4431u4 u4Var, boolean z) {
        u4Var.zze |= 131072;
        u4Var.zzz = z;
    }

    /* renamed from: k0 */
    static /* synthetic */ void m16877k0(C4431u4 u4Var) {
        u4Var.zze &= -131073;
        u4Var.zzz = false;
    }

    /* renamed from: l0 */
    static /* synthetic */ void m16878l0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= 262144;
        u4Var.zzA = str;
    }

    /* renamed from: m0 */
    static /* synthetic */ void m16879m0(C4431u4 u4Var) {
        u4Var.zze &= -262145;
        u4Var.zzA = zzd.zzA;
    }

    /* renamed from: n0 */
    static /* synthetic */ void m16880n0(C4431u4 u4Var, long j) {
        u4Var.zze |= 524288;
        u4Var.zzB = j;
    }

    /* renamed from: o0 */
    static /* synthetic */ void m16881o0(C4431u4 u4Var, int i) {
        u4Var.zze |= 1048576;
        u4Var.zzC = i;
    }

    /* renamed from: p0 */
    static /* synthetic */ void m16882p0(C4431u4 u4Var, String str) {
        u4Var.zze |= 2097152;
        u4Var.zzD = str;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m16883q0(C4431u4 u4Var) {
        u4Var.zze &= -2097153;
        u4Var.zzD = zzd.zzD;
    }

    /* renamed from: r0 */
    static /* synthetic */ void m16884r0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= 4194304;
        u4Var.zzE = str;
    }

    /* renamed from: t0 */
    static /* synthetic */ void m16885t0(C4431u4 u4Var, boolean z) {
        u4Var.zze |= 8388608;
        u4Var.zzF = z;
    }

    /* renamed from: u0 */
    static /* synthetic */ void m16886u0(C4431u4 u4Var, Iterable iterable) {
        C4453v9 v9Var = u4Var.zzG;
        if (!v9Var.mo13068s()) {
            u4Var.zzG = C4351p9.m16439q(v9Var);
        }
        C4146d8.m15688f(iterable, u4Var.zzG);
    }

    /* renamed from: w0 */
    static /* synthetic */ void m16888w0(C4431u4 u4Var, String str) {
        str.getClass();
        u4Var.zze |= 16777216;
        u4Var.zzH = str;
    }

    /* renamed from: x0 */
    static /* synthetic */ void m16889x0(C4431u4 u4Var, int i) {
        u4Var.zze |= 33554432;
        u4Var.zzI = i;
    }

    /* renamed from: y0 */
    static /* synthetic */ void m16890y0(C4431u4 u4Var, int i) {
        u4Var.zze |= 1;
        u4Var.zzg = 1;
    }

    /* renamed from: z0 */
    static /* synthetic */ void m16891z0(C4431u4 u4Var) {
        u4Var.zze &= -268435457;
        u4Var.zzL = zzd.zzL;
    }

    /* renamed from: A */
    public final String mo13686A() {
        return this.zzt;
    }

    /* renamed from: A1 */
    public final boolean mo13687A1() {
        return (this.zze & 32768) != 0;
    }

    /* renamed from: B */
    public final String mo13688B() {
        return this.zzv;
    }

    /* renamed from: B0 */
    public final boolean mo13689B0() {
        return this.zzz;
    }

    /* renamed from: B1 */
    public final int mo13690B1() {
        return this.zzh.size();
    }

    /* renamed from: C */
    public final String mo13691C() {
        return this.zzX;
    }

    /* renamed from: C0 */
    public final boolean mo13692C0() {
        return this.zzF;
    }

    /* renamed from: C1 */
    public final int mo13693C1() {
        return this.zzg;
    }

    /* renamed from: D */
    public final String mo13694D() {
        return this.zzq;
    }

    /* renamed from: D1 */
    public final int mo13695D1() {
        return this.zzQ;
    }

    /* renamed from: E */
    public final String mo13696E() {
        return this.zzO;
    }

    /* renamed from: E1 */
    public final int mo13697E1() {
        return this.zzs;
    }

    /* renamed from: F */
    public final String mo13698F() {
        return this.zzH;
    }

    /* renamed from: F1 */
    public final int mo13699F1() {
        return this.zzi.size();
    }

    /* renamed from: G */
    public final String mo13700G() {
        return this.zzE;
    }

    /* renamed from: G1 */
    public final long mo13701G1() {
        return this.zzM;
    }

    /* renamed from: H */
    public final String mo13702H() {
        return this.zzD;
    }

    /* renamed from: H1 */
    public final long mo13703H1() {
        return this.zzB;
    }

    /* renamed from: I */
    public final String mo13704I() {
        return this.zzp;
    }

    /* renamed from: I1 */
    public final long mo13705I1() {
        return this.zzU;
    }

    /* renamed from: J */
    public final String mo13706J() {
        return this.zzo;
    }

    /* renamed from: J1 */
    public final long mo13707J1() {
        return this.zzl;
    }

    /* renamed from: K */
    public final String mo13708K() {
        return this.zzy;
    }

    /* renamed from: K1 */
    public final long mo13709K1() {
        return this.zzw;
    }

    /* renamed from: L */
    public final String mo13710L() {
        return this.zzad;
    }

    /* renamed from: L1 */
    public final long mo13711L1() {
        return this.zzn;
    }

    /* renamed from: M */
    public final String mo13712M() {
        return this.zzr;
    }

    /* renamed from: M1 */
    public final long mo13713M1() {
        return this.zzm;
    }

    /* renamed from: N */
    public final List mo13714N() {
        return this.zzG;
    }

    /* renamed from: N1 */
    public final long mo13715N1() {
        return this.zzk;
    }

    /* renamed from: O */
    public final List mo13716O() {
        return this.zzh;
    }

    /* renamed from: O1 */
    public final long mo13717O1() {
        return this.zzag;
    }

    /* renamed from: P */
    public final List mo13718P() {
        return this.zzi;
    }

    /* renamed from: P1 */
    public final long mo13719P1() {
        return this.zzj;
    }

    /* renamed from: Q1 */
    public final long mo13720Q1() {
        return this.zzx;
    }

    /* renamed from: R1 */
    public final C4244j4 mo13721R1(int i) {
        return (C4244j4) this.zzh.get(i);
    }

    /* renamed from: U1 */
    public final C4143d5 mo13722U1(int i) {
        return (C4143d5) this.zzi.get(i);
    }

    /* renamed from: V1 */
    public final String mo13723V1() {
        return this.zzR;
    }

    /* renamed from: W1 */
    public final String mo13724W1() {
        return this.zzu;
    }

    /* renamed from: X1 */
    public final String mo13725X1() {
        return this.zzA;
    }

    /* renamed from: b0 */
    public final int mo13726b0() {
        return this.zzI;
    }

    /* renamed from: d1 */
    public final int mo13727d1() {
        return this.zzC;
    }

    /* renamed from: g1 */
    public final boolean mo13728g1() {
        return (this.zze & 33554432) != 0;
    }

    /* renamed from: h1 */
    public final boolean mo13729h1() {
        return (this.zze & 1048576) != 0;
    }

    /* renamed from: j1 */
    public final boolean mo13730j1() {
        return (this.zze & 536870912) != 0;
    }

    /* renamed from: k1 */
    public final boolean mo13731k1() {
        return (this.zzf & 128) != 0;
    }

    /* renamed from: l1 */
    public final boolean mo13732l1() {
        return (this.zze & 524288) != 0;
    }

    /* renamed from: m1 */
    public final boolean mo13733m1() {
        return (this.zzf & 16) != 0;
    }

    /* renamed from: n1 */
    public final boolean mo13734n1() {
        return (this.zze & 8) != 0;
    }

    /* renamed from: o1 */
    public final boolean mo13735o1() {
        return (this.zze & 16384) != 0;
    }

    /* renamed from: p1 */
    public final boolean mo13736p1() {
        return (this.zze & 131072) != 0;
    }

    /* renamed from: q1 */
    public final boolean mo13737q1() {
        return (this.zze & 32) != 0;
    }

    /* renamed from: r1 */
    public final boolean mo13738r1() {
        return (this.zze & 16) != 0;
    }

    /* renamed from: s1 */
    public final boolean mo13739s1() {
        return (this.zze & 1) != 0;
    }

    /* renamed from: t1 */
    public final boolean mo13740t1() {
        return (this.zzf & 2) != 0;
    }

    /* renamed from: u1 */
    public final boolean mo13741u1() {
        return (this.zze & 8388608) != 0;
    }

    /* renamed from: v1 */
    public final boolean mo13742v1() {
        return (this.zzf & 8192) != 0;
    }

    /* renamed from: w1 */
    public final boolean mo13743w1() {
        return (this.zze & 4) != 0;
    }

    /* renamed from: x1 */
    public final boolean mo13744x1() {
        return (this.zzf & 32768) != 0;
    }

    /* renamed from: y1 */
    public final boolean mo13745y1() {
        return (this.zze & C11398b.f33141t) != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final Object mo12903z(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C4351p9.m16441s(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", C4244j4.class, "zzi", C4143d5.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", C4176f4.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", C4108b4.f13157a, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        } else if (i2 == 3) {
            return new C4431u4();
        } else {
            if (i2 == 4) {
                return new C4414t4((C4091a4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }

    /* renamed from: z1 */
    public final boolean mo13746z1() {
        return (this.zze & 2) != 0;
    }
}
