package xy0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.m */
public final class C39949m {

    /* renamed from: a */
    private final BigDecimal f94829a;

    /* renamed from: b */
    private final String f94830b;

    public C39949m(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "currency");
        this.f94829a = bigDecimal;
        this.f94830b = str;
    }

    /* renamed from: a */
    public final BigDecimal mo93740a() {
        return this.f94829a;
    }

    /* renamed from: b */
    public final String mo93741b() {
        return this.f94830b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39949m)) {
            return false;
        }
        C39949m mVar = (C39949m) obj;
        return C41536l.m120484d(this.f94829a, mVar.f94829a) && C41536l.m120484d(this.f94830b, mVar.f94830b);
    }

    public int hashCode() {
        return (this.f94829a.hashCode() * 31) + this.f94830b.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f94829a;
        String str = this.f94830b;
        return "Currency(amount=" + bigDecimal + ", currency=" + str + ")";
    }
}
