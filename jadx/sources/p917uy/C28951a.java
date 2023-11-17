package p917uy;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: uy.a */
public final class C28951a {

    /* renamed from: a */
    private final long f73893a;

    /* renamed from: b */
    private final List f73894b;

    public C28951a(long j, List list) {
        C41536l.m120489i(list, "tickets");
        this.f73893a = j;
        this.f73894b = list;
    }

    /* renamed from: a */
    public final long mo68804a() {
        return this.f73893a;
    }

    /* renamed from: b */
    public final List mo68805b() {
        return this.f73894b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28951a)) {
            return false;
        }
        C28951a aVar = (C28951a) obj;
        return this.f73893a == aVar.f73893a && C41536l.m120484d(this.f73894b, aVar.f73894b);
    }

    public int hashCode() {
        return (C7397t.m28148a(this.f73893a) * 31) + this.f73894b.hashCode();
    }

    public String toString() {
        long j = this.f73893a;
        List list = this.f73894b;
        return "BonusPrlo(nextDrawDate=" + j + ", tickets=" + list + ")";
    }
}
