package m40;

import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;

/* renamed from: m40.b */
public final class C26142b {

    /* renamed from: a */
    private final Date f66264a;

    /* renamed from: b */
    private final BigDecimal f66265b;

    /* renamed from: c */
    private final BigDecimal f66266c;

    /* renamed from: d */
    private final BigDecimal f66267d;

    public C26142b(Date date, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        C41536l.m120489i(date, "monthDate");
        C41536l.m120489i(bigDecimal, "income");
        C41536l.m120489i(bigDecimal2, "expenses");
        C41536l.m120489i(bigDecimal3, "difference");
        this.f66264a = date;
        this.f66265b = bigDecimal;
        this.f66266c = bigDecimal2;
        this.f66267d = bigDecimal3;
    }

    /* renamed from: a */
    public final BigDecimal mo65047a() {
        return this.f66267d;
    }

    /* renamed from: b */
    public final BigDecimal mo65048b() {
        return this.f66266c;
    }

    /* renamed from: c */
    public final BigDecimal mo65049c() {
        return this.f66265b;
    }

    /* renamed from: d */
    public final Date mo65050d() {
        return this.f66264a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26142b)) {
            return false;
        }
        C26142b bVar = (C26142b) obj;
        return C41536l.m120484d(this.f66264a, bVar.f66264a) && C41536l.m120484d(this.f66265b, bVar.f66265b) && C41536l.m120484d(this.f66266c, bVar.f66266c) && C41536l.m120484d(this.f66267d, bVar.f66267d);
    }

    public int hashCode() {
        return (((((this.f66264a.hashCode() * 31) + this.f66265b.hashCode()) * 31) + this.f66266c.hashCode()) * 31) + this.f66267d.hashCode();
    }

    public String toString() {
        Date date = this.f66264a;
        BigDecimal bigDecimal = this.f66265b;
        BigDecimal bigDecimal2 = this.f66266c;
        BigDecimal bigDecimal3 = this.f66267d;
        return "CashFlowMonthModel(monthDate=" + date + ", income=" + bigDecimal + ", expenses=" + bigDecimal2 + ", difference=" + bigDecimal3 + ")";
    }
}
