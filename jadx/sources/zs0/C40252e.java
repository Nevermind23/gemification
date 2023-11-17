package zs0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: zs0.e */
public final class C40252e {

    /* renamed from: a */
    private final List f95658a;

    /* renamed from: b */
    private final List f95659b;

    public C40252e(List list, List list2) {
        C41536l.m120489i(list, "summary");
        C41536l.m120489i(list2, "clientServices");
        this.f95658a = list;
        this.f95659b = list2;
    }

    /* renamed from: a */
    public final List mo94232a() {
        return this.f95659b;
    }

    /* renamed from: b */
    public final List mo94233b() {
        return this.f95658a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40252e)) {
            return false;
        }
        C40252e eVar = (C40252e) obj;
        return C41536l.m120484d(this.f95658a, eVar.f95658a) && C41536l.m120484d(this.f95659b, eVar.f95659b);
    }

    public int hashCode() {
        return (this.f95658a.hashCode() * 31) + this.f95659b.hashCode();
    }

    public String toString() {
        List list = this.f95658a;
        List list2 = this.f95659b;
        return "CasServiceInfo(summary=" + list + ", clientServices=" + list2 + ")";
    }
}
