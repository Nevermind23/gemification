package p828mr;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;

/* renamed from: mr.f */
public final class C26262f {

    /* renamed from: a */
    private final String f66561a;

    /* renamed from: b */
    private final String f66562b;

    /* renamed from: c */
    private final String f66563c;

    /* renamed from: d */
    private final String f66564d;

    /* renamed from: e */
    private final String f66565e;

    /* renamed from: f */
    private final String f66566f;

    /* renamed from: g */
    private final String f66567g;

    /* renamed from: h */
    private final String f66568h;

    /* renamed from: i */
    private final String f66569i;

    /* renamed from: j */
    private final List f66570j;

    /* renamed from: k */
    private final BigDecimal f66571k;

    /* renamed from: l */
    private final BigDecimal f66572l;

    /* renamed from: m */
    private final String f66573m;

    /* renamed from: n */
    private final String f66574n;

    /* renamed from: o */
    private final int f66575o;

    /* renamed from: p */
    private final double f66576p;

    /* renamed from: q */
    private final double f66577q;

    /* renamed from: r */
    private final String f66578r;

    public C26262f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str10, String str11, int i, double d, double d2, String str12) {
        String str13 = str;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        String str19 = str7;
        String str20 = str8;
        String str21 = str9;
        List list2 = list;
        BigDecimal bigDecimal3 = bigDecimal;
        String str22 = str10;
        String str23 = str11;
        C41536l.m120489i(str13, IRetrofitService.TERMINAL);
        C41536l.m120489i(str14, "decNo");
        C41536l.m120489i(str15, "decisionScheme");
        C41536l.m120489i(str16, "cardPan");
        C41536l.m120489i(str17, "operationType");
        C41536l.m120489i(str18, "loanCcy");
        C41536l.m120489i(str19, "loanTerm");
        C41536l.m120489i(str20, "payDay");
        C41536l.m120489i(str21, "insIncFlag");
        C41536l.m120489i(list2, "refinanceInfo");
        C41536l.m120489i(bigDecimal3, "loanAmount");
        C41536l.m120489i(str22, "prodType");
        C41536l.m120489i(str23, "limitCategory");
        this.f66561a = str13;
        this.f66562b = str14;
        this.f66563c = str15;
        this.f66564d = str16;
        this.f66565e = str17;
        this.f66566f = str18;
        this.f66567g = str19;
        this.f66568h = str20;
        this.f66569i = str21;
        this.f66570j = list2;
        this.f66571k = bigDecimal3;
        this.f66572l = bigDecimal2;
        this.f66573m = str22;
        this.f66574n = str23;
        this.f66575o = i;
        this.f66576p = d;
        this.f66577q = d2;
        this.f66578r = str12;
    }

    /* renamed from: a */
    public final String mo65393a() {
        return this.f66564d;
    }

    /* renamed from: b */
    public final int mo65394b() {
        return this.f66575o;
    }

    /* renamed from: c */
    public final String mo65395c() {
        return this.f66562b;
    }

    /* renamed from: d */
    public final String mo65396d() {
        return this.f66563c;
    }

    /* renamed from: e */
    public final double mo65397e() {
        return this.f66576p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26262f)) {
            return false;
        }
        C26262f fVar = (C26262f) obj;
        return C41536l.m120484d(this.f66561a, fVar.f66561a) && C41536l.m120484d(this.f66562b, fVar.f66562b) && C41536l.m120484d(this.f66563c, fVar.f66563c) && C41536l.m120484d(this.f66564d, fVar.f66564d) && C41536l.m120484d(this.f66565e, fVar.f66565e) && C41536l.m120484d(this.f66566f, fVar.f66566f) && C41536l.m120484d(this.f66567g, fVar.f66567g) && C41536l.m120484d(this.f66568h, fVar.f66568h) && C41536l.m120484d(this.f66569i, fVar.f66569i) && C41536l.m120484d(this.f66570j, fVar.f66570j) && C41536l.m120484d(this.f66571k, fVar.f66571k) && C41536l.m120484d(this.f66572l, fVar.f66572l) && C41536l.m120484d(this.f66573m, fVar.f66573m) && C41536l.m120484d(this.f66574n, fVar.f66574n) && this.f66575o == fVar.f66575o && Double.compare(this.f66576p, fVar.f66576p) == 0 && Double.compare(this.f66577q, fVar.f66577q) == 0 && C41536l.m120484d(this.f66578r, fVar.f66578r);
    }

    /* renamed from: f */
    public final double mo65399f() {
        return this.f66577q;
    }

    /* renamed from: g */
    public final String mo65400g() {
        return this.f66569i;
    }

    /* renamed from: h */
    public final BigDecimal mo65401h() {
        return this.f66572l;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.f66561a.hashCode() * 31) + this.f66562b.hashCode()) * 31) + this.f66563c.hashCode()) * 31) + this.f66564d.hashCode()) * 31) + this.f66565e.hashCode()) * 31) + this.f66566f.hashCode()) * 31) + this.f66567g.hashCode()) * 31) + this.f66568h.hashCode()) * 31) + this.f66569i.hashCode()) * 31) + this.f66570j.hashCode()) * 31) + this.f66571k.hashCode()) * 31;
        BigDecimal bigDecimal = this.f66572l;
        int i = 0;
        int hashCode2 = (((((((((((hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.f66573m.hashCode()) * 31) + this.f66574n.hashCode()) * 31) + this.f66575o) * 31) + Double.doubleToLongBits(this.f66576p)) * 31) + Double.doubleToLongBits(this.f66577q)) * 31;
        String str = this.f66578r;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    /* renamed from: i */
    public final String mo65403i() {
        return this.f66574n;
    }

    /* renamed from: j */
    public final BigDecimal mo65404j() {
        return this.f66571k;
    }

    /* renamed from: k */
    public final String mo65405k() {
        return this.f66566f;
    }

    /* renamed from: l */
    public final String mo65406l() {
        return this.f66567g;
    }

    /* renamed from: m */
    public final String mo65407m() {
        return this.f66565e;
    }

    /* renamed from: n */
    public final String mo65408n() {
        return this.f66568h;
    }

    /* renamed from: o */
    public final String mo65409o() {
        return this.f66573m;
    }

    /* renamed from: p */
    public final String mo65410p() {
        return this.f66578r;
    }

    /* renamed from: q */
    public final List mo65411q() {
        return this.f66570j;
    }

    /* renamed from: r */
    public final String mo65412r() {
        return this.f66561a;
    }

    public String toString() {
        String str = this.f66561a;
        String str2 = this.f66562b;
        String str3 = this.f66563c;
        String str4 = this.f66564d;
        String str5 = this.f66565e;
        String str6 = this.f66566f;
        String str7 = this.f66567g;
        String str8 = this.f66568h;
        String str9 = this.f66569i;
        List list = this.f66570j;
        BigDecimal bigDecimal = this.f66571k;
        BigDecimal bigDecimal2 = this.f66572l;
        String str10 = this.f66573m;
        String str11 = this.f66574n;
        int i = this.f66575o;
        double d = this.f66576p;
        double d2 = this.f66577q;
        String str12 = this.f66578r;
        return "PreContractOptions(terminal=" + str + ", decNo=" + str2 + ", decisionScheme=" + str3 + ", cardPan=" + str4 + ", operationType=" + str5 + ", loanCcy=" + str6 + ", loanTerm=" + str7 + ", payDay=" + str8 + ", insIncFlag=" + str9 + ", refinanceInfo=" + list + ", loanAmount=" + bigDecimal + ", keepAmount=" + bigDecimal2 + ", prodType=" + str10 + ", limitCategory=" + str11 + ", conditionDays=" + i + ", drawAmount=" + d + ", drawAmount2=" + d2 + ", providerId=" + str12 + ")";
    }
}
