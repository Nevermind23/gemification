package r71;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: r71.b */
public final class C38296b {

    /* renamed from: a */
    private final List f91804a;

    /* renamed from: b */
    private final Integer f91805b;

    public C38296b(List list, Integer num) {
        C41536l.m120489i(list, "passDevices");
        this.f91804a = list;
        this.f91805b = num;
    }

    /* renamed from: a */
    public final List mo91853a() {
        return this.f91804a;
    }

    /* renamed from: b */
    public final Integer mo91854b() {
        return this.f91805b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38296b)) {
            return false;
        }
        C38296b bVar = (C38296b) obj;
        return C41536l.m120484d(this.f91804a, bVar.f91804a) && C41536l.m120484d(this.f91805b, bVar.f91805b);
    }

    public int hashCode() {
        int hashCode = this.f91804a.hashCode() * 31;
        Integer num = this.f91805b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        List list = this.f91804a;
        Integer num = this.f91805b;
        return "PassDevicesUiState(passDevices=" + list + ", selectedPassDevice=" + num + ")";
    }
}
