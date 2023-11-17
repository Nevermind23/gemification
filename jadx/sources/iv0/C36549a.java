package iv0;

import kotlin.jvm.internal.C41536l;

/* renamed from: iv0.a */
public final class C36549a {

    /* renamed from: a */
    private final String f88074a;

    /* renamed from: b */
    private final double f88075b;

    public C36549a(String str, double d) {
        C41536l.m120489i(str, "currency");
        this.f88074a = str;
        this.f88075b = d;
    }

    /* renamed from: a */
    public final double mo89328a() {
        return this.f88075b;
    }

    /* renamed from: b */
    public final String mo89329b() {
        return this.f88074a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36549a)) {
            return false;
        }
        C36549a aVar = (C36549a) obj;
        return C41536l.m120484d(this.f88074a, aVar.f88074a) && Double.compare(this.f88075b, aVar.f88075b) == 0;
    }

    public int hashCode() {
        return (this.f88074a.hashCode() * 31) + Double.doubleToLongBits(this.f88075b);
    }

    public String toString() {
        String str = this.f88074a;
        double d = this.f88075b;
        return "BalanceAmount(currency=" + str + ", amount=" + d + ")";
    }
}
