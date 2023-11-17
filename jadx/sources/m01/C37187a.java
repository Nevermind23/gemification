package m01;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: m01.a */
public final class C37187a {

    /* renamed from: a */
    private final List f89560a;

    public C37187a(List list) {
        C41536l.m120489i(list, "details");
        this.f89560a = list;
    }

    /* renamed from: a */
    public final List mo90206a() {
        return this.f89560a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37187a) && C41536l.m120484d(this.f89560a, ((C37187a) obj).f89560a);
    }

    public int hashCode() {
        return this.f89560a.hashCode();
    }

    public String toString() {
        List list = this.f89560a;
        return "AccountData(details=" + list + ")";
    }
}
