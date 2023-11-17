package tr0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: tr0.f */
public final class C38785f {

    /* renamed from: a */
    private final List f92775a;

    /* renamed from: b */
    private final C38786g f92776b;

    public C38785f(List list, C38786g gVar) {
        C41536l.m120489i(list, "repayments");
        C41536l.m120489i(gVar, "summary");
        this.f92775a = list;
        this.f92776b = gVar;
    }

    /* renamed from: a */
    public final List mo92439a() {
        return this.f92775a;
    }

    /* renamed from: b */
    public final C38786g mo92440b() {
        return this.f92776b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38785f)) {
            return false;
        }
        C38785f fVar = (C38785f) obj;
        return C41536l.m120484d(this.f92775a, fVar.f92775a) && C41536l.m120484d(this.f92776b, fVar.f92776b);
    }

    public int hashCode() {
        return (this.f92775a.hashCode() * 31) + this.f92776b.hashCode();
    }

    public String toString() {
        List list = this.f92775a;
        C38786g gVar = this.f92776b;
        return "LoanPlnHistory(repayments=" + list + ", summary=" + gVar + ")";
    }
}
