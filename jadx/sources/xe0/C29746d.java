package xe0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.d */
public final class C29746d {

    /* renamed from: a */
    private final BigDecimal f75187a;

    /* renamed from: b */
    private final BigDecimal f75188b;

    /* renamed from: c */
    private final BigDecimal f75189c;

    /* renamed from: d */
    private final BigDecimal f75190d;

    /* renamed from: e */
    private final BigDecimal f75191e;

    public C29746d(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5) {
        C41536l.m120489i(bigDecimal, "pending");
        C41536l.m120489i(bigDecimal2, "freeCash");
        C41536l.m120489i(bigDecimal3, "buyingPower");
        C41536l.m120489i(bigDecimal4, "pendingWithdrawal");
        C41536l.m120489i(bigDecimal5, "accruedCommission");
        this.f75187a = bigDecimal;
        this.f75188b = bigDecimal2;
        this.f75189c = bigDecimal3;
        this.f75190d = bigDecimal4;
        this.f75191e = bigDecimal5;
    }

    /* renamed from: a */
    public final BigDecimal mo69769a() {
        return this.f75191e;
    }

    /* renamed from: b */
    public final BigDecimal mo69770b() {
        return this.f75189c;
    }

    /* renamed from: c */
    public final BigDecimal mo69771c() {
        return this.f75188b;
    }

    /* renamed from: d */
    public final BigDecimal mo69772d() {
        return this.f75190d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29746d)) {
            return false;
        }
        C29746d dVar = (C29746d) obj;
        return C41536l.m120484d(this.f75187a, dVar.f75187a) && C41536l.m120484d(this.f75188b, dVar.f75188b) && C41536l.m120484d(this.f75189c, dVar.f75189c) && C41536l.m120484d(this.f75190d, dVar.f75190d) && C41536l.m120484d(this.f75191e, dVar.f75191e);
    }

    public int hashCode() {
        return (((((((this.f75187a.hashCode() * 31) + this.f75188b.hashCode()) * 31) + this.f75189c.hashCode()) * 31) + this.f75190d.hashCode()) * 31) + this.f75191e.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f75187a;
        BigDecimal bigDecimal2 = this.f75188b;
        BigDecimal bigDecimal3 = this.f75189c;
        BigDecimal bigDecimal4 = this.f75190d;
        BigDecimal bigDecimal5 = this.f75191e;
        return "CashData(pending=" + bigDecimal + ", freeCash=" + bigDecimal2 + ", buyingPower=" + bigDecimal3 + ", pendingWithdrawal=" + bigDecimal4 + ", accruedCommission=" + bigDecimal5 + ")";
    }
}
