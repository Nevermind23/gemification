package p342j$.util.stream;

import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.S */
final class C9592S extends C9596T {

    /* renamed from: b */
    final Consumer f26274b;

    C9592S(Consumer consumer, boolean z) {
        super(z);
        this.f26274b = consumer;
    }

    public final void accept(Object obj) {
        this.f26274b.accept(obj);
    }
}
