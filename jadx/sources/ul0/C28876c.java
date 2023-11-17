package ul0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: ul0.c */
public final class C28876c {

    /* renamed from: a */
    private final List f73710a;

    /* renamed from: b */
    private final String f73711b;

    public C28876c(List list, String str) {
        C41536l.m120489i(list, "currencies");
        C41536l.m120489i(str, "generalLimit");
        this.f73710a = list;
        this.f73711b = str;
    }

    /* renamed from: a */
    public final List mo68611a() {
        return this.f73710a;
    }

    /* renamed from: b */
    public final String mo68612b() {
        return this.f73711b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28876c)) {
            return false;
        }
        C28876c cVar = (C28876c) obj;
        return C41536l.m120484d(this.f73710a, cVar.f73710a) && C41536l.m120484d(this.f73711b, cVar.f73711b);
    }

    public int hashCode() {
        return (this.f73710a.hashCode() * 31) + this.f73711b.hashCode();
    }

    public String toString() {
        List list = this.f73710a;
        String str = this.f73711b;
        return "LimitType(currencies=" + list + ", generalLimit=" + str + ")";
    }
}
