package df1;

import kotlin.jvm.internal.C41536l;

/* renamed from: df1.k */
public final class C40663k {

    /* renamed from: a */
    private final Object f96296a;

    /* renamed from: b */
    private final long f96297b;

    /* renamed from: a */
    public final Object mo94660a() {
        return this.f96296a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40663k)) {
            return false;
        }
        C40663k kVar = (C40663k) obj;
        return C41536l.m120484d(this.f96296a, kVar.f96296a) && C40651b.m117479g(this.f96297b, kVar.f96297b);
    }

    public int hashCode() {
        Object obj = this.f96296a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + C40651b.m117492x(this.f96297b);
    }

    public String toString() {
        return "TimedValue(value=" + this.f96296a + ", duration=" + C40651b.m117472G(this.f96297b) + ')';
    }
}
