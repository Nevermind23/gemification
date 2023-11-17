package p863pw;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: pw.f */
public final class C27628f {

    /* renamed from: a */
    private final BigDecimal f70625a;

    /* renamed from: b */
    private final String f70626b;

    /* renamed from: c */
    private final Double f70627c;

    /* renamed from: d */
    private final Double f70628d;

    public C27628f(BigDecimal bigDecimal, String str, Double d, Double d2) {
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str, "ccy");
        this.f70625a = bigDecimal;
        this.f70626b = str;
        this.f70627c = d;
        this.f70628d = d2;
    }

    /* renamed from: a */
    public final BigDecimal mo67052a() {
        return this.f70625a;
    }

    /* renamed from: b */
    public final String mo67053b() {
        return this.f70626b;
    }

    /* renamed from: c */
    public final Double mo67054c() {
        return this.f70627c;
    }

    /* renamed from: d */
    public final Double mo67055d() {
        return this.f70628d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27628f)) {
            return false;
        }
        C27628f fVar = (C27628f) obj;
        return C41536l.m120484d(this.f70625a, fVar.f70625a) && C41536l.m120484d(this.f70626b, fVar.f70626b) && C41536l.m120484d(this.f70627c, fVar.f70627c) && C41536l.m120484d(this.f70628d, fVar.f70628d);
    }

    public int hashCode() {
        int hashCode = ((this.f70625a.hashCode() * 31) + this.f70626b.hashCode()) * 31;
        Double d = this.f70627c;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f70628d;
        if (d2 != null) {
            i = d2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f70625a;
        String str = this.f70626b;
        Double d = this.f70627c;
        Double d2 = this.f70628d;
        return "AccountStudDepInfo(amount=" + bigDecimal + ", ccy=" + str + ", intAccrued=" + d + ", intRate=" + d2 + ")";
    }
}
