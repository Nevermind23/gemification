package m01;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: m01.d */
public final class C37190d {

    /* renamed from: a */
    private final List f89570a;

    public C37190d(List list) {
        C41536l.m120489i(list, "atmDenominations");
        this.f89570a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37190d) && C41536l.m120484d(this.f89570a, ((C37190d) obj).f89570a);
    }

    public int hashCode() {
        return this.f89570a.hashCode();
    }

    public String toString() {
        List list = this.f89570a;
        return "AtmData(atmDenominations=" + list + ")";
    }
}
