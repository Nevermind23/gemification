package p342j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.i */
public final /* synthetic */ class C9463i implements C9467k {

    /* renamed from: a */
    public final /* synthetic */ DoubleBinaryOperator f26111a;

    private /* synthetic */ C9463i(DoubleBinaryOperator doubleBinaryOperator) {
        this.f26111a = doubleBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ C9467k m34822a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C9465j ? ((C9465j) doubleBinaryOperator).f26113a : new C9463i(doubleBinaryOperator);
    }

    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f26111a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9463i) {
            obj = ((C9463i) obj).f26111a;
        }
        return this.f26111a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26111a.hashCode();
    }
}
