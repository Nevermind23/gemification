package ml0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ml0.b */
public final class C26248b {

    /* renamed from: a */
    private final List f66464a;

    /* renamed from: b */
    private final List f66465b;

    public C26248b(List list, List list2) {
        this.f66464a = list;
        this.f66465b = list2;
    }

    /* renamed from: a */
    public final List mo65271a() {
        return this.f66464a;
    }

    /* renamed from: b */
    public final List mo65272b() {
        return this.f66465b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26248b)) {
            return false;
        }
        C26248b bVar = (C26248b) obj;
        return C41536l.m120484d(this.f66464a, bVar.f66464a) && C41536l.m120484d(this.f66465b, bVar.f66465b);
    }

    public int hashCode() {
        List list = this.f66464a;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f66465b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        List list = this.f66464a;
        List list2 = this.f66465b;
        return "InsurancePolicies(policiesTpl=" + list + ", policiesTri=" + list2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26248b(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
