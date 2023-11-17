package p640vf;

import ge1.C41084a;

/* renamed from: vf.b */
public final class C18327b implements C41084a {

    /* renamed from: c */
    private static final Object f51775c = new Object();

    /* renamed from: a */
    private volatile C41084a f51776a;

    /* renamed from: b */
    private volatile Object f51777b = f51775c;

    private C18327b(C41084a aVar) {
        this.f51776a = aVar;
    }

    /* renamed from: a */
    public static C41084a m62669a(C41084a aVar) {
        C18329d.m62675b(aVar);
        if (aVar instanceof C18327b) {
            return aVar;
        }
        return new C18327b(aVar);
    }

    /* renamed from: b */
    private static Object m62670b(Object obj, Object obj2) {
        boolean z;
        if (obj != f51775c) {
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
        Object obj = this.f51777b;
        Object obj2 = f51775c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f51777b;
                if (obj == obj2) {
                    obj = this.f51776a.get();
                    this.f51777b = m62670b(this.f51777b, obj);
                    this.f51776a = null;
                }
            }
        }
        return obj;
    }
}
