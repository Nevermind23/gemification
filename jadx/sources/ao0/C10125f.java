package ao0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ao0.f */
public final class C10125f {

    /* renamed from: a */
    private final List f28021a;

    /* renamed from: b */
    private final List f28022b;

    /* renamed from: c */
    private final List f28023c;

    /* renamed from: d */
    private final List f28024d;

    /* renamed from: e */
    private final List f28025e;

    public C10125f(List list, List list2, List list3, List list4, List list5) {
        C41536l.m120489i(list, "topOffers");
        C41536l.m120489i(list2, "recommendedOffers");
        C41536l.m120489i(list3, "lastMinuteOffers");
        C41536l.m120489i(list4, "allOffersCategories");
        C41536l.m120489i(list5, "topCategories");
        this.f28021a = list;
        this.f28022b = list2;
        this.f28023c = list3;
        this.f28024d = list4;
        this.f28025e = list5;
    }

    /* renamed from: a */
    public final List mo26627a() {
        return this.f28024d;
    }

    /* renamed from: b */
    public final List mo26628b() {
        return this.f28023c;
    }

    /* renamed from: c */
    public final List mo26629c() {
        return this.f28022b;
    }

    /* renamed from: d */
    public final List mo26630d() {
        return this.f28025e;
    }

    /* renamed from: e */
    public final List mo26631e() {
        return this.f28021a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10125f)) {
            return false;
        }
        C10125f fVar = (C10125f) obj;
        return C41536l.m120484d(this.f28021a, fVar.f28021a) && C41536l.m120484d(this.f28022b, fVar.f28022b) && C41536l.m120484d(this.f28023c, fVar.f28023c) && C41536l.m120484d(this.f28024d, fVar.f28024d) && C41536l.m120484d(this.f28025e, fVar.f28025e);
    }

    public int hashCode() {
        return (((((((this.f28021a.hashCode() * 31) + this.f28022b.hashCode()) * 31) + this.f28023c.hashCode()) * 31) + this.f28024d.hashCode()) * 31) + this.f28025e.hashCode();
    }

    public String toString() {
        List list = this.f28021a;
        List list2 = this.f28022b;
        List list3 = this.f28023c;
        List list4 = this.f28024d;
        List list5 = this.f28025e;
        return "LifestyleOffers(topOffers=" + list + ", recommendedOffers=" + list2 + ", lastMinuteOffers=" + list3 + ", allOffersCategories=" + list4 + ", topCategories=" + list5 + ")";
    }
}
