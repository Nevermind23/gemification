package p913uu;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: uu.b */
public final class C28936b {

    /* renamed from: a */
    private final BigDecimal f73792a;

    /* renamed from: b */
    private final String f73793b;

    /* renamed from: c */
    private final BigDecimal f73794c;

    /* renamed from: d */
    private final BigDecimal f73795d;

    public C28936b(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        C41536l.m120489i(bigDecimal, "cardLimit");
        C41536l.m120489i(str, "cardCcy");
        this.f73792a = bigDecimal;
        this.f73793b = str;
        this.f73794c = bigDecimal2;
        this.f73795d = bigDecimal3;
    }

    /* renamed from: a */
    public final String mo68693a() {
        return this.f73793b;
    }

    /* renamed from: b */
    public final BigDecimal mo68694b() {
        return this.f73792a;
    }

    /* renamed from: c */
    public final BigDecimal mo68695c() {
        return this.f73794c;
    }

    /* renamed from: d */
    public final BigDecimal mo68696d() {
        return this.f73795d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28936b)) {
            return false;
        }
        C28936b bVar = (C28936b) obj;
        return C41536l.m120484d(this.f73792a, bVar.f73792a) && C41536l.m120484d(this.f73793b, bVar.f73793b) && C41536l.m120484d(this.f73794c, bVar.f73794c) && C41536l.m120484d(this.f73795d, bVar.f73795d);
    }

    public int hashCode() {
        int hashCode = ((this.f73792a.hashCode() * 31) + this.f73793b.hashCode()) * 31;
        BigDecimal bigDecimal = this.f73794c;
        int i = 0;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f73795d;
        if (bigDecimal2 != null) {
            i = bigDecimal2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f73792a;
        String str = this.f73793b;
        BigDecimal bigDecimal2 = this.f73794c;
        BigDecimal bigDecimal3 = this.f73795d;
        return "CheckLimitDecisionDetails(cardLimit=" + bigDecimal + ", cardCcy=" + str + ", disbursementAmount=" + bigDecimal2 + ", disbursementAmount2=" + bigDecimal3 + ")";
    }
}
