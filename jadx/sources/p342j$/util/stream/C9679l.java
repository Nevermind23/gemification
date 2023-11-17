package p342j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p342j$.util.function.C9447a;
import p342j$.util.function.C9455e;
import p342j$.util.function.C9492w0;
import p342j$.util.function.C9497z;

/* renamed from: j$.util.stream.l */
public final /* synthetic */ class C9679l implements Collector {

    /* renamed from: a */
    public final /* synthetic */ Collector f26414a;

    private /* synthetic */ C9679l(Collector collector) {
        this.f26414a = collector;
    }

    /* renamed from: a */
    public static /* synthetic */ Collector m35609a(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C9674k ? ((C9674k) collector).f26407a : new C9679l(collector);
    }

    public final /* synthetic */ BiConsumer accumulator() {
        return C9447a.m34803a(this.f26414a.accumulator());
    }

    public final /* synthetic */ Set characteristics() {
        return this.f26414a.characteristics();
    }

    public final /* synthetic */ BinaryOperator combiner() {
        return C9455e.m34811a(this.f26414a.combiner());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f26414a;
        if (obj instanceof C9679l) {
            obj = ((C9679l) obj).f26414a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ Function finisher() {
        return C9497z.m34853a(this.f26414a.finisher());
    }

    public final /* synthetic */ int hashCode() {
        return this.f26414a.hashCode();
    }

    public final /* synthetic */ Supplier supplier() {
        return C9492w0.m34848a(this.f26414a.supplier());
    }
}
