package iv0;

import kotlin.jvm.internal.C41536l;

/* renamed from: iv0.g */
public final class C36555g {

    /* renamed from: a */
    private final String f88101a;

    /* renamed from: b */
    private final double f88102b;

    public C36555g(String str, double d) {
        C41536l.m120489i(str, "ccy");
        this.f88101a = str;
        this.f88102b = d;
    }

    /* renamed from: a */
    public final double mo89364a() {
        return this.f88102b;
    }

    /* renamed from: b */
    public final String mo89365b() {
        return this.f88101a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36555g)) {
            return false;
        }
        C36555g gVar = (C36555g) obj;
        return C41536l.m120484d(this.f88101a, gVar.f88101a) && Double.compare(this.f88102b, gVar.f88102b) == 0;
    }

    public int hashCode() {
        return (this.f88101a.hashCode() * 31) + Double.doubleToLongBits(this.f88102b);
    }

    public String toString() {
        String str = this.f88101a;
        double d = this.f88102b;
        return "OpenBankAccountSummary(ccy=" + str + ", amount=" + d + ")";
    }
}
