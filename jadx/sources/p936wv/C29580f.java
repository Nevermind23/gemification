package p936wv;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: wv.f */
public final class C29580f {

    /* renamed from: a */
    private final List f74727a;

    /* renamed from: b */
    private final String f74728b;

    /* renamed from: c */
    private final long f74729c;

    /* renamed from: d */
    private final BigDecimal f74730d;

    public C29580f(List list, String str, long j, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "expenses");
        C41536l.m120489i(str, "month");
        C41536l.m120489i(bigDecimal, "totalAmount");
        this.f74727a = list;
        this.f74728b = str;
        this.f74729c = j;
        this.f74730d = bigDecimal;
    }

    /* renamed from: a */
    public final List mo69464a() {
        return this.f74727a;
    }

    /* renamed from: b */
    public final String mo69465b() {
        return this.f74728b;
    }

    /* renamed from: c */
    public final BigDecimal mo69466c() {
        return this.f74730d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29580f)) {
            return false;
        }
        C29580f fVar = (C29580f) obj;
        return C41536l.m120484d(this.f74727a, fVar.f74727a) && C41536l.m120484d(this.f74728b, fVar.f74728b) && this.f74729c == fVar.f74729c && C41536l.m120484d(this.f74730d, fVar.f74730d);
    }

    public int hashCode() {
        return (((((this.f74727a.hashCode() * 31) + this.f74728b.hashCode()) * 31) + C7397t.m28148a(this.f74729c)) * 31) + this.f74730d.hashCode();
    }

    public String toString() {
        List list = this.f74727a;
        String str = this.f74728b;
        long j = this.f74729c;
        BigDecimal bigDecimal = this.f74730d;
        return "BudgetingMonthExpenses(expenses=" + list + ", month=" + str + ", totalNumber=" + j + ", totalAmount=" + bigDecimal + ")";
    }
}
