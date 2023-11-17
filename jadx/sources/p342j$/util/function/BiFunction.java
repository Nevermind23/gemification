package p342j$.util.function;

import java.util.function.BinaryOperator;

/* renamed from: j$.util.function.BiFunction */
public interface BiFunction<T, U, R> {

    /* renamed from: j$.util.function.BiFunction$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiFunction f26071a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.f26071a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof C9449b ? ((C9449b) biFunction).f26096a : biFunction instanceof BinaryOperator ? C9453d.m34808b((BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        /* renamed from: a */
        public final /* synthetic */ BiFunction mo25417a(Function function) {
            return convert(this.f26071a.andThen(C9497z.m34853a(function)));
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.f26071a.apply(obj, obj2);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f26071a;
            }
            return this.f26071a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f26071a.hashCode();
        }
    }

    /* renamed from: a */
    BiFunction mo25417a(Function function);

    Object apply(Object obj, Object obj2);
}
