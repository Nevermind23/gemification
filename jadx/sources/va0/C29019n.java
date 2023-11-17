package va0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: va0.n */
public final class C29019n {

    /* renamed from: a */
    private final String f73980a;

    /* renamed from: b */
    private final BigDecimal f73981b;

    /* renamed from: c */
    private final String f73982c;

    /* renamed from: d */
    private final String f73983d;

    public C29019n(String str, BigDecimal bigDecimal, String str2, String str3) {
        C41536l.m120489i(str, "textKey");
        C41536l.m120489i(bigDecimal, "amount");
        C41536l.m120489i(str2, "currency");
        C41536l.m120489i(str3, "term");
        this.f73980a = str;
        this.f73981b = bigDecimal;
        this.f73982c = str2;
        this.f73983d = str3;
    }

    /* renamed from: a */
    public final BigDecimal mo68864a() {
        return this.f73981b;
    }

    /* renamed from: b */
    public final String mo68865b() {
        return this.f73982c;
    }

    /* renamed from: c */
    public final String mo68866c() {
        return this.f73983d;
    }

    /* renamed from: d */
    public final String mo68867d() {
        return this.f73980a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29019n)) {
            return false;
        }
        C29019n nVar = (C29019n) obj;
        return C41536l.m120484d(this.f73980a, nVar.f73980a) && C41536l.m120484d(this.f73981b, nVar.f73981b) && C41536l.m120484d(this.f73982c, nVar.f73982c) && C41536l.m120484d(this.f73983d, nVar.f73983d);
    }

    public int hashCode() {
        return (((((this.f73980a.hashCode() * 31) + this.f73981b.hashCode()) * 31) + this.f73982c.hashCode()) * 31) + this.f73983d.hashCode();
    }

    public String toString() {
        String str = this.f73980a;
        BigDecimal bigDecimal = this.f73981b;
        String str2 = this.f73982c;
        String str3 = this.f73983d;
        return "InlineFeedbackModel(textKey=" + str + ", amount=" + bigDecimal + ", currency=" + str2 + ", term=" + str3 + ")";
    }
}
