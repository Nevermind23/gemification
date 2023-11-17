package ao0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ao0.b */
public final class C10121b {

    /* renamed from: a */
    private final List f27990a;

    /* renamed from: b */
    private final List f27991b;

    public C10121b(List list, List list2) {
        C41536l.m120489i(list, "topImages");
        C41536l.m120489i(list2, "bottomImages");
        this.f27990a = list;
        this.f27991b = list2;
    }

    /* renamed from: a */
    public final List mo26584a() {
        return this.f27991b;
    }

    /* renamed from: b */
    public final List mo26585b() {
        return this.f27990a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10121b)) {
            return false;
        }
        C10121b bVar = (C10121b) obj;
        return C41536l.m120484d(this.f27990a, bVar.f27990a) && C41536l.m120484d(this.f27991b, bVar.f27991b);
    }

    public int hashCode() {
        return (this.f27990a.hashCode() * 31) + this.f27991b.hashCode();
    }

    public String toString() {
        List list = this.f27990a;
        List list2 = this.f27991b;
        return "LifestyleBnplModel(topImages=" + list + ", bottomImages=" + list2 + ")";
    }
}
