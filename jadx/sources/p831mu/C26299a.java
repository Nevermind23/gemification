package p831mu;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: mu.a */
public final class C26299a {

    /* renamed from: a */
    private final List f66642a;

    /* renamed from: b */
    private final List f66643b;

    public C26299a(List list, List list2) {
        C41536l.m120489i(list, "summaryEntity");
        C41536l.m120489i(list2, "calendarData");
        this.f66642a = list;
        this.f66643b = list2;
    }

    /* renamed from: a */
    public final List mo65444a() {
        return this.f66643b;
    }

    /* renamed from: b */
    public final List mo65445b() {
        return this.f66642a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26299a)) {
            return false;
        }
        C26299a aVar = (C26299a) obj;
        return C41536l.m120484d(this.f66642a, aVar.f66642a) && C41536l.m120484d(this.f66643b, aVar.f66643b);
    }

    public int hashCode() {
        return (this.f66642a.hashCode() * 31) + this.f66643b.hashCode();
    }

    public String toString() {
        List list = this.f66642a;
        List list2 = this.f66643b;
        return "UpcomingPaymentData(summaryEntity=" + list + ", calendarData=" + list2 + ")";
    }
}
