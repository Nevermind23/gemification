package p342j$.util.function;

/* renamed from: j$.util.function.ToIntFunction */
public interface ToIntFunction<T> {

    /* renamed from: j$.util.function.ToIntFunction$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements ToIntFunction {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.ToIntFunction f26087a;

        private /* synthetic */ VivifiedWrapper(java.util.function.ToIntFunction toIntFunction) {
            this.f26087a = toIntFunction;
        }

        public static /* synthetic */ ToIntFunction convert(java.util.function.ToIntFunction toIntFunction) {
            if (toIntFunction == null) {
                return null;
            }
            return toIntFunction instanceof C9498z0 ? ((C9498z0) toIntFunction).f26143a : new VivifiedWrapper(toIntFunction);
        }

        public final /* synthetic */ int applyAsInt(Object obj) {
            return this.f26087a.applyAsInt(obj);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f26087a;
            }
            return this.f26087a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f26087a.hashCode();
        }
    }

    int applyAsInt(Object obj);
}
