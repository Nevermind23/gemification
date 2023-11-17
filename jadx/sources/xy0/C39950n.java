package xy0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.n */
public final class C39950n {

    /* renamed from: a */
    private final BigDecimal f94831a;

    /* renamed from: b */
    private final String f94832b;

    public C39950n(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "equityValue");
        C41536l.m120489i(str, "currency");
        this.f94831a = bigDecimal;
        this.f94832b = str;
    }

    /* renamed from: a */
    public final String mo93745a() {
        return this.f94832b;
    }

    /* renamed from: b */
    public final BigDecimal mo93746b() {
        return this.f94831a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39950n)) {
            return false;
        }
        C39950n nVar = (C39950n) obj;
        return C41536l.m120484d(this.f94831a, nVar.f94831a) && C41536l.m120484d(this.f94832b, nVar.f94832b);
    }

    public int hashCode() {
        return (this.f94831a.hashCode() * 31) + this.f94832b.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f94831a;
        String str = this.f94832b;
        return "GTWrapper(equityValue=" + bigDecimal + ", currency=" + str + ")";
    }
}
