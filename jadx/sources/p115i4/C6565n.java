package p115i4;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import p334z4.C9207a;

/* renamed from: i4.n */
class C6565n implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: d */
    private HashMap f20030d;

    /* renamed from: i4.n$b */
    static class C6567b implements Serializable {
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: d */
        private final HashMap f20031d;

        private Object readResolve() {
            return new C6565n(this.f20031d);
        }

        private C6567b(HashMap hashMap) {
            this.f20031d = hashMap;
        }
    }

    public C6565n() {
        this.f20030d = new HashMap();
    }

    private Object writeReplace() {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return new C6567b(this.f20030d);
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* renamed from: a */
    public void mo20555a(C6530a aVar, List list) {
        if (!C9207a.m34024c(this)) {
            try {
                if (!this.f20030d.containsKey(aVar)) {
                    this.f20030d.put(aVar, list);
                } else {
                    ((List) this.f20030d.get(aVar)).addAll(list);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: b */
    public List mo20556b(C6530a aVar) {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return (List) this.f20030d.get(aVar);
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public Set mo20557c() {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            return this.f20030d.keySet();
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    public C6565n(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        this.f20030d = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
