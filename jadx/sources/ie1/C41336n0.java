package ie1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: ie1.n0 */
final class C41336n0 implements C41334m0 {

    /* renamed from: d */
    private final Map f97383d;

    /* renamed from: e */
    private final C43075l f97384e;

    public C41336n0(Map map, C43075l lVar) {
        C41536l.m120489i(map, "map");
        C41536l.m120489i(lVar, "default");
        this.f97383d = map;
        this.f97384e = lVar;
    }

    /* renamed from: a */
    public Set mo95961a() {
        return mo95959g().entrySet();
    }

    /* renamed from: b */
    public Set mo95962b() {
        return mo95959g().keySet();
    }

    /* renamed from: c */
    public int mo95963c() {
        return mo95959g().size();
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return mo95959g().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo95959g().containsValue(obj);
    }

    /* renamed from: d */
    public Collection mo95967d() {
        return mo95959g().values();
    }

    public final /* bridge */ Set entrySet() {
        return mo95961a();
    }

    public boolean equals(Object obj) {
        return mo95959g().equals(obj);
    }

    /* renamed from: g */
    public Map mo95959g() {
        return this.f97383d;
    }

    public Object get(Object obj) {
        return mo95959g().get(obj);
    }

    public int hashCode() {
        return mo95959g().hashCode();
    }

    public boolean isEmpty() {
        return mo95959g().isEmpty();
    }

    /* renamed from: k */
    public Object mo95960k(Object obj) {
        Map g = mo95959g();
        Object obj2 = g.get(obj);
        if (obj2 != null || g.containsKey(obj)) {
            return obj2;
        }
        return this.f97384e.invoke(obj);
    }

    public final /* bridge */ Set keySet() {
        return mo95962b();
    }

    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo95963c();
    }

    public String toString() {
        return mo95959g().toString();
    }

    public final /* bridge */ Collection values() {
        return mo95967d();
    }
}
