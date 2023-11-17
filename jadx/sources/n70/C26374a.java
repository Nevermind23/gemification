package n70;

import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: n70.a */
public final class C26374a {

    /* renamed from: a */
    private final String f66807a;

    /* renamed from: b */
    private final List f66808b;

    public C26374a(String str, List list) {
        C41536l.m120489i(str, "result");
        C41536l.m120489i(list, "warnings");
        this.f66807a = str;
        this.f66808b = list;
    }

    /* renamed from: a */
    public final String mo65578a() {
        return this.f66807a;
    }

    /* renamed from: b */
    public final List mo65579b() {
        return this.f66808b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26374a)) {
            return false;
        }
        C26374a aVar = (C26374a) obj;
        return C41536l.m120484d(this.f66807a, aVar.f66807a) && C41536l.m120484d(this.f66808b, aVar.f66808b);
    }

    public int hashCode() {
        return (this.f66807a.hashCode() * 31) + this.f66808b.hashCode();
    }

    public String toString() {
        String str = this.f66807a;
        List list = this.f66808b;
        return "DeactivationAccount(result=" + str + ", warnings=" + list + ")";
    }
}
