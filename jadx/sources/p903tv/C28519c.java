package p903tv;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: tv.c */
public final class C28519c {

    /* renamed from: a */
    private final List f72336a;

    /* renamed from: b */
    private final BigDecimal f72337b;

    public C28519c(List list, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "children");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        this.f72336a = list;
        this.f72337b = bigDecimal;
    }

    /* renamed from: b */
    public static /* synthetic */ C28519c m87358b(C28519c cVar, List list, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cVar.f72336a;
        }
        if ((i & 2) != 0) {
            bigDecimal = cVar.f72337b;
        }
        return cVar.mo68128a(list, bigDecimal);
    }

    /* renamed from: a */
    public final C28519c mo68128a(List list, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "children");
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        return new C28519c(list, bigDecimal);
    }

    /* renamed from: c */
    public final List mo68129c() {
        return this.f72336a;
    }

    /* renamed from: d */
    public final BigDecimal mo68130d() {
        return this.f72337b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28519c)) {
            return false;
        }
        C28519c cVar = (C28519c) obj;
        return C41536l.m120484d(this.f72336a, cVar.f72336a) && C41536l.m120484d(this.f72337b, cVar.f72337b);
    }

    public int hashCode() {
        return (this.f72336a.hashCode() * 31) + this.f72337b.hashCode();
    }

    public String toString() {
        List list = this.f72336a;
        BigDecimal bigDecimal = this.f72337b;
        return "AnalysisIncomeAndExpenses(children=" + list + ", value=" + bigDecimal + ")";
    }
}
