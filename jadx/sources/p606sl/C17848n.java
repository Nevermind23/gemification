package p606sl;

import kotlin.jvm.internal.C41536l;

/* renamed from: sl.n */
public final class C17848n {

    /* renamed from: a */
    private final Long f50837a;

    /* renamed from: b */
    private final Long f50838b;

    /* renamed from: c */
    private final String f50839c;

    /* renamed from: d */
    private final Double f50840d;

    /* renamed from: e */
    private final Double f50841e;

    /* renamed from: f */
    private final Double f50842f;

    /* renamed from: g */
    private final Double f50843g;

    /* renamed from: h */
    private final Double f50844h;

    /* renamed from: i */
    private final Double f50845i;

    /* renamed from: j */
    private final Double f50846j;

    public C17848n(Long l, Long l2, String str, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7) {
        this.f50837a = l;
        this.f50838b = l2;
        this.f50839c = str;
        this.f50840d = d;
        this.f50841e = d2;
        this.f50842f = d3;
        this.f50843g = d4;
        this.f50844h = d5;
        this.f50845i = d6;
        this.f50846j = d7;
    }

    /* renamed from: a */
    public final Double mo45511a() {
        return this.f50845i;
    }

    /* renamed from: b */
    public final String mo45512b() {
        return this.f50839c;
    }

    /* renamed from: c */
    public final Double mo45513c() {
        return this.f50843g;
    }

    /* renamed from: d */
    public final Double mo45514d() {
        return this.f50846j;
    }

    /* renamed from: e */
    public final Double mo45515e() {
        return this.f50841e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17848n)) {
            return false;
        }
        C17848n nVar = (C17848n) obj;
        return C41536l.m120484d(this.f50837a, nVar.f50837a) && C41536l.m120484d(this.f50838b, nVar.f50838b) && C41536l.m120484d(this.f50839c, nVar.f50839c) && C41536l.m120484d(this.f50840d, nVar.f50840d) && C41536l.m120484d(this.f50841e, nVar.f50841e) && C41536l.m120484d(this.f50842f, nVar.f50842f) && C41536l.m120484d(this.f50843g, nVar.f50843g) && C41536l.m120484d(this.f50844h, nVar.f50844h) && C41536l.m120484d(this.f50845i, nVar.f50845i) && C41536l.m120484d(this.f50846j, nVar.f50846j);
    }

    /* renamed from: f */
    public final Long mo45517f() {
        return this.f50838b;
    }

    /* renamed from: g */
    public final Double mo45518g() {
        return this.f50842f;
    }

    /* renamed from: h */
    public final Double mo45519h() {
        return this.f50840d;
    }

    public int hashCode() {
        Long l = this.f50837a;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f50838b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f50839c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Double d = this.f50840d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f50841e;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f50842f;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.f50843g;
        int hashCode7 = (hashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f50844h;
        int hashCode8 = (hashCode7 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f50845i;
        int hashCode9 = (hashCode8 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.f50846j;
        if (d7 != null) {
            i = d7.hashCode();
        }
        return hashCode9 + i;
    }

    /* renamed from: i */
    public final Double mo45521i() {
        return this.f50844h;
    }

    public String toString() {
        Long l = this.f50837a;
        Long l2 = this.f50838b;
        String str = this.f50839c;
        Double d = this.f50840d;
        Double d2 = this.f50841e;
        Double d3 = this.f50842f;
        Double d4 = this.f50843g;
        Double d5 = this.f50844h;
        Double d6 = this.f50845i;
        Double d7 = this.f50846j;
        return "BnplRepayment(loanKey=" + l + ", paymentDate=" + l2 + ", ccy=" + str + ", principal=" + d + ", interest=" + d2 + ", penalty=" + d3 + ", fee=" + d4 + ", scheduledFee=" + d5 + ", amountPaid=" + d6 + ", insAmt=" + d7 + ")";
    }
}
