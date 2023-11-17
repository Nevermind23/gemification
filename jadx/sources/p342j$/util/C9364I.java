package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p342j$.util.function.C9442V;
import p342j$.util.function.C9459g;

/* renamed from: j$.util.I */
public final /* synthetic */ class C9364I implements Spliterator.OfLong {

    /* renamed from: a */
    public final /* synthetic */ C9365J f25933a;

    private /* synthetic */ C9364I(C9365J j) {
        this.f25933a = j;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfLong m34592a(C9365J j) {
        if (j == null) {
            return null;
        }
        return j instanceof C9363H ? ((C9363H) j).f25932a : new C9364I(j);
    }

    public final /* synthetic */ int characteristics() {
        return this.f25933a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9365J j = this.f25933a;
        if (obj instanceof C9364I) {
            obj = ((C9364I) obj).f25933a;
        }
        return j.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25933a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f25933a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f25933a.mo25169a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f25933a.mo25221d(C9442V.m34797a(longConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25933a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25933a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25933a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25933a.hashCode();
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f25933a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f25933a.mo25179m(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f25933a.mo25223h(C9442V.m34797a(longConsumer));
    }
}
