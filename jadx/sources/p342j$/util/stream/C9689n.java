package p342j$.util.stream;

import java.util.Set;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Function;

/* renamed from: j$.util.stream.n */
final class C9689n implements Collector {

    /* renamed from: a */
    private final C9494x0 f26425a;

    /* renamed from: b */
    private final BiConsumer f26426b;

    /* renamed from: c */
    private final C9457f f26427c;

    /* renamed from: d */
    private final Function f26428d;

    /* renamed from: e */
    private final Set f26429e;

    C9689n(C9566L0 l0, C9566L0 l02, C9684m mVar, Set set) {
        Set set2 = Collectors.f26178a;
        C9629b bVar = new C9629b(1);
        this.f26425a = l0;
        this.f26426b = l02;
        this.f26427c = mVar;
        this.f26428d = bVar;
        this.f26429e = set;
    }

    public final BiConsumer accumulator() {
        return this.f26426b;
    }

    public final Set characteristics() {
        return this.f26429e;
    }

    public final C9457f combiner() {
        return this.f26427c;
    }

    public final Function finisher() {
        return this.f26428d;
    }

    public final C9494x0 supplier() {
        return this.f26425a;
    }
}
