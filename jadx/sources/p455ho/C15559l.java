package p455ho;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: ho.l */
public final class C15559l {

    /* renamed from: a */
    private final String f44197a;

    /* renamed from: b */
    private final BigDecimal f44198b;

    /* renamed from: c */
    private final String f44199c;

    /* renamed from: d */
    private final Object f44200d;

    /* renamed from: e */
    private final Long f44201e;

    /* renamed from: f */
    private final String f44202f;

    /* renamed from: g */
    private final String f44203g;

    /* renamed from: h */
    private final Long f44204h;

    /* renamed from: i */
    private final String f44205i;

    /* renamed from: j */
    private final String f44206j;

    /* renamed from: k */
    private final String f44207k;

    /* renamed from: l */
    private final String f44208l;

    public C15559l(String str, BigDecimal bigDecimal, String str2, Object obj, Long l, String str3, String str4, Long l2, String str5, String str6, String str7, String str8) {
        this.f44197a = str;
        this.f44198b = bigDecimal;
        this.f44199c = str2;
        this.f44200d = obj;
        this.f44201e = l;
        this.f44202f = str3;
        this.f44203g = str4;
        this.f44204h = l2;
        this.f44205i = str5;
        this.f44206j = str6;
        this.f44207k = str7;
        this.f44208l = str8;
    }

    /* renamed from: a */
    public final String mo42786a() {
        return this.f44197a;
    }

    /* renamed from: b */
    public final BigDecimal mo42787b() {
        return this.f44198b;
    }

    /* renamed from: c */
    public final String mo42788c() {
        return this.f44199c;
    }

    /* renamed from: d */
    public final Object mo42789d() {
        return this.f44200d;
    }

    /* renamed from: e */
    public final Long mo42790e() {
        return this.f44201e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15559l)) {
            return false;
        }
        C15559l lVar = (C15559l) obj;
        return C41536l.m120484d(this.f44197a, lVar.f44197a) && C41536l.m120484d(this.f44198b, lVar.f44198b) && C41536l.m120484d(this.f44199c, lVar.f44199c) && C41536l.m120484d(this.f44200d, lVar.f44200d) && C41536l.m120484d(this.f44201e, lVar.f44201e) && C41536l.m120484d(this.f44202f, lVar.f44202f) && C41536l.m120484d(this.f44203g, lVar.f44203g) && C41536l.m120484d(this.f44204h, lVar.f44204h) && C41536l.m120484d(this.f44205i, lVar.f44205i) && C41536l.m120484d(this.f44206j, lVar.f44206j) && C41536l.m120484d(this.f44207k, lVar.f44207k) && C41536l.m120484d(this.f44208l, lVar.f44208l);
    }

    /* renamed from: f */
    public final String mo42792f() {
        return this.f44202f;
    }

    /* renamed from: g */
    public final String mo42793g() {
        return this.f44203g;
    }

    /* renamed from: h */
    public final Long mo42794h() {
        return this.f44204h;
    }

    public int hashCode() {
        String str = this.f44197a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.f44198b;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.f44199c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.f44200d;
        int hashCode4 = (hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l = this.f44201e;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.f44202f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f44203g;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f44204h;
        int hashCode8 = (hashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.f44205i;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f44206j;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f44207k;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f44208l;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return hashCode11 + i;
    }

    /* renamed from: i */
    public final String mo42796i() {
        return this.f44205i;
    }

    /* renamed from: j */
    public final String mo42797j() {
        return this.f44206j;
    }

    /* renamed from: k */
    public final String mo42798k() {
        return this.f44207k;
    }

    /* renamed from: l */
    public final String mo42799l() {
        return this.f44208l;
    }

    public String toString() {
        String str = this.f44197a;
        BigDecimal bigDecimal = this.f44198b;
        String str2 = this.f44199c;
        Object obj = this.f44200d;
        Long l = this.f44201e;
        String str3 = this.f44202f;
        String str4 = this.f44203g;
        Long l2 = this.f44204h;
        String str5 = this.f44205i;
        String str6 = this.f44206j;
        String str7 = this.f44207k;
        String str8 = this.f44208l;
        return "Transaction(acctNo=" + str + ", amount=" + bigDecimal + ", ccy=" + str2 + ", docKey=" + obj + ", inpSysdate=" + l + ", lastFour=" + str3 + ", nomination=" + str4 + ", packageId=" + l2 + ", postDate=" + str5 + ", prodGroup=" + str6 + ", prodGroupDesc=" + str7 + ", tranStatus=" + str8 + ")";
    }
}
