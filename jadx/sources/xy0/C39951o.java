package xy0;

import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.o */
public final class C39951o {

    /* renamed from: A */
    private final String f94833A;

    /* renamed from: B */
    private final String f94834B;

    /* renamed from: C */
    private final String f94835C;

    /* renamed from: D */
    private final String f94836D;

    /* renamed from: E */
    private final Long f94837E;

    /* renamed from: F */
    private final Float f94838F;

    /* renamed from: G */
    private final Float f94839G;

    /* renamed from: H */
    private final String f94840H;

    /* renamed from: I */
    private final String f94841I;

    /* renamed from: J */
    private final String f94842J;

    /* renamed from: a */
    private final long f94843a;

    /* renamed from: b */
    private final Date f94844b;

    /* renamed from: c */
    private final Date f94845c;

    /* renamed from: d */
    private final Date f94846d;

    /* renamed from: e */
    private final Long f94847e;

    /* renamed from: f */
    private final double f94848f;

    /* renamed from: g */
    private final double f94849g;

    /* renamed from: h */
    private final double f94850h;

    /* renamed from: i */
    private final double f94851i;

    /* renamed from: j */
    private final long f94852j;

    /* renamed from: k */
    private final boolean f94853k;

    /* renamed from: l */
    private final double f94854l;

    /* renamed from: m */
    private final String f94855m;

    /* renamed from: n */
    private final double f94856n;

    /* renamed from: o */
    private final double f94857o;

    /* renamed from: p */
    private final String f94858p;

    /* renamed from: q */
    private final boolean f94859q;

    /* renamed from: r */
    private final boolean f94860r;

    /* renamed from: s */
    private final String f94861s;

    /* renamed from: t */
    private final double f94862t;

    /* renamed from: u */
    private final double f94863u;

    /* renamed from: v */
    private final String f94864v;

    /* renamed from: w */
    private final boolean f94865w;

    /* renamed from: x */
    private final double f94866x;

    /* renamed from: y */
    private final String f94867y;

    /* renamed from: z */
    private final String f94868z;

    public C39951o(long j, Date date, Date date2, Date date3, Long l, double d, double d2, double d3, double d4, long j2, boolean z, double d5, String str, double d6, double d7, String str2, boolean z2, boolean z3, String str3, double d8, double d9, String str4, boolean z4, double d12, String str5, String str6, String str7, String str8, String str9, String str10, Long l2, Float f, Float f2, String str11, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str4;
        String str17 = str6;
        C41536l.m120489i(str14, "loanSubType");
        C41536l.m120489i(str15, "subTypeGroup");
        C41536l.m120489i(str16, "repaymentFlag");
        C41536l.m120489i(str17, "isOnlineInstallment");
        this.f94843a = j;
        this.f94844b = date;
        this.f94845c = date2;
        this.f94846d = date3;
        this.f94847e = l;
        this.f94848f = d;
        this.f94849g = d2;
        this.f94850h = d3;
        this.f94851i = d4;
        this.f94852j = j2;
        this.f94853k = z;
        this.f94854l = d5;
        this.f94855m = str14;
        this.f94856n = d6;
        this.f94857o = d7;
        this.f94858p = str15;
        this.f94859q = z2;
        this.f94860r = z3;
        this.f94861s = str3;
        this.f94862t = d8;
        this.f94863u = d9;
        this.f94864v = str16;
        this.f94865w = z4;
        this.f94866x = d12;
        this.f94867y = str5;
        this.f94868z = str17;
        this.f94833A = str7;
        this.f94834B = str8;
        this.f94835C = str9;
        this.f94836D = str10;
        this.f94837E = l2;
        this.f94838F = f;
        this.f94839G = f2;
        this.f94840H = str11;
        this.f94841I = str12;
        this.f94842J = str13;
    }

    /* renamed from: a */
    public final Long mo93750a() {
        return this.f94847e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39951o)) {
            return false;
        }
        C39951o oVar = (C39951o) obj;
        return this.f94843a == oVar.f94843a && C41536l.m120484d(this.f94844b, oVar.f94844b) && C41536l.m120484d(this.f94845c, oVar.f94845c) && C41536l.m120484d(this.f94846d, oVar.f94846d) && C41536l.m120484d(this.f94847e, oVar.f94847e) && Double.compare(this.f94848f, oVar.f94848f) == 0 && Double.compare(this.f94849g, oVar.f94849g) == 0 && Double.compare(this.f94850h, oVar.f94850h) == 0 && Double.compare(this.f94851i, oVar.f94851i) == 0 && this.f94852j == oVar.f94852j && this.f94853k == oVar.f94853k && Double.compare(this.f94854l, oVar.f94854l) == 0 && C41536l.m120484d(this.f94855m, oVar.f94855m) && Double.compare(this.f94856n, oVar.f94856n) == 0 && Double.compare(this.f94857o, oVar.f94857o) == 0 && C41536l.m120484d(this.f94858p, oVar.f94858p) && this.f94859q == oVar.f94859q && this.f94860r == oVar.f94860r && C41536l.m120484d(this.f94861s, oVar.f94861s) && Double.compare(this.f94862t, oVar.f94862t) == 0 && Double.compare(this.f94863u, oVar.f94863u) == 0 && C41536l.m120484d(this.f94864v, oVar.f94864v) && this.f94865w == oVar.f94865w && Double.compare(this.f94866x, oVar.f94866x) == 0 && C41536l.m120484d(this.f94867y, oVar.f94867y) && C41536l.m120484d(this.f94868z, oVar.f94868z) && C41536l.m120484d(this.f94833A, oVar.f94833A) && C41536l.m120484d(this.f94834B, oVar.f94834B) && C41536l.m120484d(this.f94835C, oVar.f94835C) && C41536l.m120484d(this.f94836D, oVar.f94836D) && C41536l.m120484d(this.f94837E, oVar.f94837E) && C41536l.m120484d(this.f94838F, oVar.f94838F) && C41536l.m120484d(this.f94839G, oVar.f94839G) && C41536l.m120484d(this.f94840H, oVar.f94840H) && C41536l.m120484d(this.f94841I, oVar.f94841I) && C41536l.m120484d(this.f94842J, oVar.f94842J);
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f94843a) * 31;
        Date date = this.f94844b;
        int i = 0;
        int hashCode = (a + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f94845c;
        int hashCode2 = (hashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.f94846d;
        int hashCode3 = (hashCode2 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Long l = this.f94847e;
        int hashCode4 = (((((((((((hashCode3 + (l == null ? 0 : l.hashCode())) * 31) + Double.doubleToLongBits(this.f94848f)) * 31) + Double.doubleToLongBits(this.f94849g)) * 31) + Double.doubleToLongBits(this.f94850h)) * 31) + Double.doubleToLongBits(this.f94851i)) * 31) + C7397t.m28148a(this.f94852j)) * 31;
        boolean z = this.f94853k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int a2 = (((((((((((hashCode4 + (z ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f94854l)) * 31) + this.f94855m.hashCode()) * 31) + Double.doubleToLongBits(this.f94856n)) * 31) + Double.doubleToLongBits(this.f94857o)) * 31) + this.f94858p.hashCode()) * 31;
        boolean z3 = this.f94859q;
        if (z3) {
            z3 = true;
        }
        int i2 = (a2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f94860r;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        String str = this.f94861s;
        int hashCode5 = (((((((i3 + (str == null ? 0 : str.hashCode())) * 31) + Double.doubleToLongBits(this.f94862t)) * 31) + Double.doubleToLongBits(this.f94863u)) * 31) + this.f94864v.hashCode()) * 31;
        boolean z5 = this.f94865w;
        if (!z5) {
            z2 = z5;
        }
        int a3 = (((hashCode5 + (z2 ? 1 : 0)) * 31) + Double.doubleToLongBits(this.f94866x)) * 31;
        String str2 = this.f94867y;
        int hashCode6 = (((a3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f94868z.hashCode()) * 31;
        String str3 = this.f94833A;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94834B;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f94835C;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f94836D;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l2 = this.f94837E;
        int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Float f = this.f94838F;
        int hashCode12 = (hashCode11 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f94839G;
        int hashCode13 = (hashCode12 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str7 = this.f94840H;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f94841I;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f94842J;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode15 + i;
    }

    public String toString() {
        long j = this.f94843a;
        Date date = this.f94844b;
        Date date2 = this.f94845c;
        Date date3 = this.f94846d;
        Long l = this.f94847e;
        double d = this.f94848f;
        double d2 = this.f94849g;
        double d3 = this.f94850h;
        double d4 = this.f94851i;
        long j2 = this.f94852j;
        double d5 = d4;
        boolean z = this.f94853k;
        long j3 = j2;
        double d6 = this.f94854l;
        String str = this.f94855m;
        double d7 = this.f94856n;
        double d8 = this.f94857o;
        String str2 = this.f94858p;
        boolean z2 = this.f94859q;
        boolean z3 = this.f94860r;
        String str3 = str2;
        String str4 = this.f94861s;
        double d9 = this.f94862t;
        double d12 = this.f94863u;
        String str5 = this.f94864v;
        boolean z4 = this.f94865w;
        double d13 = this.f94866x;
        String str6 = this.f94867y;
        String str7 = this.f94868z;
        String str8 = this.f94833A;
        String str9 = this.f94834B;
        String str10 = this.f94835C;
        String str11 = this.f94836D;
        Long l2 = this.f94837E;
        Float f = this.f94838F;
        Float f2 = this.f94839G;
        String str12 = this.f94840H;
        String str13 = this.f94841I;
        String str14 = this.f94842J;
        return "LndDetails(loanKey=" + j + ", signedDate=" + date + ", firstDdDate=" + date2 + ", matureDate=" + date3 + ", linkAcctKey=" + l + ", initialPrincipal=" + d + ", remainingInterest=" + d2 + ", offsetIntSaved=" + d3 + ", interestRate=" + d5 + ", clientKey=" + j3 + ", hasInsFlag=" + z + ", insAmount=" + d6 + ", loanSubType=" + str + ", nextInterest=" + d7 + ", nextPayment=" + d8 + ", subTypeGroup=" + str3 + ", hasSmsScheme=" + z2 + ", isLoanReverseAllowed=" + z3 + ", linkAcctNo=" + str4 + ", restAmount=" + d9 + ", prePaymentCom=" + d12 + ", repaymentFlag=" + str5 + ", isReversible=" + z4 + ", loanDebt=" + d13 + ", fileUrl=" + str6 + ", isOnlineInstallment=" + str7 + ", reversalStatus=" + str8 + ", reversalStatusDictionaryKey=" + str9 + ", reversalStatusDictionaryValue=" + str10 + ", nextFloatingRate=" + str11 + ", nextLoanRateChangeDate=" + l2 + ", nextSpreadRate=" + f + ", nextMinIntRate=" + f2 + ", nextLoanIntTypeName=" + str12 + ", nextLoanIntTypeDictionaryKey=" + str13 + ", nextLoanIntTypeDictionaryValue=" + str14 + ")";
    }
}
