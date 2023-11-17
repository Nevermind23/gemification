package p688ym;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import p674xm.C18781a;

/* renamed from: ym.b */
public final class C18957b {

    /* renamed from: a */
    private final List f52960a;

    /* renamed from: b */
    private final C18781a f52961b;

    /* renamed from: c */
    private final Set f52962c;

    public C18957b(List list, C18781a aVar, Set set) {
        C41536l.m120489i(list, "addresses");
        C41536l.m120489i(aVar, "step");
        C41536l.m120489i(set, "selectedAddresses");
        this.f52960a = list;
        this.f52961b = aVar;
        this.f52962c = set;
    }

    /* renamed from: a */
    public final List mo47008a() {
        return this.f52960a;
    }

    /* renamed from: b */
    public final Set mo47009b() {
        return this.f52962c;
    }

    /* renamed from: c */
    public final C18781a mo47010c() {
        return this.f52961b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18957b)) {
            return false;
        }
        C18957b bVar = (C18957b) obj;
        return C41536l.m120484d(this.f52960a, bVar.f52960a) && this.f52961b == bVar.f52961b && C41536l.m120484d(this.f52962c, bVar.f52962c);
    }

    public int hashCode() {
        return (((this.f52960a.hashCode() * 31) + this.f52961b.hashCode()) * 31) + this.f52962c.hashCode();
    }

    public String toString() {
        List list = this.f52960a;
        C18781a aVar = this.f52961b;
        Set set = this.f52962c;
        return "InstantAddressData(addresses=" + list + ", step=" + aVar + ", selectedAddresses=" + set + ")";
    }
}
