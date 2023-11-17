package m70;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: m70.c */
public final class C26150c {

    /* renamed from: a */
    private final String f66304a;

    /* renamed from: b */
    private final long f66305b;

    /* renamed from: c */
    private final String f66306c;

    /* renamed from: d */
    private final BigDecimal f66307d;

    /* renamed from: e */
    private final String f66308e;

    /* renamed from: f */
    private final String f66309f;

    /* renamed from: g */
    private final String f66310g;

    /* renamed from: h */
    private final String f66311h;

    /* renamed from: i */
    private final String f66312i;

    /* renamed from: j */
    private final String f66313j;

    /* renamed from: k */
    private final boolean f66314k;

    /* renamed from: l */
    private final boolean f66315l;

    /* renamed from: m */
    private final String f66316m;

    /* renamed from: n */
    private final List f66317n;

    /* renamed from: o */
    private final List f66318o;

    /* renamed from: p */
    private final List f66319p;

    /* renamed from: q */
    private final List f66320q;

    /* renamed from: r */
    private final List f66321r;

    /* renamed from: s */
    private final double f66322s;

    /* renamed from: t */
    private final Long f66323t;

    /* renamed from: u */
    private final String f66324u;

    public C26150c(String str, long j, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, List list, List list2, List list3, List list4, List list5, double d, Long l, String str10) {
        String str11 = str;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        String str17 = str9;
        List list6 = list;
        List list7 = list2;
        List list8 = list3;
        List list9 = list4;
        List list10 = list5;
        String str18 = str10;
        C41536l.m120489i(str11, "acctNo");
        C41536l.m120489i(str12, "ccy");
        C41536l.m120489i(str13, "productCode");
        C41536l.m120489i(str14, "acctBranch");
        C41536l.m120489i(str15, "ownerFirstName");
        C41536l.m120489i(str16, "ownerLastName");
        C41536l.m120489i(str17, "isCardInactive");
        C41536l.m120489i(list6, "subAccounts");
        C41536l.m120489i(list7, "availableAmounts");
        C41536l.m120489i(list8, "availableAmountSums");
        C41536l.m120489i(list9, "subAccountsSums");
        C41536l.m120489i(list10, "studDepInfos");
        C41536l.m120489i(str18, "displayWarning");
        this.f66304a = str11;
        this.f66305b = j;
        this.f66306c = str2;
        this.f66307d = bigDecimal;
        this.f66308e = str3;
        this.f66309f = str12;
        this.f66310g = str13;
        this.f66311h = str14;
        this.f66312i = str15;
        this.f66313j = str16;
        this.f66314k = z;
        this.f66315l = z2;
        this.f66316m = str17;
        this.f66317n = list6;
        this.f66318o = list7;
        this.f66319p = list8;
        this.f66320q = list9;
        this.f66321r = list10;
        this.f66322s = d;
        this.f66323t = l;
        this.f66324u = str18;
    }

    /* renamed from: a */
    public final String mo65120a() {
        return this.f66311h;
    }

    /* renamed from: b */
    public final long mo65121b() {
        return this.f66305b;
    }

    /* renamed from: c */
    public final String mo65122c() {
        return this.f66306c;
    }

    /* renamed from: d */
    public final String mo65123d() {
        return this.f66304a;
    }

    /* renamed from: e */
    public final List mo65124e() {
        return this.f66319p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26150c)) {
            return false;
        }
        C26150c cVar = (C26150c) obj;
        return C41536l.m120484d(this.f66304a, cVar.f66304a) && this.f66305b == cVar.f66305b && C41536l.m120484d(this.f66306c, cVar.f66306c) && C41536l.m120484d(this.f66307d, cVar.f66307d) && C41536l.m120484d(this.f66308e, cVar.f66308e) && C41536l.m120484d(this.f66309f, cVar.f66309f) && C41536l.m120484d(this.f66310g, cVar.f66310g) && C41536l.m120484d(this.f66311h, cVar.f66311h) && C41536l.m120484d(this.f66312i, cVar.f66312i) && C41536l.m120484d(this.f66313j, cVar.f66313j) && this.f66314k == cVar.f66314k && this.f66315l == cVar.f66315l && C41536l.m120484d(this.f66316m, cVar.f66316m) && C41536l.m120484d(this.f66317n, cVar.f66317n) && C41536l.m120484d(this.f66318o, cVar.f66318o) && C41536l.m120484d(this.f66319p, cVar.f66319p) && C41536l.m120484d(this.f66320q, cVar.f66320q) && C41536l.m120484d(this.f66321r, cVar.f66321r) && Double.compare(this.f66322s, cVar.f66322s) == 0 && C41536l.m120484d(this.f66323t, cVar.f66323t) && C41536l.m120484d(this.f66324u, cVar.f66324u);
    }

    /* renamed from: f */
    public final List mo65126f() {
        return this.f66318o;
    }

    /* renamed from: g */
    public final String mo65127g() {
        return this.f66309f;
    }

    /* renamed from: h */
    public final String mo65128h() {
        return this.f66324u;
    }

    public int hashCode() {
        int hashCode = ((this.f66304a.hashCode() * 31) + C7397t.m28148a(this.f66305b)) * 31;
        String str = this.f66306c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f66307d;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.f66308e;
        int hashCode4 = (((((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f66309f.hashCode()) * 31) + this.f66310g.hashCode()) * 31) + this.f66311h.hashCode()) * 31) + this.f66312i.hashCode()) * 31) + this.f66313j.hashCode()) * 31;
        boolean z = this.f66314k;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f66315l;
        if (!z3) {
            z2 = z3;
        }
        int hashCode5 = (((((((((((((((i2 + (z2 ? 1 : 0)) * 31) + this.f66316m.hashCode()) * 31) + this.f66317n.hashCode()) * 31) + this.f66318o.hashCode()) * 31) + this.f66319p.hashCode()) * 31) + this.f66320q.hashCode()) * 31) + this.f66321r.hashCode()) * 31) + Double.doubleToLongBits(this.f66322s)) * 31;
        Long l = this.f66323t;
        if (l != null) {
            i = l.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.f66324u.hashCode();
    }

    /* renamed from: i */
    public final String mo65130i() {
        return this.f66312i;
    }

    /* renamed from: j */
    public final String mo65131j() {
        return this.f66313j;
    }

    /* renamed from: k */
    public final Long mo65132k() {
        return this.f66323t;
    }

    /* renamed from: l */
    public final String mo65133l() {
        return this.f66310g;
    }

    /* renamed from: m */
    public final String mo65134m() {
        return this.f66308e;
    }

    /* renamed from: n */
    public final BigDecimal mo65135n() {
        return this.f66307d;
    }

    /* renamed from: o */
    public final double mo65136o() {
        return this.f66322s;
    }

    /* renamed from: p */
    public final List mo65137p() {
        return this.f66321r;
    }

    /* renamed from: q */
    public final List mo65138q() {
        return this.f66317n;
    }

    /* renamed from: r */
    public final List mo65139r() {
        return this.f66320q;
    }

    /* renamed from: s */
    public final boolean mo65140s() {
        return this.f66315l;
    }

    /* renamed from: t */
    public final String mo65141t() {
        return this.f66316m;
    }

    public String toString() {
        String str = this.f66304a;
        long j = this.f66305b;
        String str2 = this.f66306c;
        BigDecimal bigDecimal = this.f66307d;
        String str3 = this.f66308e;
        String str4 = this.f66309f;
        String str5 = this.f66310g;
        String str6 = this.f66311h;
        String str7 = this.f66312i;
        String str8 = this.f66313j;
        boolean z = this.f66314k;
        boolean z2 = this.f66315l;
        String str9 = this.f66316m;
        List list = this.f66317n;
        List list2 = this.f66318o;
        List list3 = this.f66319p;
        List list4 = this.f66320q;
        String str10 = str9;
        List list5 = this.f66321r;
        double d = this.f66322s;
        Long l = this.f66323t;
        String str11 = this.f66324u;
        return "AccountDetails(acctNo=" + str + ", acctKey=" + j + ", acctName=" + str2 + ", realAmount=" + bigDecimal + ", productDictionaryKey=" + str3 + ", ccy=" + str4 + ", productCode=" + str5 + ", acctBranch=" + str6 + ", ownerFirstName=" + str7 + ", ownerLastName=" + str8 + ", isScoolcard=" + z + ", isCardExpiring=" + z2 + ", isCardInactive=" + str10 + ", subAccounts=" + list + ", availableAmounts=" + list2 + ", availableAmountSums=" + list3 + ", subAccountsSums=" + list4 + ", studDepInfos=" + list5 + ", scoolas=" + d + ", pfmAcctId=" + l + ", displayWarning=" + str11 + ")";
    }

    /* renamed from: u */
    public final boolean mo65143u() {
        return this.f66314k;
    }
}
