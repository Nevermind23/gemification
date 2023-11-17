package lc0;

import kotlin.jvm.internal.C41536l;

/* renamed from: lc0.q */
public final class C25932q {

    /* renamed from: a */
    private final double f65964a;

    /* renamed from: b */
    private final double f65965b;

    /* renamed from: c */
    private final String f65966c;

    public C25932q(double d, double d2, String str) {
        C41536l.m120489i(str, "ccy");
        this.f65964a = d;
        this.f65965b = d2;
        this.f65966c = str;
    }

    /* renamed from: a */
    public final String mo64806a() {
        return this.f65966c;
    }

    /* renamed from: b */
    public final double mo64807b() {
        return this.f65965b;
    }

    /* renamed from: c */
    public final double mo64808c() {
        return this.f65964a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25932q)) {
            return false;
        }
        C25932q qVar = (C25932q) obj;
        return Double.compare(this.f65964a, qVar.f65964a) == 0 && Double.compare(this.f65965b, qVar.f65965b) == 0 && C41536l.m120484d(this.f65966c, qVar.f65966c);
    }

    public int hashCode() {
        return (((Double.doubleToLongBits(this.f65964a) * 31) + Double.doubleToLongBits(this.f65965b)) * 31) + this.f65966c.hashCode();
    }

    public String toString() {
        double d = this.f65964a;
        double d2 = this.f65965b;
        String str = this.f65966c;
        return "NewAmountWithChange(newAmount=" + d + ", change=" + d2 + ", ccy=" + str + ")";
    }
}
