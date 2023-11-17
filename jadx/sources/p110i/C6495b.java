package p110i;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i.b */
public class C6495b implements Iterable {

    /* renamed from: d */
    C6498c f19828d;

    /* renamed from: e */
    private C6498c f19829e;

    /* renamed from: f */
    private final WeakHashMap f19830f = new WeakHashMap();

    /* renamed from: g */
    private int f19831g = 0;

    /* renamed from: i.b$a */
    static class C6496a extends C6500e {
        C6496a(C6498c cVar, C6498c cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6498c mo20427d(C6498c cVar) {
            return cVar.f19835g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C6498c mo20428e(C6498c cVar) {
            return cVar.f19834f;
        }
    }

    /* renamed from: i.b$b */
    private static class C6497b extends C6500e {
        C6497b(C6498c cVar, C6498c cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C6498c mo20427d(C6498c cVar) {
            return cVar.f19834f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C6498c mo20428e(C6498c cVar) {
            return cVar.f19835g;
        }
    }

    /* renamed from: i.b$c */
    static class C6498c implements Map.Entry {

        /* renamed from: d */
        final Object f19832d;

        /* renamed from: e */
        final Object f19833e;

        /* renamed from: f */
        C6498c f19834f;

        /* renamed from: g */
        C6498c f19835g;

        C6498c(Object obj, Object obj2) {
            this.f19832d = obj;
            this.f19833e = obj2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C6498c)) {
                return false;
            }
            C6498c cVar = (C6498c) obj;
            if (!this.f19832d.equals(cVar.f19832d) || !this.f19833e.equals(cVar.f19833e)) {
                return false;
            }
            return true;
        }

        public Object getKey() {
            return this.f19832d;
        }

        public Object getValue() {
            return this.f19833e;
        }

        public int hashCode() {
            return this.f19832d.hashCode() ^ this.f19833e.hashCode();
        }

        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f19832d + "=" + this.f19833e;
        }
    }

    /* renamed from: i.b$d */
    public class C6499d extends C6501f implements Iterator {

        /* renamed from: d */
        private C6498c f19836d;

        /* renamed from: e */
        private boolean f19837e = true;

        C6499d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo20435b(C6498c cVar) {
            boolean z;
            C6498c cVar2 = this.f19836d;
            if (cVar == cVar2) {
                C6498c cVar3 = cVar2.f19835g;
                this.f19836d = cVar3;
                if (cVar3 == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f19837e = z;
            }
        }

        /* renamed from: d */
        public Map.Entry next() {
            C6498c cVar;
            if (this.f19837e) {
                this.f19837e = false;
                this.f19836d = C6495b.this.f19828d;
            } else {
                C6498c cVar2 = this.f19836d;
                if (cVar2 != null) {
                    cVar = cVar2.f19834f;
                } else {
                    cVar = null;
                }
                this.f19836d = cVar;
            }
            return this.f19836d;
        }

        public boolean hasNext() {
            if (!this.f19837e) {
                C6498c cVar = this.f19836d;
                if (cVar == null || cVar.f19834f == null) {
                    return false;
                }
                return true;
            } else if (C6495b.this.f19828d != null) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: i.b$e */
    private static abstract class C6500e extends C6501f implements Iterator {

        /* renamed from: d */
        C6498c f19839d;

        /* renamed from: e */
        C6498c f19840e;

        C6500e(C6498c cVar, C6498c cVar2) {
            this.f19839d = cVar2;
            this.f19840e = cVar;
        }

        /* renamed from: g */
        private C6498c m25680g() {
            C6498c cVar = this.f19840e;
            C6498c cVar2 = this.f19839d;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return mo20428e(cVar);
        }

        /* renamed from: b */
        public void mo20435b(C6498c cVar) {
            if (this.f19839d == cVar && cVar == this.f19840e) {
                this.f19840e = null;
                this.f19839d = null;
            }
            C6498c cVar2 = this.f19839d;
            if (cVar2 == cVar) {
                this.f19839d = mo20427d(cVar2);
            }
            if (this.f19840e == cVar) {
                this.f19840e = m25680g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract C6498c mo20427d(C6498c cVar);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract C6498c mo20428e(C6498c cVar);

        /* renamed from: f */
        public Map.Entry next() {
            C6498c cVar = this.f19840e;
            this.f19840e = m25680g();
            return cVar;
        }

        public boolean hasNext() {
            return this.f19840e != null;
        }
    }

    /* renamed from: i.b$f */
    public static abstract class C6501f {
        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo20435b(C6498c cVar);
    }

    /* renamed from: b */
    public Iterator mo20417b() {
        C6497b bVar = new C6497b(this.f19829e, this.f19828d);
        this.f19830f.put(bVar, Boolean.FALSE);
        return bVar;
    }

    /* renamed from: c */
    public Map.Entry mo20418c() {
        return this.f19828d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6495b)) {
            return false;
        }
        C6495b bVar = (C6495b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C6498c mo20413g(Object obj) {
        C6498c cVar = this.f19828d;
        while (cVar != null && !cVar.f19832d.equals(obj)) {
            cVar = cVar.f19834f;
        }
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public C6499d mo20421i() {
        C6499d dVar = new C6499d();
        this.f19830f.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Iterator iterator() {
        C6496a aVar = new C6496a(this.f19828d, this.f19829e);
        this.f19830f.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* renamed from: j */
    public Map.Entry mo20423j() {
        return this.f19829e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C6498c mo20424k(Object obj, Object obj2) {
        C6498c cVar = new C6498c(obj, obj2);
        this.f19831g++;
        C6498c cVar2 = this.f19829e;
        if (cVar2 == null) {
            this.f19828d = cVar;
            this.f19829e = cVar;
            return cVar;
        }
        cVar2.f19834f = cVar;
        cVar.f19835g = cVar2;
        this.f19829e = cVar;
        return cVar;
    }

    /* renamed from: l */
    public Object mo20414l(Object obj, Object obj2) {
        C6498c g = mo20413g(obj);
        if (g != null) {
            return g.f19833e;
        }
        mo20424k(obj, obj2);
        return null;
    }

    /* renamed from: n */
    public Object mo20415n(Object obj) {
        C6498c g = mo20413g(obj);
        if (g == null) {
            return null;
        }
        this.f19831g--;
        if (!this.f19830f.isEmpty()) {
            for (C6501f b : this.f19830f.keySet()) {
                b.mo20435b(g);
            }
        }
        C6498c cVar = g.f19835g;
        if (cVar != null) {
            cVar.f19834f = g.f19834f;
        } else {
            this.f19828d = g.f19834f;
        }
        C6498c cVar2 = g.f19834f;
        if (cVar2 != null) {
            cVar2.f19835g = cVar;
        } else {
            this.f19829e = cVar;
        }
        g.f19834f = null;
        g.f19835g = null;
        return g.f19833e;
    }

    public int size() {
        return this.f19831g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
