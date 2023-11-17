package p554op;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: op.d */
public final class C17304d {

    /* renamed from: a */
    private final List f48613a;

    /* renamed from: b */
    private final boolean f48614b;

    public C17304d(List list, boolean z) {
        C41536l.m120489i(list, "benefits");
        this.f48613a = list;
        this.f48614b = z;
    }

    /* renamed from: a */
    public final List mo44716a() {
        return this.f48613a;
    }

    /* renamed from: b */
    public final boolean mo44717b() {
        return this.f48614b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17304d)) {
            return false;
        }
        C17304d dVar = (C17304d) obj;
        return C41536l.m120484d(this.f48613a, dVar.f48613a) && this.f48614b == dVar.f48614b;
    }

    public int hashCode() {
        int hashCode = this.f48613a.hashCode() * 31;
        boolean z = this.f48614b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        List list = this.f48613a;
        boolean z = this.f48614b;
        return "PackageBenefitViewTypeData(benefits=" + list + ", isBecomeSoloEntitle=" + z + ")";
    }
}
