package r51;

import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: r51.a */
public final class C38285a {

    /* renamed from: a */
    private final Set f91791a;

    /* renamed from: b */
    private final Set f91792b;

    public C38285a(Set set, Set set2) {
        C41536l.m120489i(set, "accounts");
        C41536l.m120489i(set2, "cards");
        this.f91791a = set;
        this.f91792b = set2;
    }

    /* renamed from: a */
    public final Set mo91833a() {
        return this.f91791a;
    }

    /* renamed from: b */
    public final Set mo91834b() {
        return this.f91792b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38285a)) {
            return false;
        }
        C38285a aVar = (C38285a) obj;
        return C41536l.m120484d(this.f91791a, aVar.f91791a) && C41536l.m120484d(this.f91792b, aVar.f91792b);
    }

    public int hashCode() {
        return (this.f91791a.hashCode() * 31) + this.f91792b.hashCode();
    }

    public String toString() {
        Set set = this.f91791a;
        Set set2 = this.f91792b;
        return "AccountsAndCardsModel(accounts=" + set + ", cards=" + set2 + ")";
    }
}
