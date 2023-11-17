package p551om;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: om.a */
public final class C17265a {

    /* renamed from: a */
    private final String f48541a;

    /* renamed from: b */
    private final List f48542b;

    /* renamed from: c */
    private final long f48543c;

    public C17265a(String str, List list, long j) {
        C41536l.m120489i(str, "cityName");
        C41536l.m120489i(list, "districts");
        this.f48541a = str;
        this.f48542b = list;
        this.f48543c = j;
    }

    /* renamed from: a */
    public final String mo44653a() {
        return this.f48541a;
    }

    /* renamed from: b */
    public final List mo44654b() {
        return this.f48542b;
    }

    /* renamed from: c */
    public final long mo44655c() {
        return this.f48543c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17265a)) {
            return false;
        }
        C17265a aVar = (C17265a) obj;
        return C41536l.m120484d(this.f48541a, aVar.f48541a) && C41536l.m120484d(this.f48542b, aVar.f48542b) && this.f48543c == aVar.f48543c;
    }

    public int hashCode() {
        return (((this.f48541a.hashCode() * 31) + this.f48542b.hashCode()) * 31) + C7397t.m28148a(this.f48543c);
    }

    public String toString() {
        String str = this.f48541a;
        List list = this.f48542b;
        long j = this.f48543c;
        return "DebitCardDeliveryCity(cityName=" + str + ", districts=" + list + ", id=" + j + ")";
    }
}
