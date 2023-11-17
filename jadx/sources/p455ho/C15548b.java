package p455ho;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ho.b */
public final class C15548b {

    /* renamed from: a */
    private final List f44141a;

    public C15548b(List list) {
        C41536l.m120489i(list, "applicationFields");
        this.f44141a = list;
    }

    /* renamed from: a */
    public final List mo42721a() {
        return this.f44141a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15548b) && C41536l.m120484d(this.f44141a, ((C15548b) obj).f44141a);
    }

    public int hashCode() {
        return this.f44141a.hashCode();
    }

    public String toString() {
        List list = this.f44141a;
        return "ApplicationFields(applicationFields=" + list + ")";
    }
}
