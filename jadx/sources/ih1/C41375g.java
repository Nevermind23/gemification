package ih1;

import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: ih1.g */
public final class C41375g {

    /* renamed from: a */
    private final Map f97423a;

    public C41375g(Map map) {
        C41536l.m120489i(map, "data");
        this.f97423a = map;
    }

    /* renamed from: a */
    public final void mo96018a(String str, Object obj) {
        C41536l.m120489i(str, "key");
        Map map = this.f97423a;
        if (obj != null) {
            map.put(str, obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41375g) && C41536l.m120484d(this.f97423a, ((C41375g) obj).f97423a);
        }
        return true;
    }

    public int hashCode() {
        Map map = this.f97423a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Properties(data=" + this.f97423a + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C41375g(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : map);
    }
}
