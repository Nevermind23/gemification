package xy0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.d */
public final class C39940d {

    /* renamed from: a */
    private final String f94761a;

    /* renamed from: b */
    private final String f94762b;

    /* renamed from: c */
    private final String f94763c;

    /* renamed from: d */
    private final Object f94764d;

    /* renamed from: e */
    private final String f94765e;

    /* renamed from: f */
    private final long f94766f;

    /* renamed from: g */
    private final String f94767g;

    /* renamed from: h */
    private final double f94768h;

    /* renamed from: i */
    private final BigDecimal f94769i;

    /* renamed from: j */
    private final long f94770j;

    /* renamed from: k */
    private final String f94771k;

    /* renamed from: l */
    private final String f94772l;

    /* renamed from: m */
    private final String f94773m;

    /* renamed from: n */
    private final String f94774n;

    /* renamed from: o */
    private final String f94775o;

    /* renamed from: p */
    private final double f94776p;

    /* renamed from: q */
    private final BigDecimal f94777q;

    /* renamed from: r */
    private final String f94778r;

    /* renamed from: s */
    private final String f94779s;

    /* renamed from: t */
    private final BigDecimal f94780t;

    public C39940d(String str, String str2, String str3, Object obj, String str4, long j, String str5, double d, BigDecimal bigDecimal, long j2, String str6, String str7, String str8, String str9, String str10, double d2, BigDecimal bigDecimal2, String str11, String str12, BigDecimal bigDecimal3) {
        String str13 = str6;
        String str14 = str7;
        C41536l.m120489i(str, "agreementNameEn");
        C41536l.m120489i(str2, "agreementNameGe");
        C41536l.m120489i(str4, "ccy");
        C41536l.m120489i(str13, "securityNameEn");
        C41536l.m120489i(str14, "securityNameGe");
        this.f94761a = str;
        this.f94762b = str2;
        this.f94763c = str3;
        this.f94764d = obj;
        this.f94765e = str4;
        this.f94766f = j;
        this.f94767g = str5;
        this.f94768h = d;
        this.f94769i = bigDecimal;
        this.f94770j = j2;
        this.f94771k = str13;
        this.f94772l = str14;
        this.f94773m = str8;
        this.f94774n = str9;
        this.f94775o = str10;
        this.f94776p = d2;
        this.f94777q = bigDecimal2;
        this.f94778r = str11;
        this.f94779s = str12;
        this.f94780t = bigDecimal3;
    }

    /* renamed from: a */
    public final String mo93684a() {
        return this.f94765e;
    }

    /* renamed from: b */
    public final long mo93685b() {
        return this.f94766f;
    }

    /* renamed from: c */
    public final double mo93686c() {
        return this.f94768h;
    }

    /* renamed from: d */
    public final double mo93687d() {
        return this.f94776p;
    }

    /* renamed from: e */
    public final long mo93688e() {
        return this.f94770j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39940d)) {
            return false;
        }
        C39940d dVar = (C39940d) obj;
        return C41536l.m120484d(this.f94761a, dVar.f94761a) && C41536l.m120484d(this.f94762b, dVar.f94762b) && C41536l.m120484d(this.f94763c, dVar.f94763c) && C41536l.m120484d(this.f94764d, dVar.f94764d) && C41536l.m120484d(this.f94765e, dVar.f94765e) && this.f94766f == dVar.f94766f && C41536l.m120484d(this.f94767g, dVar.f94767g) && Double.compare(this.f94768h, dVar.f94768h) == 0 && C41536l.m120484d(this.f94769i, dVar.f94769i) && this.f94770j == dVar.f94770j && C41536l.m120484d(this.f94771k, dVar.f94771k) && C41536l.m120484d(this.f94772l, dVar.f94772l) && C41536l.m120484d(this.f94773m, dVar.f94773m) && C41536l.m120484d(this.f94774n, dVar.f94774n) && C41536l.m120484d(this.f94775o, dVar.f94775o) && Double.compare(this.f94776p, dVar.f94776p) == 0 && C41536l.m120484d(this.f94777q, dVar.f94777q) && C41536l.m120484d(this.f94778r, dVar.f94778r) && C41536l.m120484d(this.f94779s, dVar.f94779s) && C41536l.m120484d(this.f94780t, dVar.f94780t);
    }

    /* renamed from: f */
    public final String mo93690f() {
        return this.f94771k;
    }

    /* renamed from: g */
    public final String mo93691g() {
        return this.f94772l;
    }

    public int hashCode() {
        int hashCode = ((this.f94761a.hashCode() * 31) + this.f94762b.hashCode()) * 31;
        String str = this.f94763c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.f94764d;
        int hashCode3 = (((((hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31) + this.f94765e.hashCode()) * 31) + C7397t.m28148a(this.f94766f)) * 31;
        String str2 = this.f94767g;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.doubleToLongBits(this.f94768h)) * 31;
        BigDecimal bigDecimal = this.f94769i;
        int hashCode5 = (((((((hashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + C7397t.m28148a(this.f94770j)) * 31) + this.f94771k.hashCode()) * 31) + this.f94772l.hashCode()) * 31;
        String str3 = this.f94773m;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94774n;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f94775o;
        int hashCode8 = (((hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + Double.doubleToLongBits(this.f94776p)) * 31;
        BigDecimal bigDecimal2 = this.f94777q;
        int hashCode9 = (hashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str6 = this.f94778r;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f94779s;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f94780t;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        String str = this.f94761a;
        String str2 = this.f94762b;
        String str3 = this.f94763c;
        Object obj = this.f94764d;
        String str4 = this.f94765e;
        long j = this.f94766f;
        String str5 = this.f94767g;
        double d = this.f94768h;
        BigDecimal bigDecimal = this.f94769i;
        long j2 = this.f94770j;
        String str6 = this.f94771k;
        String str7 = this.f94772l;
        String str8 = this.f94773m;
        String str9 = this.f94774n;
        String str10 = str6;
        String str11 = this.f94775o;
        double d2 = this.f94776p;
        BigDecimal bigDecimal2 = this.f94777q;
        String str12 = this.f94778r;
        String str13 = this.f94779s;
        BigDecimal bigDecimal3 = this.f94780t;
        return "Bond(agreementNameEn=" + str + ", agreementNameGe=" + str2 + ", agreementType=" + str3 + ", attachmentFileBase64=" + obj + ", ccy=" + str4 + ", id=" + j + ", isinCode=" + str5 + ", marketPrice=" + d + ", purchasePrice=" + bigDecimal + ", quantity=" + j2 + ", securityNameEn=" + str10 + ", securityNameGe=" + str7 + ", tickerCode=" + str8 + ", tickerNameEn=" + str9 + ", tickerNameGe=" + str11 + ", marketValue=" + d2 + ", unrealisedProfitLoss=" + bigDecimal2 + ", note=" + str12 + ", coupon=" + str13 + ", cashValue=" + bigDecimal3 + ")";
    }
}
