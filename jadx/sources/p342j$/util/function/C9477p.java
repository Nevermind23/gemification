package p342j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.p */
public final /* synthetic */ class C9477p implements C9481r {

    /* renamed from: a */
    public final /* synthetic */ DoubleFunction f26122a;

    private /* synthetic */ C9477p(DoubleFunction doubleFunction) {
        this.f26122a = doubleFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9481r m34834a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return doubleFunction instanceof C9479q ? ((C9479q) doubleFunction).f26124a : new C9477p(doubleFunction);
    }

    public final /* synthetic */ Object apply(double d) {
        return this.f26122a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9477p) {
            obj = ((C9477p) obj).f26122a;
        }
        return this.f26122a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26122a.hashCode();
    }
}
