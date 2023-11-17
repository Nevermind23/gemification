package xy0;

import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.s */
public final class C39955s {

    /* renamed from: a */
    private final Date f94894a;

    /* renamed from: b */
    private final double f94895b;

    /* renamed from: c */
    private final List f94896c;

    public C39955s(Date date, double d, List list) {
        C41536l.m120489i(date, "paymentDate");
        C41536l.m120489i(list, "list");
        this.f94894a = date;
        this.f94895b = d;
        this.f94896c = list;
    }

    /* renamed from: a */
    public final double mo93770a() {
        return this.f94895b;
    }

    /* renamed from: b */
    public final Date mo93771b() {
        return this.f94894a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39955s)) {
            return false;
        }
        C39955s sVar = (C39955s) obj;
        return C41536l.m120484d(this.f94894a, sVar.f94894a) && Double.compare(this.f94895b, sVar.f94895b) == 0 && C41536l.m120484d(this.f94896c, sVar.f94896c);
    }

    public int hashCode() {
        return (((this.f94894a.hashCode() * 31) + Double.doubleToLongBits(this.f94895b)) * 31) + this.f94896c.hashCode();
    }

    public String toString() {
        Date date = this.f94894a;
        double d = this.f94895b;
        List list = this.f94896c;
        return "LoanInvoiceWrapper(paymentDate=" + date + ", amount=" + d + ", list=" + list + ")";
    }
}
