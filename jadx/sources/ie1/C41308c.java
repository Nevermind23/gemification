package ie1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ve1.C43151a;

/* renamed from: ie1.c */
public abstract class C41308c extends C41301a implements List {

    /* renamed from: d */
    public static final C41309a f97363d = new C41309a((DefaultConstructorMarker) null);

    /* renamed from: ie1.c$a */
    public static final class C41309a {
        private C41309a() {
        }

        public /* synthetic */ C41309a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo95861a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo95862b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void mo95863c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: d */
        public final void mo95864d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: e */
        public final boolean mo95865e(Collection collection, Collection collection2) {
            C41536l.m120489i(collection, "c");
            C41536l.m120489i(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object d : collection) {
                if (!C41536l.m120484d(d, it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int mo95866f(Collection collection) {
            int i;
            C41536l.m120489i(collection, "c");
            int i2 = 1;
            for (Object next : collection) {
                int i3 = i2 * 31;
                if (next != null) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
            return i2;
        }
    }

    /* renamed from: ie1.c$b */
    private class C41310b implements Iterator, C43151a {

        /* renamed from: d */
        private int f97364d;

        public C41310b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo95867b() {
            return this.f97364d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo95868d(int i) {
            this.f97364d = i;
        }

        public boolean hasNext() {
            return this.f97364d < C41308c.this.size();
        }

        public Object next() {
            if (hasNext()) {
                C41308c cVar = C41308c.this;
                int i = this.f97364d;
                this.f97364d = i + 1;
                return cVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ie1.c$c */
    private class C41311c extends C41310b implements ListIterator {
        public C41311c(int i) {
            super();
            C41308c.f97363d.mo95863c(i, C41308c.this.size());
            mo95868d(i);
        }

        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo95867b() > 0;
        }

        public int nextIndex() {
            return mo95867b();
        }

        public Object previous() {
            if (hasPrevious()) {
                C41308c cVar = C41308c.this;
                mo95868d(mo95867b() - 1);
                return cVar.get(mo95867b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo95867b() - 1;
        }

        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ie1.c$d */
    private static final class C41312d extends C41308c implements RandomAccess {

        /* renamed from: e */
        private final C41308c f97367e;

        /* renamed from: f */
        private final int f97368f;

        /* renamed from: g */
        private int f97369g;

        public C41312d(C41308c cVar, int i, int i2) {
            C41536l.m120489i(cVar, "list");
            this.f97367e = cVar;
            this.f97368f = i;
            C41308c.f97363d.mo95864d(i, i2, cVar.size());
            this.f97369g = i2 - i;
        }

        /* renamed from: b */
        public int mo94472b() {
            return this.f97369g;
        }

        public Object get(int i) {
            C41308c.f97363d.mo95862b(i, this.f97369g);
            return this.f97367e.get(this.f97368f + i);
        }
    }

    protected C41308c() {
    }

    public void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f97363d.mo95865e(this, (Collection) obj);
    }

    public abstract Object get(int i);

    public int hashCode() {
        return f97363d.mo95866f(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object d : this) {
            if (C41536l.m120484d(d, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator iterator() {
        return new C41310b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C41536l.m120484d(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C41311c(0);
    }

    public Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List subList(int i, int i2) {
        return new C41312d(this, i, i2);
    }

    public ListIterator listIterator(int i) {
        return new C41311c(i);
    }
}
