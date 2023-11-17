package i40;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: i40.c */
public final class C25117c {

    /* renamed from: a */
    private final List f64555a;

    /* renamed from: b */
    private final String f64556b;

    /* renamed from: c */
    private final String f64557c;

    /* renamed from: d */
    private final BigDecimal f64558d;

    /* renamed from: e */
    private final BigDecimal f64559e;

    /* renamed from: f */
    private final BigDecimal f64560f;

    /* renamed from: g */
    private final BigDecimal f64561g;

    public C25117c(List list, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        C41536l.m120489i(list, "budgets");
        C41536l.m120489i(str, "month");
        C41536l.m120489i(str2, "serverDate");
        C41536l.m120489i(bigDecimal, "totalIncome");
        C41536l.m120489i(bigDecimal2, "totalIncomeValue");
        C41536l.m120489i(bigDecimal3, "totalSpend");
        C41536l.m120489i(bigDecimal4, "totalValue");
        this.f64555a = list;
        this.f64556b = str;
        this.f64557c = str2;
        this.f64558d = bigDecimal;
        this.f64559e = bigDecimal2;
        this.f64560f = bigDecimal3;
        this.f64561g = bigDecimal4;
    }

    /* renamed from: a */
    public final List mo63652a() {
        return this.f64555a;
    }

    /* renamed from: b */
    public final String mo63653b() {
        return this.f64556b;
    }

    /* renamed from: c */
    public final BigDecimal mo63654c() {
        return this.f64560f;
    }

    /* renamed from: d */
    public final BigDecimal mo63655d() {
        return this.f64561g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25117c)) {
            return false;
        }
        C25117c cVar = (C25117c) obj;
        return C41536l.m120484d(this.f64555a, cVar.f64555a) && C41536l.m120484d(this.f64556b, cVar.f64556b) && C41536l.m120484d(this.f64557c, cVar.f64557c) && C41536l.m120484d(this.f64558d, cVar.f64558d) && C41536l.m120484d(this.f64559e, cVar.f64559e) && C41536l.m120484d(this.f64560f, cVar.f64560f) && C41536l.m120484d(this.f64561g, cVar.f64561g);
    }

    public int hashCode() {
        return (((((((((((this.f64555a.hashCode() * 31) + this.f64556b.hashCode()) * 31) + this.f64557c.hashCode()) * 31) + this.f64558d.hashCode()) * 31) + this.f64559e.hashCode()) * 31) + this.f64560f.hashCode()) * 31) + this.f64561g.hashCode();
    }

    public String toString() {
        List list = this.f64555a;
        String str = this.f64556b;
        String str2 = this.f64557c;
        BigDecimal bigDecimal = this.f64558d;
        BigDecimal bigDecimal2 = this.f64559e;
        BigDecimal bigDecimal3 = this.f64560f;
        BigDecimal bigDecimal4 = this.f64561g;
        return "BudgetingDataResponseModel(budgets=" + list + ", month=" + str + ", serverDate=" + str2 + ", totalIncome=" + bigDecimal + ", totalIncomeValue=" + bigDecimal2 + ", totalSpend=" + bigDecimal3 + ", totalValue=" + bigDecimal4 + ")";
    }
}
