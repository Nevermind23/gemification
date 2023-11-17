package p565pm;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: pm.a */
public final class C17386a {

    /* renamed from: a */
    private final List f48779a;

    /* renamed from: b */
    private final List f48780b;

    public C17386a(List list, List list2) {
        C41536l.m120489i(list, "regTypes");
        C41536l.m120489i(list2, "numbers");
        this.f48779a = list;
        this.f48780b = list2;
    }

    /* renamed from: a */
    public final List mo44894a() {
        return this.f48780b;
    }

    /* renamed from: b */
    public final List mo44895b() {
        return this.f48779a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17386a)) {
            return false;
        }
        C17386a aVar = (C17386a) obj;
        return C41536l.m120484d(this.f48779a, aVar.f48779a) && C41536l.m120484d(this.f48780b, aVar.f48780b);
    }

    public int hashCode() {
        return (this.f48779a.hashCode() * 31) + this.f48780b.hashCode();
    }

    public String toString() {
        List list = this.f48779a;
        List list2 = this.f48780b;
        return "InstantCardActivationResources(regTypes=" + list + ", numbers=" + list2 + ")";
    }
}
