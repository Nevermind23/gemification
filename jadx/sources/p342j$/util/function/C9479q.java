package p342j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.q */
public final /* synthetic */ class C9479q implements DoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ C9481r f26124a;

    private /* synthetic */ C9479q(C9481r rVar) {
        this.f26124a = rVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleFunction m34836a(C9481r rVar) {
        if (rVar == null) {
            return null;
        }
        return rVar instanceof C9477p ? ((C9477p) rVar).f26122a : new C9479q(rVar);
    }

    public final /* synthetic */ Object apply(double d) {
        return this.f26124a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9481r rVar = this.f26124a;
        if (obj instanceof C9479q) {
            obj = ((C9479q) obj).f26124a;
        }
        return rVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26124a.hashCode();
    }
}
