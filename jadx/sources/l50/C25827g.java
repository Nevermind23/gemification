package l50;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.g */
public final class C25827g {

    /* renamed from: a */
    private final BigDecimal f65684a;

    /* renamed from: b */
    private final String f65685b;

    public C25827g(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f65684a = bigDecimal;
        this.f65685b = str;
    }

    /* renamed from: a */
    public final BigDecimal mo64487a() {
        return this.f65684a;
    }

    /* renamed from: b */
    public final String mo64488b() {
        return this.f65685b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25827g)) {
            return false;
        }
        C25827g gVar = (C25827g) obj;
        return C41536l.m120484d(this.f65684a, gVar.f65684a) && C41536l.m120484d(this.f65685b, gVar.f65685b);
    }

    public int hashCode() {
        int hashCode = this.f65684a.hashCode() * 31;
        String str = this.f65685b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f65684a;
        String str = this.f65685b;
        return "AccountWithCardsAmountsWrapperUIModel(amount=" + bigDecimal + ", currency=" + str + ")";
    }
}
