package u00;

import i20.C25111h;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: u00.b */
public final class C28534b {

    /* renamed from: a */
    private final List f72432a;

    /* renamed from: b */
    private final List f72433b;

    public C28534b(List list, List list2) {
        C41536l.m120489i(list, "summaries");
        C41536l.m120489i(list2, "calendarData");
        this.f72432a = list;
        this.f72433b = list2;
    }

    /* renamed from: a */
    public final List mo68254a(boolean z) {
        ArrayList arrayList;
        if (z) {
            List list = this.f72433b;
            arrayList = new ArrayList();
            for (Object next : list) {
                if (C41536l.m120484d(((C25111h) next).mo63620f(), "FEE")) {
                    arrayList.add(next);
                }
            }
        } else {
            List list2 = this.f72433b;
            arrayList = new ArrayList();
            for (Object next2 : list2) {
                if (!C41536l.m120484d(((C25111h) next2).mo63620f(), "FEE")) {
                    arrayList.add(next2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List mo68255b() {
        return this.f72432a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28534b)) {
            return false;
        }
        C28534b bVar = (C28534b) obj;
        return C41536l.m120484d(this.f72432a, bVar.f72432a) && C41536l.m120484d(this.f72433b, bVar.f72433b);
    }

    public int hashCode() {
        return (this.f72432a.hashCode() * 31) + this.f72433b.hashCode();
    }

    public String toString() {
        List list = this.f72432a;
        List list2 = this.f72433b;
        return "UpcomingPaymentDataUIModel(summaries=" + list + ", calendarData=" + list2 + ")";
    }
}
