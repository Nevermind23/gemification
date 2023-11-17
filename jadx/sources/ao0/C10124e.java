package ao0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ao0.e */
public final class C10124e {

    /* renamed from: a */
    private final List f28019a;

    /* renamed from: b */
    private final List f28020b;

    public C10124e(List list, List list2) {
        C41536l.m120489i(list, "filteredCategories");
        C41536l.m120489i(list2, "filteredBadges");
        this.f28019a = list;
        this.f28020b = list2;
    }

    /* renamed from: a */
    public final List mo26622a() {
        return this.f28019a;
    }

    /* renamed from: b */
    public final List mo26623b() {
        return this.f28020b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10124e)) {
            return false;
        }
        C10124e eVar = (C10124e) obj;
        return C41536l.m120484d(this.f28019a, eVar.f28019a) && C41536l.m120484d(this.f28020b, eVar.f28020b);
    }

    public int hashCode() {
        return (this.f28019a.hashCode() * 31) + this.f28020b.hashCode();
    }

    public String toString() {
        List list = this.f28019a;
        List list2 = this.f28020b;
        return "LifestyleOfferFilterTypes(filteredCategories=" + list + ", filteredBadges=" + list2 + ")";
    }
}
