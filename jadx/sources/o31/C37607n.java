package o31;

import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

/* renamed from: o31.n */
final class C37607n extends ThreadLocal {

    /* renamed from: a */
    private final C43064a f90355a;

    public C37607n(C43064a aVar) {
        C41536l.m120489i(aVar, "supplier");
        this.f90355a = aVar;
    }

    /* renamed from: a */
    public final Object mo90790a() {
        Object obj = get();
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* access modifiers changed from: protected */
    public Object initialValue() {
        return this.f90355a.invoke();
    }
}
