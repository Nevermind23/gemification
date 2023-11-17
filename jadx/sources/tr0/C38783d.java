package tr0;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: tr0.d */
public final class C38783d {

    /* renamed from: a */
    private final BigDecimal f92764a;

    /* renamed from: b */
    private final String f92765b;

    /* renamed from: c */
    private final List f92766c;

    /* renamed from: d */
    private final List f92767d;

    public C38783d(BigDecimal bigDecimal, String str, List list, List list2) {
        C41536l.m120489i(bigDecimal, "fullAmount");
        C41536l.m120489i(str, "loanCCY");
        C41536l.m120489i(list, "loanParamsList");
        this.f92764a = bigDecimal;
        this.f92765b = str;
        this.f92766c = list;
        this.f92767d = list2;
    }

    /* renamed from: b */
    public static /* synthetic */ C38783d m113519b(C38783d dVar, BigDecimal bigDecimal, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = dVar.f92764a;
        }
        if ((i & 2) != 0) {
            str = dVar.f92765b;
        }
        if ((i & 4) != 0) {
            list = dVar.f92766c;
        }
        if ((i & 8) != 0) {
            list2 = dVar.f92767d;
        }
        return dVar.mo92424a(bigDecimal, str, list, list2);
    }

    /* renamed from: a */
    public final C38783d mo92424a(BigDecimal bigDecimal, String str, List list, List list2) {
        C41536l.m120489i(bigDecimal, "fullAmount");
        C41536l.m120489i(str, "loanCCY");
        C41536l.m120489i(list, "loanParamsList");
        return new C38783d(bigDecimal, str, list, list2);
    }

    /* renamed from: c */
    public final BigDecimal mo92425c() {
        return this.f92764a;
    }

    /* renamed from: d */
    public final String mo92426d() {
        return this.f92765b;
    }

    /* renamed from: e */
    public final List mo92427e() {
        return this.f92766c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38783d)) {
            return false;
        }
        C38783d dVar = (C38783d) obj;
        return C41536l.m120484d(this.f92764a, dVar.f92764a) && C41536l.m120484d(this.f92765b, dVar.f92765b) && C41536l.m120484d(this.f92766c, dVar.f92766c) && C41536l.m120484d(this.f92767d, dVar.f92767d);
    }

    /* renamed from: f */
    public final List mo92429f() {
        return this.f92767d;
    }

    public int hashCode() {
        int hashCode = ((((this.f92764a.hashCode() * 31) + this.f92765b.hashCode()) * 31) + this.f92766c.hashCode()) * 31;
        List list = this.f92767d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        BigDecimal bigDecimal = this.f92764a;
        String str = this.f92765b;
        List list = this.f92766c;
        List list2 = this.f92767d;
        return "LoanPayment(fullAmount=" + bigDecimal + ", loanCCY=" + str + ", loanParamsList=" + list + ", offeredPlanTypes=" + list2 + ")";
    }
}
