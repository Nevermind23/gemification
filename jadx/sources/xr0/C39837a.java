package xr0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xr0.a */
public final class C39837a {

    /* renamed from: a */
    private final BigDecimal f94554a;

    /* renamed from: b */
    private final String f94555b;

    /* renamed from: c */
    private final List f94556c;

    public C39837a(BigDecimal bigDecimal, String str, List list) {
        C41536l.m120489i(bigDecimal, "prevPaymentAmount");
        C41536l.m120489i(str, "currency");
        C41536l.m120489i(list, "details");
        this.f94554a = bigDecimal;
        this.f94555b = str;
        this.f94556c = list;
    }

    /* renamed from: a */
    public final String mo93535a() {
        return this.f94555b;
    }

    /* renamed from: b */
    public final List mo93536b() {
        return this.f94556c;
    }

    /* renamed from: c */
    public final BigDecimal mo93537c() {
        return this.f94554a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39837a)) {
            return false;
        }
        C39837a aVar = (C39837a) obj;
        return C41536l.m120484d(this.f94554a, aVar.f94554a) && C41536l.m120484d(this.f94555b, aVar.f94555b) && C41536l.m120484d(this.f94556c, aVar.f94556c);
    }

    public int hashCode() {
        return (((this.f94554a.hashCode() * 31) + this.f94555b.hashCode()) * 31) + this.f94556c.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f94554a;
        String str = this.f94555b;
        List list = this.f94556c;
        return "HistoryUiModel(prevPaymentAmount=" + bigDecimal + ", currency=" + str + ", details=" + list + ")";
    }
}
