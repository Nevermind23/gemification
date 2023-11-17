package p606sl;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: sl.r */
public final class C17852r {

    /* renamed from: a */
    private final BigDecimal f50865a;

    /* renamed from: b */
    private final Long f50866b;

    /* renamed from: c */
    private final Long f50867c;

    /* renamed from: d */
    private final BigDecimal f50868d;

    /* renamed from: e */
    private final BigDecimal f50869e;

    /* renamed from: f */
    private final BigDecimal f50870f;

    /* renamed from: g */
    private final BigDecimal f50871g;

    /* renamed from: h */
    private final String f50872h;

    /* renamed from: i */
    private final String f50873i;

    /* renamed from: j */
    private final BigDecimal f50874j;

    public C17852r(BigDecimal bigDecimal, Long l, Long l2, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, String str, String str2, BigDecimal bigDecimal6) {
        this.f50865a = bigDecimal;
        this.f50866b = l;
        this.f50867c = l2;
        this.f50868d = bigDecimal2;
        this.f50869e = bigDecimal3;
        this.f50870f = bigDecimal4;
        this.f50871g = bigDecimal5;
        this.f50872h = str;
        this.f50873i = str2;
        this.f50874j = bigDecimal6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17852r)) {
            return false;
        }
        C17852r rVar = (C17852r) obj;
        return C41536l.m120484d(this.f50865a, rVar.f50865a) && C41536l.m120484d(this.f50866b, rVar.f50866b) && C41536l.m120484d(this.f50867c, rVar.f50867c) && C41536l.m120484d(this.f50868d, rVar.f50868d) && C41536l.m120484d(this.f50869e, rVar.f50869e) && C41536l.m120484d(this.f50870f, rVar.f50870f) && C41536l.m120484d(this.f50871g, rVar.f50871g) && C41536l.m120484d(this.f50872h, rVar.f50872h) && C41536l.m120484d(this.f50873i, rVar.f50873i) && C41536l.m120484d(this.f50874j, rVar.f50874j);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f50865a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Long l = this.f50866b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f50867c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f50868d;
        int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f50869e;
        int hashCode5 = (hashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f50870f;
        int hashCode6 = (hashCode5 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.f50871g;
        int hashCode7 = (hashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str = this.f50872h;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50873i;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.f50874j;
        if (bigDecimal6 != null) {
            i = bigDecimal6.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f50865a;
        Long l = this.f50866b;
        Long l2 = this.f50867c;
        BigDecimal bigDecimal2 = this.f50868d;
        BigDecimal bigDecimal3 = this.f50869e;
        BigDecimal bigDecimal4 = this.f50870f;
        BigDecimal bigDecimal5 = this.f50871g;
        String str = this.f50872h;
        String str2 = this.f50873i;
        BigDecimal bigDecimal6 = this.f50874j;
        return "PlnDetails(amount=" + bigDecimal + ", startDate=" + l + ", maturityDate=" + l2 + ", interestRate=" + bigDecimal2 + ", intAmount=" + bigDecimal3 + ", penalty=" + bigDecimal4 + ", initialPrincipal=" + bigDecimal5 + ", acctNo=" + str + ", productDictionaryKey=" + str2 + ", availableAmount=" + bigDecimal6 + ")";
    }
}
