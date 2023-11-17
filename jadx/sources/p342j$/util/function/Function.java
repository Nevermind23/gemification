package p342j$.util.function;

import java.util.function.UnaryOperator;

/* renamed from: j$.util.function.Function */
public interface Function<T, R> {

    /* renamed from: j$.util.function.Function$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements Function {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.Function f26076a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.f26076a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof C9497z ? ((C9497z) function).f26142a : function instanceof UnaryOperator ? C9423B0.m34770c((UnaryOperator) function) : new VivifiedWrapper(function);
        }

        /* renamed from: a */
        public final /* synthetic */ Function mo25463a(Function function) {
            return convert(this.f26076a.andThen(C9497z.m34853a(function)));
        }

        public final /* synthetic */ Object apply(Object obj) {
            return this.f26076a.apply(obj);
        }

        /* renamed from: b */
        public final /* synthetic */ Function mo25465b(Function function) {
            return convert(this.f26076a.compose(C9497z.m34853a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f26076a;
            }
            return this.f26076a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f26076a.hashCode();
        }
    }

    /* renamed from: a */
    Function mo25463a(Function function);

    Object apply(Object obj);

    /* renamed from: b */
    Function mo25465b(Function function);
}
