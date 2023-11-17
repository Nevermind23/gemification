package p342j$.lang;

import java.util.Collection;
import p342j$.util.DesugarCollections;
import p342j$.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-EL  reason: invalid class name */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof C9285b) {
            ((C9285b) iterable).mo24915a(consumer);
        } else if (iterable instanceof Collection) {
            consumer.getClass();
            for (Object accept : (Collection) iterable) {
                consumer.accept(accept);
            }
        } else if (DesugarCollections.f25924a.isInstance(iterable)) {
            DesugarCollections.m34576c(iterable, consumer);
        } else {
            consumer.getClass();
            for (Object accept2 : iterable) {
                consumer.accept(accept2);
            }
        }
    }
}
