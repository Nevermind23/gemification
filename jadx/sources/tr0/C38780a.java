package tr0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: tr0.a */
public final class C38780a {

    /* renamed from: a */
    private final List f92725a;

    /* renamed from: b */
    private final C38782c f92726b;

    public C38780a(List list, C38782c cVar) {
        C41536l.m120489i(list, "repayments");
        this.f92725a = list;
        this.f92726b = cVar;
    }

    /* renamed from: a */
    public final List mo92401a() {
        return this.f92725a;
    }

    /* renamed from: b */
    public final C38782c mo92402b() {
        return this.f92726b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38780a)) {
            return false;
        }
        C38780a aVar = (C38780a) obj;
        return C41536l.m120484d(this.f92725a, aVar.f92725a) && C41536l.m120484d(this.f92726b, aVar.f92726b);
    }

    public int hashCode() {
        int hashCode = this.f92725a.hashCode() * 31;
        C38782c cVar = this.f92726b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        List list = this.f92725a;
        C38782c cVar = this.f92726b;
        return "LoanHistory(repayments=" + list + ", summary=" + cVar + ")";
    }
}
