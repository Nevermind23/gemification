package p640vf;

import ge1.C41084a;

/* renamed from: vf.f */
public final class C18331f implements C41084a {

    /* renamed from: c */
    private static final Object f51780c = new Object();

    /* renamed from: a */
    private volatile C41084a f51781a;

    /* renamed from: b */
    private volatile Object f51782b = f51780c;

    private C18331f(C41084a aVar) {
        this.f51781a = aVar;
    }

    /* renamed from: a */
    public static C41084a m62681a(C41084a aVar) {
        if ((aVar instanceof C18331f) || (aVar instanceof C18327b)) {
            return aVar;
        }
        return new C18331f((C41084a) C18329d.m62675b(aVar));
    }

    public Object get() {
        Object obj = this.f51782b;
        if (obj != f51780c) {
            return obj;
        }
        C41084a aVar = this.f51781a;
        if (aVar == null) {
            return this.f51782b;
        }
        Object obj2 = aVar.get();
        this.f51782b = obj2;
        this.f51781a = null;
        return obj2;
    }
}
