package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p342j$.util.function.C9461h;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.K */
public final /* synthetic */ class C9366K implements C9368M {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f25934a;

    private /* synthetic */ C9366K(Spliterator.OfPrimitive ofPrimitive) {
        this.f25934a = ofPrimitive;
    }

    /* renamed from: b */
    public static /* synthetic */ C9368M m34595b(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof C9367L ? ((C9367L) ofPrimitive).f25935a : ofPrimitive instanceof Spliterator.OfDouble ? C9357B.m34563b((Spliterator.OfDouble) ofPrimitive) : ofPrimitive instanceof Spliterator.OfInt ? C9360E.m34579b((Spliterator.OfInt) ofPrimitive) : ofPrimitive instanceof Spliterator.OfLong ? C9363H.m34587b((Spliterator.OfLong) ofPrimitive) : new C9366K(ofPrimitive);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        this.f25934a.forEachRemaining(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ int characteristics() {
        return this.f25934a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9366K) {
            obj = ((C9366K) obj).f25934a;
        }
        return this.f25934a.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25934a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f25934a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25934a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25934a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25934a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25934a.hashCode();
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return this.f25934a.tryAdvance(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f25934a.tryAdvance(obj);
    }
}
