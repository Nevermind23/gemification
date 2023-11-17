package p194o5;

import ge1.C41084a;

/* renamed from: o5.a */
public final class C7457a implements C41084a {

    /* renamed from: c */
    private static final Object f21745c = new Object();

    /* renamed from: a */
    private volatile C41084a f21746a;

    /* renamed from: b */
    private volatile Object f21747b = f21745c;

    private C7457a(C41084a aVar) {
        this.f21746a = aVar;
    }

    /* renamed from: a */
    public static C41084a m28356a(C41084a aVar) {
        C7460d.m28360b(aVar);
        if (aVar instanceof C7457a) {
            return aVar;
        }
        return new C7457a(aVar);
    }

    /* renamed from: b */
    public static Object m28357b(Object obj, Object obj2) {
        boolean z;
        if (obj != f21745c) {
            z = true;
        } else {
            z = false;
        }
        if (!z || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public Object get() {
        Object obj = this.f21747b;
        Object obj2 = f21745c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f21747b;
                if (obj == obj2) {
                    obj = this.f21746a.get();
                    this.f21747b = m28357b(this.f21747b, obj);
                    this.f21746a = null;
                }
            }
        }
        return obj;
    }
}
