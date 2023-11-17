package u00;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: u00.a */
public final class C28533a {

    /* renamed from: a */
    private final BigDecimal f72430a;

    /* renamed from: b */
    private final long f72431b;

    public C28533a(BigDecimal bigDecimal, long j) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f72430a = bigDecimal;
        this.f72431b = j;
    }

    /* renamed from: a */
    public final long mo68249a() {
        return this.f72431b;
    }

    /* renamed from: b */
    public final BigDecimal mo68250b() {
        return this.f72430a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28533a)) {
            return false;
        }
        C28533a aVar = (C28533a) obj;
        return C41536l.m120484d(this.f72430a, aVar.f72430a) && this.f72431b == aVar.f72431b;
    }

    public int hashCode() {
        return (this.f72430a.hashCode() * 31) + C7397t.m28148a(this.f72431b);
    }

    public String toString() {
        BigDecimal bigDecimal = this.f72430a;
        long j = this.f72431b;
        return "CommissionPaymentRequest(amount=" + bigDecimal + ", acctKey=" + j + ")";
    }
}
