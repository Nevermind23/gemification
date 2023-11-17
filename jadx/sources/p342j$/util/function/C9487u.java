package p342j$.util.function;

import java.util.function.DoubleToLongFunction;

/* renamed from: j$.util.function.u */
public final /* synthetic */ class C9487u implements C9491w {

    /* renamed from: a */
    public final /* synthetic */ DoubleToLongFunction f26132a;

    private /* synthetic */ C9487u(DoubleToLongFunction doubleToLongFunction) {
        this.f26132a = doubleToLongFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ C9491w m34843a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof C9489v ? ((C9489v) doubleToLongFunction).f26134a : new C9487u(doubleToLongFunction);
    }

    public final /* synthetic */ long applyAsLong(double d) {
        return this.f26132a.applyAsLong(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9487u) {
            obj = ((C9487u) obj).f26132a;
        }
        return this.f26132a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26132a.hashCode();
    }
}
