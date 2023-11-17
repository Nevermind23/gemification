package j31;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: j31.b */
public final class C36726b {

    /* renamed from: a */
    private final String f88625a;

    /* renamed from: b */
    private final List f88626b;

    public C36726b(String str, List list) {
        C41536l.m120489i(list, "params");
        this.f88625a = str;
        this.f88626b = list;
    }

    /* renamed from: a */
    public final List mo89546a() {
        return this.f88626b;
    }

    /* renamed from: b */
    public final String mo89547b() {
        return this.f88625a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36726b)) {
            return false;
        }
        C36726b bVar = (C36726b) obj;
        return C41536l.m120484d(this.f88625a, bVar.f88625a) && C41536l.m120484d(this.f88626b, bVar.f88626b);
    }

    public int hashCode() {
        String str = this.f88625a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.f88626b.hashCode();
    }

    public String toString() {
        String str = this.f88625a;
        List list = this.f88626b;
        return "UrlData(type=" + str + ", params=" + list + ")";
    }
}
