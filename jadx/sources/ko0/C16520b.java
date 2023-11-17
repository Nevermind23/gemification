package ko0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOffersFilterResultData;

/* renamed from: ko0.b */
public final class C16520b {

    /* renamed from: a */
    private final List f46669a;

    /* renamed from: b */
    private final List f46670b;

    public C16520b(List list, List list2) {
        C41536l.m120489i(list, "filteredCategories");
        C41536l.m120489i(list2, "filteredBadges");
        this.f46669a = list;
        this.f46670b = list2;
    }

    /* renamed from: a */
    public final void mo43667a() {
        this.f46669a.clear();
        this.f46670b.clear();
    }

    /* renamed from: b */
    public final List mo43668b() {
        return this.f46670b;
    }

    /* renamed from: c */
    public final List mo43669c() {
        return this.f46669a;
    }

    /* renamed from: d */
    public final boolean mo43670d() {
        return (this.f46669a.isEmpty() ^ true) || (this.f46670b.isEmpty() ^ true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16520b)) {
            return false;
        }
        C16520b bVar = (C16520b) obj;
        return C41536l.m120484d(this.f46669a, bVar.f46669a) && C41536l.m120484d(this.f46670b, bVar.f46670b);
    }

    public int hashCode() {
        return (this.f46669a.hashCode() * 31) + this.f46670b.hashCode();
    }

    public String toString() {
        List list = this.f46669a;
        List list2 = this.f46670b;
        StringBuilder sb = new StringBuilder();
        sb.append(list);
        sb.append(list2);
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16520b(LifestyleOffersFilterResultData lifestyleOffersFilterResultData) {
        this(C41358y.m119991B0(lifestyleOffersFilterResultData.mo42068b()), C41358y.m119991B0(lifestyleOffersFilterResultData.mo42067a()));
        C41536l.m120489i(lifestyleOffersFilterResultData, "filterData");
    }
}
