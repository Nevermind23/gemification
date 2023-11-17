package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p342j$.util.function.C9426E;
import p342j$.util.function.C9459g;

/* renamed from: j$.util.F */
public final /* synthetic */ class C9361F implements Spliterator.OfInt {

    /* renamed from: a */
    public final /* synthetic */ C9362G f25931a;

    private /* synthetic */ C9361F(C9362G g) {
        this.f25931a = g;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfInt m34584a(C9362G g) {
        if (g == null) {
            return null;
        }
        return g instanceof C9360E ? ((C9360E) g).f25930a : new C9361F(g);
    }

    public final /* synthetic */ int characteristics() {
        return this.f25931a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9362G g = this.f25931a;
        if (obj instanceof C9361F) {
            obj = ((C9361F) obj).f25931a;
        }
        return g.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25931a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f25931a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f25931a.mo25169a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f25931a.mo25203c(C9426E.m34778a(intConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25931a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25931a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25931a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25931a.hashCode();
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f25931a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f25931a.mo25179m(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f25931a.mo25205g(C9426E.m34778a(intConsumer));
    }
}
