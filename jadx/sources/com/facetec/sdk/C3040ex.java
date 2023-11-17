package com.facetec.sdk;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.facetec.sdk.ex */
public final class C3040ex<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: a */
    private static final Comparator<Comparable> f10183a = new Comparator<Comparable>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    };

    /* renamed from: h */
    private static /* synthetic */ boolean f10184h = true;

    /* renamed from: b */
    private Comparator<? super K> f10185b;

    /* renamed from: c */
    int f10186c;

    /* renamed from: d */
    final C3047e<K, V> f10187d;

    /* renamed from: e */
    int f10188e;

    /* renamed from: f */
    private C3047e<K, V> f10189f;

    /* renamed from: g */
    private C3040ex<K, V>.d f10190g;

    /* renamed from: j */
    private C3040ex<K, V>.C10137b f10191j;

    /* renamed from: com.facetec.sdk.ex$b */
    class C3042b extends AbstractSet<Map.Entry<K, V>> {
        C3042b() {
        }

        public final void clear() {
            C3040ex.this.clear();
        }

        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C3040ex.this.mo9234e((Map.Entry<?, ?>) (Map.Entry) obj) != null;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C3044c() {
                {
                    C3040ex exVar = C3040ex.this;
                }

                public final /* synthetic */ Object next() {
                    return mo9248b();
                }
            };
        }

        public final boolean remove(Object obj) {
            C3047e e;
            if (!(obj instanceof Map.Entry) || (e = C3040ex.this.mo9234e((Map.Entry<?, ?>) (Map.Entry) obj)) == null) {
                return false;
            }
            C3040ex.this.mo9230c(e, true);
            return true;
        }

        public final int size() {
            return C3040ex.this.f10186c;
        }
    }

    /* renamed from: com.facetec.sdk.ex$c */
    abstract class C3044c<T> implements Iterator<T> {

        /* renamed from: a */
        private int f10194a;

        /* renamed from: b */
        private C3047e<K, V> f10195b;

        /* renamed from: d */
        private C3047e<K, V> f10197d = null;

        C3044c() {
            this.f10195b = C3040ex.this.f10187d.f10202c;
            this.f10194a = C3040ex.this.f10188e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C3047e<K, V> mo9248b() {
            C3047e<K, V> eVar = this.f10195b;
            C3040ex exVar = C3040ex.this;
            if (eVar == exVar.f10187d) {
                throw new NoSuchElementException();
            } else if (exVar.f10188e == this.f10194a) {
                this.f10195b = eVar.f10202c;
                this.f10197d = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f10195b != C3040ex.this.f10187d;
        }

        public final void remove() {
            C3047e<K, V> eVar = this.f10197d;
            if (eVar != null) {
                C3040ex.this.mo9230c(eVar, true);
                this.f10197d = null;
                this.f10194a = C3040ex.this.f10188e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.facetec.sdk.ex$d */
    final class C3045d extends AbstractSet<K> {
        C3045d() {
        }

        public final void clear() {
            C3040ex.this.clear();
        }

        public final boolean contains(Object obj) {
            return C3040ex.this.containsKey(obj);
        }

        public final Iterator<K> iterator() {
            return new C3044c() {
                {
                    C3040ex exVar = C3040ex.this;
                }

                public final K next() {
                    return mo9248b().f10205f;
                }
            };
        }

        public final boolean remove(Object obj) {
            return C3040ex.this.mo9233e(obj) != null;
        }

        public final int size() {
            return C3040ex.this.f10186c;
        }
    }

    public C3040ex() {
        this(f10183a);
    }

    /* renamed from: a */
    private C3047e<K, V> m12691a(K k, boolean z) {
        int i;
        C3047e<K, V> eVar;
        Comparable comparable;
        C3047e<K, V> eVar2;
        Comparator<? super K> comparator = this.f10185b;
        C3047e<K, V> eVar3 = this.f10189f;
        if (eVar3 != null) {
            if (comparator == f10183a) {
                comparable = (Comparable) k;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar3.f10205f);
                } else {
                    i = comparator.compare(k, eVar3.f10205f);
                }
                if (i != 0) {
                    if (i < 0) {
                        eVar2 = eVar3.f10204e;
                    } else {
                        eVar2 = eVar3.f10203d;
                    }
                    if (eVar2 == null) {
                        break;
                    }
                    eVar3 = eVar2;
                } else {
                    return eVar3;
                }
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C3047e<K, V> eVar4 = this.f10187d;
        if (eVar3 != null) {
            eVar = new C3047e<>(eVar3, k, eVar4, eVar4.f10201b);
            if (i < 0) {
                eVar3.f10204e = eVar;
            } else {
                eVar3.f10203d = eVar;
            }
            m12693b(eVar3, true);
        } else if (comparator != f10183a || (k instanceof Comparable)) {
            eVar = new C3047e<>(eVar3, k, eVar4, eVar4.f10201b);
            this.f10189f = eVar;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(k.getClass().getName());
            sb.append(" is not Comparable");
            throw new ClassCastException(sb.toString());
        }
        this.f10186c++;
        this.f10188e++;
        return eVar;
    }

    /* renamed from: b */
    private C3047e<K, V> m12692b(Object obj) {
        if (obj != null) {
            try {
                return m12691a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m12696d(C3047e<K, V> eVar, C3047e<K, V> eVar2) {
        C3047e<K, V> eVar3 = eVar.f10200a;
        eVar.f10200a = null;
        if (eVar2 != null) {
            eVar2.f10200a = eVar3;
        }
        if (eVar3 == null) {
            this.f10189f = eVar2;
        } else if (eVar3.f10204e == eVar) {
            eVar3.f10204e = eVar2;
        } else if (f10184h || eVar3.f10203d == eVar) {
            eVar3.f10203d = eVar2;
        } else {
            throw new AssertionError();
        }
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo9230c(C3047e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C3047e<K, V> eVar2 = eVar.f10201b;
            eVar2.f10202c = eVar.f10202c;
            eVar.f10202c.f10201b = eVar2;
        }
        C3047e<K, V> eVar3 = eVar.f10204e;
        C3047e<K, V> eVar4 = eVar.f10203d;
        C3047e<K, V> eVar5 = eVar.f10200a;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m12696d(eVar, eVar3);
                eVar.f10204e = null;
            } else if (eVar4 != null) {
                m12696d(eVar, eVar4);
                eVar.f10203d = null;
            } else {
                m12696d(eVar, (C3047e<K, V>) null);
            }
            m12693b(eVar5, false);
            this.f10186c--;
            this.f10188e++;
            return;
        }
        if (eVar3.f10206i > eVar4.f10206i) {
            C3047e<K, V> eVar6 = eVar3.f10203d;
            while (true) {
                C3047e<K, V> eVar7 = eVar6;
                eVar4 = eVar3;
                eVar3 = eVar7;
                if (eVar3 == null) {
                    break;
                }
                eVar6 = eVar3.f10203d;
            }
        } else {
            while (true) {
                C3047e<K, V> eVar8 = eVar4.f10204e;
                if (eVar8 == null) {
                    break;
                }
                eVar4 = eVar8;
            }
        }
        mo9230c(eVar4, false);
        C3047e<K, V> eVar9 = eVar.f10204e;
        if (eVar9 != null) {
            i = eVar9.f10206i;
            eVar4.f10204e = eVar9;
            eVar9.f10200a = eVar4;
            eVar.f10204e = null;
        } else {
            i = 0;
        }
        C3047e<K, V> eVar10 = eVar.f10203d;
        if (eVar10 != null) {
            i2 = eVar10.f10206i;
            eVar4.f10203d = eVar10;
            eVar10.f10200a = eVar4;
            eVar.f10203d = null;
        }
        eVar4.f10206i = Math.max(i, i2) + 1;
        m12696d(eVar, eVar4);
    }

    public final void clear() {
        this.f10189f = null;
        this.f10186c = 0;
        this.f10188e++;
        C3047e<K, V> eVar = this.f10187d;
        eVar.f10201b = eVar;
        eVar.f10202c = eVar;
    }

    public final boolean containsKey(Object obj) {
        return m12692b(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C3047e<K, V> mo9234e(Map.Entry<?, ?> entry) {
        C3047e<K, V> b = m12692b(entry.getKey());
        if (b != null && m12694b((Object) b.f10207j, (Object) entry.getValue())) {
            return b;
        }
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        C3040ex<K, V>.C10137b bVar = this.f10191j;
        if (bVar != null) {
            return bVar;
        }
        C3040ex<K, V>.C10137b bVar2 = new C3042b();
        this.f10191j = bVar2;
        return bVar2;
    }

    public final V get(Object obj) {
        C3047e b = m12692b(obj);
        if (b != null) {
            return b.f10207j;
        }
        return null;
    }

    public final Set<K> keySet() {
        C3040ex<K, V>.d dVar = this.f10190g;
        if (dVar != null) {
            return dVar;
        }
        C3040ex<K, V>.d dVar2 = new C3045d();
        this.f10190g = dVar2;
        return dVar2;
    }

    public final V put(K k, V v) {
        if (k != null) {
            C3047e a = m12691a(k, true);
            V v2 = a.f10207j;
            a.f10207j = v;
            return v2;
        }
        throw new NullPointerException("key == null");
    }

    public final V remove(Object obj) {
        C3047e e = mo9233e(obj);
        if (e != null) {
            return e.f10207j;
        }
        return null;
    }

    public final int size() {
        return this.f10186c;
    }

    private C3040ex(Comparator<? super K> comparator) {
        this.f10186c = 0;
        this.f10188e = 0;
        this.f10187d = new C3047e<>();
        this.f10185b = comparator == null ? f10183a : comparator;
    }

    /* renamed from: b */
    private static boolean m12694b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: com.facetec.sdk.ex$e */
    static final class C3047e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        C3047e<K, V> f10200a;

        /* renamed from: b */
        C3047e<K, V> f10201b;

        /* renamed from: c */
        C3047e<K, V> f10202c;

        /* renamed from: d */
        C3047e<K, V> f10203d;

        /* renamed from: e */
        C3047e<K, V> f10204e;

        /* renamed from: f */
        final K f10205f;

        /* renamed from: i */
        int f10206i;

        /* renamed from: j */
        V f10207j;

        C3047e() {
            this.f10205f = null;
            this.f10201b = this;
            this.f10202c = this;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k = this.f10205f;
                if (k != null ? k.equals(entry.getKey()) : entry.getKey() == null) {
                    V v = this.f10207j;
                    if (v == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final K getKey() {
            return this.f10205f;
        }

        public final V getValue() {
            return this.f10207j;
        }

        public final int hashCode() {
            int i;
            K k = this.f10205f;
            int i2 = 0;
            if (k == null) {
                i = 0;
            } else {
                i = k.hashCode();
            }
            V v = this.f10207j;
            if (v != null) {
                i2 = v.hashCode();
            }
            return i ^ i2;
        }

        public final V setValue(V v) {
            V v2 = this.f10207j;
            this.f10207j = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f10205f);
            sb.append("=");
            sb.append(this.f10207j);
            return sb.toString();
        }

        C3047e(C3047e<K, V> eVar, K k, C3047e<K, V> eVar2, C3047e<K, V> eVar3) {
            this.f10200a = eVar;
            this.f10205f = k;
            this.f10206i = 1;
            this.f10202c = eVar2;
            this.f10201b = eVar3;
            eVar3.f10202c = this;
            eVar2.f10201b = this;
        }
    }

    /* renamed from: b */
    private void m12693b(C3047e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C3047e<K, V> eVar2 = eVar.f10204e;
            C3047e<K, V> eVar3 = eVar.f10203d;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f10206i : 0;
            int i3 = eVar3 != null ? eVar3.f10206i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C3047e<K, V> eVar4 = eVar3.f10204e;
                C3047e<K, V> eVar5 = eVar3.f10203d;
                int i5 = eVar5 != null ? eVar5.f10206i : 0;
                if (eVar4 != null) {
                    i = eVar4.f10206i;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m12695c(eVar);
                } else if (f10184h || i6 == 1) {
                    m12697e(eVar3);
                    m12695c(eVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C3047e<K, V> eVar6 = eVar2.f10204e;
                C3047e<K, V> eVar7 = eVar2.f10203d;
                int i7 = eVar7 != null ? eVar7.f10206i : 0;
                if (eVar6 != null) {
                    i = eVar6.f10206i;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m12697e(eVar);
                } else if (f10184h || i8 == -1) {
                    m12695c(eVar2);
                    m12697e(eVar);
                } else {
                    throw new AssertionError();
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f10206i = i2 + 1;
                if (z) {
                    return;
                }
            } else if (f10184h || i4 == -1 || i4 == 1) {
                eVar.f10206i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            } else {
                throw new AssertionError();
            }
            eVar = eVar.f10200a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C3047e<K, V> mo9233e(Object obj) {
        C3047e<K, V> b = m12692b(obj);
        if (b != null) {
            mo9230c(b, true);
        }
        return b;
    }

    /* renamed from: e */
    private void m12697e(C3047e<K, V> eVar) {
        C3047e<K, V> eVar2 = eVar.f10204e;
        C3047e<K, V> eVar3 = eVar.f10203d;
        C3047e<K, V> eVar4 = eVar2.f10204e;
        C3047e<K, V> eVar5 = eVar2.f10203d;
        eVar.f10204e = eVar5;
        if (eVar5 != null) {
            eVar5.f10200a = eVar;
        }
        m12696d(eVar, eVar2);
        eVar2.f10203d = eVar;
        eVar.f10200a = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f10206i : 0, eVar5 != null ? eVar5.f10206i : 0) + 1;
        eVar.f10206i = max;
        if (eVar4 != null) {
            i = eVar4.f10206i;
        }
        eVar2.f10206i = Math.max(max, i) + 1;
    }

    /* renamed from: c */
    private void m12695c(C3047e<K, V> eVar) {
        C3047e<K, V> eVar2 = eVar.f10204e;
        C3047e<K, V> eVar3 = eVar.f10203d;
        C3047e<K, V> eVar4 = eVar3.f10204e;
        C3047e<K, V> eVar5 = eVar3.f10203d;
        eVar.f10203d = eVar4;
        if (eVar4 != null) {
            eVar4.f10200a = eVar;
        }
        m12696d(eVar, eVar3);
        eVar3.f10204e = eVar;
        eVar.f10200a = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f10206i : 0, eVar4 != null ? eVar4.f10206i : 0) + 1;
        eVar.f10206i = max;
        if (eVar5 != null) {
            i = eVar5.f10206i;
        }
        eVar3.f10206i = Math.max(max, i) + 1;
    }
}
