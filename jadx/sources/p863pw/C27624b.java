package p863pw;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.b */
public final class C27624b {

    /* renamed from: a */
    private final BigDecimal f70595a;

    /* renamed from: b */
    private final String f70596b;

    public C27624b(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "amount");
        this.f70595a = bigDecimal;
        this.f70596b = str;
    }

    /* renamed from: a */
    public final BigDecimal mo67024a() {
        return this.f70595a;
    }

    /* renamed from: b */
    public final String mo67025b() {
        return this.f70596b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27624b)) {
            return false;
        }
        C27624b bVar = (C27624b) obj;
        return C41536l.m120484d(this.f70595a, bVar.f70595a) && C41536l.m120484d(this.f70596b, bVar.f70596b);
    }

    public int hashCode() {
        int hashCode = this.f70595a.hashCode() * 31;
        String str = this.f70596b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f70595a;
        String str = this.f70596b;
        return "AccountAmountWrapper(amount=" + bigDecimal + ", currency=" + str + ")";
    }
}
