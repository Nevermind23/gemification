package cx0;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: cx0.b */
public final class C31455b {

    /* renamed from: a */
    private final String f78028a;

    /* renamed from: b */
    private final List f78029b;

    public C31455b(String str, List list) {
        C41536l.m120489i(str, "hashCode");
        C41536l.m120489i(list, "configs");
        this.f78028a = str;
        this.f78029b = list;
    }

    /* renamed from: a */
    public final List mo71845a() {
        return this.f78029b;
    }

    /* renamed from: b */
    public final String mo71846b() {
        return this.f78028a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31455b)) {
            return false;
        }
        C31455b bVar = (C31455b) obj;
        return C41536l.m120484d(this.f78028a, bVar.f78028a) && C41536l.m120484d(this.f78029b, bVar.f78029b);
    }

    public int hashCode() {
        return (this.f78028a.hashCode() * 31) + this.f78029b.hashCode();
    }

    public String toString() {
        String str = this.f78028a;
        List list = this.f78029b;
        return "PaymentConfigData(hashCode=" + str + ", configs=" + list + ")";
    }
}
