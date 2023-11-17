package bc0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import ny0.C37500b;
import oy0.C37837c;

/* renamed from: bc0.a */
public final class C19369a {

    /* renamed from: a */
    private final C37837c f53599a;

    /* renamed from: b */
    private final List f53600b;

    /* renamed from: c */
    private final C37500b f53601c;

    public C19369a(C37837c cVar, List list, C37500b bVar) {
        C41536l.m120489i(cVar, "info");
        C41536l.m120489i(list, "selectorAccounts");
        C41536l.m120489i(bVar, "deposit");
        this.f53599a = cVar;
        this.f53600b = list;
        this.f53601c = bVar;
    }

    /* renamed from: a */
    public final C37500b mo47574a() {
        return this.f53601c;
    }

    /* renamed from: b */
    public final C37837c mo47575b() {
        return this.f53599a;
    }

    /* renamed from: c */
    public final List mo47576c() {
        return this.f53600b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19369a)) {
            return false;
        }
        C19369a aVar = (C19369a) obj;
        return C41536l.m120484d(this.f53599a, aVar.f53599a) && C41536l.m120484d(this.f53600b, aVar.f53600b) && C41536l.m120484d(this.f53601c, aVar.f53601c);
    }

    public int hashCode() {
        return (((this.f53599a.hashCode() * 31) + this.f53600b.hashCode()) * 31) + this.f53601c.hashCode();
    }

    public String toString() {
        C37837c cVar = this.f53599a;
        List list = this.f53600b;
        C37500b bVar = this.f53601c;
        return "DepositBreakResources(info=" + cVar + ", selectorAccounts=" + list + ", deposit=" + bVar + ")";
    }
}
