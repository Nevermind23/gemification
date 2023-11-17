package p936wv;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: wv.c */
public final class C29577c {

    /* renamed from: a */
    private final List f74713a;

    /* renamed from: b */
    private final String f74714b;

    /* renamed from: c */
    private final String f74715c;

    /* renamed from: d */
    private final BigDecimal f74716d;

    /* renamed from: e */
    private final BigDecimal f74717e;

    /* renamed from: f */
    private final BigDecimal f74718f;

    /* renamed from: g */
    private final BigDecimal f74719g;

    public C29577c(List list, String str, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
        C41536l.m120489i(list, "budgets");
        C41536l.m120489i(str, "month");
        C41536l.m120489i(str2, "serverDate");
        C41536l.m120489i(bigDecimal, "totalIncome");
        C41536l.m120489i(bigDecimal2, "totalIncomeValue");
        C41536l.m120489i(bigDecimal3, "totalSpend");
        C41536l.m120489i(bigDecimal4, "totalValue");
        this.f74713a = list;
        this.f74714b = str;
        this.f74715c = str2;
        this.f74716d = bigDecimal;
        this.f74717e = bigDecimal2;
        this.f74718f = bigDecimal3;
        this.f74719g = bigDecimal4;
    }

    /* renamed from: a */
    public final List mo69441a() {
        return this.f74713a;
    }

    /* renamed from: b */
    public final String mo69442b() {
        return this.f74714b;
    }

    /* renamed from: c */
    public final String mo69443c() {
        return this.f74715c;
    }

    /* renamed from: d */
    public final BigDecimal mo69444d() {
        return this.f74716d;
    }

    /* renamed from: e */
    public final BigDecimal mo69445e() {
        return this.f74717e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29577c)) {
            return false;
        }
        C29577c cVar = (C29577c) obj;
        return C41536l.m120484d(this.f74713a, cVar.f74713a) && C41536l.m120484d(this.f74714b, cVar.f74714b) && C41536l.m120484d(this.f74715c, cVar.f74715c) && C41536l.m120484d(this.f74716d, cVar.f74716d) && C41536l.m120484d(this.f74717e, cVar.f74717e) && C41536l.m120484d(this.f74718f, cVar.f74718f) && C41536l.m120484d(this.f74719g, cVar.f74719g);
    }

    /* renamed from: f */
    public final BigDecimal mo69447f() {
        return this.f74718f;
    }

    /* renamed from: g */
    public final BigDecimal mo69448g() {
        return this.f74719g;
    }

    public int hashCode() {
        return (((((((((((this.f74713a.hashCode() * 31) + this.f74714b.hashCode()) * 31) + this.f74715c.hashCode()) * 31) + this.f74716d.hashCode()) * 31) + this.f74717e.hashCode()) * 31) + this.f74718f.hashCode()) * 31) + this.f74719g.hashCode();
    }

    public String toString() {
        List list = this.f74713a;
        String str = this.f74714b;
        String str2 = this.f74715c;
        BigDecimal bigDecimal = this.f74716d;
        BigDecimal bigDecimal2 = this.f74717e;
        BigDecimal bigDecimal3 = this.f74718f;
        BigDecimal bigDecimal4 = this.f74719g;
        return "BudgetingDataResponse(budgets=" + list + ", month=" + str + ", serverDate=" + str2 + ", totalIncome=" + bigDecimal + ", totalIncomeValue=" + bigDecimal2 + ", totalSpend=" + bigDecimal3 + ", totalValue=" + bigDecimal4 + ")";
    }
}
