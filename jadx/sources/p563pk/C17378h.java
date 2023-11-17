package p563pk;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: pk.h */
public final class C17378h {

    /* renamed from: a */
    private final List f48755a;

    /* renamed from: b */
    private final List f48756b;

    public C17378h(List list, List list2) {
        C41536l.m120489i(list, "currencies");
        C41536l.m120489i(list2, "paymentPeriods");
        this.f48755a = list;
        this.f48756b = list2;
    }

    /* renamed from: a */
    public final List mo44862a() {
        return this.f48755a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17378h)) {
            return false;
        }
        C17378h hVar = (C17378h) obj;
        return C41536l.m120484d(this.f48755a, hVar.f48755a) && C41536l.m120484d(this.f48756b, hVar.f48756b);
    }

    public int hashCode() {
        return (this.f48755a.hashCode() * 31) + this.f48756b.hashCode();
    }

    public String toString() {
        List list = this.f48755a;
        List list2 = this.f48756b;
        return "LimitType(currencies=" + list + ", paymentPeriods=" + list2 + ")";
    }
}
