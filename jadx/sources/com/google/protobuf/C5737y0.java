package com.google.protobuf;

import android.support.p013v4.media.session.C0125b;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.protobuf.y0 */
abstract class C5737y0 extends AbstractMap {

    /* renamed from: d */
    private final int f18108d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List f18109e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map f18110f;

    /* renamed from: g */
    private boolean f18111g;

    /* renamed from: h */
    private volatile C5746g f18112h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Map f18113i;

    /* renamed from: j */
    private volatile C5740c f18114j;

    /* renamed from: com.google.protobuf.y0$a */
    class C5738a extends C5737y0 {
        C5738a(int i) {
            super(i, (C5738a) null);
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C5737y0.super.mo18833t((Comparable) obj, obj2);
        }

        /* renamed from: r */
        public void mo18830r() {
            if (!mo18829q()) {
                if (mo18826m() <= 0) {
                    Iterator it = mo18828o().iterator();
                    if (it.hasNext()) {
                        C0125b.m366a(((Map.Entry) it.next()).getKey());
                        throw null;
                    }
                } else {
                    C0125b.m366a(mo18825l(0).getKey());
                    throw null;
                }
            }
            C5737y0.super.mo18830r();
        }
    }

    /* renamed from: com.google.protobuf.y0$c */
    private class C5740c extends C5746g {
        private C5740c() {
            super(C5737y0.this, (C5738a) null);
        }

        public Iterator iterator() {
            return new C5739b(C5737y0.this, (C5738a) null);
        }

        /* synthetic */ C5740c(C5737y0 y0Var, C5738a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.y0$d */
    private static class C5741d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator f18119a = new C5742a();

        /* renamed from: b */
        private static final Iterable f18120b = new C5743b();

        /* renamed from: com.google.protobuf.y0$d$a */
        class C5742a implements Iterator {
            C5742a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.y0$d$b */
        class C5743b implements Iterable {
            C5743b() {
            }

            public Iterator iterator() {
                return C5741d.f18119a;
            }
        }

        /* renamed from: b */
        static Iterable m23136b() {
            return f18120b;
        }
    }

    /* renamed from: com.google.protobuf.y0$e */
    private class C5744e implements Map.Entry, Comparable {

        /* renamed from: d */
        private final Comparable f18121d;

        /* renamed from: e */
        private Object f18122e;

        C5744e(C5737y0 y0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: b */
        private boolean m23137b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(C5744e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: c */
        public Comparable getKey() {
            return this.f18121d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m23137b(this.f18121d, entry.getKey()) || !m23137b(this.f18122e, entry.getValue())) {
                return false;
            }
            return true;
        }

        public Object getValue() {
            return this.f18122e;
        }

        public int hashCode() {
            Comparable comparable = this.f18121d;
            int i = 0;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f18122e;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode ^ i;
        }

        public Object setValue(Object obj) {
            C5737y0.this.m23119h();
            Object obj2 = this.f18122e;
            this.f18122e = obj;
            return obj2;
        }

        public String toString() {
            return this.f18121d + "=" + this.f18122e;
        }

        C5744e(Comparable comparable, Object obj) {
            this.f18121d = comparable;
            this.f18122e = obj;
        }
    }

    /* renamed from: com.google.protobuf.y0$g */
    private class C5746g extends AbstractSet {
        private C5746g() {
        }

        /* renamed from: b */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            C5737y0.this.mo18833t((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C5737y0.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C5737y0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public Iterator iterator() {
            return new C5745f(C5737y0.this, (C5738a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C5737y0.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C5737y0.this.size();
        }

        /* synthetic */ C5746g(C5737y0 y0Var, C5738a aVar) {
            this();
        }
    }

    /* synthetic */ C5737y0(int i, C5738a aVar) {
        this(i);
    }

    /* renamed from: f */
    private int m23118f(Comparable comparable) {
        int size = this.f18109e.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((C5744e) this.f18109e.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((C5744e) this.f18109e.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m23119h() {
        if (this.f18111g) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    private void m23120j() {
        m23119h();
        if (this.f18109e.isEmpty() && !(this.f18109e instanceof ArrayList)) {
            this.f18109e = new ArrayList(this.f18108d);
        }
    }

    /* renamed from: p */
    private SortedMap m23121p() {
        m23119h();
        if (this.f18110f.isEmpty() && !(this.f18110f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18110f = treeMap;
            this.f18113i = treeMap.descendingMap();
        }
        return (SortedMap) this.f18110f;
    }

    /* renamed from: s */
    static C5737y0 m23122s(int i) {
        return new C5738a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public Object m23123u(int i) {
        m23119h();
        Object value = ((C5744e) this.f18109e.remove(i)).getValue();
        if (!this.f18110f.isEmpty()) {
            Iterator it = m23121p().entrySet().iterator();
            this.f18109e.add(new C5744e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        m23119h();
        if (!this.f18109e.isEmpty()) {
            this.f18109e.clear();
        }
        if (!this.f18110f.isEmpty()) {
            this.f18110f.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (m23118f(comparable) >= 0 || this.f18110f.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set entrySet() {
        if (this.f18112h == null) {
            this.f18112h = new C5746g(this, (C5738a) null);
        }
        return this.f18112h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5737y0)) {
            return super.equals(obj);
        }
        C5737y0 y0Var = (C5737y0) obj;
        int size = size();
        if (size != y0Var.size()) {
            return false;
        }
        int m = mo18826m();
        if (m != y0Var.mo18826m()) {
            return entrySet().equals(y0Var.entrySet());
        }
        for (int i = 0; i < m; i++) {
            if (!mo18825l(i).equals(y0Var.mo18825l(i))) {
                return false;
            }
        }
        if (m != size) {
            return this.f18110f.equals(y0Var.f18110f);
        }
        return true;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = m23118f(comparable);
        if (f >= 0) {
            return ((C5744e) this.f18109e.get(f)).getValue();
        }
        return this.f18110f.get(comparable);
    }

    public int hashCode() {
        int m = mo18826m();
        int i = 0;
        for (int i2 = 0; i2 < m; i2++) {
            i += ((C5744e) this.f18109e.get(i2)).hashCode();
        }
        if (mo18827n() > 0) {
            return i + this.f18110f.hashCode();
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Set mo18824i() {
        if (this.f18114j == null) {
            this.f18114j = new C5740c(this, (C5738a) null);
        }
        return this.f18114j;
    }

    /* renamed from: l */
    public Map.Entry mo18825l(int i) {
        return (Map.Entry) this.f18109e.get(i);
    }

    /* renamed from: m */
    public int mo18826m() {
        return this.f18109e.size();
    }

    /* renamed from: n */
    public int mo18827n() {
        return this.f18110f.size();
    }

    /* renamed from: o */
    public Iterable mo18828o() {
        if (this.f18110f.isEmpty()) {
            return C5741d.m23136b();
        }
        return this.f18110f.entrySet();
    }

    /* renamed from: q */
    public boolean mo18829q() {
        return this.f18111g;
    }

    /* renamed from: r */
    public void mo18830r() {
        Map map;
        Map map2;
        if (!this.f18111g) {
            if (this.f18110f.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f18110f);
            }
            this.f18110f = map;
            if (this.f18113i.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f18113i);
            }
            this.f18113i = map2;
            this.f18111g = true;
        }
    }

    public Object remove(Object obj) {
        m23119h();
        Comparable comparable = (Comparable) obj;
        int f = m23118f(comparable);
        if (f >= 0) {
            return m23123u(f);
        }
        if (this.f18110f.isEmpty()) {
            return null;
        }
        return this.f18110f.remove(comparable);
    }

    public int size() {
        return this.f18109e.size() + this.f18110f.size();
    }

    /* renamed from: t */
    public Object mo18833t(Comparable comparable, Object obj) {
        m23119h();
        int f = m23118f(comparable);
        if (f >= 0) {
            return ((C5744e) this.f18109e.get(f)).setValue(obj);
        }
        m23120j();
        int i = -(f + 1);
        if (i >= this.f18108d) {
            return m23121p().put(comparable, obj);
        }
        int size = this.f18109e.size();
        int i2 = this.f18108d;
        if (size == i2) {
            C5744e eVar = (C5744e) this.f18109e.remove(i2 - 1);
            m23121p().put(eVar.getKey(), eVar.getValue());
        }
        this.f18109e.add(i, new C5744e(comparable, obj));
        return null;
    }

    /* renamed from: com.google.protobuf.y0$b */
    private class C5739b implements Iterator {

        /* renamed from: d */
        private int f18115d;

        /* renamed from: e */
        private Iterator f18116e;

        private C5739b() {
            this.f18115d = C5737y0.this.f18109e.size();
        }

        /* renamed from: b */
        private Iterator m23133b() {
            if (this.f18116e == null) {
                this.f18116e = C5737y0.this.f18113i.entrySet().iterator();
            }
            return this.f18116e;
        }

        /* renamed from: d */
        public Map.Entry next() {
            if (m23133b().hasNext()) {
                return (Map.Entry) m23133b().next();
            }
            List b = C5737y0.this.f18109e;
            int i = this.f18115d - 1;
            this.f18115d = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f18115d;
            return (i > 0 && i <= C5737y0.this.f18109e.size()) || m23133b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ C5739b(C5737y0 y0Var, C5738a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.y0$f */
    private class C5745f implements Iterator {

        /* renamed from: d */
        private int f18124d;

        /* renamed from: e */
        private boolean f18125e;

        /* renamed from: f */
        private Iterator f18126f;

        private C5745f() {
            this.f18124d = -1;
        }

        /* renamed from: b */
        private Iterator m23140b() {
            if (this.f18126f == null) {
                this.f18126f = C5737y0.this.f18110f.entrySet().iterator();
            }
            return this.f18126f;
        }

        /* renamed from: d */
        public Map.Entry next() {
            this.f18125e = true;
            int i = this.f18124d + 1;
            this.f18124d = i;
            if (i < C5737y0.this.f18109e.size()) {
                return (Map.Entry) C5737y0.this.f18109e.get(this.f18124d);
            }
            return (Map.Entry) m23140b().next();
        }

        public boolean hasNext() {
            if (this.f18124d + 1 < C5737y0.this.f18109e.size()) {
                return true;
            }
            if (C5737y0.this.f18110f.isEmpty() || !m23140b().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f18125e) {
                this.f18125e = false;
                C5737y0.this.m23119h();
                if (this.f18124d < C5737y0.this.f18109e.size()) {
                    C5737y0 y0Var = C5737y0.this;
                    int i = this.f18124d;
                    this.f18124d = i - 1;
                    Object unused = y0Var.m23123u(i);
                    return;
                }
                m23140b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C5745f(C5737y0 y0Var, C5738a aVar) {
            this();
        }
    }

    private C5737y0(int i) {
        this.f18108d = i;
        this.f18109e = Collections.emptyList();
        this.f18110f = Collections.emptyMap();
        this.f18113i = Collections.emptyMap();
    }
}
