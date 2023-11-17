package ml0;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ml0.g */
public final class C26254g {

    /* renamed from: a */
    private final long f66513a;

    /* renamed from: b */
    private final long f66514b;

    /* renamed from: c */
    private final String f66515c;

    /* renamed from: d */
    private final String f66516d;

    /* renamed from: e */
    private final String f66517e;

    /* renamed from: f */
    private final BigDecimal f66518f;

    /* renamed from: g */
    private final String f66519g;

    /* renamed from: h */
    private final BigDecimal f66520h;

    /* renamed from: i */
    private final String f66521i;

    /* renamed from: j */
    private final Date f66522j;

    /* renamed from: k */
    private final Date f66523k;

    /* renamed from: l */
    private final Long f66524l;

    /* renamed from: m */
    private final String f66525m;

    /* renamed from: n */
    private final String f66526n;

    /* renamed from: o */
    private final String f66527o;

    /* renamed from: p */
    private final String f66528p;

    /* renamed from: q */
    private final String f66529q;

    /* renamed from: r */
    private final Boolean f66530r;

    /* renamed from: s */
    private final String f66531s;

    /* renamed from: t */
    private final String f66532t;

    /* renamed from: u */
    private final String f66533u;

    /* renamed from: v */
    private final String f66534v;

    /* renamed from: w */
    private final List f66535w;

    public C26254g(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, Date date, Date date2, Long l, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, String str12, String str13, String str14, List list) {
        String str15 = str;
        String str16 = str2;
        String str17 = str3;
        Date date3 = date;
        Date date4 = date2;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        String str22 = str10;
        String str23 = str11;
        String str24 = str12;
        String str25 = str13;
        C41536l.m120489i(str15, "providerId");
        C41536l.m120489i(str16, "prodType");
        C41536l.m120489i(str17, "policyNo");
        C41536l.m120489i(date3, "policyStartDate");
        C41536l.m120489i(date4, "policyEndDate");
        C41536l.m120489i(str18, "insuredFirstName");
        C41536l.m120489i(str19, "insuredLastName");
        C41536l.m120489i(str20, "insuredFirstNameEn");
        C41536l.m120489i(str21, "insuredLastNameEn");
        C41536l.m120489i(str22, "insuredPin");
        C41536l.m120489i(str23, "productName");
        C41536l.m120489i(str24, "providerName");
        C41536l.m120489i(str25, "providerLogoUrl");
        C41536l.m120489i(str14, "policyPdfUrl");
        C41536l.m120489i(list, "contactInformation");
        this.f66513a = j;
        this.f66514b = j2;
        this.f66515c = str15;
        this.f66516d = str16;
        this.f66517e = str17;
        this.f66518f = bigDecimal;
        this.f66519g = str4;
        this.f66520h = bigDecimal2;
        this.f66521i = str5;
        this.f66522j = date3;
        this.f66523k = date4;
        this.f66524l = l;
        this.f66525m = str18;
        this.f66526n = str19;
        this.f66527o = str20;
        this.f66528p = str21;
        this.f66529q = str22;
        this.f66530r = bool;
        this.f66531s = str23;
        this.f66532t = str24;
        this.f66533u = str25;
        this.f66534v = str14;
        this.f66535w = list;
    }

    /* renamed from: a */
    public final Boolean mo65319a() {
        return this.f66530r;
    }

    /* renamed from: b */
    public final long mo65320b() {
        return this.f66514b;
    }

    /* renamed from: c */
    public final List mo65321c() {
        return this.f66535w;
    }

    /* renamed from: d */
    public final long mo65322d() {
        return this.f66513a;
    }

    /* renamed from: e */
    public final BigDecimal mo65323e() {
        return this.f66518f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26254g)) {
            return false;
        }
        C26254g gVar = (C26254g) obj;
        return this.f66513a == gVar.f66513a && this.f66514b == gVar.f66514b && C41536l.m120484d(this.f66515c, gVar.f66515c) && C41536l.m120484d(this.f66516d, gVar.f66516d) && C41536l.m120484d(this.f66517e, gVar.f66517e) && C41536l.m120484d(this.f66518f, gVar.f66518f) && C41536l.m120484d(this.f66519g, gVar.f66519g) && C41536l.m120484d(this.f66520h, gVar.f66520h) && C41536l.m120484d(this.f66521i, gVar.f66521i) && C41536l.m120484d(this.f66522j, gVar.f66522j) && C41536l.m120484d(this.f66523k, gVar.f66523k) && C41536l.m120484d(this.f66524l, gVar.f66524l) && C41536l.m120484d(this.f66525m, gVar.f66525m) && C41536l.m120484d(this.f66526n, gVar.f66526n) && C41536l.m120484d(this.f66527o, gVar.f66527o) && C41536l.m120484d(this.f66528p, gVar.f66528p) && C41536l.m120484d(this.f66529q, gVar.f66529q) && C41536l.m120484d(this.f66530r, gVar.f66530r) && C41536l.m120484d(this.f66531s, gVar.f66531s) && C41536l.m120484d(this.f66532t, gVar.f66532t) && C41536l.m120484d(this.f66533u, gVar.f66533u) && C41536l.m120484d(this.f66534v, gVar.f66534v) && C41536l.m120484d(this.f66535w, gVar.f66535w);
    }

    /* renamed from: f */
    public final String mo65325f() {
        return this.f66519g;
    }

    /* renamed from: g */
    public final BigDecimal mo65326g() {
        return this.f66520h;
    }

    /* renamed from: h */
    public final String mo65327h() {
        return this.f66521i;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f66513a) * 31) + C7397t.m28148a(this.f66514b)) * 31) + this.f66515c.hashCode()) * 31) + this.f66516d.hashCode()) * 31) + this.f66517e.hashCode()) * 31;
        BigDecimal bigDecimal = this.f66518f;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f66519g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f66520h;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.f66521i;
        int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f66522j.hashCode()) * 31) + this.f66523k.hashCode()) * 31;
        Long l = this.f66524l;
        int hashCode5 = (((((((((((hashCode4 + (l == null ? 0 : l.hashCode())) * 31) + this.f66525m.hashCode()) * 31) + this.f66526n.hashCode()) * 31) + this.f66527o.hashCode()) * 31) + this.f66528p.hashCode()) * 31) + this.f66529q.hashCode()) * 31;
        Boolean bool = this.f66530r;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((((((((((hashCode5 + i) * 31) + this.f66531s.hashCode()) * 31) + this.f66532t.hashCode()) * 31) + this.f66533u.hashCode()) * 31) + this.f66534v.hashCode()) * 31) + this.f66535w.hashCode();
    }

    /* renamed from: i */
    public final String mo65329i() {
        return this.f66525m;
    }

    /* renamed from: j */
    public final String mo65330j() {
        return this.f66527o;
    }

    /* renamed from: k */
    public final String mo65331k() {
        return this.f66526n;
    }

    /* renamed from: l */
    public final String mo65332l() {
        return this.f66528p;
    }

    /* renamed from: m */
    public final String mo65333m() {
        return this.f66529q;
    }

    /* renamed from: n */
    public final Date mo65334n() {
        return this.f66523k;
    }

    /* renamed from: o */
    public final Long mo65335o() {
        return this.f66524l;
    }

    /* renamed from: p */
    public final String mo65336p() {
        return this.f66517e;
    }

    /* renamed from: q */
    public final String mo65337q() {
        return this.f66534v;
    }

    /* renamed from: r */
    public final Date mo65338r() {
        return this.f66522j;
    }

    /* renamed from: s */
    public final String mo65339s() {
        return this.f66516d;
    }

    /* renamed from: t */
    public final String mo65340t() {
        return this.f66531s;
    }

    public String toString() {
        long j = this.f66513a;
        long j2 = this.f66514b;
        String str = this.f66515c;
        String str2 = this.f66516d;
        String str3 = this.f66517e;
        BigDecimal bigDecimal = this.f66518f;
        String str4 = this.f66519g;
        BigDecimal bigDecimal2 = this.f66520h;
        String str5 = this.f66521i;
        Date date = this.f66522j;
        Date date2 = this.f66523k;
        Long l = this.f66524l;
        String str6 = this.f66525m;
        String str7 = this.f66526n;
        String str8 = this.f66527o;
        String str9 = this.f66528p;
        String str10 = this.f66529q;
        Boolean bool = this.f66530r;
        String str11 = this.f66531s;
        String str12 = this.f66532t;
        String str13 = this.f66533u;
        String str14 = this.f66534v;
        List list = this.f66535w;
        return "TravelPolicy(docKey=" + j + ", clientKey=" + j2 + ", providerId=" + str + ", prodType=" + str2 + ", policyNo=" + str3 + ", insLimit=" + bigDecimal + ", insLimitCcy=" + str4 + ", insPremium=" + bigDecimal2 + ", insPremiumCcy=" + str5 + ", policyStartDate=" + date + ", policyEndDate=" + date2 + ", policyFileId=" + l + ", insuredFirstName=" + str6 + ", insuredLastName=" + str7 + ", insuredFirstNameEn=" + str8 + ", insuredLastNameEn=" + str9 + ", insuredPin=" + str10 + ", addCoverage=" + bool + ", productName=" + str11 + ", providerName=" + str12 + ", providerLogoUrl=" + str13 + ", policyPdfUrl=" + str14 + ", contactInformation=" + list + ")";
    }

    /* renamed from: u */
    public final String mo65342u() {
        return this.f66515c;
    }

    /* renamed from: v */
    public final String mo65343v() {
        return this.f66533u;
    }

    /* renamed from: w */
    public final String mo65344w() {
        return this.f66532t;
    }
}
