package m70;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: m70.b */
public final class C26149b {

    /* renamed from: a */
    private final BigDecimal f66302a;

    /* renamed from: b */
    private final String f66303b;

    public C26149b(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f66302a = bigDecimal;
        this.f66303b = str;
    }

    /* renamed from: a */
    public final BigDecimal mo65115a() {
        return this.f66302a;
    }

    /* renamed from: b */
    public final String mo65116b() {
        return this.f66303b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26149b)) {
            return false;
        }
        C26149b bVar = (C26149b) obj;
        return C41536l.m120484d(this.f66302a, bVar.f66302a) && C41536l.m120484d(this.f66303b, bVar.f66303b);
    }

    public int hashCode() {
        int hashCode = this.f66302a.hashCode() * 31;
        String str = this.f66303b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f66302a;
        String str = this.f66303b;
        return "AccountAmountWrapper(amount=" + bigDecimal + ", currency=" + str + ")";
    }
}
