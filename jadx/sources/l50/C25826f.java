package l50;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.f */
public final class C25826f {

    /* renamed from: a */
    private final BigDecimal f65682a;

    /* renamed from: b */
    private final String f65683b;

    public C25826f(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f65682a = bigDecimal;
        this.f65683b = str;
    }

    /* renamed from: a */
    public final BigDecimal mo64482a() {
        return this.f65682a;
    }

    /* renamed from: b */
    public final String mo64483b() {
        return this.f65683b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25826f)) {
            return false;
        }
        C25826f fVar = (C25826f) obj;
        return C41536l.m120484d(this.f65682a, fVar.f65682a) && C41536l.m120484d(this.f65683b, fVar.f65683b);
    }

    public int hashCode() {
        int hashCode = this.f65682a.hashCode() * 31;
        String str = this.f65683b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f65682a;
        String str = this.f65683b;
        return "AccountWithCardsAmountsCcyWrapperUIModel(amount=" + bigDecimal + ", ccy=" + str + ")";
    }
}
