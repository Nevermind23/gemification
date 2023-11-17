package p342j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.P */
public final /* synthetic */ class C9437P {

    /* renamed from: a */
    public final /* synthetic */ IntUnaryOperator f26083a;

    private /* synthetic */ C9437P(IntUnaryOperator intUnaryOperator) {
        this.f26083a = intUnaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C9437P m34792a(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return new C9437P(intUnaryOperator);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9437P) {
            obj = ((C9437P) obj).f26083a;
        }
        return this.f26083a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26083a.hashCode();
    }
}
