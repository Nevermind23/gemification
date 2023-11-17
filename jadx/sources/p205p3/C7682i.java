package p205p3;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p089g4.C6223k;

/* renamed from: p3.i */
public final class C7682i implements C7674b {

    /* renamed from: a */
    private final C7679g f22334a = new C7679g();

    /* renamed from: b */
    private final C7684b f22335b = new C7684b();

    /* renamed from: c */
    private final Map f22336c = new HashMap();

    /* renamed from: d */
    private final Map f22337d = new HashMap();

    /* renamed from: e */
    private final int f22338e;

    /* renamed from: f */
    private int f22339f;

    /* renamed from: p3.i$a */
    private static final class C7683a implements C7690m {

        /* renamed from: a */
        private final C7684b f22340a;

        /* renamed from: b */
        int f22341b;

        /* renamed from: c */
        private Class f22342c;

        C7683a(C7684b bVar) {
            this.f22340a = bVar;
        }

        /* renamed from: a */
        public void mo22408a() {
            this.f22340a.mo22392c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo22409b(int i, Class cls) {
            this.f22341b = i;
            this.f22342c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C7683a)) {
                return false;
            }
            C7683a aVar = (C7683a) obj;
            if (this.f22341b == aVar.f22341b && this.f22342c == aVar.f22342c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = this.f22341b * 31;
            Class cls = this.f22342c;
            if (cls != null) {
                i = cls.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Key{size=" + this.f22341b + "array=" + this.f22342c + '}';
        }
    }

    /* renamed from: p3.i$b */
    private static final class C7684b extends C7675c {
        C7684b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C7683a mo22390a() {
            return new C7683a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C7683a mo22414e(int i, Class cls) {
            C7683a aVar = (C7683a) mo22391b();
            aVar.mo22409b(i, cls);
            return aVar;
        }
    }

    public C7682i(int i) {
        this.f22338e = i;
    }

    /* renamed from: f */
    private void m29169f(int i, Class cls) {
        NavigableMap m = m29176m(cls);
        Integer num = (Integer) m.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            m.remove(Integer.valueOf(i));
        } else {
            m.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: g */
    private void m29170g() {
        m29171h(this.f22338e);
    }

    /* renamed from: h */
    private void m29171h(int i) {
        while (this.f22339f > i) {
            Object f = this.f22334a.mo22401f();
            C6223k.m24730d(f);
            C7673a i2 = m29172i(f);
            this.f22339f -= i2.mo22383c(f) * i2.mo22381a();
            m29169f(i2.mo22383c(f), f.getClass());
            if (Log.isLoggable(i2.mo22382b(), 2)) {
                Log.v(i2.mo22382b(), "evicted: " + i2.mo22383c(f));
            }
        }
    }

    /* renamed from: i */
    private C7673a m29172i(Object obj) {
        return m29173j(obj.getClass());
    }

    /* renamed from: j */
    private C7673a m29173j(Class cls) {
        C7673a aVar = (C7673a) this.f22337d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C7681h();
            } else if (cls.equals(byte[].class)) {
                aVar = new C7678f();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f22337d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: k */
    private Object m29174k(C7683a aVar) {
        return this.f22334a.mo22399a(aVar);
    }

    /* renamed from: l */
    private Object m29175l(C7683a aVar, Class cls) {
        C7673a j = m29173j(cls);
        Object k = m29174k(aVar);
        if (k != null) {
            this.f22339f -= j.mo22383c(k) * j.mo22381a();
            m29169f(j.mo22383c(k), cls);
        }
        if (k != null) {
            return k;
        }
        if (Log.isLoggable(j.mo22382b(), 2)) {
            Log.v(j.mo22382b(), "Allocated " + aVar.f22341b + " bytes");
        }
        return j.newArray(aVar.f22341b);
    }

    /* renamed from: m */
    private NavigableMap m29176m(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f22336c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f22336c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: n */
    private boolean m29177n() {
        int i = this.f22339f;
        return i == 0 || this.f22338e / i >= 2;
    }

    /* renamed from: o */
    private boolean m29178o(int i) {
        return i <= this.f22338e / 2;
    }

    /* renamed from: p */
    private boolean m29179p(int i, Integer num) {
        return num != null && (m29177n() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    public synchronized void mo22385a(int i) {
        if (i >= 40) {
            try {
                mo22386b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m29171h(this.f22338e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo22386b() {
        m29171h(0);
    }

    /* renamed from: c */
    public synchronized Object mo22387c(int i, Class cls) {
        C7683a aVar;
        Integer num = (Integer) m29176m(cls).ceilingKey(Integer.valueOf(i));
        if (m29179p(i, num)) {
            aVar = this.f22335b.mo22414e(num.intValue(), cls);
        } else {
            aVar = this.f22335b.mo22414e(i, cls);
        }
        return m29175l(aVar, cls);
    }

    /* renamed from: d */
    public synchronized Object mo22388d(int i, Class cls) {
        return m29175l(this.f22335b.mo22414e(i, cls), cls);
    }

    /* renamed from: e */
    public synchronized void mo22389e(Object obj) {
        Class<?> cls = obj.getClass();
        C7673a j = m29173j(cls);
        int c = j.mo22383c(obj);
        int a = j.mo22381a() * c;
        if (m29178o(a)) {
            C7683a e = this.f22335b.mo22414e(c, cls);
            this.f22334a.mo22400d(e, obj);
            NavigableMap m = m29176m(cls);
            Integer num = (Integer) m.get(Integer.valueOf(e.f22341b));
            Integer valueOf = Integer.valueOf(e.f22341b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m.put(valueOf, Integer.valueOf(i));
            this.f22339f += a;
            m29170g();
        }
    }
}
