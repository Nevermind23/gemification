package az0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: az0.a */
public final class C31103a {

    /* renamed from: a */
    private final List f77307a;

    /* renamed from: b */
    private final List f77308b;

    public C31103a(List list, List list2) {
        C41536l.m120489i(list, "searchedNbos");
        C41536l.m120489i(list2, "searchedCategories");
        this.f77307a = list;
        this.f77308b = list2;
    }

    /* renamed from: a */
    public final List mo71301a() {
        return this.f77308b;
    }

    /* renamed from: b */
    public final List mo71302b() {
        return this.f77307a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31103a)) {
            return false;
        }
        C31103a aVar = (C31103a) obj;
        return C41536l.m120484d(this.f77307a, aVar.f77307a) && C41536l.m120484d(this.f77308b, aVar.f77308b);
    }

    public int hashCode() {
        return (this.f77307a.hashCode() * 31) + this.f77308b.hashCode();
    }

    public String toString() {
        List list = this.f77307a;
        List list2 = this.f77308b;
        return "SearchedItems(searchedNbos=" + list + ", searchedCategories=" + list2 + ")";
    }
}
