package xy0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: xy0.e */
public final class C39941e {

    /* renamed from: a */
    private final C39939c f94781a;

    /* renamed from: b */
    private final List f94782b;

    /* renamed from: c */
    private final List f94783c;

    public C39941e(C39939c cVar, List list, List list2) {
        C41536l.m120489i(cVar, "clientInfo");
        C41536l.m120489i(list, "bonds");
        C41536l.m120489i(list2, "cashAgreements");
        this.f94781a = cVar;
        this.f94782b = list;
        this.f94783c = list2;
    }

    /* renamed from: a */
    public final List mo93694a() {
        return this.f94782b;
    }

    /* renamed from: b */
    public final List mo93695b() {
        return this.f94783c;
    }

    /* renamed from: c */
    public final C39939c mo93696c() {
        return this.f94781a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39941e)) {
            return false;
        }
        C39941e eVar = (C39941e) obj;
        return C41536l.m120484d(this.f94781a, eVar.f94781a) && C41536l.m120484d(this.f94782b, eVar.f94782b) && C41536l.m120484d(this.f94783c, eVar.f94783c);
    }

    public int hashCode() {
        return (((this.f94781a.hashCode() * 31) + this.f94782b.hashCode()) * 31) + this.f94783c.hashCode();
    }

    public String toString() {
        C39939c cVar = this.f94781a;
        List list = this.f94782b;
        List list2 = this.f94783c;
        return "BondsWrapper(clientInfo=" + cVar + ", bonds=" + list + ", cashAgreements=" + list2 + ")";
    }
}
