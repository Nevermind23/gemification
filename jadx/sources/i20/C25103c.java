package i20;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: i20.c */
public final class C25103c {

    /* renamed from: a */
    private final List f64466a;

    /* renamed from: b */
    private final List f64467b;

    /* renamed from: c */
    private final List f64468c;

    /* renamed from: d */
    private final List f64469d;

    /* renamed from: e */
    private final boolean f64470e;

    /* renamed from: f */
    private final boolean f64471f;

    public C25103c(List list, List list2, List list3, List list4, boolean z, boolean z2) {
        C41536l.m120489i(list, "points");
        C41536l.m120489i(list2, "assets");
        C41536l.m120489i(list3, "liabilities");
        C41536l.m120489i(list4, "availableAmounts");
        this.f64466a = list;
        this.f64467b = list2;
        this.f64468c = list3;
        this.f64469d = list4;
        this.f64470e = z;
        this.f64471f = z2;
    }

    /* renamed from: b */
    public static /* synthetic */ C25103c m80075b(C25103c cVar, List list, List list2, List list3, List list4, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cVar.f64466a;
        }
        if ((i & 2) != 0) {
            list2 = cVar.f64467b;
        }
        List list5 = list2;
        if ((i & 4) != 0) {
            list3 = cVar.f64468c;
        }
        List list6 = list3;
        if ((i & 8) != 0) {
            list4 = cVar.f64469d;
        }
        List list7 = list4;
        if ((i & 16) != 0) {
            z = cVar.f64470e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = cVar.f64471f;
        }
        return cVar.mo63552a(list, list5, list6, list7, z3, z2);
    }

    /* renamed from: a */
    public final C25103c mo63552a(List list, List list2, List list3, List list4, boolean z, boolean z2) {
        C41536l.m120489i(list, "points");
        C41536l.m120489i(list2, "assets");
        C41536l.m120489i(list3, "liabilities");
        C41536l.m120489i(list4, "availableAmounts");
        return new C25103c(list, list2, list3, list4, z, z2);
    }

    /* renamed from: c */
    public final List mo63553c() {
        return this.f64467b;
    }

    /* renamed from: d */
    public final List mo63554d() {
        return this.f64468c;
    }

    /* renamed from: e */
    public final List mo63555e() {
        return this.f64466a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25103c)) {
            return false;
        }
        C25103c cVar = (C25103c) obj;
        return C41536l.m120484d(this.f64466a, cVar.f64466a) && C41536l.m120484d(this.f64467b, cVar.f64467b) && C41536l.m120484d(this.f64468c, cVar.f64468c) && C41536l.m120484d(this.f64469d, cVar.f64469d) && this.f64470e == cVar.f64470e && this.f64471f == cVar.f64471f;
    }

    /* renamed from: f */
    public final boolean mo63557f() {
        return this.f64470e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f64466a.hashCode() * 31) + this.f64467b.hashCode()) * 31) + this.f64468c.hashCode()) * 31) + this.f64469d.hashCode()) * 31;
        boolean z = this.f64470e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f64471f;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        List list = this.f64466a;
        List list2 = this.f64467b;
        List list3 = this.f64468c;
        List list4 = this.f64469d;
        boolean z = this.f64470e;
        boolean z2 = this.f64471f;
        return "AssetLiabilityUIModel(points=" + list + ", assets=" + list2 + ", liabilities=" + list3 + ", availableAmounts=" + list4 + ", isHidden=" + z + ", hasExpireSoonDeposits=" + z2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25103c(List list, List list2, List list3, List list4, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, z, (i & 32) != 0 ? false : z2);
    }
}
