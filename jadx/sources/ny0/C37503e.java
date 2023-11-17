package ny0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ny0.e */
public final class C37503e {

    /* renamed from: a */
    private final double f90188a;

    /* renamed from: b */
    private final String f90189b;

    public C37503e(double d, String str) {
        C41536l.m120489i(str, "ccy");
        this.f90188a = d;
        this.f90189b = str;
    }

    /* renamed from: a */
    public final double mo90698a() {
        return this.f90188a;
    }

    /* renamed from: b */
    public final String mo90699b() {
        return this.f90189b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37503e)) {
            return false;
        }
        C37503e eVar = (C37503e) obj;
        return Double.compare(this.f90188a, eVar.f90188a) == 0 && C41536l.m120484d(this.f90189b, eVar.f90189b);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.f90188a) * 31) + this.f90189b.hashCode();
    }

    public String toString() {
        double d = this.f90188a;
        String str = this.f90189b;
        return "DepositBondsSummary(balance=" + d + ", ccy=" + str + ")";
    }
}
