package xy0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.k */
public final class C39947k {

    /* renamed from: a */
    private final Long f94811a;

    /* renamed from: b */
    private final String f94812b;

    /* renamed from: c */
    private final String f94813c;

    /* renamed from: d */
    private final BigDecimal f94814d;

    /* renamed from: e */
    private final BigDecimal f94815e;

    /* renamed from: f */
    private final String f94816f;

    /* renamed from: g */
    private final int f94817g;

    /* renamed from: h */
    private final String f94818h;

    /* renamed from: i */
    private final String f94819i;

    /* renamed from: j */
    private final String f94820j;

    /* renamed from: k */
    private final String f94821k;

    /* renamed from: l */
    private final List f94822l;

    /* renamed from: m */
    private final String f94823m;

    /* renamed from: n */
    private final List f94824n;

    /* renamed from: o */
    private final List f94825o;

    public C39947k(Long l, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, int i, String str4, String str5, String str6, String str7, List list, String str8, List list2, List list3) {
        C41536l.m120489i(bigDecimal2, "amount");
        C41536l.m120489i(str3, "ccy");
        this.f94811a = l;
        this.f94812b = str;
        this.f94813c = str2;
        this.f94814d = bigDecimal;
        this.f94815e = bigDecimal2;
        this.f94816f = str3;
        this.f94817g = i;
        this.f94818h = str4;
        this.f94819i = str5;
        this.f94820j = str6;
        this.f94821k = str7;
        this.f94822l = list;
        this.f94823m = str8;
        this.f94824n = list2;
        this.f94825o = list3;
    }

    /* renamed from: a */
    public final BigDecimal mo93729a() {
        return this.f94815e;
    }

    /* renamed from: b */
    public final String mo93730b() {
        return this.f94816f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39947k)) {
            return false;
        }
        C39947k kVar = (C39947k) obj;
        return C41536l.m120484d(this.f94811a, kVar.f94811a) && C41536l.m120484d(this.f94812b, kVar.f94812b) && C41536l.m120484d(this.f94813c, kVar.f94813c) && C41536l.m120484d(this.f94814d, kVar.f94814d) && C41536l.m120484d(this.f94815e, kVar.f94815e) && C41536l.m120484d(this.f94816f, kVar.f94816f) && this.f94817g == kVar.f94817g && C41536l.m120484d(this.f94818h, kVar.f94818h) && C41536l.m120484d(this.f94819i, kVar.f94819i) && C41536l.m120484d(this.f94820j, kVar.f94820j) && C41536l.m120484d(this.f94821k, kVar.f94821k) && C41536l.m120484d(this.f94822l, kVar.f94822l) && C41536l.m120484d(this.f94823m, kVar.f94823m) && C41536l.m120484d(this.f94824n, kVar.f94824n) && C41536l.m120484d(this.f94825o, kVar.f94825o);
    }

    public int hashCode() {
        Long l = this.f94811a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f94812b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94813c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.f94814d;
        int hashCode4 = (((((((hashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31) + this.f94815e.hashCode()) * 31) + this.f94816f.hashCode()) * 31) + this.f94817g) * 31;
        String str3 = this.f94818h;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94819i;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f94820j;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f94821k;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.f94822l;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.f94823m;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list2 = this.f94824n;
        int hashCode11 = (hashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f94825o;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode11 + i;
    }

    public String toString() {
        Long l = this.f94811a;
        String str = this.f94812b;
        String str2 = this.f94813c;
        BigDecimal bigDecimal = this.f94814d;
        BigDecimal bigDecimal2 = this.f94815e;
        String str3 = this.f94816f;
        int i = this.f94817g;
        String str4 = this.f94818h;
        String str5 = this.f94819i;
        String str6 = this.f94820j;
        String str7 = this.f94821k;
        List list = this.f94822l;
        String str8 = this.f94823m;
        List list2 = this.f94824n;
        List list3 = this.f94825o;
        return "CreditCardSummery(acctKey=" + l + ", acctName=" + str + ", printAcctNo=" + str2 + ", availableAmount=" + bigDecimal + ", amount=" + bigDecimal2 + ", ccy=" + str3 + ", orderNo=" + i + ", productCode=" + str4 + ", productDictionaryKey=" + str5 + ", cardTypes=" + str6 + ", cardSubProduct=" + str7 + ", cardSubProductGroups=" + list + ", nameDictionaryKey=" + str8 + ", cardTypeList=" + list2 + ", cardSubProductGroupList=" + list3 + ")";
    }
}
