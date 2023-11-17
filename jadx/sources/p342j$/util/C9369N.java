package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p342j$.util.function.C9461h;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.N */
public final /* synthetic */ class C9369N implements C9371P {

    /* renamed from: a */
    public final /* synthetic */ Spliterator f25936a;

    private /* synthetic */ C9369N(Spliterator spliterator) {
        this.f25936a = spliterator;
    }

    /* renamed from: b */
    public static /* synthetic */ C9371P m34599b(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        return spliterator instanceof C9370O ? ((C9370O) spliterator).f25937a : spliterator instanceof Spliterator.OfPrimitive ? C9366K.m34595b((Spliterator.OfPrimitive) spliterator) : new C9369N(spliterator);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        this.f25936a.forEachRemaining(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ int characteristics() {
        return this.f25936a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9369N) {
            obj = ((C9369N) obj).f25936a;
        }
        return this.f25936a.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25936a.estimateSize();
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25936a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25936a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25936a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25936a.hashCode();
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return this.f25936a.tryAdvance(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ C9371P trySplit() {
        return m34599b(this.f25936a.trySplit());
    }
}
