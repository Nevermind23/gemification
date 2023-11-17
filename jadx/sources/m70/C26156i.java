package m70;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: m70.i */
public final class C26156i {

    /* renamed from: a */
    private final C26155h f66354a;

    /* renamed from: b */
    private final List f66355b;

    /* renamed from: c */
    private final List f66356c;

    public C26156i(C26155h hVar, List list, List list2) {
        C41536l.m120489i(hVar, "accounts");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "overdraftParams");
        this.f66354a = hVar;
        this.f66355b = list;
        this.f66356c = list2;
    }

    /* renamed from: a */
    public final C26155h mo65188a() {
        return this.f66354a;
    }

    /* renamed from: b */
    public final List mo65189b() {
        return this.f66355b;
    }

    /* renamed from: c */
    public final List mo65190c() {
        return this.f66356c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26156i)) {
            return false;
        }
        C26156i iVar = (C26156i) obj;
        return C41536l.m120484d(this.f66354a, iVar.f66354a) && C41536l.m120484d(this.f66355b, iVar.f66355b) && C41536l.m120484d(this.f66356c, iVar.f66356c);
    }

    public int hashCode() {
        return (((this.f66354a.hashCode() * 31) + this.f66355b.hashCode()) * 31) + this.f66356c.hashCode();
    }

    public String toString() {
        C26155h hVar = this.f66354a;
        List list = this.f66355b;
        List list2 = this.f66356c;
        return "AccountsAndDetailsModel(accounts=" + hVar + ", details=" + list + ", overdraftParams=" + list2 + ")";
    }
}
