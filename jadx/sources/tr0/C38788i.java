package tr0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: tr0.i */
public final class C38788i {

    /* renamed from: a */
    private final List f92792a;

    /* renamed from: b */
    private final C38792m f92793b;

    public C38788i(List list, C38792m mVar) {
        C41536l.m120489i(list, "schedule");
        this.f92792a = list;
        this.f92793b = mVar;
    }

    /* renamed from: a */
    public final List mo92456a() {
        return this.f92792a;
    }

    /* renamed from: b */
    public final C38792m mo92457b() {
        return this.f92793b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38788i)) {
            return false;
        }
        C38788i iVar = (C38788i) obj;
        return C41536l.m120484d(this.f92792a, iVar.f92792a) && C41536l.m120484d(this.f92793b, iVar.f92793b);
    }

    public int hashCode() {
        int hashCode = this.f92792a.hashCode() * 31;
        C38792m mVar = this.f92793b;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public String toString() {
        List list = this.f92792a;
        C38792m mVar = this.f92793b;
        return "LoanSchedules(schedule=" + list + ", summary=" + mVar + ")";
    }
}
