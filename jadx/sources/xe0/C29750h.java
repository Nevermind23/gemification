package xe0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.h */
public final class C29750h {

    /* renamed from: a */
    private final BigDecimal f75210a;

    /* renamed from: b */
    private final String f75211b;

    /* renamed from: c */
    private final BigDecimal f75212c;

    public C29750h(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2) {
        C41536l.m120489i(bigDecimal, "mktPrice");
        C41536l.m120489i(str, "currency");
        C41536l.m120489i(bigDecimal2, "profitPercentage");
        this.f75210a = bigDecimal;
        this.f75211b = str;
        this.f75212c = bigDecimal2;
    }

    /* renamed from: a */
    public final String mo69795a() {
        return this.f75211b;
    }

    /* renamed from: b */
    public final BigDecimal mo69796b() {
        return this.f75210a;
    }

    /* renamed from: c */
    public final BigDecimal mo69797c() {
        return this.f75212c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29750h)) {
            return false;
        }
        C29750h hVar = (C29750h) obj;
        return C41536l.m120484d(this.f75210a, hVar.f75210a) && C41536l.m120484d(this.f75211b, hVar.f75211b) && C41536l.m120484d(this.f75212c, hVar.f75212c);
    }

    public int hashCode() {
        return (((this.f75210a.hashCode() * 31) + this.f75211b.hashCode()) * 31) + this.f75212c.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f75210a;
        String str = this.f75211b;
        BigDecimal bigDecimal2 = this.f75212c;
        return "MinimizedOnlineData(mktPrice=" + bigDecimal + ", currency=" + str + ", profitPercentage=" + bigDecimal2 + ")";
    }
}
