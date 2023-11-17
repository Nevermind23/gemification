package p596rp;

import kotlin.jvm.internal.C41536l;
import p455ho.C15552f;
import p469io.C15710c;

/* renamed from: rp.a */
public final class C17710a {

    /* renamed from: a */
    private final Object f49449a;

    /* renamed from: b */
    private final Double f49450b;

    /* renamed from: c */
    private final String f49451c;

    /* renamed from: d */
    private final Double f49452d;

    /* renamed from: e */
    private final C15552f f49453e;

    /* renamed from: f */
    private final Object f49454f;

    /* renamed from: g */
    private final Object f49455g;

    /* renamed from: h */
    private final Object f49456h;

    /* renamed from: i */
    private final Long f49457i;

    /* renamed from: j */
    private final String f49458j;

    /* renamed from: k */
    private final Long f49459k;

    /* renamed from: l */
    private final String f49460l;

    /* renamed from: m */
    private final Integer f49461m;

    /* renamed from: n */
    private final Long f49462n;

    /* renamed from: o */
    private final C15710c f49463o;

    public C17710a(Object obj, Double d, String str, Double d2, C15552f fVar, Object obj2, Object obj3, Object obj4, Long l, String str2, Long l2, String str3, Integer num, Long l3, C15710c cVar) {
        this.f49449a = obj;
        this.f49450b = d;
        this.f49451c = str;
        this.f49452d = d2;
        this.f49453e = fVar;
        this.f49454f = obj2;
        this.f49455g = obj3;
        this.f49456h = obj4;
        this.f49457i = l;
        this.f49458j = str2;
        this.f49459k = l2;
        this.f49460l = str3;
        this.f49461m = num;
        this.f49462n = l3;
        this.f49463o = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17710a)) {
            return false;
        }
        C17710a aVar = (C17710a) obj;
        return C41536l.m120484d(this.f49449a, aVar.f49449a) && C41536l.m120484d(this.f49450b, aVar.f49450b) && C41536l.m120484d(this.f49451c, aVar.f49451c) && C41536l.m120484d(this.f49452d, aVar.f49452d) && this.f49453e == aVar.f49453e && C41536l.m120484d(this.f49454f, aVar.f49454f) && C41536l.m120484d(this.f49455g, aVar.f49455g) && C41536l.m120484d(this.f49456h, aVar.f49456h) && C41536l.m120484d(this.f49457i, aVar.f49457i) && C41536l.m120484d(this.f49458j, aVar.f49458j) && C41536l.m120484d(this.f49459k, aVar.f49459k) && C41536l.m120484d(this.f49460l, aVar.f49460l) && C41536l.m120484d(this.f49461m, aVar.f49461m) && C41536l.m120484d(this.f49462n, aVar.f49462n) && this.f49463o == aVar.f49463o;
    }

    public int hashCode() {
        Object obj = this.f49449a;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Double d = this.f49450b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f49451c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d2 = this.f49452d;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        C15552f fVar = this.f49453e;
        int hashCode5 = (hashCode4 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.f49454f;
        int hashCode6 = (hashCode5 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f49455g;
        int hashCode7 = (hashCode6 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f49456h;
        int hashCode8 = (hashCode7 + (obj4 == null ? 0 : obj4.hashCode())) * 31;
        Long l = this.f49457i;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.f49458j;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l2 = this.f49459k;
        int hashCode11 = (hashCode10 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str3 = this.f49460l;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f49461m;
        int hashCode13 = (hashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.f49462n;
        int hashCode14 = (hashCode13 + (l3 == null ? 0 : l3.hashCode())) * 31;
        C15710c cVar = this.f49463o;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        Object obj = this.f49449a;
        Double d = this.f49450b;
        String str = this.f49451c;
        Double d2 = this.f49452d;
        C15552f fVar = this.f49453e;
        Object obj2 = this.f49454f;
        Object obj3 = this.f49455g;
        Object obj4 = this.f49456h;
        Long l = this.f49457i;
        String str2 = this.f49458j;
        Long l2 = this.f49459k;
        String str3 = this.f49460l;
        Integer num = this.f49461m;
        Long l3 = this.f49462n;
        C15710c cVar = this.f49463o;
        return "ActivePackageDetailsUiModel(endDate=" + obj + ", feeAmount=" + d + ", feeCcy=" + str + ", feeOverdueAmount=" + d2 + ", feePeriodType=" + fVar + ", graceEndDate=" + obj2 + ", initialLimitAmount=" + obj3 + ", limitType=" + obj4 + ", nextFeeGenDate=" + l + ", packageDesc=" + str2 + ", packageId=" + l2 + ", packageName=" + str3 + ", priority=" + num + ", startDate=" + l3 + ", status=" + cVar + ")";
    }
}
