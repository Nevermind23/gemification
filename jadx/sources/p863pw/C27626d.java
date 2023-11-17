package p863pw;

import hd0.C24978b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.d */
public final class C27626d {

    /* renamed from: a */
    private final String f70599a;

    /* renamed from: b */
    private final String f70600b;

    /* renamed from: c */
    private final BigDecimal f70601c;

    /* renamed from: d */
    private final String f70602d;

    /* renamed from: e */
    private final String f70603e;

    /* renamed from: f */
    private final String f70604f;

    /* renamed from: g */
    private final String f70605g;

    /* renamed from: h */
    private final String f70606h;

    /* renamed from: i */
    private final String f70607i;

    /* renamed from: j */
    private final boolean f70608j;

    /* renamed from: k */
    private final C24978b f70609k;

    /* renamed from: l */
    private final String f70610l;

    /* renamed from: m */
    private final List f70611m;

    /* renamed from: n */
    private final List f70612n;

    /* renamed from: o */
    private final List f70613o;

    /* renamed from: p */
    private final List f70614p;

    /* renamed from: q */
    private final List f70615q;

    /* renamed from: r */
    private final double f70616r;

    /* renamed from: s */
    private final Long f70617s;

    /* renamed from: t */
    private final String f70618t;

    public C27626d(String str, String str2, BigDecimal bigDecimal, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, C24978b bVar, String str9, List list, List list2, List list3, List list4, List list5, double d, Long l, String str10) {
        String str11 = str;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        C24978b bVar2 = bVar;
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
        C41536l.m120489i(bVar2, "isCardExpiring");
        C41536l.m120489i(str17, "isCardInactive");
        C41536l.m120489i(list6, "subAccounts");
        C41536l.m120489i(list7, "availableAmounts");
        C41536l.m120489i(list8, "availableAmountSums");
        C41536l.m120489i(list9, "subAccountsSums");
        C41536l.m120489i(list10, "studDepInfos");
        C41536l.m120489i(str18, "displayWarning");
        this.f70599a = str11;
        this.f70600b = str2;
        this.f70601c = bigDecimal;
        this.f70602d = str3;
        this.f70603e = str12;
        this.f70604f = str13;
        this.f70605g = str14;
        this.f70606h = str15;
        this.f70607i = str16;
        this.f70608j = z;
        this.f70609k = bVar2;
        this.f70610l = str17;
        this.f70611m = list6;
        this.f70612n = list7;
        this.f70613o = list8;
        this.f70614p = list9;
        this.f70615q = list10;
        this.f70616r = d;
        this.f70617s = l;
        this.f70618t = str18;
    }

    /* renamed from: a */
    public final String mo67034a() {
        return this.f70599a;
    }

    /* renamed from: b */
    public final List mo67035b() {
        return this.f70612n;
    }

    /* renamed from: c */
    public final String mo67036c() {
        return this.f70604f;
    }

    /* renamed from: d */
    public final BigDecimal mo67037d() {
        return this.f70601c;
    }

    /* renamed from: e */
    public final List mo67038e() {
        return this.f70615q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27626d)) {
            return false;
        }
        C27626d dVar = (C27626d) obj;
        return C41536l.m120484d(this.f70599a, dVar.f70599a) && C41536l.m120484d(this.f70600b, dVar.f70600b) && C41536l.m120484d(this.f70601c, dVar.f70601c) && C41536l.m120484d(this.f70602d, dVar.f70602d) && C41536l.m120484d(this.f70603e, dVar.f70603e) && C41536l.m120484d(this.f70604f, dVar.f70604f) && C41536l.m120484d(this.f70605g, dVar.f70605g) && C41536l.m120484d(this.f70606h, dVar.f70606h) && C41536l.m120484d(this.f70607i, dVar.f70607i) && this.f70608j == dVar.f70608j && this.f70609k == dVar.f70609k && C41536l.m120484d(this.f70610l, dVar.f70610l) && C41536l.m120484d(this.f70611m, dVar.f70611m) && C41536l.m120484d(this.f70612n, dVar.f70612n) && C41536l.m120484d(this.f70613o, dVar.f70613o) && C41536l.m120484d(this.f70614p, dVar.f70614p) && C41536l.m120484d(this.f70615q, dVar.f70615q) && Double.compare(this.f70616r, dVar.f70616r) == 0 && C41536l.m120484d(this.f70617s, dVar.f70617s) && C41536l.m120484d(this.f70618t, dVar.f70618t);
    }

    /* renamed from: f */
    public final List mo67040f() {
        return this.f70611m;
    }

    public int hashCode() {
        int hashCode = this.f70599a.hashCode() * 31;
        String str = this.f70600b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal = this.f70601c;
        int hashCode3 = (hashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.f70602d;
        int hashCode4 = (((((((((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f70603e.hashCode()) * 31) + this.f70604f.hashCode()) * 31) + this.f70605g.hashCode()) * 31) + this.f70606h.hashCode()) * 31) + this.f70607i.hashCode()) * 31;
        boolean z = this.f70608j;
        if (z) {
            z = true;
        }
        int hashCode5 = (((((((((((((((((hashCode4 + (z ? 1 : 0)) * 31) + this.f70609k.hashCode()) * 31) + this.f70610l.hashCode()) * 31) + this.f70611m.hashCode()) * 31) + this.f70612n.hashCode()) * 31) + this.f70613o.hashCode()) * 31) + this.f70614p.hashCode()) * 31) + this.f70615q.hashCode()) * 31) + Double.doubleToLongBits(this.f70616r)) * 31;
        Long l = this.f70617s;
        if (l != null) {
            i = l.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.f70618t.hashCode();
    }

    public String toString() {
        String str = this.f70599a;
        String str2 = this.f70600b;
        BigDecimal bigDecimal = this.f70601c;
        String str3 = this.f70602d;
        String str4 = this.f70603e;
        String str5 = this.f70604f;
        String str6 = this.f70605g;
        String str7 = this.f70606h;
        String str8 = this.f70607i;
        boolean z = this.f70608j;
        C24978b bVar = this.f70609k;
        String str9 = this.f70610l;
        List list = this.f70611m;
        List list2 = this.f70612n;
        List list3 = this.f70613o;
        List list4 = this.f70614p;
        List list5 = list2;
        List list6 = this.f70615q;
        double d = this.f70616r;
        Long l = this.f70617s;
        String str10 = this.f70618t;
        return "AccountDetails(acctNo=" + str + ", acctName=" + str2 + ", realAmount=" + bigDecimal + ", productDictionaryKey=" + str3 + ", ccy=" + str4 + ", productCode=" + str5 + ", acctBranch=" + str6 + ", ownerFirstName=" + str7 + ", ownerLastName=" + str8 + ", isScoolcard=" + z + ", isCardExpiring=" + bVar + ", isCardInactive=" + str9 + ", subAccounts=" + list + ", availableAmounts=" + list5 + ", availableAmountSums=" + list3 + ", subAccountsSums=" + list4 + ", studDepInfos=" + list6 + ", scoolas=" + d + ", pfmAcctId=" + l + ", displayWarning=" + str10 + ")";
    }
}
