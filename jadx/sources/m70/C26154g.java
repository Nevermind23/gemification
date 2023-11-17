package m70;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: m70.g */
public final class C26154g {

    /* renamed from: a */
    private final BigDecimal f66348a;

    /* renamed from: b */
    private final String f66349b;

    /* renamed from: c */
    private final int f66350c;

    public C26154g(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f66348a = bigDecimal;
        this.f66349b = str;
        this.f66350c = i;
    }

    /* renamed from: a */
    public final BigDecimal mo65176a() {
        return this.f66348a;
    }

    /* renamed from: b */
    public final String mo65177b() {
        return this.f66349b;
    }

    /* renamed from: c */
    public final int mo65178c() {
        return this.f66350c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26154g)) {
            return false;
        }
        C26154g gVar = (C26154g) obj;
        return C41536l.m120484d(this.f66348a, gVar.f66348a) && C41536l.m120484d(this.f66349b, gVar.f66349b) && this.f66350c == gVar.f66350c;
    }

    public int hashCode() {
        return (((this.f66348a.hashCode() * 31) + this.f66349b.hashCode()) * 31) + this.f66350c;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f66348a;
        String str = this.f66349b;
        int i = this.f66350c;
        return "AccountSubAccountAmountSums(amount=" + bigDecimal + ", ccy=" + str + ", orderNo=" + i + ")";
    }
}
