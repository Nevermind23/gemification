package p831mu;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: mu.b */
public final class C26300b {

    /* renamed from: a */
    private final String f66644a;

    /* renamed from: b */
    private final BigDecimal f66645b;

    /* renamed from: c */
    private final String f66646c;

    /* renamed from: d */
    private final int f66647d;

    /* renamed from: e */
    private final String f66648e;

    public C26300b(String str, BigDecimal bigDecimal, String str2, int i, String str3) {
        C41536l.m120489i(str, "productGroup");
        C41536l.m120489i(bigDecimal, "amountSum");
        C41536l.m120489i(str2, "ccy");
        C41536l.m120489i(str3, "nameDictionaryKey");
        this.f66644a = str;
        this.f66645b = bigDecimal;
        this.f66646c = str2;
        this.f66647d = i;
        this.f66648e = str3;
    }

    /* renamed from: a */
    public final BigDecimal mo65449a() {
        return this.f66645b;
    }

    /* renamed from: b */
    public final String mo65450b() {
        return this.f66646c;
    }

    /* renamed from: c */
    public final int mo65451c() {
        return this.f66647d;
    }

    /* renamed from: d */
    public final String mo65452d() {
        return this.f66648e;
    }

    /* renamed from: e */
    public final String mo65453e() {
        return this.f66644a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26300b)) {
            return false;
        }
        C26300b bVar = (C26300b) obj;
        return C41536l.m120484d(this.f66644a, bVar.f66644a) && C41536l.m120484d(this.f66645b, bVar.f66645b) && C41536l.m120484d(this.f66646c, bVar.f66646c) && this.f66647d == bVar.f66647d && C41536l.m120484d(this.f66648e, bVar.f66648e);
    }

    public int hashCode() {
        return (((((((this.f66644a.hashCode() * 31) + this.f66645b.hashCode()) * 31) + this.f66646c.hashCode()) * 31) + this.f66647d) * 31) + this.f66648e.hashCode();
    }

    public String toString() {
        String str = this.f66644a;
        BigDecimal bigDecimal = this.f66645b;
        String str2 = this.f66646c;
        int i = this.f66647d;
        String str3 = this.f66648e;
        return "UpcomingPaymentSummary(productGroup=" + str + ", amountSum=" + bigDecimal + ", ccy=" + str2 + ", count=" + i + ", nameDictionaryKey=" + str3 + ")";
    }
}
