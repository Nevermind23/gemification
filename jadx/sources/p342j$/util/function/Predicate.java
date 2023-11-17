package p342j$.util.function;

/* renamed from: j$.util.function.Predicate */
public interface Predicate<T> {

    /* renamed from: j$.util.function.Predicate$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Predicate $default$and(Predicate predicate, Predicate predicate2) {
            predicate2.getClass();
            return new C9482r0(predicate, predicate2, 0);
        }

        public static Predicate $default$negate(Predicate predicate) {
            return new C9484s0(predicate);
        }

        public static Predicate $default$or(Predicate predicate, Predicate predicate2) {
            predicate2.getClass();
            return new C9482r0(predicate, predicate2, 1);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    /* renamed from: or */
    Predicate<T> mo25500or(Predicate<? super T> predicate);

    boolean test(T t);
}
