package l50;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.k */
public final class C25831k {

    /* renamed from: a */
    private final BigDecimal f65701a;

    /* renamed from: b */
    private final String f65702b;

    /* renamed from: c */
    private final int f65703c;

    public C25831k(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f65701a = bigDecimal;
        this.f65702b = str;
        this.f65703c = i;
    }

    /* renamed from: a */
    public final BigDecimal mo64517a() {
        return this.f65701a;
    }

    /* renamed from: b */
    public final String mo64518b() {
        return this.f65702b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25831k)) {
            return false;
        }
        C25831k kVar = (C25831k) obj;
        return C41536l.m120484d(this.f65701a, kVar.f65701a) && C41536l.m120484d(this.f65702b, kVar.f65702b) && this.f65703c == kVar.f65703c;
    }

    public int hashCode() {
        return (((this.f65701a.hashCode() * 31) + this.f65702b.hashCode()) * 31) + this.f65703c;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f65701a;
        String str = this.f65702b;
        int i = this.f65703c;
        return "AccountWithCardsSubAccountAmountSumsUIModel(amount=" + bigDecimal + ", ccy=" + str + ", orderNo=" + i + ")";
    }
}
