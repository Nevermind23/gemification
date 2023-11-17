package p342j$.util.stream;

import java.util.Iterator;
import p342j$.util.C9371P;

/* renamed from: j$.util.stream.i */
public interface C9664i extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    C9664i onClose(Runnable runnable);

    C9664i parallel();

    C9664i sequential();

    C9371P spliterator();

    C9664i unordered();
}
