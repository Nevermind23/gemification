package py0;

import kotlin.jvm.internal.C41536l;

/* renamed from: py0.a */
public final class C38047a {

    /* renamed from: a */
    private final double f91390a;

    /* renamed from: b */
    private final double f91391b;

    /* renamed from: c */
    private final String f91392c;

    /* renamed from: d */
    private final double f91393d;

    public C38047a(double d, double d2, String str, double d3) {
        C41536l.m120489i(str, "agreeType");
        this.f91390a = d;
        this.f91391b = d2;
        this.f91392c = str;
        this.f91393d = d3;
    }

    /* renamed from: a */
    public final String mo91417a() {
        return this.f91392c;
    }

    /* renamed from: b */
    public final double mo91418b() {
        return this.f91391b;
    }

    /* renamed from: c */
    public final double mo91419c() {
        return this.f91390a;
    }

    /* renamed from: d */
    public final double mo91420d() {
        return this.f91393d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38047a)) {
            return false;
        }
        C38047a aVar = (C38047a) obj;
        return Double.compare(this.f91390a, aVar.f91390a) == 0 && Double.compare(this.f91391b, aVar.f91391b) == 0 && C41536l.m120484d(this.f91392c, aVar.f91392c) && Double.compare(this.f91393d, aVar.f91393d) == 0;
    }

    public int hashCode() {
        return (((((Double.doubleToLongBits(this.f91390a) * 31) + Double.doubleToLongBits(this.f91391b)) * 31) + this.f91392c.hashCode()) * 31) + Double.doubleToLongBits(this.f91393d);
    }

    public String toString() {
        double d = this.f91390a;
        double d2 = this.f91391b;
        String str = this.f91392c;
        double d3 = this.f91393d;
        return "DepositChangeProlParameters(interestRate=" + d + ", interestAmount=" + d2 + ", agreeType=" + str + ", irr=" + d3 + ")";
    }
}
