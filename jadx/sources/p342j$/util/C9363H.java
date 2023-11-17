package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p342j$.util.function.C9443W;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9461h;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.H */
public final /* synthetic */ class C9363H implements C9365J {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f25932a;

    private /* synthetic */ C9363H(Spliterator.OfLong ofLong) {
        this.f25932a = ofLong;
    }

    /* renamed from: b */
    public static /* synthetic */ C9365J m34587b(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C9364I ? ((C9364I) ofLong).f25933a : new C9363H(ofLong);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        this.f25932a.forEachRemaining(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ int characteristics() {
        return this.f25932a.characteristics();
    }

    /* renamed from: d */
    public final /* synthetic */ void mo25221d(C9444X x) {
        this.f25932a.forEachRemaining(C9443W.m34799a(x));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9363H) {
            obj = ((C9363H) obj).f25932a;
        }
        return this.f25932a.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25932a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f25932a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25932a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25932a.getExactSizeIfKnown();
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo25223h(C9444X x) {
        return this.f25932a.tryAdvance(C9443W.m34799a(x));
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25932a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25932a.hashCode();
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return this.f25932a.tryAdvance(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f25932a.tryAdvance(obj);
    }
}
