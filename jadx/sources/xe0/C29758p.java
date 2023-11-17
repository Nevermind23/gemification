package xe0;

import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: xe0.p */
public final class C29758p {

    /* renamed from: a */
    private final Date f75263a;

    /* renamed from: b */
    private final BigDecimal f75264b;

    /* renamed from: c */
    private final BigDecimal f75265c;

    /* renamed from: d */
    private final BigDecimal f75266d;

    /* renamed from: e */
    private final BigDecimal f75267e;

    /* renamed from: f */
    private final long f75268f;

    public C29758p(Date date, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, long j) {
        C41536l.m120489i(date, "date");
        C41536l.m120489i(bigDecimal, "open");
        C41536l.m120489i(bigDecimal2, "high");
        C41536l.m120489i(bigDecimal3, "low");
        C41536l.m120489i(bigDecimal4, "close");
        this.f75263a = date;
        this.f75264b = bigDecimal;
        this.f75265c = bigDecimal2;
        this.f75266d = bigDecimal3;
        this.f75267e = bigDecimal4;
        this.f75268f = j;
    }

    /* renamed from: a */
    public final BigDecimal mo69872a() {
        return this.f75267e;
    }

    /* renamed from: b */
    public final Date mo69873b() {
        return this.f75263a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29758p)) {
            return false;
        }
        C29758p pVar = (C29758p) obj;
        return C41536l.m120484d(this.f75263a, pVar.f75263a) && C41536l.m120484d(this.f75264b, pVar.f75264b) && C41536l.m120484d(this.f75265c, pVar.f75265c) && C41536l.m120484d(this.f75266d, pVar.f75266d) && C41536l.m120484d(this.f75267e, pVar.f75267e) && this.f75268f == pVar.f75268f;
    }

    public int hashCode() {
        return (((((((((this.f75263a.hashCode() * 31) + this.f75264b.hashCode()) * 31) + this.f75265c.hashCode()) * 31) + this.f75266d.hashCode()) * 31) + this.f75267e.hashCode()) * 31) + C7397t.m28148a(this.f75268f);
    }

    public String toString() {
        Date date = this.f75263a;
        BigDecimal bigDecimal = this.f75264b;
        BigDecimal bigDecimal2 = this.f75265c;
        BigDecimal bigDecimal3 = this.f75266d;
        BigDecimal bigDecimal4 = this.f75267e;
        long j = this.f75268f;
        return "SymbolHistoryDataItem(date=" + date + ", open=" + bigDecimal + ", high=" + bigDecimal2 + ", low=" + bigDecimal3 + ", close=" + bigDecimal4 + ", volume=" + j + ")";
    }
}
