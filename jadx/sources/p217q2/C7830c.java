package p217q2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: q2.c */
public final class C7830c {

    /* renamed from: a */
    private final String f22747a;

    /* renamed from: b */
    private final List f22748b;

    /* renamed from: c */
    private final Map f22749c;

    /* renamed from: q2.c$a */
    public static final class C7831a {

        /* renamed from: a */
        private final long f22750a;

        /* renamed from: b */
        private final long f22751b;

        public C7831a(long j, long j2) {
            this.f22750a = j;
            this.f22751b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7831a)) {
                return false;
            }
            C7831a aVar = (C7831a) obj;
            if (this.f22750a == aVar.f22750a && this.f22751b == aVar.f22751b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (C7397t.m28148a(this.f22750a) * 31) + C7397t.m28148a(this.f22751b);
        }
    }

    public C7830c(String str, List list, Map map) {
        C41536l.m120490j(str, "message");
        C41536l.m120490j(list, "locations");
        C41536l.m120490j(map, "customAttributes");
        this.f22747a = str;
        this.f22748b = list;
        this.f22749c = map;
    }

    /* renamed from: a */
    public final Map mo22755a() {
        return this.f22749c;
    }

    /* renamed from: b */
    public final String mo22756b() {
        return this.f22747a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7830c)) {
            return false;
        }
        C7830c cVar = (C7830c) obj;
        if (!(!C41536l.m120484d(this.f22747a, cVar.f22747a)) && !(!C41536l.m120484d(this.f22748b, cVar.f22748b)) && !(!C41536l.m120484d(this.f22749c, cVar.f22749c))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22747a.hashCode() * 31) + this.f22748b.hashCode()) * 31) + this.f22749c.hashCode();
    }
}
