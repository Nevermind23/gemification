package a40;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: a40.a */
public final class C19167a {

    /* renamed from: a */
    private final List f53368a;

    /* renamed from: b */
    private final BigDecimal f53369b;

    public C19167a(List list, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "children");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        this.f53368a = list;
        this.f53369b = bigDecimal;
    }

    /* renamed from: a */
    public final List mo47392a() {
        return this.f53368a;
    }

    /* renamed from: b */
    public final BigDecimal mo47393b() {
        return this.f53369b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19167a)) {
            return false;
        }
        C19167a aVar = (C19167a) obj;
        return C41536l.m120484d(this.f53368a, aVar.f53368a) && C41536l.m120484d(this.f53369b, aVar.f53369b);
    }

    public int hashCode() {
        return (this.f53368a.hashCode() * 31) + this.f53369b.hashCode();
    }

    public String toString() {
        List list = this.f53368a;
        BigDecimal bigDecimal = this.f53369b;
        return "AnalysisIncomeAndExpensesModel(children=" + list + ", value=" + bigDecimal + ")";
    }
}
