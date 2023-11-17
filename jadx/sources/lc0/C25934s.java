package lc0;

import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import ic0.C25168f;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: lc0.s */
public final class C25934s {

    /* renamed from: a */
    private final C25168f f65967a;

    /* renamed from: b */
    private final double f65968b;

    /* renamed from: c */
    private final double f65969c;

    /* renamed from: d */
    private final double f65970d;

    /* renamed from: e */
    private final String f65971e;

    /* renamed from: f */
    private final String f65972f;

    /* renamed from: g */
    private final long f65973g;

    /* renamed from: h */
    private final long f65974h;

    /* renamed from: i */
    private final int f65975i;

    /* renamed from: j */
    private final long f65976j;

    /* renamed from: k */
    private final String f65977k;

    /* renamed from: l */
    private final String f65978l;

    /* renamed from: m */
    private final String f65979m;

    /* renamed from: n */
    private final Long f65980n;

    /* renamed from: o */
    private final String f65981o;

    /* renamed from: p */
    private final String f65982p;

    /* renamed from: q */
    private final boolean f65983q;

    /* renamed from: r */
    private final boolean f65984r;

    /* renamed from: s */
    private final double f65985s;

    /* renamed from: t */
    private final double f65986t;

    /* renamed from: u */
    private final double f65987u;

    /* renamed from: lc0.s$a */
    public /* synthetic */ class C25935a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65988a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                ic0.f[] r0 = ic0.C25168f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ic0.f r1 = ic0.C25168f.INITIAL_AMOUNT_WITH_INTEREST     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ic0.f r1 = ic0.C25168f.LOWER_THAN_INITIAL_AMOUNT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ic0.f r1 = ic0.C25168f.INITIAL_AMOUNT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f65988a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lc0.C25934s.C25935a.<clinit>():void");
        }
    }

    public C25934s(C25168f fVar, double d, double d2, double d3, String str, String str2, long j, long j2, int i, long j3, String str3, String str4, String str5, Long l, String str6, String str7, boolean z, boolean z2, double d4, double d5, double d6) {
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        C41536l.m120489i(fVar, "prolongationType");
        C41536l.m120489i(str8, "name");
        C41536l.m120489i(str9, "purpose");
        C41536l.m120489i(str10, "withdrawalType");
        C41536l.m120489i(str11, "withdrawalTypeKey");
        C41536l.m120489i(str12, "agreeType");
        C41536l.m120489i(str13, "ccy");
        C41536l.m120489i(str14, "prodType");
        this.f65967a = fVar;
        this.f65968b = d;
        this.f65969c = d2;
        this.f65970d = d3;
        this.f65971e = str8;
        this.f65972f = str9;
        this.f65973g = j;
        this.f65974h = j2;
        this.f65975i = i;
        this.f65976j = j3;
        this.f65977k = str10;
        this.f65978l = str11;
        this.f65979m = str12;
        this.f65980n = l;
        this.f65981o = str13;
        this.f65982p = str14;
        this.f65983q = z;
        this.f65984r = z2;
        this.f65985s = d4;
        this.f65986t = d5;
        this.f65987u = d6;
    }

    /* renamed from: b */
    public static /* synthetic */ C25934s m81517b(C25934s sVar, C25168f fVar, double d, double d2, double d3, String str, String str2, long j, long j2, int i, long j3, String str3, String str4, String str5, Long l, String str6, String str7, boolean z, boolean z2, double d4, double d5, double d6, int i2, Object obj) {
        C25934s sVar2 = sVar;
        int i3 = i2;
        C25168f fVar2 = (i3 & 1) != 0 ? sVar2.f65967a : fVar;
        double d7 = (i3 & 2) != 0 ? sVar2.f65968b : d;
        double d8 = (i3 & 4) != 0 ? sVar2.f65969c : d2;
        double d9 = (i3 & 8) != 0 ? sVar2.f65970d : d3;
        String str8 = (i3 & 16) != 0 ? sVar2.f65971e : str;
        String str9 = (i3 & 32) != 0 ? sVar2.f65972f : str2;
        long j4 = (i3 & 64) != 0 ? sVar2.f65973g : j;
        long j5 = (i3 & 128) != 0 ? sVar2.f65974h : j2;
        return sVar.mo64822a(fVar2, d7, d8, d9, str8, str9, j4, j5, (i3 & C11398b.f33139r) != 0 ? sVar2.f65975i : i, (i3 & C11398b.f33140s) != 0 ? sVar2.f65976j : j3, (i3 & C11398b.f33141t) != 0 ? sVar2.f65977k : str3, (i3 & C11398b.f33142u) != 0 ? sVar2.f65978l : str4, (i3 & C11398b.f33143v) != 0 ? sVar2.f65979m : str5, (i3 & 8192) != 0 ? sVar2.f65980n : l, (i3 & 16384) != 0 ? sVar2.f65981o : str6, (i3 & 32768) != 0 ? sVar2.f65982p : str7, (i3 & 65536) != 0 ? sVar2.f65983q : z, (i3 & 131072) != 0 ? sVar2.f65984r : z2, (i3 & 262144) != 0 ? sVar2.f65985s : d4, (i3 & 524288) != 0 ? sVar2.f65986t : d5, (i3 & 1048576) != 0 ? sVar2.f65987u : d6);
    }

    /* renamed from: a */
    public final C25934s mo64822a(C25168f fVar, double d, double d2, double d3, String str, String str2, long j, long j2, int i, long j3, String str3, String str4, String str5, Long l, String str6, String str7, boolean z, boolean z2, double d4, double d5, double d6) {
        C25168f fVar2 = fVar;
        C41536l.m120489i(fVar2, "prolongationType");
        C41536l.m120489i(str, "name");
        C41536l.m120489i(str2, "purpose");
        C41536l.m120489i(str3, "withdrawalType");
        C41536l.m120489i(str4, "withdrawalTypeKey");
        C41536l.m120489i(str5, "agreeType");
        C41536l.m120489i(str6, "ccy");
        C41536l.m120489i(str7, "prodType");
        return new C25934s(fVar2, d, d2, d3, str, str2, j, j2, i, j3, str3, str4, str5, l, str6, str7, z, z2, d4, d5, d6);
    }

    /* renamed from: c */
    public final Long mo64823c() {
        Long l = this.f65980n;
        if (l != null) {
            if (l.longValue() > 0) {
                return l;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final double mo64824d() {
        int i = C25935a.f65988a[this.f65967a.ordinal()];
        if (i == 1) {
            return this.f65968b;
        }
        if (i == 2) {
            return this.f65969c;
        }
        if (i != 3) {
            return Utils.DOUBLE_EPSILON;
        }
        return this.f65970d;
    }

    /* renamed from: e */
    public final long mo64825e() {
        return this.f65976j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25934s)) {
            return false;
        }
        C25934s sVar = (C25934s) obj;
        return this.f65967a == sVar.f65967a && Double.compare(this.f65968b, sVar.f65968b) == 0 && Double.compare(this.f65969c, sVar.f65969c) == 0 && Double.compare(this.f65970d, sVar.f65970d) == 0 && C41536l.m120484d(this.f65971e, sVar.f65971e) && C41536l.m120484d(this.f65972f, sVar.f65972f) && this.f65973g == sVar.f65973g && this.f65974h == sVar.f65974h && this.f65975i == sVar.f65975i && this.f65976j == sVar.f65976j && C41536l.m120484d(this.f65977k, sVar.f65977k) && C41536l.m120484d(this.f65978l, sVar.f65978l) && C41536l.m120484d(this.f65979m, sVar.f65979m) && C41536l.m120484d(this.f65980n, sVar.f65980n) && C41536l.m120484d(this.f65981o, sVar.f65981o) && C41536l.m120484d(this.f65982p, sVar.f65982p) && this.f65983q == sVar.f65983q && this.f65984r == sVar.f65984r && Double.compare(this.f65985s, sVar.f65985s) == 0 && Double.compare(this.f65986t, sVar.f65986t) == 0 && Double.compare(this.f65987u, sVar.f65987u) == 0;
    }

    /* renamed from: f */
    public final String mo64827f() {
        return this.f65979m;
    }

    /* renamed from: g */
    public final String mo64828g() {
        return this.f65981o;
    }

    /* renamed from: h */
    public final boolean mo64829h() {
        return this.f65983q;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f65967a.hashCode() * 31) + Double.doubleToLongBits(this.f65968b)) * 31) + Double.doubleToLongBits(this.f65969c)) * 31) + Double.doubleToLongBits(this.f65970d)) * 31) + this.f65971e.hashCode()) * 31) + this.f65972f.hashCode()) * 31) + C7397t.m28148a(this.f65973g)) * 31) + C7397t.m28148a(this.f65974h)) * 31) + this.f65975i) * 31) + C7397t.m28148a(this.f65976j)) * 31) + this.f65977k.hashCode()) * 31) + this.f65978l.hashCode()) * 31) + this.f65979m.hashCode()) * 31;
        Long l = this.f65980n;
        int hashCode2 = (((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.f65981o.hashCode()) * 31) + this.f65982p.hashCode()) * 31;
        boolean z = this.f65983q;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f65984r;
        if (!z3) {
            z2 = z3;
        }
        return ((((((i + (z2 ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f65985s)) * 31) + Double.doubleToLongBits(this.f65986t)) * 31) + Double.doubleToLongBits(this.f65987u);
    }

    /* renamed from: i */
    public final boolean mo64831i() {
        return this.f65984r;
    }

    /* renamed from: j */
    public final int mo64832j() {
        return this.f65975i;
    }

    /* renamed from: k */
    public final double mo64833k() {
        return this.f65968b;
    }

    /* renamed from: l */
    public final double mo64834l() {
        return this.f65987u;
    }

    /* renamed from: m */
    public final double mo64835m() {
        return this.f65985s;
    }

    /* renamed from: n */
    public final double mo64836n() {
        return this.f65986t;
    }

    /* renamed from: o */
    public final long mo64837o() {
        return this.f65974h;
    }

    /* renamed from: p */
    public final String mo64838p() {
        return this.f65971e;
    }

    /* renamed from: q */
    public final double mo64839q() {
        return this.f65969c;
    }

    /* renamed from: r */
    public final String mo64840r() {
        return this.f65982p;
    }

    /* renamed from: s */
    public final String mo64841s() {
        return this.f65972f;
    }

    /* renamed from: t */
    public final long mo64842t() {
        return this.f65973g;
    }

    public String toString() {
        C25168f fVar = this.f65967a;
        double d = this.f65968b;
        double d2 = this.f65969c;
        double d3 = this.f65970d;
        String str = this.f65971e;
        String str2 = this.f65972f;
        long j = this.f65973g;
        long j2 = this.f65974h;
        int i = this.f65975i;
        long j3 = this.f65976j;
        String str3 = this.f65977k;
        String str4 = this.f65978l;
        String str5 = this.f65979m;
        Long l = this.f65980n;
        String str6 = this.f65981o;
        String str7 = this.f65982p;
        boolean z = this.f65983q;
        String str8 = str3;
        double d4 = this.f65985s;
        double d5 = this.f65986t;
        double d6 = this.f65987u;
        return "ProlongationModel(prolongationType=" + fVar + ", fullAmount=" + d + ", newAmount=" + d2 + ", initialAmount=" + d3 + ", name=" + str + ", purpose=" + str2 + ", startDate=" + j + ", maturityDate=" + j2 + ", depositPeriod=" + i + ", agreeKey=" + j3 + ", withdrawalType=" + str8 + ", withdrawalTypeKey=" + str4 + ", agreeType=" + str5 + ", acctKey=" + l + ", ccy=" + str6 + ", prodType=" + str7 + ", copyCas=" + z + ", copySto=" + this.f65984r + ", interestRate=" + d4 + ", irr=" + d5 + ", interestAmount=" + d6 + ")";
    }

    /* renamed from: u */
    public final String mo64844u() {
        return this.f65977k;
    }

    /* renamed from: v */
    public final String mo64845v() {
        return this.f65978l;
    }

    /* renamed from: w */
    public final boolean mo64846w() {
        boolean z;
        if (this.f65967a == C25168f.DONT_WANT_TO_RENEW) {
            return false;
        }
        if (mo64824d() == Utils.DOUBLE_EPSILON) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(!C40439w.m117118v(this.f65977k))) {
            return false;
        }
        long j = this.f65974h;
        if (j == Long.MIN_VALUE || j <= this.f65973g) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C25934s(ic0.C25168f r32, double r33, double r35, double r37, java.lang.String r39, java.lang.String r40, long r41, long r43, int r45, long r46, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.Long r51, java.lang.String r52, java.lang.String r53, boolean r54, boolean r55, double r56, double r58, double r60, int r62, kotlin.jvm.internal.DefaultConstructorMarker r63) {
        /*
            r31 = this;
            r0 = r62
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            ic0.f r1 = ic0.C25168f.DONT_WANT_TO_RENEW
            goto L_0x000b
        L_0x0009:
            r1 = r32
        L_0x000b:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0013
            r5 = r3
            goto L_0x0015
        L_0x0013:
            r5 = r33
        L_0x0015:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x001b
            r7 = r3
            goto L_0x001d
        L_0x001b:
            r7 = r35
        L_0x001d:
            r2 = r0 & 8
            if (r2 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r3 = r37
        L_0x0024:
            r2 = r0 & 16
            java.lang.String r9 = ""
            if (r2 == 0) goto L_0x002c
            r2 = r9
            goto L_0x002e
        L_0x002c:
            r2 = r39
        L_0x002e:
            r10 = r0 & 32
            if (r10 == 0) goto L_0x0034
            r10 = r9
            goto L_0x0036
        L_0x0034:
            r10 = r40
        L_0x0036:
            r11 = r0 & 64
            if (r11 == 0) goto L_0x003d
            r14 = -9223372036854775808
            goto L_0x003f
        L_0x003d:
            r14 = r41
        L_0x003f:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0046
            r16 = -9223372036854775808
            goto L_0x0048
        L_0x0046:
            r16 = r43
        L_0x0048:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004f
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0051
        L_0x004f:
            r11 = r45
        L_0x0051:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x0058
            r12 = -9223372036854775808
            goto L_0x005a
        L_0x0058:
            r12 = r46
        L_0x005a:
            r32 = r9
            r9 = r0 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0063
            r9 = r32
            goto L_0x0065
        L_0x0063:
            r9 = r48
        L_0x0065:
            r63 = r9
            r9 = r0 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x006e
            r9 = r32
            goto L_0x0070
        L_0x006e:
            r9 = r49
        L_0x0070:
            r18 = r9
            r9 = r0 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0079
            r9 = r32
            goto L_0x007b
        L_0x0079:
            r9 = r50
        L_0x007b:
            r19 = r9
            r9 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r9 == 0) goto L_0x0083
            r9 = 0
            goto L_0x0085
        L_0x0083:
            r9 = r51
        L_0x0085:
            r20 = r9
            r9 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r9 == 0) goto L_0x008e
            java.lang.String r9 = "GEL"
            goto L_0x0090
        L_0x008e:
            r9 = r52
        L_0x0090:
            r21 = 32768(0x8000, float:4.5918E-41)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x009a
            r21 = r32
            goto L_0x009c
        L_0x009a:
            r21 = r53
        L_0x009c:
            r22 = 65536(0x10000, float:9.18355E-41)
            r22 = r0 & r22
            r23 = 0
            if (r22 == 0) goto L_0x00a7
            r22 = r23
            goto L_0x00a9
        L_0x00a7:
            r22 = r54
        L_0x00a9:
            r24 = 131072(0x20000, float:1.83671E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r23 = r55
        L_0x00b2:
            r24 = 262144(0x40000, float:3.67342E-40)
            r24 = r0 & r24
            r25 = 1
            if (r24 == 0) goto L_0x00bd
            r27 = r25
            goto L_0x00bf
        L_0x00bd:
            r27 = r56
        L_0x00bf:
            r24 = 524288(0x80000, float:7.34684E-40)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00c8
            r29 = r25
            goto L_0x00ca
        L_0x00c8:
            r29 = r58
        L_0x00ca:
            r24 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r24
            if (r0 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r25 = r60
        L_0x00d3:
            r32 = r31
            r33 = r1
            r34 = r5
            r36 = r7
            r38 = r3
            r40 = r2
            r41 = r10
            r42 = r14
            r44 = r16
            r46 = r11
            r47 = r12
            r49 = r63
            r50 = r18
            r51 = r19
            r52 = r20
            r53 = r9
            r54 = r21
            r55 = r22
            r56 = r23
            r57 = r27
            r59 = r29
            r61 = r25
            r32.<init>(r33, r34, r36, r38, r40, r41, r42, r44, r46, r47, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59, r61)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lc0.C25934s.<init>(ic0.f, double, double, double, java.lang.String, java.lang.String, long, long, int, long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, boolean, boolean, double, double, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
