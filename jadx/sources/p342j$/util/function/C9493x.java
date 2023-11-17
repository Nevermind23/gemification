package p342j$.util.function;

import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.function.x */
public final /* synthetic */ class C9493x {

    /* renamed from: a */
    public final /* synthetic */ DoubleUnaryOperator f26137a;

    private /* synthetic */ C9493x(DoubleUnaryOperator doubleUnaryOperator) {
        this.f26137a = doubleUnaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C9493x m34849a(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return new C9493x(doubleUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9493x) {
            obj = ((C9493x) obj).f26137a;
        }
        return this.f26137a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26137a.hashCode();
    }
}
