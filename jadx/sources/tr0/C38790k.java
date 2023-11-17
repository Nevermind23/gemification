package tr0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: tr0.k */
public final class C38790k {

    /* renamed from: a */
    private final String f92799a;

    /* renamed from: b */
    private final BigDecimal f92800b;

    /* renamed from: c */
    private final BigDecimal f92801c;

    /* renamed from: d */
    private final BigDecimal f92802d;

    public C38790k(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.f92799a = str;
        this.f92800b = bigDecimal;
        this.f92801c = bigDecimal2;
        this.f92802d = bigDecimal3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38790k)) {
            return false;
        }
        C38790k kVar = (C38790k) obj;
        return C41536l.m120484d(this.f92799a, kVar.f92799a) && C41536l.m120484d(this.f92800b, kVar.f92800b) && C41536l.m120484d(this.f92801c, kVar.f92801c) && C41536l.m120484d(this.f92802d, kVar.f92802d);
    }

    public int hashCode() {
        String str = this.f92799a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.f92800b;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f92801c;
        int hashCode3 = (hashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f92802d;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        String str = this.f92799a;
        BigDecimal bigDecimal = this.f92800b;
        BigDecimal bigDecimal2 = this.f92801c;
        BigDecimal bigDecimal3 = this.f92802d;
        return "PawnLoanData(errorMessage=" + str + ", intAmount=" + bigDecimal + ", penAmount=" + bigDecimal2 + ", priAmount=" + bigDecimal3 + ")";
    }
}
