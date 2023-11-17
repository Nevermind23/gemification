package p342j$.util;

import java.util.Comparator;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.P */
public interface C9371P {
    /* renamed from: a */
    void mo25169a(Consumer consumer);

    int characteristics();

    long estimateSize();

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    /* renamed from: m */
    boolean mo25179m(Consumer consumer);

    C9371P trySplit();
}
