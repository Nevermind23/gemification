package p342j$.util.function;

/* renamed from: j$.util.function.BiConsumer */
public interface BiConsumer<T, U> {

    /* renamed from: j$.util.function.BiConsumer$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {

        /* renamed from: a */
        public final /* synthetic */ java.util.function.BiConsumer f26070a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.f26070a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C9447a ? ((C9447a) biConsumer).f26095a : new VivifiedWrapper(biConsumer);
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.f26070a.accept(obj, obj2);
        }

        /* renamed from: c */
        public final /* synthetic */ BiConsumer mo25420c(BiConsumer biConsumer) {
            return convert(this.f26070a.andThen(C9447a.m34803a(biConsumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f26070a;
            }
            return this.f26070a.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.f26070a.hashCode();
        }
    }

    void accept(Object obj, Object obj2);

    /* renamed from: c */
    BiConsumer mo25420c(BiConsumer biConsumer);
}
