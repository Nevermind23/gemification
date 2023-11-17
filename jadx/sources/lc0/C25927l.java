package lc0;

import kotlin.jvm.internal.C41536l;

/* renamed from: lc0.l */
public final class C25927l {

    /* renamed from: a */
    private final String f65950a;

    /* renamed from: b */
    private final String f65951b;

    /* renamed from: c */
    private final String f65952c;

    /* renamed from: d */
    private final double f65953d;

    /* renamed from: e */
    private final double f65954e;

    /* renamed from: f */
    private final double f65955f;

    /* renamed from: g */
    private final double f65956g;

    public C25927l(String str, String str2, String str3, double d, double d2, double d3, double d4) {
        C41536l.m120489i(str, "ccy");
        C41536l.m120489i(str2, "amountSuffix");
        C41536l.m120489i(str3, "fullAmount");
        this.f65950a = str;
        this.f65951b = str2;
        this.f65952c = str3;
        this.f65953d = d;
        this.f65954e = d2;
        this.f65955f = d3;
        this.f65956g = d4;
    }

    /* renamed from: a */
    public final double mo64779a() {
        return this.f65955f;
    }

    /* renamed from: b */
    public final String mo64780b() {
        return this.f65951b;
    }

    /* renamed from: c */
    public final String mo64781c() {
        return this.f65950a;
    }

    /* renamed from: d */
    public final String mo64782d() {
        return this.f65952c;
    }

    /* renamed from: e */
    public final double mo64783e() {
        return this.f65956g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25927l)) {
            return false;
        }
        C25927l lVar = (C25927l) obj;
        return C41536l.m120484d(this.f65950a, lVar.f65950a) && C41536l.m120484d(this.f65951b, lVar.f65951b) && C41536l.m120484d(this.f65952c, lVar.f65952c) && Double.compare(this.f65953d, lVar.f65953d) == 0 && Double.compare(this.f65954e, lVar.f65954e) == 0 && Double.compare(this.f65955f, lVar.f65955f) == 0 && Double.compare(this.f65956g, lVar.f65956g) == 0;
    }

    /* renamed from: f */
    public final double mo64785f() {
        return this.f65954e;
    }

    /* renamed from: g */
    public final double mo64786g() {
        return this.f65953d;
    }

    public int hashCode() {
        return (((((((((((this.f65950a.hashCode() * 31) + this.f65951b.hashCode()) * 31) + this.f65952c.hashCode()) * 31) + Double.doubleToLongBits(this.f65953d)) * 31) + Double.doubleToLongBits(this.f65954e)) * 31) + Double.doubleToLongBits(this.f65955f)) * 31) + Double.doubleToLongBits(this.f65956g);
    }

    public String toString() {
        String str = this.f65950a;
        String str2 = this.f65951b;
        String str3 = this.f65952c;
        double d = this.f65953d;
        double d2 = this.f65954e;
        double d3 = this.f65955f;
        double d4 = this.f65956g;
        return "AmountUiModel(ccy=" + str + ", amountSuffix=" + str2 + ", fullAmount=" + str3 + ", minAmount=" + d + ", maxAmount=" + d2 + ", amount=" + d3 + ", interestAmount=" + d4 + ")";
    }
}
