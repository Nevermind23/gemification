package lc0;

import kotlin.jvm.internal.C41536l;

/* renamed from: lc0.p */
public final class C25931p {

    /* renamed from: a */
    private final double f65959a;

    /* renamed from: b */
    private final double f65960b;

    /* renamed from: c */
    private final double f65961c;

    /* renamed from: d */
    private final double f65962d;

    /* renamed from: e */
    private final String f65963e;

    public C25931p(double d, double d2, double d3, double d4, String str) {
        C41536l.m120489i(str, "ccy");
        this.f65959a = d;
        this.f65960b = d2;
        this.f65961c = d3;
        this.f65962d = d4;
        this.f65963e = str;
    }

    /* renamed from: a */
    public final String mo64798a() {
        return this.f65963e;
    }

    /* renamed from: b */
    public final double mo64799b() {
        return this.f65960b;
    }

    /* renamed from: c */
    public final double mo64800c() {
        return this.f65959a;
    }

    /* renamed from: d */
    public final double mo64801d() {
        return this.f65962d;
    }

    /* renamed from: e */
    public final double mo64802e() {
        return this.f65961c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25931p)) {
            return false;
        }
        C25931p pVar = (C25931p) obj;
        return Double.compare(this.f65959a, pVar.f65959a) == 0 && Double.compare(this.f65960b, pVar.f65960b) == 0 && Double.compare(this.f65961c, pVar.f65961c) == 0 && Double.compare(this.f65962d, pVar.f65962d) == 0 && C41536l.m120484d(this.f65963e, pVar.f65963e);
    }

    public int hashCode() {
        return (((((((Double.doubleToLongBits(this.f65959a) * 31) + Double.doubleToLongBits(this.f65960b)) * 31) + Double.doubleToLongBits(this.f65961c)) * 31) + Double.doubleToLongBits(this.f65962d)) * 31) + this.f65963e.hashCode();
    }

    public String toString() {
        double d = this.f65959a;
        double d2 = this.f65960b;
        double d3 = this.f65961c;
        double d4 = this.f65962d;
        String str = this.f65963e;
        return "InterestDetailsUiModel(interest=" + d + ", extraInterest=" + d2 + ", totalInterest=" + d3 + ", interestAmount=" + d4 + ", ccy=" + str + ")";
    }
}
