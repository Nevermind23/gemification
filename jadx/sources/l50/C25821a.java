package l50;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.a */
public final class C25821a {

    /* renamed from: a */
    private final BigDecimal f65656a;

    /* renamed from: b */
    private final String f65657b;

    public C25821a(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f65656a = bigDecimal;
        this.f65657b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25821a)) {
            return false;
        }
        C25821a aVar = (C25821a) obj;
        return C41536l.m120484d(this.f65656a, aVar.f65656a) && C41536l.m120484d(this.f65657b, aVar.f65657b);
    }

    public int hashCode() {
        int hashCode = this.f65656a.hashCode() * 31;
        String str = this.f65657b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f65656a;
        String str = this.f65657b;
        return "AccountAmountWrapperCcyUIModel(amount=" + bigDecimal + ", ccy=" + str + ")";
    }
}
