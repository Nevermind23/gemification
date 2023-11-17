package po0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: po0.a */
public final class C17456a {

    /* renamed from: a */
    private final List f48876a;

    /* renamed from: b */
    private final Integer f48877b;

    public C17456a(List list, Integer num) {
        C41536l.m120489i(list, "types");
        this.f48876a = list;
        this.f48877b = num;
    }

    /* renamed from: a */
    public final Integer mo44963a() {
        return this.f48877b;
    }

    /* renamed from: b */
    public final List mo44964b() {
        return this.f48876a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17456a)) {
            return false;
        }
        C17456a aVar = (C17456a) obj;
        return C41536l.m120484d(this.f48876a, aVar.f48876a) && C41536l.m120484d(this.f48877b, aVar.f48877b);
    }

    public int hashCode() {
        int hashCode = this.f48876a.hashCode() * 31;
        Integer num = this.f48877b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        List list = this.f48876a;
        Integer num = this.f48877b;
        return "BenefitTypes(types=" + list + ", position=" + num + ")";
    }
}
