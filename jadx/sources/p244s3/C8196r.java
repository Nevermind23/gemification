package p244s3;

import androidx.core.util.C1005e;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p089g4.C6223k;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.r */
public class C8196r {

    /* renamed from: e */
    private static final C8199c f23365e = new C8199c();

    /* renamed from: f */
    private static final C8188n f23366f = new C8197a();

    /* renamed from: a */
    private final List f23367a;

    /* renamed from: b */
    private final C8199c f23368b;

    /* renamed from: c */
    private final Set f23369c;

    /* renamed from: d */
    private final C1005e f23370d;

    /* renamed from: s3.r$a */
    private static class C8197a implements C8188n {
        C8197a() {
        }

        /* renamed from: a */
        public C8188n.C8189a mo23326a(Object obj, int i, int i2, C7088h hVar) {
            return null;
        }

        /* renamed from: b */
        public boolean mo23327b(Object obj) {
            return false;
        }
    }

    /* renamed from: s3.r$b */
    private static class C8198b {

        /* renamed from: a */
        private final Class f23371a;

        /* renamed from: b */
        final Class f23372b;

        /* renamed from: c */
        final C8190o f23373c;

        public C8198b(Class cls, Class cls2, C8190o oVar) {
            this.f23371a = cls;
            this.f23372b = cls2;
            this.f23373c = oVar;
        }

        /* renamed from: a */
        public boolean mo23398a(Class cls) {
            return this.f23371a.isAssignableFrom(cls);
        }

        /* renamed from: b */
        public boolean mo23399b(Class cls, Class cls2) {
            return mo23398a(cls) && this.f23372b.isAssignableFrom(cls2);
        }
    }

    /* renamed from: s3.r$c */
    static class C8199c {
        C8199c() {
        }

        /* renamed from: a */
        public C8194q mo23400a(List list, C1005e eVar) {
            return new C8194q(list, eVar);
        }
    }

    public C8196r(C1005e eVar) {
        this(eVar, f23365e);
    }

    /* renamed from: a */
    private void m30914a(Class cls, Class cls2, C8190o oVar, boolean z) {
        int i;
        C8198b bVar = new C8198b(cls, cls2, oVar);
        List list = this.f23367a;
        if (z) {
            i = list.size();
        } else {
            i = 0;
        }
        list.add(i, bVar);
    }

    /* renamed from: e */
    private C8188n m30915e(C8198b bVar) {
        return (C8188n) C6223k.m24730d(bVar.f23373c.mo23331d(this));
    }

    /* renamed from: f */
    private static C8188n m30916f() {
        return f23366f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo23394b(Class cls, Class cls2, C8190o oVar) {
        m30914a(cls, cls2, oVar, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List mo23395c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C8198b bVar : this.f23367a) {
                if (!this.f23369c.contains(bVar)) {
                    if (bVar.mo23398a(cls)) {
                        this.f23369c.add(bVar);
                        arrayList.add(m30915e(bVar));
                        this.f23369c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f23369c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: d */
    public synchronized C8188n mo23396d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (C8198b bVar : this.f23367a) {
                if (this.f23369c.contains(bVar)) {
                    z = true;
                } else if (bVar.mo23399b(cls, cls2)) {
                    this.f23369c.add(bVar);
                    arrayList.add(m30915e(bVar));
                    this.f23369c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f23368b.mo23400a(arrayList, this.f23370d);
            } else if (arrayList.size() == 1) {
                return (C8188n) arrayList.get(0);
            } else if (z) {
                return m30916f();
            } else {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.f23369c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized List mo23397g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C8198b bVar : this.f23367a) {
            if (!arrayList.contains(bVar.f23372b) && bVar.mo23398a(cls)) {
                arrayList.add(bVar.f23372b);
            }
        }
        return arrayList;
    }

    C8196r(C1005e eVar, C8199c cVar) {
        this.f23367a = new ArrayList();
        this.f23369c = new HashSet();
        this.f23370d = eVar;
        this.f23368b = cVar;
    }
}
