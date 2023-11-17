package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
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

/* renamed from: com.google.gson.internal.g */
public final class C5579g extends AbstractMap implements Serializable {

    /* renamed from: l */
    private static final Comparator f17751l = new C5580a();

    /* renamed from: d */
    private final Comparator f17752d;

    /* renamed from: e */
    private final boolean f17753e;

    /* renamed from: f */
    C5586e f17754f;

    /* renamed from: g */
    int f17755g;

    /* renamed from: h */
    int f17756h;

    /* renamed from: i */
    final C5586e f17757i;

    /* renamed from: j */
    private C5581b f17758j;

    /* renamed from: k */
    private C5583c f17759k;

    /* renamed from: com.google.gson.internal.g$a */
    class C5580a implements Comparator {
        C5580a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.g$b */
    class C5581b extends AbstractSet {

        /* renamed from: com.google.gson.internal.g$b$a */
        class C5582a extends C5585d {
            C5582a() {
                super();
            }

            /* renamed from: d */
            public Map.Entry next() {
                return mo18413b();
            }
        }

        C5581b() {
        }

        public void clear() {
            C5579g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C5579g.this.mo18386c((Map.Entry) obj) != null;
        }

        public Iterator iterator() {
            return new C5582a();
        }

        public boolean remove(Object obj) {
            C5586e c;
            if (!(obj instanceof Map.Entry) || (c = C5579g.this.mo18386c((Map.Entry) obj)) == null) {
                return false;
            }
            C5579g.this.mo18391f(c, true);
            return true;
        }

        public int size() {
            return C5579g.this.f17755g;
        }
    }

    /* renamed from: com.google.gson.internal.g$c */
    final class C5583c extends AbstractSet {

        /* renamed from: com.google.gson.internal.g$c$a */
        class C5584a extends C5585d {
            C5584a() {
                super();
            }

            public Object next() {
                return mo18413b().f17773i;
            }
        }

        C5583c() {
        }

        public void clear() {
            C5579g.this.clear();
        }

        public boolean contains(Object obj) {
            return C5579g.this.containsKey(obj);
        }

        public Iterator iterator() {
            return new C5584a();
        }

        public boolean remove(Object obj) {
            return C5579g.this.mo18393h(obj) != null;
        }

        public int size() {
            return C5579g.this.f17755g;
        }
    }

    /* renamed from: com.google.gson.internal.g$d */
    private abstract class C5585d implements Iterator {

        /* renamed from: d */
        C5586e f17764d;

        /* renamed from: e */
        C5586e f17765e = null;

        /* renamed from: f */
        int f17766f;

        C5585d() {
            this.f17764d = C5579g.this.f17757i.f17771g;
            this.f17766f = C5579g.this.f17756h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final C5586e mo18413b() {
            C5586e eVar = this.f17764d;
            C5579g gVar = C5579g.this;
            if (eVar == gVar.f17757i) {
                throw new NoSuchElementException();
            } else if (gVar.f17756h == this.f17766f) {
                this.f17764d = eVar.f17771g;
                this.f17765e = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f17764d != C5579g.this.f17757i;
        }

        public final void remove() {
            C5586e eVar = this.f17765e;
            if (eVar != null) {
                C5579g.this.mo18391f(eVar, true);
                this.f17765e = null;
                this.f17766f = C5579g.this.f17756h;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C5579g() {
        this(f17751l, true);
    }

    /* renamed from: a */
    private boolean m22219a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    private void m22220e(C5586e eVar, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (eVar != null) {
            C5586e eVar2 = eVar.f17769e;
            C5586e eVar3 = eVar.f17770f;
            int i5 = 0;
            if (eVar2 != null) {
                i = eVar2.f17776l;
            } else {
                i = 0;
            }
            if (eVar3 != null) {
                i2 = eVar3.f17776l;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                C5586e eVar4 = eVar3.f17769e;
                C5586e eVar5 = eVar3.f17770f;
                if (eVar5 != null) {
                    i4 = eVar5.f17776l;
                } else {
                    i4 = 0;
                }
                if (eVar4 != null) {
                    i5 = eVar4.f17776l;
                }
                int i7 = i5 - i4;
                if (i7 == -1 || (i7 == 0 && !z)) {
                    m22222l(eVar);
                } else {
                    m22223m(eVar3);
                    m22222l(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 2) {
                C5586e eVar6 = eVar2.f17769e;
                C5586e eVar7 = eVar2.f17770f;
                if (eVar7 != null) {
                    i3 = eVar7.f17776l;
                } else {
                    i3 = 0;
                }
                if (eVar6 != null) {
                    i5 = eVar6.f17776l;
                }
                int i8 = i5 - i3;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m22223m(eVar);
                } else {
                    m22222l(eVar2);
                    m22223m(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i6 == 0) {
                eVar.f17776l = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f17776l = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f17768d;
        }
    }

    /* renamed from: i */
    private void m22221i(C5586e eVar, C5586e eVar2) {
        C5586e eVar3 = eVar.f17768d;
        eVar.f17768d = null;
        if (eVar2 != null) {
            eVar2.f17768d = eVar3;
        }
        if (eVar3 == null) {
            this.f17754f = eVar2;
        } else if (eVar3.f17769e == eVar) {
            eVar3.f17769e = eVar2;
        } else {
            eVar3.f17770f = eVar2;
        }
    }

    /* renamed from: l */
    private void m22222l(C5586e eVar) {
        int i;
        int i2;
        C5586e eVar2 = eVar.f17769e;
        C5586e eVar3 = eVar.f17770f;
        C5586e eVar4 = eVar3.f17769e;
        C5586e eVar5 = eVar3.f17770f;
        eVar.f17770f = eVar4;
        if (eVar4 != null) {
            eVar4.f17768d = eVar;
        }
        m22221i(eVar, eVar3);
        eVar3.f17769e = eVar;
        eVar.f17768d = eVar3;
        int i3 = 0;
        if (eVar2 != null) {
            i = eVar2.f17776l;
        } else {
            i = 0;
        }
        if (eVar4 != null) {
            i2 = eVar4.f17776l;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.f17776l = max;
        if (eVar5 != null) {
            i3 = eVar5.f17776l;
        }
        eVar3.f17776l = Math.max(max, i3) + 1;
    }

    /* renamed from: m */
    private void m22223m(C5586e eVar) {
        int i;
        int i2;
        C5586e eVar2 = eVar.f17769e;
        C5586e eVar3 = eVar.f17770f;
        C5586e eVar4 = eVar2.f17769e;
        C5586e eVar5 = eVar2.f17770f;
        eVar.f17769e = eVar5;
        if (eVar5 != null) {
            eVar5.f17768d = eVar;
        }
        m22221i(eVar, eVar2);
        eVar2.f17770f = eVar;
        eVar.f17768d = eVar2;
        int i3 = 0;
        if (eVar3 != null) {
            i = eVar3.f17776l;
        } else {
            i = 0;
        }
        if (eVar5 != null) {
            i2 = eVar5.f17776l;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        eVar.f17776l = max;
        if (eVar4 != null) {
            i3 = eVar4.f17776l;
        }
        eVar2.f17776l = Math.max(max, i3) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C5586e mo18385b(Object obj, boolean z) {
        int i;
        C5586e eVar;
        Comparable comparable;
        C5586e eVar2;
        Comparator comparator = this.f17752d;
        C5586e eVar3 = this.f17754f;
        if (eVar3 != null) {
            if (comparator == f17751l) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar3.f17773i);
                } else {
                    i = comparator.compare(obj, eVar3.f17773i);
                }
                if (i == 0) {
                    return eVar3;
                }
                if (i < 0) {
                    eVar2 = eVar3.f17769e;
                } else {
                    eVar2 = eVar3.f17770f;
                }
                if (eVar2 == null) {
                    break;
                }
                eVar3 = eVar2;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C5586e eVar4 = this.f17757i;
        if (eVar3 != null) {
            eVar = new C5586e(this.f17753e, eVar3, obj, eVar4, eVar4.f17772h);
            if (i < 0) {
                eVar3.f17769e = eVar;
            } else {
                eVar3.f17770f = eVar;
            }
            m22220e(eVar3, true);
        } else if (comparator != f17751l || (obj instanceof Comparable)) {
            eVar = new C5586e(this.f17753e, eVar3, obj, eVar4, eVar4.f17772h);
            this.f17754f = eVar;
        } else {
            throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
        }
        this.f17755g++;
        this.f17756h++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C5586e mo18386c(Map.Entry entry) {
        boolean z;
        C5586e d = mo18389d(entry.getKey());
        if (d == null || !m22219a(d.f17775k, entry.getValue())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return d;
        }
        return null;
    }

    public void clear() {
        this.f17754f = null;
        this.f17755g = 0;
        this.f17756h++;
        C5586e eVar = this.f17757i;
        eVar.f17772h = eVar;
        eVar.f17771g = eVar;
    }

    public boolean containsKey(Object obj) {
        return mo18389d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C5586e mo18389d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo18385b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set entrySet() {
        C5581b bVar = this.f17758j;
        if (bVar != null) {
            return bVar;
        }
        C5581b bVar2 = new C5581b();
        this.f17758j = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo18391f(C5586e eVar, boolean z) {
        C5586e eVar2;
        int i;
        if (z) {
            C5586e eVar3 = eVar.f17772h;
            eVar3.f17771g = eVar.f17771g;
            eVar.f17771g.f17772h = eVar3;
        }
        C5586e eVar4 = eVar.f17769e;
        C5586e eVar5 = eVar.f17770f;
        C5586e eVar6 = eVar.f17768d;
        int i2 = 0;
        if (eVar4 == null || eVar5 == null) {
            if (eVar4 != null) {
                m22221i(eVar, eVar4);
                eVar.f17769e = null;
            } else if (eVar5 != null) {
                m22221i(eVar, eVar5);
                eVar.f17770f = null;
            } else {
                m22221i(eVar, (C5586e) null);
            }
            m22220e(eVar6, false);
            this.f17755g--;
            this.f17756h++;
            return;
        }
        if (eVar4.f17776l > eVar5.f17776l) {
            eVar2 = eVar4.mo18417b();
        } else {
            eVar2 = eVar5.mo18416a();
        }
        mo18391f(eVar2, false);
        C5586e eVar7 = eVar.f17769e;
        if (eVar7 != null) {
            i = eVar7.f17776l;
            eVar2.f17769e = eVar7;
            eVar7.f17768d = eVar2;
            eVar.f17769e = null;
        } else {
            i = 0;
        }
        C5586e eVar8 = eVar.f17770f;
        if (eVar8 != null) {
            i2 = eVar8.f17776l;
            eVar2.f17770f = eVar8;
            eVar8.f17768d = eVar2;
            eVar.f17770f = null;
        }
        eVar2.f17776l = Math.max(i, i2) + 1;
        m22221i(eVar, eVar2);
    }

    public Object get(Object obj) {
        C5586e d = mo18389d(obj);
        if (d != null) {
            return d.f17775k;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C5586e mo18393h(Object obj) {
        C5586e d = mo18389d(obj);
        if (d != null) {
            mo18391f(d, true);
        }
        return d;
    }

    public Set keySet() {
        C5583c cVar = this.f17759k;
        if (cVar != null) {
            return cVar;
        }
        C5583c cVar2 = new C5583c();
        this.f17759k = cVar2;
        return cVar2;
    }

    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        } else if (obj2 != null || this.f17753e) {
            C5586e b = mo18385b(obj, true);
            Object obj3 = b.f17775k;
            b.f17775k = obj2;
            return obj3;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public Object remove(Object obj) {
        C5586e h = mo18393h(obj);
        if (h != null) {
            return h.f17775k;
        }
        return null;
    }

    public int size() {
        return this.f17755g;
    }

    public C5579g(boolean z) {
        this(f17751l, z);
    }

    public C5579g(Comparator comparator, boolean z) {
        this.f17755g = 0;
        this.f17756h = 0;
        this.f17752d = comparator == null ? f17751l : comparator;
        this.f17753e = z;
        this.f17757i = new C5586e(z);
    }

    /* renamed from: com.google.gson.internal.g$e */
    static final class C5586e implements Map.Entry {

        /* renamed from: d */
        C5586e f17768d;

        /* renamed from: e */
        C5586e f17769e;

        /* renamed from: f */
        C5586e f17770f;

        /* renamed from: g */
        C5586e f17771g;

        /* renamed from: h */
        C5586e f17772h;

        /* renamed from: i */
        final Object f17773i;

        /* renamed from: j */
        final boolean f17774j;

        /* renamed from: k */
        Object f17775k;

        /* renamed from: l */
        int f17776l;

        C5586e(boolean z) {
            this.f17773i = null;
            this.f17774j = z;
            this.f17772h = this;
            this.f17771g = this;
        }

        /* renamed from: a */
        public C5586e mo18416a() {
            C5586e eVar = this;
            for (C5586e eVar2 = this.f17769e; eVar2 != null; eVar2 = eVar2.f17769e) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C5586e mo18417b() {
            C5586e eVar = this;
            for (C5586e eVar2 = this.f17770f; eVar2 != null; eVar2 = eVar2.f17770f) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r3.f17773i
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                java.lang.Object r0 = r3.f17775k
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C5579g.C5586e.equals(java.lang.Object):boolean");
        }

        public Object getKey() {
            return this.f17773i;
        }

        public Object getValue() {
            return this.f17775k;
        }

        public int hashCode() {
            int i;
            Object obj = this.f17773i;
            int i2 = 0;
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            Object obj2 = this.f17775k;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            return i ^ i2;
        }

        public Object setValue(Object obj) {
            if (obj != null || this.f17774j) {
                Object obj2 = this.f17775k;
                this.f17775k = obj;
                return obj2;
            }
            throw new NullPointerException("value == null");
        }

        public String toString() {
            return this.f17773i + "=" + this.f17775k;
        }

        C5586e(boolean z, C5586e eVar, Object obj, C5586e eVar2, C5586e eVar3) {
            this.f17768d = eVar;
            this.f17773i = obj;
            this.f17774j = z;
            this.f17776l = 1;
            this.f17771g = eVar2;
            this.f17772h = eVar3;
            eVar3.f17771g = this;
            eVar2.f17772h = this;
        }
    }
}
