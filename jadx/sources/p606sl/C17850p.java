package p606sl;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: sl.p */
public final class C17850p {

    /* renamed from: a */
    private final List f50855a;

    /* renamed from: b */
    private final List f50856b;

    public C17850p(List list, List list2) {
        C41536l.m120489i(list, "schedules");
        C41536l.m120489i(list2, "repayments");
        this.f50855a = list;
        this.f50856b = list2;
    }

    /* renamed from: a */
    public final List mo45533a() {
        return this.f50856b;
    }

    /* renamed from: b */
    public final List mo45534b() {
        return this.f50855a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17850p)) {
            return false;
        }
        C17850p pVar = (C17850p) obj;
        return C41536l.m120484d(this.f50855a, pVar.f50855a) && C41536l.m120484d(this.f50856b, pVar.f50856b);
    }

    public int hashCode() {
        return (this.f50855a.hashCode() * 31) + this.f50856b.hashCode();
    }

    public String toString() {
        List list = this.f50855a;
        List list2 = this.f50856b;
        return "BnplScheduleHistory(schedules=" + list + ", repayments=" + list2 + ")";
    }
}
