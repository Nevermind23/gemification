package ie1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C41531g;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: ie1.c0 */
public final class C41313c0 implements Set, Serializable, C43151a {

    /* renamed from: d */
    public static final C41313c0 f97370d = new C41313c0();
    private static final long serialVersionUID = 3406603774387020532L;

    private C41313c0() {
    }

    private final Object readResolve() {
        return f97370d;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo95880b(Void voidR) {
        C41536l.m120489i(voidR, "element");
        return false;
    }

    /* renamed from: c */
    public int mo95881c() {
        return 0;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo95880b((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C41362z.f97394d;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo95881c();
    }

    public Object[] toArray() {
        return C41531g.m120479a(this);
    }

    public String toString() {
        return "[]";
    }

    public Object[] toArray(Object[] objArr) {
        C41536l.m120489i(objArr, "array");
        return C41531g.m120480b(this, objArr);
    }
}
