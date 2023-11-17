package p342j$.util.function;

/* renamed from: j$.util.function.ToDoubleFunction */
public interface ToDoubleFunction<T> {

    /* renamed from: j$.util.function.ToDoubleFunction$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements ToDoubleFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToDoubleFunction f26086a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToDoubleFunction toDoubleFunction) {
            this.f26086a = toDoubleFunction;
        }

        public static /* synthetic */ ToDoubleFunction convert(java.util.function.ToDoubleFunction toDoubleFunction) {
            if (toDoubleFunction == null) {
                return null;
            }
            return toDoubleFunction instanceof C9496y0 ? ((C9496y0) toDoubleFunction).f26141a : new VivifiedWrapper(toDoubleFunction);
        }

        public final /* synthetic */ double applyAsDouble(Object obj) {
            return this.f26086a.applyAsDouble(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f26086a;
            }
            return this.f26086a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f26086a.hashCode();
        }
    }

    double applyAsDouble(Object obj);
}
