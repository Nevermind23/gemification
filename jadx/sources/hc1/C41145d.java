package hc1;

import he1.C41233s;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: hc1.d */
public final class C41145d {

    /* renamed from: d */
    public static final C41146a f97084d = new C41146a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Map f97085a;

    /* renamed from: b */
    private final Map f97086b;

    /* renamed from: c */
    private final Map f97087c;

    /* renamed from: hc1.d$a */
    public static final class C41146a {
        private C41146a() {
        }

        public /* synthetic */ C41146a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C41145d(Map map, Map map2, Map map3) {
        C41536l.m120489i(map, "headers");
        C41536l.m120489i(map2, "queryParams");
        C41536l.m120489i(map3, "payload");
        this.f97085a = map;
        this.f97086b = map2;
        this.f97087c = map3;
    }

    /* renamed from: a */
    public final Map mo95599a() {
        return C41344r0.m119931m(C41233s.m119492a("HEADERS_KEY", this.f97085a), C41233s.m119492a("QUERY_PARAMS_KEY", this.f97086b), C41233s.m119492a("PAYLOAD_KEY", this.f97087c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41145d)) {
            return false;
        }
        C41145d dVar = (C41145d) obj;
        return C41536l.m120484d(this.f97085a, dVar.f97085a) && C41536l.m120484d(this.f97086b, dVar.f97086b) && C41536l.m120484d(this.f97087c, dVar.f97087c);
    }

    public int hashCode() {
        return (((this.f97085a.hashCode() * 31) + this.f97086b.hashCode()) * 31) + this.f97087c.hashCode();
    }

    public String toString() {
        return "ScaParams(headers=" + this.f97085a + ", queryParams=" + this.f97086b + ", payload=" + this.f97087c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41145d(Map map, Map map2, Map map3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41344r0.m119928j() : map, (i & 2) != 0 ? C41344r0.m119928j() : map2, (i & 4) != 0 ? C41344r0.m119928j() : map3);
    }
}
