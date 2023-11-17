package p863pw;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.c */
public final class C27625c {

    /* renamed from: a */
    private final BigDecimal f70597a;

    /* renamed from: b */
    private final String f70598b;

    public C27625c(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f70597a = bigDecimal;
        this.f70598b = str;
    }

    /* renamed from: a */
    public final BigDecimal mo67029a() {
        return this.f70597a;
    }

    /* renamed from: b */
    public final String mo67030b() {
        return this.f70598b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27625c)) {
            return false;
        }
        C27625c cVar = (C27625c) obj;
        return C41536l.m120484d(this.f70597a, cVar.f70597a) && C41536l.m120484d(this.f70598b, cVar.f70598b);
    }

    public int hashCode() {
        int hashCode = this.f70597a.hashCode() * 31;
        String str = this.f70598b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f70597a;
        String str = this.f70598b;
        return "AccountAmountWrapperCcy(amount=" + bigDecimal + ", ccy=" + str + ")";
    }
}
