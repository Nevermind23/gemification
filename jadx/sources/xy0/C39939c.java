package xy0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.c */
public final class C39939c {

    /* renamed from: a */
    private final BigDecimal f94754a;

    /* renamed from: b */
    private final BigDecimal f94755b;

    /* renamed from: c */
    private final String f94756c;

    /* renamed from: d */
    private final long f94757d;

    /* renamed from: e */
    private final Long f94758e;

    /* renamed from: f */
    private final BigDecimal f94759f;

    /* renamed from: g */
    private final double f94760g;

    public C39939c(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, long j, Long l, BigDecimal bigDecimal3, double d) {
        C41536l.m120489i(str, "ccy");
        this.f94754a = bigDecimal;
        this.f94755b = bigDecimal2;
        this.f94756c = str;
        this.f94757d = j;
        this.f94758e = l;
        this.f94759f = bigDecimal3;
        this.f94760g = d;
    }

    /* renamed from: a */
    public final BigDecimal mo93678a() {
        return this.f94755b;
    }

    /* renamed from: b */
    public final String mo93679b() {
        return this.f94756c;
    }

    /* renamed from: c */
    public final double mo93680c() {
        return this.f94760g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39939c)) {
            return false;
        }
        C39939c cVar = (C39939c) obj;
        return C41536l.m120484d(this.f94754a, cVar.f94754a) && C41536l.m120484d(this.f94755b, cVar.f94755b) && C41536l.m120484d(this.f94756c, cVar.f94756c) && this.f94757d == cVar.f94757d && C41536l.m120484d(this.f94758e, cVar.f94758e) && C41536l.m120484d(this.f94759f, cVar.f94759f) && Double.compare(this.f94760g, cVar.f94760g) == 0;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f94754a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f94755b;
        int hashCode2 = (((((hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31) + this.f94756c.hashCode()) * 31) + C7397t.m28148a(this.f94757d)) * 31;
        Long l = this.f94758e;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f94759f;
        if (bigDecimal3 != null) {
            i = bigDecimal3.hashCode();
        }
        return ((hashCode3 + i) * 31) + Double.doubleToLongBits(this.f94760g);
    }

    public String toString() {
        BigDecimal bigDecimal = this.f94754a;
        BigDecimal bigDecimal2 = this.f94755b;
        String str = this.f94756c;
        long j = this.f94757d;
        Long l = this.f94758e;
        BigDecimal bigDecimal3 = this.f94759f;
        double d = this.f94760g;
        return "AgreementClientInfo(bondsValue=" + bigDecimal + ", cashValue=" + bigDecimal2 + ", ccy=" + str + ", clientKey=" + j + ", insertDate=" + l + ", sharesValue=" + bigDecimal3 + ", totalValue=" + d + ")";
    }
}
