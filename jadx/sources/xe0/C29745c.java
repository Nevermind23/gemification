package xe0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.c */
public final class C29745c {

    /* renamed from: a */
    private final BigDecimal f75180a;

    /* renamed from: b */
    private final String f75181b;

    /* renamed from: c */
    private final BigDecimal f75182c;

    /* renamed from: d */
    private final String f75183d;

    /* renamed from: e */
    private final double f75184e;

    /* renamed from: f */
    private final int f75185f;

    /* renamed from: g */
    private final BigDecimal f75186g;

    public C29745c(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, double d, int i, BigDecimal bigDecimal3) {
        C41536l.m120489i(bigDecimal2, "fee");
        C41536l.m120489i(bigDecimal3, "price");
        this.f75180a = bigDecimal;
        this.f75181b = str;
        this.f75182c = bigDecimal2;
        this.f75183d = str2;
        this.f75184e = d;
        this.f75185f = i;
        this.f75186g = bigDecimal3;
    }

    /* renamed from: a */
    public final BigDecimal mo69762a() {
        return this.f75180a;
    }

    /* renamed from: b */
    public final BigDecimal mo69763b() {
        return this.f75182c;
    }

    /* renamed from: c */
    public final int mo69764c() {
        return this.f75185f;
    }

    /* renamed from: d */
    public final double mo69765d() {
        return this.f75184e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29745c)) {
            return false;
        }
        C29745c cVar = (C29745c) obj;
        return C41536l.m120484d(this.f75180a, cVar.f75180a) && C41536l.m120484d(this.f75181b, cVar.f75181b) && C41536l.m120484d(this.f75182c, cVar.f75182c) && C41536l.m120484d(this.f75183d, cVar.f75183d) && Double.compare(this.f75184e, cVar.f75184e) == 0 && this.f75185f == cVar.f75185f && C41536l.m120484d(this.f75186g, cVar.f75186g);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f75180a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.f75181b;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f75182c.hashCode()) * 31;
        String str2 = this.f75183d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode2 + i) * 31) + Double.doubleToLongBits(this.f75184e)) * 31) + this.f75185f) * 31) + this.f75186g.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f75180a;
        String str = this.f75181b;
        BigDecimal bigDecimal2 = this.f75182c;
        String str2 = this.f75183d;
        double d = this.f75184e;
        int i = this.f75185f;
        BigDecimal bigDecimal3 = this.f75186g;
        return "CalculateTradeData(amount=" + bigDecimal + ", amountCurrency=" + str + ", fee=" + bigDecimal2 + ", feeCurrency=" + str2 + ", quantity=" + d + ", opUniqueId=" + i + ", price=" + bigDecimal3 + ")";
    }
}
