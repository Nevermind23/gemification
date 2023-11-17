package l50;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: l50.c */
public final class C25823c {

    /* renamed from: a */
    private final BigDecimal f65659a;

    /* renamed from: b */
    private final String f65660b;

    /* renamed from: c */
    private final int f65661c;

    public C25823c(BigDecimal bigDecimal, String str, int i) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f65659a = bigDecimal;
        this.f65660b = str;
        this.f65661c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25823c)) {
            return false;
        }
        C25823c cVar = (C25823c) obj;
        return C41536l.m120484d(this.f65659a, cVar.f65659a) && C41536l.m120484d(this.f65660b, cVar.f65660b) && this.f65661c == cVar.f65661c;
    }

    public int hashCode() {
        return (((this.f65659a.hashCode() * 31) + this.f65660b.hashCode()) * 31) + this.f65661c;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f65659a;
        String str = this.f65660b;
        int i = this.f65661c;
        return "AccountSubAccountAmountSumsUIModel(amount=" + bigDecimal + ", ccy=" + str + ", orderNo=" + i + ")";
    }
}
