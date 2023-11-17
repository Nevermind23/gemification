package ie1;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: ie1.b0 */
final class C41307b0 implements Map, Serializable, C43151a {

    /* renamed from: d */
    public static final C41307b0 f97362d = new C41307b0();
    private static final long serialVersionUID = 8246714829545688274L;

    private C41307b0() {
    }

    private final Object readResolve() {
        return f97362d;
    }

    /* renamed from: a */
    public boolean mo95829a(Void voidR) {
        C41536l.m120489i(voidR, C11755a.C11756a.f34100b);
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set mo95831c() {
        return C41313c0.f97370d;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo95829a((Void) obj);
    }

    /* renamed from: d */
    public Set mo95835d() {
        return C41313c0.f97370d;
    }

    /* renamed from: e */
    public int mo95836e() {
        return 0;
    }

    public final /* bridge */ Set entrySet() {
        return mo95831c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection mo95839f() {
        return C41303a0.f97353d;
    }

    /* renamed from: h */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set keySet() {
        return mo95835d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo95836e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo95839f();
    }
}
