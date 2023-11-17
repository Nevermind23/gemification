package m70;

import hd0.C24977a;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: m70.h */
public final class C26155h {

    /* renamed from: a */
    private final C24977a f66351a;

    /* renamed from: b */
    private final List f66352b;

    /* renamed from: c */
    private final List f66353c;

    public C26155h(C24977a aVar, List list, List list2) {
        C41536l.m120489i(aVar, "summary");
        C41536l.m120489i(list, "accounts");
        C41536l.m120489i(list2, "subAccountRealAmountSums");
        this.f66351a = aVar;
        this.f66352b = list;
        this.f66353c = list2;
    }

    /* renamed from: a */
    public final List mo65182a() {
        return this.f66352b;
    }

    /* renamed from: b */
    public final List mo65183b() {
        return this.f66353c;
    }

    /* renamed from: c */
    public final C24977a mo65184c() {
        return this.f66351a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26155h)) {
            return false;
        }
        C26155h hVar = (C26155h) obj;
        return C41536l.m120484d(this.f66351a, hVar.f66351a) && C41536l.m120484d(this.f66352b, hVar.f66352b) && C41536l.m120484d(this.f66353c, hVar.f66353c);
    }

    public int hashCode() {
        return (((this.f66351a.hashCode() * 31) + this.f66352b.hashCode()) * 31) + this.f66353c.hashCode();
    }

    public String toString() {
        C24977a aVar = this.f66351a;
        List list = this.f66352b;
        List list2 = this.f66353c;
        return "AccountsAccounts(summary=" + aVar + ", accounts=" + list + ", subAccountRealAmountSums=" + list2 + ")";
    }
}
