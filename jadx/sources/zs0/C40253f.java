package zs0;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: zs0.f */
public final class C40253f {

    /* renamed from: A */
    private final String f95660A;

    /* renamed from: B */
    private final String f95661B;

    /* renamed from: a */
    private final long f95662a;

    /* renamed from: b */
    private final long f95663b;

    /* renamed from: c */
    private final String f95664c;

    /* renamed from: d */
    private final long f95665d;

    /* renamed from: e */
    private final double f95666e;

    /* renamed from: f */
    private final String f95667f;

    /* renamed from: g */
    private final long f95668g;

    /* renamed from: h */
    private final String f95669h;

    /* renamed from: i */
    private final String f95670i;

    /* renamed from: j */
    private final String f95671j;

    /* renamed from: k */
    private final String f95672k;

    /* renamed from: l */
    private final String f95673l;

    /* renamed from: m */
    private final String f95674m;

    /* renamed from: n */
    private final double f95675n;

    /* renamed from: o */
    private final Double f95676o;

    /* renamed from: p */
    private final double f95677p;

    /* renamed from: q */
    private final String f95678q;

    /* renamed from: r */
    private final double f95679r;

    /* renamed from: s */
    private final boolean f95680s;

    /* renamed from: t */
    private final Date f95681t;

    /* renamed from: u */
    private final Date f95682u;

    /* renamed from: v */
    private final boolean f95683v;

    /* renamed from: w */
    private final String f95684w;

    /* renamed from: x */
    private final String f95685x;

    /* renamed from: y */
    private final List f95686y;

    /* renamed from: z */
    private final List f95687z;

    public C40253f(long j, long j2, String str, long j3, double d, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, double d2, Double d3, double d4, String str9, double d5, boolean z, Date date, Date date2, boolean z2, String str10, String str11, List list, List list2, String str12, String str13) {
        String str14 = str;
        String str15 = str2;
        String str16 = str3;
        String str17 = str4;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        List list3 = list;
        List list4 = list2;
        C41536l.m120489i(str14, "scheme");
        C41536l.m120489i(str15, "schemeTariffCcy");
        C41536l.m120489i(str16, "agreeType");
        C41536l.m120489i(str17, "status");
        C41536l.m120489i(str18, "agreeNo");
        C41536l.m120489i(str19, "prodType");
        C41536l.m120489i(str20, "agreeCcy");
        C41536l.m120489i(str21, "depositAgreeType");
        C41536l.m120489i(list3, "accounts");
        C41536l.m120489i(list4, "depositAccounts");
        this.f95662a = j;
        this.f95663b = j2;
        this.f95664c = str14;
        this.f95665d = j3;
        this.f95666e = d;
        this.f95667f = str15;
        this.f95668g = j4;
        this.f95669h = str16;
        this.f95670i = str17;
        this.f95671j = str5;
        this.f95672k = str18;
        this.f95673l = str19;
        this.f95674m = str20;
        this.f95675n = d2;
        this.f95676o = d3;
        this.f95677p = d4;
        this.f95678q = str21;
        this.f95679r = d5;
        this.f95680s = z;
        this.f95681t = date;
        this.f95682u = date2;
        this.f95683v = z2;
        this.f95684w = str10;
        this.f95685x = str11;
        this.f95686y = list3;
        this.f95687z = list4;
        this.f95660A = str12;
        this.f95661B = str13;
    }

    /* renamed from: A */
    public final double mo94237A() {
        return this.f95675n;
    }

    /* renamed from: B */
    public final Double mo94238B() {
        return this.f95676o;
    }

    /* renamed from: a */
    public final List mo94239a() {
        return this.f95686y;
    }

    /* renamed from: b */
    public final double mo94240b() {
        return this.f95679r;
    }

    /* renamed from: c */
    public final String mo94241c() {
        return this.f95674m;
    }

    /* renamed from: d */
    public final long mo94242d() {
        return this.f95668g;
    }

    /* renamed from: e */
    public final String mo94243e() {
        return this.f95672k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40253f)) {
            return false;
        }
        C40253f fVar = (C40253f) obj;
        return this.f95662a == fVar.f95662a && this.f95663b == fVar.f95663b && C41536l.m120484d(this.f95664c, fVar.f95664c) && this.f95665d == fVar.f95665d && Double.compare(this.f95666e, fVar.f95666e) == 0 && C41536l.m120484d(this.f95667f, fVar.f95667f) && this.f95668g == fVar.f95668g && C41536l.m120484d(this.f95669h, fVar.f95669h) && C41536l.m120484d(this.f95670i, fVar.f95670i) && C41536l.m120484d(this.f95671j, fVar.f95671j) && C41536l.m120484d(this.f95672k, fVar.f95672k) && C41536l.m120484d(this.f95673l, fVar.f95673l) && C41536l.m120484d(this.f95674m, fVar.f95674m) && Double.compare(this.f95675n, fVar.f95675n) == 0 && C41536l.m120484d(this.f95676o, fVar.f95676o) && Double.compare(this.f95677p, fVar.f95677p) == 0 && C41536l.m120484d(this.f95678q, fVar.f95678q) && Double.compare(this.f95679r, fVar.f95679r) == 0 && this.f95680s == fVar.f95680s && C41536l.m120484d(this.f95681t, fVar.f95681t) && C41536l.m120484d(this.f95682u, fVar.f95682u) && this.f95683v == fVar.f95683v && C41536l.m120484d(this.f95684w, fVar.f95684w) && C41536l.m120484d(this.f95685x, fVar.f95685x) && C41536l.m120484d(this.f95686y, fVar.f95686y) && C41536l.m120484d(this.f95687z, fVar.f95687z) && C41536l.m120484d(this.f95660A, fVar.f95660A) && C41536l.m120484d(this.f95661B, fVar.f95661B);
    }

    /* renamed from: f */
    public final String mo94245f() {
        return this.f95669h;
    }

    /* renamed from: g */
    public final String mo94246g() {
        return this.f95684w;
    }

    /* renamed from: h */
    public final String mo94247h() {
        return this.f95685x;
    }

    public int hashCode() {
        int a = ((((((((((((((((C7397t.m28148a(this.f95662a) * 31) + C7397t.m28148a(this.f95663b)) * 31) + this.f95664c.hashCode()) * 31) + C7397t.m28148a(this.f95665d)) * 31) + Double.doubleToLongBits(this.f95666e)) * 31) + this.f95667f.hashCode()) * 31) + C7397t.m28148a(this.f95668g)) * 31) + this.f95669h.hashCode()) * 31) + this.f95670i.hashCode()) * 31;
        String str = this.f95671j;
        int i = 0;
        int hashCode = (((((((((a + (str == null ? 0 : str.hashCode())) * 31) + this.f95672k.hashCode()) * 31) + this.f95673l.hashCode()) * 31) + this.f95674m.hashCode()) * 31) + Double.doubleToLongBits(this.f95675n)) * 31;
        Double d = this.f95676o;
        int hashCode2 = (((((((hashCode + (d == null ? 0 : d.hashCode())) * 31) + Double.doubleToLongBits(this.f95677p)) * 31) + this.f95678q.hashCode()) * 31) + Double.doubleToLongBits(this.f95679r)) * 31;
        boolean z = this.f95680s;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Date date = this.f95681t;
        int hashCode3 = (i2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f95682u;
        int hashCode4 = (hashCode3 + (date2 == null ? 0 : date2.hashCode())) * 31;
        boolean z3 = this.f95683v;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode4 + (z2 ? 1 : 0)) * 31;
        String str2 = this.f95684w;
        int hashCode5 = (i3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95685x;
        int hashCode6 = (((((hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f95686y.hashCode()) * 31) + this.f95687z.hashCode()) * 31;
        String str4 = this.f95660A;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95661B;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final long mo94249i() {
        return this.f95663b;
    }

    /* renamed from: j */
    public final long mo94250j() {
        return this.f95662a;
    }

    /* renamed from: k */
    public final double mo94251k() {
        return this.f95677p;
    }

    /* renamed from: l */
    public final List mo94252l() {
        return this.f95687z;
    }

    /* renamed from: m */
    public final String mo94253m() {
        return this.f95678q;
    }

    /* renamed from: n */
    public final String mo94254n() {
        return this.f95660A;
    }

    /* renamed from: o */
    public final String mo94255o() {
        return this.f95661B;
    }

    /* renamed from: p */
    public final String mo94256p() {
        return this.f95671j;
    }

    /* renamed from: q */
    public final boolean mo94257q() {
        return this.f95683v;
    }

    /* renamed from: r */
    public final String mo94258r() {
        return this.f95673l;
    }

    /* renamed from: s */
    public final Date mo94259s() {
        return this.f95682u;
    }

    /* renamed from: t */
    public final boolean mo94260t() {
        return this.f95680s;
    }

    public String toString() {
        long j = this.f95662a;
        long j2 = this.f95663b;
        String str = this.f95664c;
        long j3 = this.f95665d;
        double d = this.f95666e;
        String str2 = this.f95667f;
        long j4 = this.f95668g;
        String str3 = this.f95669h;
        String str4 = this.f95670i;
        String str5 = this.f95671j;
        String str6 = this.f95672k;
        String str7 = this.f95673l;
        String str8 = str4;
        String str9 = this.f95674m;
        double d2 = this.f95675n;
        Double d3 = this.f95676o;
        double d4 = this.f95677p;
        String str10 = this.f95678q;
        double d5 = this.f95679r;
        boolean z = this.f95680s;
        Date date = this.f95681t;
        Date date2 = this.f95682u;
        boolean z2 = this.f95683v;
        String str11 = this.f95684w;
        String str12 = this.f95685x;
        List list = this.f95686y;
        List list2 = this.f95687z;
        String str13 = this.f95660A;
        String str14 = this.f95661B;
        return "CasServiceProduct(clientServiceId=" + j + ", clientKey=" + j2 + ", scheme=" + str + ", schemeTariffId=" + j3 + ", schemeTariffValue=" + d + ", schemeTariffCcy=" + str2 + ", agreeKey=" + j4 + ", agreeType=" + str3 + ", status=" + str8 + ", name=" + str5 + ", agreeNo=" + str6 + ", prodType=" + str7 + ", agreeCcy=" + str9 + ", totalAmount=" + d2 + ", totalAmountAcct=" + d3 + ", currentMonthTotalAmount=" + d4 + ", depositAgreeType=" + str10 + ", agreeBalance=" + d5 + ", restFlag=" + z + ", restStartDate=" + date + ", restEndDate=" + date2 + ", opensAgrFlag=" + z2 + ", agreeTypeDictionaryKey=" + str11 + ", agreeTypeDictionaryValue=" + str12 + ", accounts=" + list + ", depositAccounts=" + list2 + ", depositTypeDictionaryKey=" + str13 + ", depositTypeDictionaryValue=" + str14 + ")";
    }

    /* renamed from: u */
    public final Date mo94262u() {
        return this.f95681t;
    }

    /* renamed from: v */
    public final String mo94263v() {
        return this.f95664c;
    }

    /* renamed from: w */
    public final String mo94264w() {
        return this.f95667f;
    }

    /* renamed from: x */
    public final long mo94265x() {
        return this.f95665d;
    }

    /* renamed from: y */
    public final double mo94266y() {
        return this.f95666e;
    }

    /* renamed from: z */
    public final String mo94267z() {
        return this.f95670i;
    }
}
