package p342j$.util.function;

import p342j$.util.concurrent.C9407t;

/* renamed from: j$.util.function.Consumer */
public interface Consumer<T> {

    /* renamed from: j$.util.function.Consumer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
            consumer2.getClass();
            return new C9407t(3, consumer, consumer2);
        }
    }

    void accept(T t);

    Consumer<T> andThen(Consumer<? super T> consumer);
}
