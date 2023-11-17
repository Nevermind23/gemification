package cx0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: cx0.c */
public final class C31456c {

    /* renamed from: a */
    private final C31453a f78030a;

    /* renamed from: b */
    private final C31456c f78031b;

    /* renamed from: c */
    private final Map f78032c = new LinkedHashMap();

    public C31456c(C31453a aVar, C31456c cVar) {
        C41536l.m120489i(aVar, "data");
        this.f78030a = aVar;
        this.f78031b = cVar;
    }

    /* renamed from: a */
    public final void mo71850a(Map map) {
        C41536l.m120489i(map, "map");
        this.f78032c.putAll(map);
    }

    /* renamed from: b */
    public final Map mo71851b() {
        return this.f78032c;
    }

    /* renamed from: c */
    public final C31453a mo71852c() {
        return this.f78030a;
    }

    /* renamed from: d */
    public final C31456c mo71853d() {
        return this.f78031b;
    }

    /* renamed from: e */
    public final boolean mo71854e() {
        return C41536l.m120484d(this.f78030a.mo71840v(), "C");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31456c)) {
            return false;
        }
        C31456c cVar = (C31456c) obj;
        return C41536l.m120484d(this.f78030a, cVar.f78030a) && C41536l.m120484d(this.f78031b, cVar.f78031b);
    }

    public int hashCode() {
        int hashCode = this.f78030a.hashCode() * 31;
        C31456c cVar = this.f78031b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        C31453a aVar = this.f78030a;
        C31456c cVar = this.f78031b;
        return "PaymentConfigTreeNode(data=" + aVar + ", parent=" + cVar + ")";
    }
}
