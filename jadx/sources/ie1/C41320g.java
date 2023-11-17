package ie1;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C41523c;
import kotlin.jvm.internal.C41531g;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: ie1.g */
final class C41320g implements Collection, C43151a {

    /* renamed from: d */
    private final Object[] f97371d;

    /* renamed from: e */
    private final boolean f97372e;

    public C41320g(Object[] objArr, boolean z) {
        C41536l.m120489i(objArr, "values");
        this.f97371d = objArr;
        this.f97372e = z;
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public int mo95906b() {
        return this.f97371d.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return C41333m.m119794s(this.f97371d, obj);
    }

    public boolean containsAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f97371d.length == 0;
    }

    public Iterator iterator() {
        return C41523c.m120452a(this.f97371d);
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
        return mo95906b();
    }

    public Object[] toArray(Object[] objArr) {
        C41536l.m120489i(objArr, "array");
        return C41531g.m120480b(this, objArr);
    }

    public final Object[] toArray() {
        return C41339p.m119897b(this.f97371d, this.f97372e);
    }
}
