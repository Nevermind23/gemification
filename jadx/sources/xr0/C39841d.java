package xr0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xr0.d */
public final class C39841d {

    /* renamed from: a */
    private final BigDecimal f94573a;

    /* renamed from: b */
    private final String f94574b;

    /* renamed from: c */
    private final List f94575c;

    public C39841d(BigDecimal bigDecimal, String str, List list) {
        C41536l.m120489i(bigDecimal, "nextPaymentAmount");
        C41536l.m120489i(str, "currency");
        C41536l.m120489i(list, "details");
        this.f94573a = bigDecimal;
        this.f94574b = str;
        this.f94575c = list;
    }

    /* renamed from: a */
    public final String mo93549a() {
        return this.f94574b;
    }

    /* renamed from: b */
    public final List mo93550b() {
        return this.f94575c;
    }

    /* renamed from: c */
    public final BigDecimal mo93551c() {
        return this.f94573a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39841d)) {
            return false;
        }
        C39841d dVar = (C39841d) obj;
        return C41536l.m120484d(this.f94573a, dVar.f94573a) && C41536l.m120484d(this.f94574b, dVar.f94574b) && C41536l.m120484d(this.f94575c, dVar.f94575c);
    }

    public int hashCode() {
        return (((this.f94573a.hashCode() * 31) + this.f94574b.hashCode()) * 31) + this.f94575c.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f94573a;
        String str = this.f94574b;
        List list = this.f94575c;
        return "ScheduleUiModel(nextPaymentAmount=" + bigDecimal + ", currency=" + str + ", details=" + list + ")";
    }
}
