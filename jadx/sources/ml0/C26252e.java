package ml0;

import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: ml0.e */
public final class C26252e {

    /* renamed from: A */
    private final boolean f66478A;

    /* renamed from: a */
    private final long f66479a;

    /* renamed from: b */
    private final long f66480b;

    /* renamed from: c */
    private final String f66481c;

    /* renamed from: d */
    private final String f66482d;

    /* renamed from: e */
    private final String f66483e;

    /* renamed from: f */
    private final BigDecimal f66484f;

    /* renamed from: g */
    private final String f66485g;

    /* renamed from: h */
    private final BigDecimal f66486h;

    /* renamed from: i */
    private final String f66487i;

    /* renamed from: j */
    private final Date f66488j;

    /* renamed from: k */
    private final Date f66489k;

    /* renamed from: l */
    private final Date f66490l;

    /* renamed from: m */
    private final String f66491m;

    /* renamed from: n */
    private final Long f66492n;

    /* renamed from: o */
    private final String f66493o;

    /* renamed from: p */
    private final String f66494p;

    /* renamed from: q */
    private final String f66495q;

    /* renamed from: r */
    private final Date f66496r;

    /* renamed from: s */
    private final String f66497s;

    /* renamed from: t */
    private final boolean f66498t;

    /* renamed from: u */
    private final String f66499u;

    /* renamed from: v */
    private final String f66500v;

    /* renamed from: w */
    private final String f66501w;

    /* renamed from: x */
    private final String f66502x;

    /* renamed from: y */
    private final String f66503y;

    /* renamed from: z */
    private final String f66504z;

    public C26252e(long j, long j2, String str, String str2, String str3, BigDecimal bigDecimal, String str4, BigDecimal bigDecimal2, String str5, Date date, Date date2, Date date3, String str6, Long l, String str7, String str8, String str9, Date date4, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, boolean z2) {
        String str17 = str;
        String str18 = str2;
        String str19 = str3;
        Date date5 = date;
        Date date6 = date2;
        Date date7 = date3;
        String str20 = str6;
        String str21 = str7;
        String str22 = str8;
        String str23 = str9;
        Date date8 = date4;
        String str24 = str10;
        String str25 = str11;
        String str26 = str14;
        C41536l.m120489i(str17, "providerId");
        C41536l.m120489i(str18, "productType");
        C41536l.m120489i(str19, "policyNo");
        C41536l.m120489i(date5, "policyCreateDate");
        C41536l.m120489i(date6, "policyStartDate");
        C41536l.m120489i(date7, "policyEndDate");
        C41536l.m120489i(str20, "payPeriod");
        C41536l.m120489i(str21, "carOwnerFirstName");
        C41536l.m120489i(str22, "carOwnerLastName");
        C41536l.m120489i(str23, "carOwnerPin");
        C41536l.m120489i(date8, "carOwnerBirthDate");
        C41536l.m120489i(str24, "carNumber");
        C41536l.m120489i(str25, "productName");
        C41536l.m120489i(str12, "providerName");
        C41536l.m120489i(str13, "providerLogoUrl");
        C41536l.m120489i(str14, "providerPhone");
        C41536l.m120489i(str15, "policyPdfUrl");
        C41536l.m120489i(str16, "paymentPeriodName");
        this.f66479a = j;
        this.f66480b = j2;
        this.f66481c = str17;
        this.f66482d = str18;
        this.f66483e = str19;
        this.f66484f = bigDecimal;
        this.f66485g = str4;
        this.f66486h = bigDecimal2;
        this.f66487i = str5;
        this.f66488j = date5;
        this.f66489k = date6;
        this.f66490l = date7;
        this.f66491m = str20;
        this.f66492n = l;
        this.f66493o = str21;
        this.f66494p = str22;
        this.f66495q = str23;
        this.f66496r = date8;
        this.f66497s = str24;
        this.f66498t = z;
        this.f66499u = str25;
        this.f66500v = str12;
        this.f66501w = str13;
        this.f66502x = str14;
        this.f66503y = str15;
        this.f66504z = str16;
        this.f66478A = z2;
    }

    /* renamed from: A */
    public final boolean mo65285A() {
        return this.f66478A;
    }

    /* renamed from: a */
    public final String mo65286a() {
        return this.f66497s;
    }

    /* renamed from: b */
    public final Date mo65287b() {
        return this.f66496r;
    }

    /* renamed from: c */
    public final String mo65288c() {
        return this.f66493o;
    }

    /* renamed from: d */
    public final String mo65289d() {
        return this.f66494p;
    }

    /* renamed from: e */
    public final String mo65290e() {
        return this.f66495q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26252e)) {
            return false;
        }
        C26252e eVar = (C26252e) obj;
        return this.f66479a == eVar.f66479a && this.f66480b == eVar.f66480b && C41536l.m120484d(this.f66481c, eVar.f66481c) && C41536l.m120484d(this.f66482d, eVar.f66482d) && C41536l.m120484d(this.f66483e, eVar.f66483e) && C41536l.m120484d(this.f66484f, eVar.f66484f) && C41536l.m120484d(this.f66485g, eVar.f66485g) && C41536l.m120484d(this.f66486h, eVar.f66486h) && C41536l.m120484d(this.f66487i, eVar.f66487i) && C41536l.m120484d(this.f66488j, eVar.f66488j) && C41536l.m120484d(this.f66489k, eVar.f66489k) && C41536l.m120484d(this.f66490l, eVar.f66490l) && C41536l.m120484d(this.f66491m, eVar.f66491m) && C41536l.m120484d(this.f66492n, eVar.f66492n) && C41536l.m120484d(this.f66493o, eVar.f66493o) && C41536l.m120484d(this.f66494p, eVar.f66494p) && C41536l.m120484d(this.f66495q, eVar.f66495q) && C41536l.m120484d(this.f66496r, eVar.f66496r) && C41536l.m120484d(this.f66497s, eVar.f66497s) && this.f66498t == eVar.f66498t && C41536l.m120484d(this.f66499u, eVar.f66499u) && C41536l.m120484d(this.f66500v, eVar.f66500v) && C41536l.m120484d(this.f66501w, eVar.f66501w) && C41536l.m120484d(this.f66502x, eVar.f66502x) && C41536l.m120484d(this.f66503y, eVar.f66503y) && C41536l.m120484d(this.f66504z, eVar.f66504z) && this.f66478A == eVar.f66478A;
    }

    /* renamed from: f */
    public final long mo65292f() {
        return this.f66480b;
    }

    /* renamed from: g */
    public final boolean mo65293g() {
        return this.f66498t;
    }

    /* renamed from: h */
    public final long mo65294h() {
        return this.f66479a;
    }

    public int hashCode() {
        int a = ((((((((C7397t.m28148a(this.f66479a) * 31) + C7397t.m28148a(this.f66480b)) * 31) + this.f66481c.hashCode()) * 31) + this.f66482d.hashCode()) * 31) + this.f66483e.hashCode()) * 31;
        BigDecimal bigDecimal = this.f66484f;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.f66485g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f66486h;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.f66487i;
        int hashCode4 = (((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f66488j.hashCode()) * 31) + this.f66489k.hashCode()) * 31) + this.f66490l.hashCode()) * 31) + this.f66491m.hashCode()) * 31;
        Long l = this.f66492n;
        if (l != null) {
            i = l.hashCode();
        }
        int hashCode5 = (((((((((((hashCode4 + i) * 31) + this.f66493o.hashCode()) * 31) + this.f66494p.hashCode()) * 31) + this.f66495q.hashCode()) * 31) + this.f66496r.hashCode()) * 31) + this.f66497s.hashCode()) * 31;
        boolean z = this.f66498t;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode6 = (((((((((((((hashCode5 + (z ? 1 : 0)) * 31) + this.f66499u.hashCode()) * 31) + this.f66500v.hashCode()) * 31) + this.f66501w.hashCode()) * 31) + this.f66502x.hashCode()) * 31) + this.f66503y.hashCode()) * 31) + this.f66504z.hashCode()) * 31;
        boolean z3 = this.f66478A;
        if (!z3) {
            z2 = z3;
        }
        return hashCode6 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final BigDecimal mo65296i() {
        return this.f66484f;
    }

    /* renamed from: j */
    public final String mo65297j() {
        return this.f66485g;
    }

    /* renamed from: k */
    public final BigDecimal mo65298k() {
        return this.f66486h;
    }

    /* renamed from: l */
    public final String mo65299l() {
        return this.f66487i;
    }

    /* renamed from: m */
    public final String mo65300m() {
        return this.f66491m;
    }

    /* renamed from: n */
    public final String mo65301n() {
        return this.f66504z;
    }

    /* renamed from: o */
    public final Date mo65302o() {
        return this.f66488j;
    }

    /* renamed from: p */
    public final Date mo65303p() {
        return this.f66490l;
    }

    /* renamed from: q */
    public final Long mo65304q() {
        return this.f66492n;
    }

    /* renamed from: r */
    public final String mo65305r() {
        return this.f66483e;
    }

    /* renamed from: s */
    public final String mo65306s() {
        return this.f66503y;
    }

    /* renamed from: t */
    public final Date mo65307t() {
        return this.f66489k;
    }

    public String toString() {
        long j = this.f66479a;
        long j2 = this.f66480b;
        String str = this.f66481c;
        String str2 = this.f66482d;
        String str3 = this.f66483e;
        BigDecimal bigDecimal = this.f66484f;
        String str4 = this.f66485g;
        BigDecimal bigDecimal2 = this.f66486h;
        String str5 = this.f66487i;
        Date date = this.f66488j;
        Date date2 = this.f66489k;
        Date date3 = this.f66490l;
        String str6 = this.f66491m;
        Long l = this.f66492n;
        String str7 = this.f66493o;
        String str8 = this.f66494p;
        String str9 = this.f66495q;
        Date date4 = this.f66496r;
        String str10 = this.f66497s;
        boolean z = this.f66498t;
        String str11 = this.f66499u;
        String str12 = this.f66500v;
        String str13 = this.f66501w;
        String str14 = this.f66502x;
        String str15 = this.f66503y;
        String str16 = this.f66504z;
        boolean z2 = this.f66478A;
        return "Policy(docKey=" + j + ", clientKey=" + j2 + ", providerId=" + str + ", productType=" + str2 + ", policyNo=" + str3 + ", insLimit=" + bigDecimal + ", insLimitCcy=" + str4 + ", insPremium=" + bigDecimal2 + ", insPremiumCcy=" + str5 + ", policyCreateDate=" + date + ", policyStartDate=" + date2 + ", policyEndDate=" + date3 + ", payPeriod=" + str6 + ", policyFileId=" + l + ", carOwnerFirstName=" + str7 + ", carOwnerLastName=" + str8 + ", carOwnerPin=" + str9 + ", carOwnerBirthDate=" + date4 + ", carNumber=" + str10 + ", directDebitStatus=" + z + ", productName=" + str11 + ", providerName=" + str12 + ", providerLogoUrl=" + str13 + ", providerPhone=" + str14 + ", policyPdfUrl=" + str15 + ", paymentPeriodName=" + str16 + ", isOwnersCar=" + z2 + ")";
    }

    /* renamed from: u */
    public final String mo65309u() {
        return this.f66499u;
    }

    /* renamed from: v */
    public final String mo65310v() {
        return this.f66482d;
    }

    /* renamed from: w */
    public final String mo65311w() {
        return this.f66481c;
    }

    /* renamed from: x */
    public final String mo65312x() {
        return this.f66501w;
    }

    /* renamed from: y */
    public final String mo65313y() {
        return this.f66500v;
    }

    /* renamed from: z */
    public final String mo65314z() {
        return this.f66502x;
    }
}
