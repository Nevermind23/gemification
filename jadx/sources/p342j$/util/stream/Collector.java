package p342j$.util.stream;

import java.util.Set;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Function;

/* renamed from: j$.util.stream.Collector */
public interface Collector<T, A, R> {
    BiConsumer accumulator();

    Set characteristics();

    C9457f combiner();

    Function finisher();

    C9494x0 supplier();
}
