package ie1;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C41531g;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: ie1.a0 */
public final class C41303a0 implements List, Serializable, RandomAccess, C43151a {

    /* renamed from: d */
    public static final C41303a0 f97353d = new C41303a0();
    private static final long serialVersionUID = -7390468764508069838L;

    private C41303a0() {
    }

    private final Object readResolve() {
        return f97353d;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public boolean mo95796b(Void voidR) {
        C41536l.m120489i(voidR, "element");
        return false;
    }

    /* renamed from: c */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo95796b((Void) obj);
    }

    public boolean containsAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: i */
    public int mo95804i() {
        return 0;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo95808l((Void) obj);
    }

    public boolean isEmpty() {
        return true;
    }

    public Iterator iterator() {
        return C41362z.f97394d;
    }

    /* renamed from: l */
    public int mo95808l(Void voidR) {
        C41536l.m120489i(voidR, "element");
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return mo95812n((Void) obj);
    }

    public ListIterator listIterator() {
        return C41362z.f97394d;
    }

    /* renamed from: n */
    public int mo95812n(Void voidR) {
        C41536l.m120489i(voidR, "element");
        return -1;
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo95804i();
    }

    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    public Object[] toArray() {
        return C41531g.m120479a(this);
    }

    public String toString() {
        return "[]";
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator listIterator(int i) {
        if (i == 0) {
            return C41362z.f97394d;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray(Object[] objArr) {
        C41536l.m120489i(objArr, "array");
        return C41531g.m120480b(this, objArr);
    }
}
