package ie1;

import java.util.Collection;
import kotlin.jvm.internal.C41531g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import ve1.C43151a;

/* renamed from: ie1.a */
public abstract class C41301a implements Collection, C43151a {

    /* renamed from: ie1.a$a */
    static final class C41302a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41301a f97352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41302a(C41301a aVar) {
            super(1);
            this.f97352d = aVar;
        }

        /* renamed from: a */
        public final CharSequence invoke(Object obj) {
            return obj == this.f97352d ? "(this Collection)" : String.valueOf(obj);
        }
    }

    protected C41301a() {
    }

    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int mo94472b();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object d : this) {
            if (C41536l.m120484d(d, obj)) {
                return true;
            }
        }
        return false;
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
        return size() == 0;
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
        return mo94472b();
    }

    public Object[] toArray() {
        return C41531g.m120479a(this);
    }

    public String toString() {
        return C41358y.m120017g0(this, ", ", "[", "]", 0, (CharSequence) null, new C41302a(this), 24, (Object) null);
    }

    public Object[] toArray(Object[] objArr) {
        C41536l.m120489i(objArr, "array");
        return C41531g.m120480b(this, objArr);
    }
}
