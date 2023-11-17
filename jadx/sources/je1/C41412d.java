package je1;

import ie1.C41330k0;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ve1.C43151a;
import ve1.C43155e;
import ze1.C43420e;

/* renamed from: je1.d */
public final class C41412d implements Map, Serializable, C43155e {

    /* renamed from: p */
    private static final C41413a f97467p = new C41413a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Object[] f97468d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Object[] f97469e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int[] f97470f;

    /* renamed from: g */
    private int[] f97471g;

    /* renamed from: h */
    private int f97472h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f97473i;

    /* renamed from: j */
    private int f97474j;

    /* renamed from: k */
    private int f97475k;

    /* renamed from: l */
    private C41420f f97476l;

    /* renamed from: m */
    private C41421g f97477m;

    /* renamed from: n */
    private C41419e f97478n;

    /* renamed from: o */
    private boolean f97479o;

    /* renamed from: je1.d$a */
    private static final class C41413a {
        private C41413a() {
        }

        public /* synthetic */ C41413a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final int m120195c(int i) {
            return Integer.highestOneBit(C43429k.m124585d(i, 1) * 3);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final int m120196d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    /* renamed from: je1.d$b */
    public static final class C41414b extends C41416d implements Iterator, C43151a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41414b(C41412d dVar) {
            super(dVar);
            C41536l.m120489i(dVar, "map");
        }

        /* renamed from: j */
        public C41415c next() {
            if (mo96122b() < mo96124e().f97473i) {
                int b = mo96122b();
                mo96126h(b + 1);
                mo96128i(b);
                C41415c cVar = new C41415c(mo96124e(), mo96123d());
                mo96125f();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: l */
        public final void mo96113l(StringBuilder sb) {
            C41536l.m120489i(sb, "sb");
            if (mo96122b() < mo96124e().f97473i) {
                int b = mo96122b();
                mo96126h(b + 1);
                mo96128i(b);
                Object obj = mo96124e().f97468d[mo96123d()];
                if (C41536l.m120484d(obj, mo96124e())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] e = mo96124e().f97469e;
                C41536l.m120486f(e);
                Object obj2 = e[mo96123d()];
                if (C41536l.m120484d(obj2, mo96124e())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                mo96125f();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: m */
        public final int mo96114m() {
            int i;
            if (mo96122b() < mo96124e().f97473i) {
                int b = mo96122b();
                mo96126h(b + 1);
                mo96128i(b);
                Object obj = mo96124e().f97468d[mo96123d()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] e = mo96124e().f97469e;
                C41536l.m120486f(e);
                Object obj2 = e[mo96123d()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                mo96125f();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: je1.d$c */
    public static final class C41415c implements Map.Entry, C43155e.C43156a {

        /* renamed from: d */
        private final C41412d f97480d;

        /* renamed from: e */
        private final int f97481e;

        public C41415c(C41412d dVar, int i) {
            C41536l.m120489i(dVar, "map");
            this.f97480d = dVar;
            this.f97481e = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (!C41536l.m120484d(entry.getKey(), getKey()) || !C41536l.m120484d(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public Object getKey() {
            return this.f97480d.f97468d[this.f97481e];
        }

        public Object getValue() {
            Object[] e = this.f97480d.f97469e;
            C41536l.m120486f(e);
            return e[this.f97481e];
        }

        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public Object setValue(Object obj) {
            this.f97480d.mo96100m();
            Object[] a = this.f97480d.m120168i();
            int i = this.f97481e;
            Object obj2 = a[i];
            a[i] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: je1.d$d */
    public static class C41416d {

        /* renamed from: d */
        private final C41412d f97482d;

        /* renamed from: e */
        private int f97483e;

        /* renamed from: f */
        private int f97484f = -1;

        public C41416d(C41412d dVar) {
            C41536l.m120489i(dVar, "map");
            this.f97482d = dVar;
            mo96125f();
        }

        /* renamed from: b */
        public final int mo96122b() {
            return this.f97483e;
        }

        /* renamed from: d */
        public final int mo96123d() {
            return this.f97484f;
        }

        /* renamed from: e */
        public final C41412d mo96124e() {
            return this.f97482d;
        }

        /* renamed from: f */
        public final void mo96125f() {
            while (this.f97483e < this.f97482d.f97473i) {
                int[] d = this.f97482d.f97470f;
                int i = this.f97483e;
                if (d[i] < 0) {
                    this.f97483e = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: h */
        public final void mo96126h(int i) {
            this.f97483e = i;
        }

        public final boolean hasNext() {
            return this.f97483e < this.f97482d.f97473i;
        }

        /* renamed from: i */
        public final void mo96128i(int i) {
            this.f97484f = i;
        }

        public final void remove() {
            boolean z;
            if (this.f97484f != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f97482d.mo96100m();
                this.f97482d.m120160N(this.f97484f);
                this.f97484f = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* renamed from: je1.d$e */
    public static final class C41417e extends C41416d implements Iterator, C43151a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41417e(C41412d dVar) {
            super(dVar);
            C41536l.m120489i(dVar, "map");
        }

        public Object next() {
            if (mo96122b() < mo96124e().f97473i) {
                int b = mo96122b();
                mo96126h(b + 1);
                mo96128i(b);
                Object obj = mo96124e().f97468d[mo96123d()];
                mo96125f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: je1.d$f */
    public static final class C41418f extends C41416d implements Iterator, C43151a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41418f(C41412d dVar) {
            super(dVar);
            C41536l.m120489i(dVar, "map");
        }

        public Object next() {
            if (mo96122b() < mo96124e().f97473i) {
                int b = mo96122b();
                mo96126h(b + 1);
                mo96128i(b);
                Object[] e = mo96124e().f97469e;
                C41536l.m120486f(e);
                Object obj = e[mo96123d()];
                mo96125f();
                return obj;
            }
            throw new NoSuchElementException();
        }
    }

    private C41412d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i, int i2) {
        this.f97468d = objArr;
        this.f97469e = objArr2;
        this.f97470f = iArr;
        this.f97471g = iArr2;
        this.f97472h = i;
        this.f97473i = i2;
        this.f97474j = f97467p.m120196d(m120175y());
    }

    /* renamed from: D */
    private final int m120154D(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * -1640531527) >>> this.f97474j;
    }

    /* renamed from: G */
    private final boolean m120155G(Collection collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m120172s(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m120156H((Map.Entry) it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: H */
    private final boolean m120156H(Map.Entry entry) {
        int h = mo96095h(entry.getKey());
        Object[] i = m120168i();
        if (h >= 0) {
            i[h] = entry.getValue();
            return true;
        }
        int i2 = (-h) - 1;
        if (C41536l.m120484d(entry.getValue(), i[i2])) {
            return false;
        }
        i[i2] = entry.getValue();
        return true;
    }

    /* renamed from: I */
    private final boolean m120157I(int i) {
        int D = m120154D(this.f97468d[i]);
        int i2 = this.f97472h;
        while (true) {
            int[] iArr = this.f97471g;
            if (iArr[D] == 0) {
                iArr[D] = i + 1;
                this.f97470f[i] = D;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = D - 1;
            if (D == 0) {
                D = m120175y() - 1;
            } else {
                D = i3;
            }
        }
    }

    /* renamed from: J */
    private final void m120158J(int i) {
        if (this.f97473i > size()) {
            m120169n();
        }
        int i2 = 0;
        if (i != m120175y()) {
            this.f97471g = new int[i];
            this.f97474j = f97467p.m120196d(i);
        } else {
            C41331l.m119766j(this.f97471g, 0, 0, m120175y());
        }
        while (i2 < this.f97473i) {
            int i3 = i2 + 1;
            if (m120157I(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: L */
    private final void m120159L(int i) {
        int g = C43429k.m124588g(this.f97472h * 2, m120175y() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            int i4 = i - 1;
            if (i == 0) {
                i = m120175y() - 1;
            } else {
                i = i4;
            }
            i2++;
            if (i2 > this.f97472h) {
                this.f97471g[i3] = 0;
                return;
            }
            int[] iArr = this.f97471g;
            int i5 = iArr[i];
            if (i5 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i3] = -1;
            } else {
                int i6 = i5 - 1;
                if (((m120154D(this.f97468d[i6]) - i) & (m120175y() - 1)) >= i2) {
                    this.f97471g[i3] = i5;
                    this.f97470f[i6] = i3;
                }
                g--;
            }
            i3 = i;
            i2 = 0;
            g--;
        } while (g >= 0);
        this.f97471g[i3] = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m120160N(int i) {
        C41411c.m120149f(this.f97468d, i);
        m120159L(this.f97470f[i]);
        this.f97470f[i] = -1;
        this.f97475k = size() - 1;
    }

    /* renamed from: P */
    private final boolean m120161P(int i) {
        int w = mo96110w();
        int i2 = this.f97473i;
        int i3 = w - i2;
        int size = i2 - size();
        if (i3 >= i || i3 + size < i || size < mo96110w() / 4) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final Object[] m120168i() {
        Object[] objArr = this.f97469e;
        if (objArr != null) {
            return objArr;
        }
        Object[] d = C41411c.m120147d(mo96110w());
        this.f97469e = d;
        return d;
    }

    /* renamed from: n */
    private final void m120169n() {
        int i;
        Object[] objArr = this.f97469e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f97473i;
            if (i2 >= i) {
                break;
            }
            if (this.f97470f[i2] >= 0) {
                Object[] objArr2 = this.f97468d;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C41411c.m120150g(this.f97468d, i3, i);
        if (objArr != null) {
            C41411c.m120150g(objArr, i3, this.f97473i);
        }
        this.f97473i = i3;
    }

    /* renamed from: q */
    private final boolean m120170q(Map map) {
        return size() == map.size() && mo96101o(map.entrySet());
    }

    /* renamed from: r */
    private final void m120171r(int i) {
        Object[] objArr;
        if (i < 0) {
            throw new OutOfMemoryError();
        } else if (i > mo96110w()) {
            int w = (mo96110w() * 3) / 2;
            if (i <= w) {
                i = w;
            }
            this.f97468d = C41411c.m120148e(this.f97468d, i);
            Object[] objArr2 = this.f97469e;
            if (objArr2 != null) {
                objArr = C41411c.m120148e(objArr2, i);
            } else {
                objArr = null;
            }
            this.f97469e = objArr;
            int[] copyOf = Arrays.copyOf(this.f97470f, i);
            C41536l.m120488h(copyOf, "copyOf(this, newSize)");
            this.f97470f = copyOf;
            int a = f97467p.m120195c(i);
            if (a > m120175y()) {
                m120158J(a);
            }
        }
    }

    /* renamed from: s */
    private final void m120172s(int i) {
        if (m120161P(i)) {
            m120158J(m120175y());
        } else {
            m120171r(this.f97473i + i);
        }
    }

    /* renamed from: u */
    private final int m120173u(Object obj) {
        int D = m120154D(obj);
        int i = this.f97472h;
        while (true) {
            int i2 = this.f97471g[D];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C41536l.m120484d(this.f97468d[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = D - 1;
            if (D == 0) {
                D = m120175y() - 1;
            } else {
                D = i4;
            }
        }
    }

    /* renamed from: v */
    private final int m120174v(Object obj) {
        int i = this.f97473i;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f97470f[i] >= 0) {
                Object[] objArr = this.f97469e;
                C41536l.m120486f(objArr);
                if (C41536l.m120484d(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    private final Object writeReplace() {
        if (this.f97479o) {
            return new C41424i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: y */
    private final int m120175y() {
        return this.f97471g.length;
    }

    /* renamed from: A */
    public Set mo96080A() {
        C41420f fVar = this.f97476l;
        if (fVar != null) {
            return fVar;
        }
        C41420f fVar2 = new C41420f(this);
        this.f97476l = fVar2;
        return fVar2;
    }

    /* renamed from: B */
    public int mo96081B() {
        return this.f97475k;
    }

    /* renamed from: C */
    public Collection mo96082C() {
        C41421g gVar = this.f97477m;
        if (gVar != null) {
            return gVar;
        }
        C41421g gVar2 = new C41421g(this);
        this.f97477m = gVar2;
        return gVar2;
    }

    /* renamed from: E */
    public final boolean mo96083E() {
        return this.f97479o;
    }

    /* renamed from: F */
    public final C41417e mo96084F() {
        return new C41417e(this);
    }

    /* renamed from: K */
    public final boolean mo96085K(Map.Entry entry) {
        C41536l.m120489i(entry, "entry");
        mo96100m();
        int u = m120173u(entry.getKey());
        if (u < 0) {
            return false;
        }
        Object[] objArr = this.f97469e;
        C41536l.m120486f(objArr);
        if (!C41536l.m120484d(objArr[u], entry.getValue())) {
            return false;
        }
        m120160N(u);
        return true;
    }

    /* renamed from: M */
    public final int mo96086M(Object obj) {
        mo96100m();
        int u = m120173u(obj);
        if (u < 0) {
            return -1;
        }
        m120160N(u);
        return u;
    }

    /* renamed from: O */
    public final boolean mo96087O(Object obj) {
        mo96100m();
        int v = m120174v(obj);
        if (v < 0) {
            return false;
        }
        m120160N(v);
        return true;
    }

    /* renamed from: Q */
    public final C41418f mo96088Q() {
        return new C41418f(this);
    }

    public void clear() {
        mo96100m();
        C41330k0 o = new C43420e(0, this.f97473i - 1).iterator();
        while (o.hasNext()) {
            int nextInt = o.nextInt();
            int[] iArr = this.f97470f;
            int i = iArr[nextInt];
            if (i >= 0) {
                this.f97471g[i] = 0;
                iArr[nextInt] = -1;
            }
        }
        C41411c.m120150g(this.f97468d, 0, this.f97473i);
        Object[] objArr = this.f97469e;
        if (objArr != null) {
            C41411c.m120150g(objArr, 0, this.f97473i);
        }
        this.f97475k = 0;
        this.f97473i = 0;
    }

    public boolean containsKey(Object obj) {
        return m120173u(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m120174v(obj) >= 0;
    }

    public final /* bridge */ Set entrySet() {
        return mo96111x();
    }

    public boolean equals(Object obj) {
        if (obj == this || ((obj instanceof Map) && m120170q((Map) obj))) {
            return true;
        }
        return false;
    }

    public Object get(Object obj) {
        int u = m120173u(obj);
        if (u < 0) {
            return null;
        }
        Object[] objArr = this.f97469e;
        C41536l.m120486f(objArr);
        return objArr[u];
    }

    /* renamed from: h */
    public final int mo96095h(Object obj) {
        mo96100m();
        while (true) {
            int D = m120154D(obj);
            int g = C43429k.m124588g(this.f97472h * 2, m120175y() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f97471g[D];
                if (i2 <= 0) {
                    if (this.f97473i >= mo96110w()) {
                        m120172s(1);
                    } else {
                        int i3 = this.f97473i;
                        int i4 = i3 + 1;
                        this.f97473i = i4;
                        this.f97468d[i3] = obj;
                        this.f97470f[i3] = D;
                        this.f97471g[D] = i4;
                        this.f97475k = size() + 1;
                        if (i > this.f97472h) {
                            this.f97472h = i;
                        }
                        return i3;
                    }
                } else if (C41536l.m120484d(this.f97468d[i2 - 1], obj)) {
                    return -i2;
                } else {
                    i++;
                    if (i > g) {
                        m120158J(m120175y() * 2);
                        break;
                    }
                    int i5 = D - 1;
                    if (D == 0) {
                        D = m120175y() - 1;
                    } else {
                        D = i5;
                    }
                }
            }
        }
    }

    public int hashCode() {
        C41414b t = mo96107t();
        int i = 0;
        while (t.hasNext()) {
            i += t.mo96114m();
        }
        return i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final /* bridge */ Set keySet() {
        return mo96080A();
    }

    /* renamed from: l */
    public final Map mo96099l() {
        mo96100m();
        this.f97479o = true;
        return this;
    }

    /* renamed from: m */
    public final void mo96100m() {
        if (this.f97479o) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o */
    public final boolean mo96101o(Collection collection) {
        C41536l.m120489i(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo96102p((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public final boolean mo96102p(Map.Entry entry) {
        C41536l.m120489i(entry, "entry");
        int u = m120173u(entry.getKey());
        if (u < 0) {
            return false;
        }
        Object[] objArr = this.f97469e;
        C41536l.m120486f(objArr);
        return C41536l.m120484d(objArr[u], entry.getValue());
    }

    public Object put(Object obj, Object obj2) {
        mo96100m();
        int h = mo96095h(obj);
        Object[] i = m120168i();
        if (h < 0) {
            int i2 = (-h) - 1;
            Object obj3 = i[i2];
            i[i2] = obj2;
            return obj3;
        }
        i[h] = obj2;
        return null;
    }

    public void putAll(Map map) {
        C41536l.m120489i(map, "from");
        mo96100m();
        m120155G(map.entrySet());
    }

    public Object remove(Object obj) {
        int M = mo96086M(obj);
        if (M < 0) {
            return null;
        }
        Object[] objArr = this.f97469e;
        C41536l.m120486f(objArr);
        Object obj2 = objArr[M];
        C41411c.m120149f(objArr, M);
        return obj2;
    }

    public final /* bridge */ int size() {
        return mo96081B();
    }

    /* renamed from: t */
    public final C41414b mo96107t() {
        return new C41414b(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C41414b t = mo96107t();
        int i = 0;
        while (t.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            t.mo96113l(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "sb.toString()");
        return sb2;
    }

    public final /* bridge */ Collection values() {
        return mo96082C();
    }

    /* renamed from: w */
    public final int mo96110w() {
        return this.f97468d.length;
    }

    /* renamed from: x */
    public Set mo96111x() {
        C41419e eVar = this.f97478n;
        if (eVar != null) {
            return eVar;
        }
        C41419e eVar2 = new C41419e(this);
        this.f97478n = eVar2;
        return eVar2;
    }

    public C41412d() {
        this(8);
    }

    public C41412d(int i) {
        this(C41411c.m120147d(i), (Object[]) null, new int[i], new int[f97467p.m120195c(i)], 2, 0);
    }
}
