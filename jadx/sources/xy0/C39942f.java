package xy0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.f */
public final class C39942f {

    /* renamed from: a */
    private final C39947k f94784a;

    /* renamed from: b */
    private final List f94785b;

    public C39942f(C39947k kVar, List list) {
        C41536l.m120489i(kVar, "summary");
        this.f94784a = kVar;
        this.f94785b = list;
    }

    /* renamed from: a */
    public final List mo93700a() {
        return this.f94785b;
    }

    /* renamed from: b */
    public final C39947k mo93701b() {
        return this.f94784a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39942f)) {
            return false;
        }
        C39942f fVar = (C39942f) obj;
        return C41536l.m120484d(this.f94784a, fVar.f94784a) && C41536l.m120484d(this.f94785b, fVar.f94785b);
    }

    public int hashCode() {
        int hashCode = this.f94784a.hashCode() * 31;
        List list = this.f94785b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        C39947k kVar = this.f94784a;
        List list = this.f94785b;
        return "CardsContainer(summary=" + kVar + ", accounts=" + list + ")";
    }
}
