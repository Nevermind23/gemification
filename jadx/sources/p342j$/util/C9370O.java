package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p342j$.util.function.C9459g;

/* renamed from: j$.util.O */
public final /* synthetic */ class C9370O implements Spliterator {

    /* renamed from: a */
    public final /* synthetic */ C9371P f25937a;

    private /* synthetic */ C9370O(C9371P p) {
        this.f25937a = p;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator m34602a(C9371P p) {
        if (p == null) {
            return null;
        }
        return p instanceof C9369N ? ((C9369N) p).f25936a : p instanceof C9368M ? C9367L.m34598a((C9368M) p) : new C9370O(p);
    }

    public final /* synthetic */ int characteristics() {
        return this.f25937a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9371P p = this.f25937a;
        if (obj instanceof C9370O) {
            obj = ((C9370O) obj).f25937a;
        }
        return p.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25937a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f25937a.mo25169a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25937a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25937a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25937a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25937a.hashCode();
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f25937a.mo25179m(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ Spliterator trySplit() {
        return m34602a(this.f25937a.trySplit());
    }
}
