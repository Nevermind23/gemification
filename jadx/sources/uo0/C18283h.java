package uo0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: uo0.h */
public final class C18283h {

    /* renamed from: a */
    private final List f51664a;

    /* renamed from: b */
    private final List f51665b;

    /* renamed from: c */
    private final List f51666c;

    /* renamed from: d */
    private final C18270b f51667d;

    /* renamed from: e */
    private final List f51668e;

    /* renamed from: f */
    private final List f51669f;

    /* renamed from: g */
    private final List f51670g;

    /* renamed from: h */
    private final List f51671h;

    /* renamed from: i */
    private final List f51672i;

    public C18283h(List list, List list2, List list3, C18270b bVar, List list4, List list5, List list6, List list7, List list8) {
        C41536l.m120489i(list, "topOffers");
        C41536l.m120489i(list2, "recommendedOffers");
        C41536l.m120489i(list3, "lastMinuteOffers");
        C41536l.m120489i(bVar, "bnplOffer");
        C41536l.m120489i(list4, "installmentOffers");
        C41536l.m120489i(list5, "allOffersCategories");
        C41536l.m120489i(list6, "topCategories");
        this.f51664a = list;
        this.f51665b = list2;
        this.f51666c = list3;
        this.f51667d = bVar;
        this.f51668e = list4;
        this.f51669f = list5;
        this.f51670g = list6;
        this.f51671h = list7;
        this.f51672i = list8;
    }

    /* renamed from: a */
    public final C18270b mo46003a() {
        return this.f51667d;
    }

    /* renamed from: b */
    public final List mo46004b() {
        return this.f51671h;
    }

    /* renamed from: c */
    public final List mo46005c() {
        return this.f51668e;
    }

    /* renamed from: d */
    public final List mo46006d() {
        return this.f51666c;
    }

    /* renamed from: e */
    public final List mo46007e() {
        return this.f51672i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18283h)) {
            return false;
        }
        C18283h hVar = (C18283h) obj;
        return C41536l.m120484d(this.f51664a, hVar.f51664a) && C41536l.m120484d(this.f51665b, hVar.f51665b) && C41536l.m120484d(this.f51666c, hVar.f51666c) && C41536l.m120484d(this.f51667d, hVar.f51667d) && C41536l.m120484d(this.f51668e, hVar.f51668e) && C41536l.m120484d(this.f51669f, hVar.f51669f) && C41536l.m120484d(this.f51670g, hVar.f51670g) && C41536l.m120484d(this.f51671h, hVar.f51671h) && C41536l.m120484d(this.f51672i, hVar.f51672i);
    }

    /* renamed from: f */
    public final List mo46009f() {
        return this.f51665b;
    }

    /* renamed from: g */
    public final List mo46010g() {
        return this.f51670g;
    }

    /* renamed from: h */
    public final List mo46011h() {
        return this.f51664a;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f51664a.hashCode() * 31) + this.f51665b.hashCode()) * 31) + this.f51666c.hashCode()) * 31) + this.f51667d.hashCode()) * 31) + this.f51668e.hashCode()) * 31) + this.f51669f.hashCode()) * 31) + this.f51670g.hashCode()) * 31;
        List list = this.f51671h;
        int i = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f51672i;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        List list = this.f51664a;
        List list2 = this.f51665b;
        List list3 = this.f51666c;
        C18270b bVar = this.f51667d;
        List list4 = this.f51668e;
        List list5 = this.f51669f;
        List list6 = this.f51670g;
        List list7 = this.f51671h;
        List list8 = this.f51672i;
        return "LifestyleOffersUiModel(topOffers=" + list + ", recommendedOffers=" + list2 + ", lastMinuteOffers=" + list3 + ", bnplOffer=" + bVar + ", installmentOffers=" + list4 + ", allOffersCategories=" + list5 + ", topCategories=" + list6 + ", categories=" + list7 + ", offersProgress=" + list8 + ")";
    }
}
