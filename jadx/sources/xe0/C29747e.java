package xe0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.e */
public final class C29747e {

    /* renamed from: a */
    private final double f75192a;

    /* renamed from: b */
    private final BigDecimal f75193b;

    /* renamed from: c */
    private final BigDecimal f75194c;

    /* renamed from: d */
    private final BigDecimal f75195d;

    public C29747e(double d, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        C41536l.m120489i(bigDecimal, "avgPrice");
        C41536l.m120489i(bigDecimal2, "unrealizedPL");
        C41536l.m120489i(bigDecimal3, "marketValue");
        this.f75192a = d;
        this.f75193b = bigDecimal;
        this.f75194c = bigDecimal2;
        this.f75195d = bigDecimal3;
    }

    /* renamed from: a */
    public final BigDecimal mo69776a() {
        return this.f75193b;
    }

    /* renamed from: b */
    public final BigDecimal mo69777b() {
        return this.f75195d;
    }

    /* renamed from: c */
    public final double mo69778c() {
        return this.f75192a;
    }

    /* renamed from: d */
    public final BigDecimal mo69779d() {
        return this.f75194c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29747e)) {
            return false;
        }
        C29747e eVar = (C29747e) obj;
        return Double.compare(this.f75192a, eVar.f75192a) == 0 && C41536l.m120484d(this.f75193b, eVar.f75193b) && C41536l.m120484d(this.f75194c, eVar.f75194c) && C41536l.m120484d(this.f75195d, eVar.f75195d);
    }

    public int hashCode() {
        return (((((Double.doubleToLongBits(this.f75192a) * 31) + this.f75193b.hashCode()) * 31) + this.f75194c.hashCode()) * 31) + this.f75195d.hashCode();
    }

    public String toString() {
        double d = this.f75192a;
        BigDecimal bigDecimal = this.f75193b;
        BigDecimal bigDecimal2 = this.f75194c;
        BigDecimal bigDecimal3 = this.f75195d;
        return "ClientPosition(openQty=" + d + ", avgPrice=" + bigDecimal + ", unrealizedPL=" + bigDecimal2 + ", marketValue=" + bigDecimal3 + ")";
    }
}
