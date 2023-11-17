package p917uy;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: uy.c */
public final class C28953c {

    /* renamed from: a */
    private final long f73900a;

    /* renamed from: b */
    private final int f73901b;

    /* renamed from: c */
    private final List f73902c;

    public C28953c(long j, int i, List list) {
        C41536l.m120489i(list, "tickets");
        this.f73900a = j;
        this.f73901b = i;
        this.f73902c = list;
    }

    /* renamed from: a */
    public final long mo68817a() {
        return this.f73900a;
    }

    /* renamed from: b */
    public final int mo68818b() {
        return this.f73901b;
    }

    /* renamed from: c */
    public final List mo68819c() {
        return this.f73902c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28953c)) {
            return false;
        }
        C28953c cVar = (C28953c) obj;
        return this.f73900a == cVar.f73900a && this.f73901b == cVar.f73901b && C41536l.m120484d(this.f73902c, cVar.f73902c);
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f73900a) * 31) + this.f73901b) * 31) + this.f73902c.hashCode();
    }

    public String toString() {
        long j = this.f73900a;
        int i = this.f73901b;
        List list = this.f73902c;
        return "PrloTicketWrapper(month=" + j + ", ticketCount=" + i + ", tickets=" + list + ")";
    }
}
