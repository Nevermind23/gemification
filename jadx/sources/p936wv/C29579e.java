package p936wv;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: wv.e */
public final class C29579e {

    /* renamed from: a */
    private final List f74724a;

    /* renamed from: b */
    private final C29581g f74725b;

    /* renamed from: c */
    private final List f74726c;

    public C29579e(List list, C29581g gVar, List list2) {
        C41536l.m120489i(list, "monthsExpenses");
        C41536l.m120489i(gVar, "budgetingResponse");
        C41536l.m120489i(list2, "transactionCategories");
        this.f74724a = list;
        this.f74725b = gVar;
        this.f74726c = list2;
    }

    /* renamed from: a */
    public final C29581g mo69458a() {
        return this.f74725b;
    }

    /* renamed from: b */
    public final List mo69459b() {
        return this.f74724a;
    }

    /* renamed from: c */
    public final List mo69460c() {
        return this.f74726c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29579e)) {
            return false;
        }
        C29579e eVar = (C29579e) obj;
        return C41536l.m120484d(this.f74724a, eVar.f74724a) && C41536l.m120484d(this.f74725b, eVar.f74725b) && C41536l.m120484d(this.f74726c, eVar.f74726c);
    }

    public int hashCode() {
        return (((this.f74724a.hashCode() * 31) + this.f74725b.hashCode()) * 31) + this.f74726c.hashCode();
    }

    public String toString() {
        List list = this.f74724a;
        C29581g gVar = this.f74725b;
        List list2 = this.f74726c;
        return "BudgetingHistoryInfo(monthsExpenses=" + list + ", budgetingResponse=" + gVar + ", transactionCategories=" + list2 + ")";
    }
}
