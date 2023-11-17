package r30;

import kotlin.jvm.internal.C41536l;
import r30.C27906g;

/* renamed from: r30.j */
public final class C27914j implements C27906g {

    /* renamed from: a */
    private final C27906g.C27907a f71102a;

    public C27914j(C27906g.C27907a aVar) {
        C41536l.m120489i(aVar, "itemType");
        this.f71102a = aVar;
    }

    /* renamed from: a */
    public C27906g.C27907a mo67429a() {
        return this.f71102a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27914j) && this.f71102a == ((C27914j) obj).f71102a;
    }

    public int hashCode() {
        return this.f71102a.hashCode();
    }

    public String toString() {
        C27906g.C27907a aVar = this.f71102a;
        return "SimplePaymentItem(itemType=" + aVar + ")";
    }
}
