package p342j$.util.stream;

import java.util.Set;
import java.util.stream.Collector;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9453d;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9490v0;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Function;

/* renamed from: j$.util.stream.k */
public final /* synthetic */ class C9674k implements Collector {

    /* renamed from: a */
    public final /* synthetic */ Collector f26407a;

    private /* synthetic */ C9674k(Collector collector) {
        this.f26407a = collector;
    }

    /* renamed from: a */
    public static /* synthetic */ Collector m35565a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C9679l ? ((C9679l) collector).f26414a : new C9674k(collector);
    }

    public final /* synthetic */ BiConsumer accumulator() {
        return BiConsumer.VivifiedWrapper.convert(this.f26407a.accumulator());
    }

    public final /* synthetic */ Set characteristics() {
        return this.f26407a.characteristics();
    }

    public final /* synthetic */ C9457f combiner() {
        return C9453d.m34808b(this.f26407a.combiner());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9674k) {
            obj = ((C9674k) obj).f26407a;
        }
        return this.f26407a.equals(obj);
    }

    public final /* synthetic */ Function finisher() {
        return Function.VivifiedWrapper.convert(this.f26407a.finisher());
    }

    public final /* synthetic */ int hashCode() {
        return this.f26407a.hashCode();
    }

    public final /* synthetic */ C9494x0 supplier() {
        return C9490v0.m34847a(this.f26407a.supplier());
    }
}
