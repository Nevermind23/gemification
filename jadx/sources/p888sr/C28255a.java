package p888sr;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: sr.a */
public final class C28255a {

    /* renamed from: a */
    private final C28256b f71709a;

    /* renamed from: b */
    private final List f71710b;

    public C28255a(C28256b bVar, List list) {
        C41536l.m120489i(bVar, "decision");
        C41536l.m120489i(list, "cards");
        this.f71709a = bVar;
        this.f71710b = list;
    }

    /* renamed from: a */
    public final List mo67813a() {
        return this.f71710b;
    }

    /* renamed from: b */
    public final C28256b mo67814b() {
        return this.f71709a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28255a)) {
            return false;
        }
        C28255a aVar = (C28255a) obj;
        return C41536l.m120484d(this.f71709a, aVar.f71709a) && C41536l.m120484d(this.f71710b, aVar.f71710b);
    }

    public int hashCode() {
        return (this.f71709a.hashCode() * 31) + this.f71710b.hashCode();
    }

    public String toString() {
        C28256b bVar = this.f71709a;
        List list = this.f71710b;
        return "LimitLoanDecisionUiData(decision=" + bVar + ", cards=" + list + ")";
    }
}
