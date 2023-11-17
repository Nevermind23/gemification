package je1;

import ie1.C41308c;
import ie1.C41316e;
import ie1.C41322h;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C41536l;
import ve1.C43151a;

/* renamed from: je1.b */
public final class C41409b extends C41316e implements RandomAccess, Serializable {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Object[] f97458d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f97459e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f97460f;

    /* renamed from: g */
    private boolean f97461g;

    /* renamed from: h */
    private final C41409b f97462h;

    /* renamed from: i */
    private final C41409b f97463i;

    /* renamed from: je1.b$a */
    private static final class C41410a implements ListIterator, C43151a {

        /* renamed from: d */
        private final C41409b f97464d;

        /* renamed from: e */
        private int f97465e;

        /* renamed from: f */
        private int f97466f = -1;

        public C41410a(C41409b bVar, int i) {
            C41536l.m120489i(bVar, "list");
            this.f97464d = bVar;
            this.f97465e = i;
        }

        public void add(Object obj) {
            C41409b bVar = this.f97464d;
            int i = this.f97465e;
            this.f97465e = i + 1;
            bVar.add(i, obj);
            this.f97466f = -1;
        }

        public boolean hasNext() {
            return this.f97465e < this.f97464d.f97460f;
        }

        public boolean hasPrevious() {
            return this.f97465e > 0;
        }

        public Object next() {
            if (this.f97465e < this.f97464d.f97460f) {
                int i = this.f97465e;
                this.f97465e = i + 1;
                this.f97466f = i;
                return this.f97464d.f97458d[this.f97464d.f97459e + this.f97466f];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f97465e;
        }

        public Object previous() {
            int i = this.f97465e;
            if (i > 0) {
                int i2 = i - 1;
                this.f97465e = i2;
                this.f97466f = i2;
                return this.f97464d.f97458d[this.f97464d.f97459e + this.f97466f];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f97465e - 1;
        }

        public void remove() {
            boolean z;
            int i = this.f97466f;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f97464d.remove(i);
                this.f97465e = this.f97466f;
                this.f97466f = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(Object obj) {
            boolean z;
            int i = this.f97466f;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f97464d.set(i, obj);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    private C41409b(Object[] objArr, int i, int i2, boolean z, C41409b bVar, C41409b bVar2) {
        this.f97458d = objArr;
        this.f97459e = i;
        this.f97460f = i2;
        this.f97461g = z;
        this.f97462h = bVar;
        this.f97463i = bVar2;
    }

    /* renamed from: A */
    private final void m120127A(int i) {
        if (this.f97462h != null) {
            throw new IllegalStateException();
        } else if (i >= 0) {
            Object[] objArr = this.f97458d;
            if (i > objArr.length) {
                this.f97458d = C41411c.m120148e(this.f97458d, C41322h.f97373g.mo95942a(objArr.length, i));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: B */
    private final void m120128B(int i) {
        m120127A(this.f97460f + i);
    }

    /* renamed from: C */
    private final void m120129C(int i, int i2) {
        m120128B(i2);
        Object[] objArr = this.f97458d;
        Object[] unused = C41331l.m119761e(objArr, objArr, i + i2, i, this.f97459e + this.f97460f);
        this.f97460f += i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f97463i;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m120130D() {
        /*
            r1 = this;
            boolean r0 = r1.f97461g
            if (r0 != 0) goto L_0x000f
            je1.b r0 = r1.f97463i
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.f97461g
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: je1.C41409b.m120130D():boolean");
    }

    /* renamed from: E */
    private final Object m120131E(int i) {
        C41409b bVar = this.f97462h;
        if (bVar != null) {
            this.f97460f--;
            return bVar.m120131E(i);
        }
        Object[] objArr = this.f97458d;
        Object obj = objArr[i];
        Object[] unused = C41331l.m119761e(objArr, objArr, i, i + 1, this.f97459e + this.f97460f);
        C41411c.m120149f(this.f97458d, (this.f97459e + this.f97460f) - 1);
        this.f97460f--;
        return obj;
    }

    /* renamed from: F */
    private final void m120132F(int i, int i2) {
        C41409b bVar = this.f97462h;
        if (bVar != null) {
            bVar.m120132F(i, i2);
        } else {
            Object[] objArr = this.f97458d;
            Object[] unused = C41331l.m119761e(objArr, objArr, i, i + i2, this.f97460f);
            Object[] objArr2 = this.f97458d;
            int i3 = this.f97460f;
            C41411c.m120150g(objArr2, i3 - i2, i3);
        }
        this.f97460f -= i2;
    }

    /* renamed from: G */
    private final int m120133G(int i, int i2, Collection collection, boolean z) {
        C41409b bVar = this.f97462h;
        if (bVar != null) {
            int G = bVar.m120133G(i, i2, collection, z);
            this.f97460f -= G;
            return G;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.f97458d[i5]) == z) {
                Object[] objArr = this.f97458d;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.f97458d;
        Object[] unused = C41331l.m119761e(objArr2, objArr2, i + i4, i2 + i, this.f97460f);
        Object[] objArr3 = this.f97458d;
        int i7 = this.f97460f;
        C41411c.m120150g(objArr3, i7 - i6, i7);
        this.f97460f -= i6;
        return i6;
    }

    /* renamed from: o */
    private final void m120137o(int i, Collection collection, int i2) {
        C41409b bVar = this.f97462h;
        if (bVar != null) {
            bVar.m120137o(i, collection, i2);
            this.f97458d = this.f97462h.f97458d;
            this.f97460f += i2;
            return;
        }
        m120129C(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f97458d[i + i3] = it.next();
        }
    }

    /* renamed from: r */
    private final void m120138r(int i, Object obj) {
        C41409b bVar = this.f97462h;
        if (bVar != null) {
            bVar.m120138r(i, obj);
            this.f97458d = this.f97462h.f97458d;
            this.f97460f++;
            return;
        }
        m120129C(i, 1);
        this.f97458d[i] = obj;
    }

    /* renamed from: w */
    private final void m120139w() {
        if (m120130D()) {
            throw new UnsupportedOperationException();
        }
    }

    private final Object writeReplace() {
        if (m120130D()) {
            return new C41422h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: x */
    private final boolean m120140x(List list) {
        return C41411c.m120151h(this.f97458d, this.f97459e, this.f97460f, list);
    }

    public boolean add(Object obj) {
        m120139w();
        m120138r(this.f97459e + this.f97460f, obj);
        return true;
    }

    public boolean addAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        m120139w();
        int size = collection.size();
        m120137o(this.f97459e + this.f97460f, collection, size);
        return size > 0;
    }

    /* renamed from: b */
    public int mo95898b() {
        return this.f97460f;
    }

    /* renamed from: c */
    public Object mo95899c(int i) {
        m120139w();
        C41308c.f97363d.mo95862b(i, this.f97460f);
        return m120131E(this.f97459e + i);
    }

    public void clear() {
        m120139w();
        m120132F(this.f97459e, this.f97460f);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && m120140x((List) obj));
    }

    public Object get(int i) {
        C41308c.f97363d.mo95862b(i, this.f97460f);
        return this.f97458d[this.f97459e + i];
    }

    public int hashCode() {
        return C41411c.m120152i(this.f97458d, this.f97459e, this.f97460f);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.f97460f; i++) {
            if (C41536l.m120484d(this.f97458d[this.f97459e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f97460f == 0;
    }

    public Iterator iterator() {
        return new C41410a(this, 0);
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.f97460f - 1; i >= 0; i--) {
            if (C41536l.m120484d(this.f97458d[this.f97459e + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new C41410a(this, 0);
    }

    public boolean remove(Object obj) {
        m120139w();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        m120139w();
        if (m120133G(this.f97459e, this.f97460f, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public boolean retainAll(Collection collection) {
        C41536l.m120489i(collection, "elements");
        m120139w();
        if (m120133G(this.f97459e, this.f97460f, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public Object set(int i, Object obj) {
        m120139w();
        C41308c.f97363d.mo95862b(i, this.f97460f);
        Object[] objArr = this.f97458d;
        int i2 = this.f97459e;
        Object obj2 = objArr[i2 + i];
        objArr[i2 + i] = obj;
        return obj2;
    }

    public List subList(int i, int i2) {
        C41409b bVar;
        C41308c.f97363d.mo95864d(i, i2, this.f97460f);
        Object[] objArr = this.f97458d;
        int i3 = this.f97459e + i;
        int i4 = i2 - i;
        boolean z = this.f97461g;
        C41409b bVar2 = this.f97463i;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new C41409b(objArr, i3, i4, z, this, bVar);
    }

    public Object[] toArray(Object[] objArr) {
        C41536l.m120489i(objArr, "destination");
        int length = objArr.length;
        int i = this.f97460f;
        if (length < i) {
            Object[] objArr2 = this.f97458d;
            int i2 = this.f97459e;
            Object[] copyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            C41536l.m120488h(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        Object[] objArr3 = this.f97458d;
        int i3 = this.f97459e;
        Object[] unused = C41331l.m119761e(objArr3, objArr, 0, i3, i + i3);
        int length2 = objArr.length;
        int i4 = this.f97460f;
        if (length2 > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }

    public String toString() {
        return C41411c.m120153j(this.f97458d, this.f97459e, this.f97460f);
    }

    /* renamed from: v */
    public final List mo96070v() {
        if (this.f97462h == null) {
            m120139w();
            this.f97461g = true;
            return this;
        }
        throw new IllegalStateException();
    }

    public ListIterator listIterator(int i) {
        C41308c.f97363d.mo95863c(i, this.f97460f);
        return new C41410a(this, i);
    }

    public void add(int i, Object obj) {
        m120139w();
        C41308c.f97363d.mo95863c(i, this.f97460f);
        m120138r(this.f97459e + i, obj);
    }

    public boolean addAll(int i, Collection collection) {
        C41536l.m120489i(collection, "elements");
        m120139w();
        C41308c.f97363d.mo95863c(i, this.f97460f);
        int size = collection.size();
        m120137o(this.f97459e + i, collection, size);
        return size > 0;
    }

    public Object[] toArray() {
        Object[] objArr = this.f97458d;
        int i = this.f97459e;
        return C41331l.m119765i(objArr, i, this.f97460f + i);
    }

    public C41409b() {
        this(10);
    }

    public C41409b(int i) {
        this(C41411c.m120147d(i), 0, 0, false, (C41409b) null, (C41409b) null);
    }
}
