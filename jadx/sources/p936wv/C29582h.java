package p936wv;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: wv.h */
public final class C29582h {

    /* renamed from: a */
    private final List f74733a;

    /* renamed from: b */
    private final List f74734b;

    public C29582h(List list, List list2) {
        C41536l.m120489i(list, "updatedBudgets");
        C41536l.m120489i(list2, "createdBudgets");
        this.f74733a = list;
        this.f74734b = list2;
    }

    /* renamed from: a */
    public final List mo69474a() {
        return this.f74734b;
    }

    /* renamed from: b */
    public final List mo69475b() {
        return this.f74733a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29582h)) {
            return false;
        }
        C29582h hVar = (C29582h) obj;
        return C41536l.m120484d(this.f74733a, hVar.f74733a) && C41536l.m120484d(this.f74734b, hVar.f74734b);
    }

    public int hashCode() {
        return (this.f74733a.hashCode() * 31) + this.f74734b.hashCode();
    }

    public String toString() {
        List list = this.f74733a;
        List list2 = this.f74734b;
        return "EditBudgetsResponse(updatedBudgets=" + list + ", createdBudgets=" + list2 + ")";
    }
}
