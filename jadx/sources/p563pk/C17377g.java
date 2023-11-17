package p563pk;

import kotlin.jvm.internal.C41536l;

/* renamed from: pk.g */
public final class C17377g {

    /* renamed from: a */
    private final double f48750a;

    /* renamed from: b */
    private final double f48751b;

    /* renamed from: c */
    private final String f48752c;

    /* renamed from: d */
    private final double f48753d;

    /* renamed from: e */
    private final Double f48754e;

    public C17377g(double d, double d2, String str, double d3, Double d4) {
        C41536l.m120489i(str, "ccy");
        this.f48750a = d;
        this.f48751b = d2;
        this.f48752c = str;
        this.f48753d = d3;
        this.f48754e = d4;
    }

    /* renamed from: a */
    public final double mo44854a() {
        return this.f48753d;
    }

    /* renamed from: b */
    public final String mo44855b() {
        return this.f48752c;
    }

    /* renamed from: c */
    public final Double mo44856c() {
        return this.f48754e;
    }

    /* renamed from: d */
    public final double mo44857d() {
        return this.f48750a;
    }

    /* renamed from: e */
    public final double mo44858e() {
        return this.f48751b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17377g)) {
            return false;
        }
        C17377g gVar = (C17377g) obj;
        return Double.compare(this.f48750a, gVar.f48750a) == 0 && Double.compare(this.f48751b, gVar.f48751b) == 0 && C41536l.m120484d(this.f48752c, gVar.f48752c) && Double.compare(this.f48753d, gVar.f48753d) == 0 && C41536l.m120484d(this.f48754e, gVar.f48754e);
    }

    public int hashCode() {
        int a = ((((((Double.doubleToLongBits(this.f48750a) * 31) + Double.doubleToLongBits(this.f48751b)) * 31) + this.f48752c.hashCode()) * 31) + Double.doubleToLongBits(this.f48753d)) * 31;
        Double d = this.f48754e;
        return a + (d == null ? 0 : d.hashCode());
    }

    public String toString() {
        double d = this.f48750a;
        double d2 = this.f48751b;
        String str = this.f48752c;
        double d3 = this.f48753d;
        Double d4 = this.f48754e;
        return "LimitAmount(limitAmount=" + d + ", totalPaymentAmount=" + d2 + ", ccy=" + str + ", averageMonthlyPaymentAmount=" + d3 + ", firstMonthPaymentAmount=" + d4 + ")";
    }
}
