package r80;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: r80.b */
public final class C27948b {

    /* renamed from: a */
    private final BigDecimal f71160a;

    public C27948b(BigDecimal bigDecimal) {
        C41536l.m120489i(bigDecimal, "pmtAmount");
        this.f71160a = bigDecimal;
    }

    /* renamed from: a */
    public final BigDecimal mo67530a() {
        return this.f71160a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27948b) && C41536l.m120484d(this.f71160a, ((C27948b) obj).f71160a);
    }

    public int hashCode() {
        return this.f71160a.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f71160a;
        return "LoanCalculation(pmtAmount=" + bigDecimal + ")";
    }
}
