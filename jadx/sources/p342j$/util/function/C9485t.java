package p342j$.util.function;

import java.util.function.DoubleToIntFunction;

/* renamed from: j$.util.function.t */
public final /* synthetic */ class C9485t {

    /* renamed from: a */
    public final /* synthetic */ DoubleToIntFunction f26130a;

    private /* synthetic */ C9485t(DoubleToIntFunction doubleToIntFunction) {
        this.f26130a = doubleToIntFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9485t m34840a(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return new C9485t(doubleToIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9485t) {
            obj = ((C9485t) obj).f26130a;
        }
        return this.f26130a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26130a.hashCode();
    }
}
