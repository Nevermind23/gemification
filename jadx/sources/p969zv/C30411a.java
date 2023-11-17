package p969zv;

import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;

/* renamed from: zv.a */
public final class C30411a {

    /* renamed from: a */
    private final Date f76394a;

    /* renamed from: b */
    private final BigDecimal f76395b;

    /* renamed from: c */
    private final BigDecimal f76396c;

    /* renamed from: d */
    private final BigDecimal f76397d;

    /* renamed from: e */
    private final BigDecimal f76398e;

    /* renamed from: f */
    private final boolean f76399f;

    public C30411a(Date date, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, boolean z) {
        C41536l.m120489i(date, "monthDate");
        C41536l.m120489i(bigDecimal, "income");
        C41536l.m120489i(bigDecimal2, "expenses");
        C41536l.m120489i(bigDecimal3, "balance");
        C41536l.m120489i(bigDecimal4, "netCashFlow");
        this.f76394a = date;
        this.f76395b = bigDecimal;
        this.f76396c = bigDecimal2;
        this.f76397d = bigDecimal3;
        this.f76398e = bigDecimal4;
        this.f76399f = z;
    }

    /* renamed from: a */
    public final BigDecimal mo70753a() {
        return this.f76396c;
    }

    /* renamed from: b */
    public final BigDecimal mo70754b() {
        return this.f76395b;
    }

    /* renamed from: c */
    public final Date mo70755c() {
        return this.f76394a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30411a)) {
            return false;
        }
        C30411a aVar = (C30411a) obj;
        return C41536l.m120484d(this.f76394a, aVar.f76394a) && C41536l.m120484d(this.f76395b, aVar.f76395b) && C41536l.m120484d(this.f76396c, aVar.f76396c) && C41536l.m120484d(this.f76397d, aVar.f76397d) && C41536l.m120484d(this.f76398e, aVar.f76398e) && this.f76399f == aVar.f76399f;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f76394a.hashCode() * 31) + this.f76395b.hashCode()) * 31) + this.f76396c.hashCode()) * 31) + this.f76397d.hashCode()) * 31) + this.f76398e.hashCode()) * 31;
        boolean z = this.f76399f;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        Date date = this.f76394a;
        BigDecimal bigDecimal = this.f76395b;
        BigDecimal bigDecimal2 = this.f76396c;
        BigDecimal bigDecimal3 = this.f76397d;
        BigDecimal bigDecimal4 = this.f76398e;
        boolean z = this.f76399f;
        return "CashFlowMonth(monthDate=" + date + ", income=" + bigDecimal + ", expenses=" + bigDecimal2 + ", balance=" + bigDecimal3 + ", netCashFlow=" + bigDecimal4 + ", isForecast=" + z + ")";
    }
}
