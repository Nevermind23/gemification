package p342j$.util.function;

/* renamed from: j$.util.function.ToLongFunction */
public interface ToLongFunction<T> {

    /* renamed from: j$.util.function.ToLongFunction$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements ToLongFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToLongFunction f26088a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToLongFunction toLongFunction) {
            this.f26088a = toLongFunction;
        }

        public static /* synthetic */ ToLongFunction convert(java.util.function.ToLongFunction toLongFunction) {
            if (toLongFunction == null) {
                return null;
            }
            return toLongFunction instanceof C9421A0 ? ((C9421A0) toLongFunction).f26067a : new VivifiedWrapper(toLongFunction);
        }

        public final /* synthetic */ long applyAsLong(Object obj) {
            return this.f26088a.applyAsLong(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f26088a;
            }
            return this.f26088a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f26088a.hashCode();
        }
    }

    long applyAsLong(Object obj);
}
