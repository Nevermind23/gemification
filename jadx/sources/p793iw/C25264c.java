package p793iw;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: iw.c */
public final class C25264c {

    /* renamed from: a */
    private final BigDecimal f64903a;

    /* renamed from: b */
    private final BigDecimal f64904b;

    /* renamed from: c */
    private final List f64905c;

    public C25264c(BigDecimal bigDecimal, BigDecimal bigDecimal2, List list) {
        C41536l.m120489i(list, "myOperations");
        this.f64903a = bigDecimal;
        this.f64904b = bigDecimal2;
        this.f64905c = list;
    }

    /* renamed from: b */
    public static /* synthetic */ C25264c m80433b(C25264c cVar, BigDecimal bigDecimal, BigDecimal bigDecimal2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = cVar.f64903a;
        }
        if ((i & 2) != 0) {
            bigDecimal2 = cVar.f64904b;
        }
        if ((i & 4) != 0) {
            list = cVar.f64905c;
        }
        return cVar.mo63844a(bigDecimal, bigDecimal2, list);
    }

    /* renamed from: a */
    public final C25264c mo63844a(BigDecimal bigDecimal, BigDecimal bigDecimal2, List list) {
        C41536l.m120489i(list, "myOperations");
        return new C25264c(bigDecimal, bigDecimal2, list);
    }

    /* renamed from: c */
    public final BigDecimal mo63845c() {
        return this.f64904b;
    }

    /* renamed from: d */
    public final List mo63846d() {
        return this.f64905c;
    }

    /* renamed from: e */
    public final BigDecimal mo63847e() {
        return this.f64903a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25264c)) {
            return false;
        }
        C25264c cVar = (C25264c) obj;
        return C41536l.m120484d(this.f64903a, cVar.f64903a) && C41536l.m120484d(this.f64904b, cVar.f64904b) && C41536l.m120484d(this.f64905c, cVar.f64905c);
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.f64903a;
        int i = 0;
        int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f64904b;
        if (bigDecimal2 != null) {
            i = bigDecimal2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f64905c.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.f64903a;
        BigDecimal bigDecimal2 = this.f64904b;
        List list = this.f64905c;
        return "Transactions(outcomeSum=" + bigDecimal + ", incomeSum=" + bigDecimal2 + ", myOperations=" + list + ")";
    }
}
