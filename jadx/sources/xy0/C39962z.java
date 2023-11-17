package xy0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xy0.z */
public final class C39962z {

    /* renamed from: a */
    private final BigDecimal f94939a;

    /* renamed from: b */
    private final long f94940b;

    /* renamed from: c */
    private final long f94941c;

    /* renamed from: d */
    private final BigDecimal f94942d;

    /* renamed from: e */
    private final BigDecimal f94943e;

    /* renamed from: f */
    private final BigDecimal f94944f;

    /* renamed from: g */
    private final BigDecimal f94945g;

    /* renamed from: h */
    private final String f94946h;

    /* renamed from: i */
    private final String f94947i;

    /* renamed from: j */
    private final BigDecimal f94948j;

    public C39962z(BigDecimal bigDecimal, long j, long j2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, String str2, BigDecimal bigDecimal6) {
        this.f94939a = bigDecimal;
        this.f94940b = j;
        this.f94941c = j2;
        this.f94942d = bigDecimal2;
        this.f94943e = bigDecimal3;
        this.f94944f = bigDecimal4;
        this.f94945g = bigDecimal5;
        this.f94946h = str;
        this.f94947i = str2;
        this.f94948j = bigDecimal6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39962z)) {
            return false;
        }
        C39962z zVar = (C39962z) obj;
        return C41536l.m120484d(this.f94939a, zVar.f94939a) && this.f94940b == zVar.f94940b && this.f94941c == zVar.f94941c && C41536l.m120484d(this.f94942d, zVar.f94942d) && C41536l.m120484d(this.f94943e, zVar.f94943e) && C41536l.m120484d(this.f94944f, zVar.f94944f) && C41536l.m120484d(this.f94945g, zVar.f94945g) && C41536l.m120484d(this.f94946h, zVar.f94946h) && C41536l.m120484d(this.f94947i, zVar.f94947i) && C41536l.m120484d(this.f94948j, zVar.f94948j);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f94939a;
        int i = 0;
        int hashCode = (((((bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31) + C7397t.m28148a(this.f94940b)) * 31) + C7397t.m28148a(this.f94941c)) * 31;
        BigDecimal bigDecimal2 = this.f94942d;
        int hashCode2 = (hashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f94943e;
        int hashCode3 = (hashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f94944f;
        int hashCode4 = (hashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.f94945g;
        int hashCode5 = (hashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str = this.f94946h;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94947i;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.f94948j;
        if (bigDecimal6 != null) {
            i = bigDecimal6.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f94939a;
        long j = this.f94940b;
        long j2 = this.f94941c;
        BigDecimal bigDecimal2 = this.f94942d;
        BigDecimal bigDecimal3 = this.f94943e;
        BigDecimal bigDecimal4 = this.f94944f;
        BigDecimal bigDecimal5 = this.f94945g;
        String str = this.f94946h;
        String str2 = this.f94947i;
        BigDecimal bigDecimal6 = this.f94948j;
        return "PlnDetails(amount=" + bigDecimal + ", startDate=" + j + ", maturityDate=" + j2 + ", interestRate=" + bigDecimal2 + ", intAmount=" + bigDecimal3 + ", penalty=" + bigDecimal4 + ", initialPrincipal=" + bigDecimal5 + ", acctNo=" + str + ", productDictionaryKey=" + str2 + ", availableAmount=" + bigDecimal6 + ")";
    }
}
