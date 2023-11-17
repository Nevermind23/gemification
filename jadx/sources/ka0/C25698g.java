package ka0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ka0.g */
public final class C25698g {

    /* renamed from: a */
    private final double f65457a;

    /* renamed from: b */
    private final double f65458b;

    /* renamed from: c */
    private final Double f65459c;

    /* renamed from: d */
    private final Double f65460d;

    /* renamed from: e */
    private final Boolean f65461e;

    public C25698g(double d, double d2, Double d3, Double d4, Boolean bool) {
        this.f65457a = d;
        this.f65458b = d2;
        this.f65459c = d3;
        this.f65460d = d4;
        this.f65461e = bool;
    }

    /* renamed from: a */
    public final double mo64240a() {
        return this.f65458b;
    }

    /* renamed from: b */
    public final Boolean mo64241b() {
        return this.f65461e;
    }

    /* renamed from: c */
    public final double mo64242c() {
        return this.f65457a;
    }

    /* renamed from: d */
    public final Double mo64243d() {
        return this.f65459c;
    }

    /* renamed from: e */
    public final Double mo64244e() {
        return this.f65460d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25698g)) {
            return false;
        }
        C25698g gVar = (C25698g) obj;
        return Double.compare(this.f65457a, gVar.f65457a) == 0 && Double.compare(this.f65458b, gVar.f65458b) == 0 && C41536l.m120484d(this.f65459c, gVar.f65459c) && C41536l.m120484d(this.f65460d, gVar.f65460d) && C41536l.m120484d(this.f65461e, gVar.f65461e);
    }

    public int hashCode() {
        int a = ((Double.doubleToLongBits(this.f65457a) * 31) + Double.doubleToLongBits(this.f65458b)) * 31;
        Double d = this.f65459c;
        int i = 0;
        int hashCode = (a + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f65460d;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Boolean bool = this.f65461e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        double d = this.f65457a;
        double d2 = this.f65458b;
        Double d3 = this.f65459c;
        Double d4 = this.f65460d;
        Boolean bool = this.f65461e;
        return "InterestRate(interestRate=" + d + ", effectiveInterestRate=" + d2 + ", possibleProfit=" + d3 + ", spreadRate=" + d4 + ", hasSpreadRate=" + bool + ")";
    }
}
