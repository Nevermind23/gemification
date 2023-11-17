package hu0;

import gu0.C36080b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: hu0.c */
public final class C36222c {

    /* renamed from: a */
    private final C36080b f87411a;

    /* renamed from: b */
    private final List f87412b;

    /* renamed from: c */
    private final List f87413c;

    public C36222c(C36080b bVar, List list, List list2) {
        C41536l.m120489i(bVar, "statusDetailsUiModel");
        C41536l.m120489i(list, "statusBenefitsUiModel");
        C41536l.m120489i(list2, "starsGuideUiModel");
        this.f87411a = bVar;
        this.f87412b = list;
        this.f87413c = list2;
    }

    /* renamed from: a */
    public final List mo88965a() {
        return this.f87413c;
    }

    /* renamed from: b */
    public final List mo88966b() {
        return this.f87412b;
    }

    /* renamed from: c */
    public final C36080b mo88967c() {
        return this.f87411a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36222c)) {
            return false;
        }
        C36222c cVar = (C36222c) obj;
        return C41536l.m120484d(this.f87411a, cVar.f87411a) && C41536l.m120484d(this.f87412b, cVar.f87412b) && C41536l.m120484d(this.f87413c, cVar.f87413c);
    }

    public int hashCode() {
        return (((this.f87411a.hashCode() * 31) + this.f87412b.hashCode()) * 31) + this.f87413c.hashCode();
    }

    public String toString() {
        C36080b bVar = this.f87411a;
        List list = this.f87412b;
        List list2 = this.f87413c;
        return "StatusPageModel(statusDetailsUiModel=" + bVar + ", statusBenefitsUiModel=" + list + ", starsGuideUiModel=" + list2 + ")";
    }
}
