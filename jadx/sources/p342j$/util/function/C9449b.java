package p342j$.util.function;

import java.util.function.BiFunction;
import java.util.function.Function;
import p342j$.util.function.BiFunction;
import p342j$.util.function.Function;

/* renamed from: j$.util.function.b */
public final /* synthetic */ class C9449b implements BiFunction {

    /* renamed from: a */
    public final /* synthetic */ BiFunction f26096a;

    private /* synthetic */ C9449b(BiFunction biFunction) {
        this.f26096a = biFunction;
    }

    /* renamed from: a */
    public static /* synthetic */ BiFunction m34804a(BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof BiFunction.VivifiedWrapper ? ((BiFunction.VivifiedWrapper) biFunction).f26071a : biFunction instanceof C9457f ? C9455e.m34811a((C9457f) biFunction) : new C9449b(biFunction);
    }

    public final /* synthetic */ java.util.function.BiFunction andThen(Function function) {
        return m34804a(this.f26096a.mo25417a(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f26096a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiFunction biFunction = this.f26096a;
        if (obj instanceof C9449b) {
            obj = ((C9449b) obj).f26096a;
        }
        return biFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26096a.hashCode();
    }
}
