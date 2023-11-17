package p828mr;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: mr.d */
public final class C26260d {

    /* renamed from: a */
    private final C26259c f66556a;

    /* renamed from: b */
    private final List f66557b;

    public C26260d(C26259c cVar, List list) {
        C41536l.m120489i(cVar, "decision");
        C41536l.m120489i(list, "cards");
        this.f66556a = cVar;
        this.f66557b = list;
    }

    /* renamed from: a */
    public final List mo65382a() {
        return this.f66557b;
    }

    /* renamed from: b */
    public final C26259c mo65383b() {
        return this.f66556a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26260d)) {
            return false;
        }
        C26260d dVar = (C26260d) obj;
        return C41536l.m120484d(this.f66556a, dVar.f66556a) && C41536l.m120484d(this.f66557b, dVar.f66557b);
    }

    public int hashCode() {
        return (this.f66556a.hashCode() * 31) + this.f66557b.hashCode();
    }

    public String toString() {
        C26259c cVar = this.f66556a;
        List list = this.f66557b;
        return "LimitLoanDecisionData(decision=" + cVar + ", cards=" + list + ")";
    }
}
