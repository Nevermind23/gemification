package p606sl;

import kotlin.jvm.internal.C41536l;

/* renamed from: sl.f */
public final class C17840f {

    /* renamed from: a */
    private final String f50773a;

    /* renamed from: b */
    private final Long f50774b;

    /* renamed from: c */
    private final String f50775c;

    /* renamed from: d */
    private final Long f50776d;

    /* renamed from: e */
    private final String f50777e;

    /* renamed from: f */
    private final Double f50778f;

    /* renamed from: g */
    private final Double f50779g;

    /* renamed from: h */
    private final Double f50780h;

    /* renamed from: i */
    private final String f50781i;

    /* renamed from: j */
    private final Double f50782j;

    /* renamed from: k */
    private final Double f50783k;

    /* renamed from: l */
    private final Double f50784l;

    /* renamed from: m */
    private final Double f50785m;

    /* renamed from: n */
    private final String f50786n;

    /* renamed from: o */
    private final String f50787o;

    public C17840f(String str, Long l, String str2, Long l2, String str3, Double d, Double d2, Double d3, String str4, Double d4, Double d5, Double d6, Double d7, String str5, String str6) {
        this.f50773a = str;
        this.f50774b = l;
        this.f50775c = str2;
        this.f50776d = l2;
        this.f50777e = str3;
        this.f50778f = d;
        this.f50779g = d2;
        this.f50780h = d3;
        this.f50781i = str4;
        this.f50782j = d4;
        this.f50783k = d5;
        this.f50784l = d6;
        this.f50785m = d7;
        this.f50786n = str5;
        this.f50787o = str6;
    }

    /* renamed from: a */
    public final Long mo45463a() {
        return this.f50776d;
    }

    /* renamed from: b */
    public final Double mo45464b() {
        return this.f50783k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17840f)) {
            return false;
        }
        C17840f fVar = (C17840f) obj;
        return C41536l.m120484d(this.f50773a, fVar.f50773a) && C41536l.m120484d(this.f50774b, fVar.f50774b) && C41536l.m120484d(this.f50775c, fVar.f50775c) && C41536l.m120484d(this.f50776d, fVar.f50776d) && C41536l.m120484d(this.f50777e, fVar.f50777e) && C41536l.m120484d(this.f50778f, fVar.f50778f) && C41536l.m120484d(this.f50779g, fVar.f50779g) && C41536l.m120484d(this.f50780h, fVar.f50780h) && C41536l.m120484d(this.f50781i, fVar.f50781i) && C41536l.m120484d(this.f50782j, fVar.f50782j) && C41536l.m120484d(this.f50783k, fVar.f50783k) && C41536l.m120484d(this.f50784l, fVar.f50784l) && C41536l.m120484d(this.f50785m, fVar.f50785m) && C41536l.m120484d(this.f50786n, fVar.f50786n) && C41536l.m120484d(this.f50787o, fVar.f50787o);
    }

    public int hashCode() {
        String str = this.f50773a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f50774b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f50775c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f50776d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f50777e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.f50778f;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f50779g;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f50780h;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        String str4 = this.f50781i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d4 = this.f50782j;
        int hashCode10 = (hashCode9 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f50783k;
        int hashCode11 = (hashCode10 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f50784l;
        int hashCode12 = (hashCode11 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.f50785m;
        int hashCode13 = (hashCode12 + (d7 == null ? 0 : d7.hashCode())) * 31;
        String str5 = this.f50786n;
        int hashCode14 = (hashCode13 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f50787o;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        String str = this.f50773a;
        Long l = this.f50774b;
        String str2 = this.f50775c;
        Long l2 = this.f50776d;
        String str3 = this.f50777e;
        Double d = this.f50778f;
        Double d2 = this.f50779g;
        Double d3 = this.f50780h;
        String str4 = this.f50781i;
        Double d4 = this.f50782j;
        Double d5 = this.f50783k;
        Double d6 = this.f50784l;
        Double d7 = this.f50785m;
        String str5 = this.f50786n;
        String str6 = this.f50787o;
        return "BnplDetailsSchedule(primaryKey=" + str + ", loanKey=" + l + ", loanNo=" + str2 + ", payDate=" + l2 + ", ccy=" + str3 + ", priAmt=" + d + ", intAmt=" + d2 + ", feeAmt=" + d3 + ", feeType=" + str4 + ", exAmt=" + d4 + ", totalAmt=" + d5 + ", nextPayAmt=" + d6 + ", intAmtWithoutOffset=" + d7 + ", feeTypeDictionaryKey=" + str5 + ", feeTypeDictionaryValue=" + str6 + ")";
    }
}
