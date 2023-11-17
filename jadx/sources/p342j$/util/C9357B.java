package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p342j$.util.function.C9461h;
import p342j$.util.function.C9473n;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.B */
public final /* synthetic */ class C9357B implements C9359D {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f25922a;

    private /* synthetic */ C9357B(Spliterator.OfDouble ofDouble) {
        this.f25922a = ofDouble;
    }

    /* renamed from: b */
    public static /* synthetic */ C9359D m34563b(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C9358C ? ((C9358C) ofDouble).f25923a : new C9357B(ofDouble);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        this.f25922a.forEachRemaining(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ int characteristics() {
        return this.f25922a.characteristics();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo25171e(C9475o oVar) {
        this.f25922a.forEachRemaining(C9473n.m34831a(oVar));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9357B) {
            obj = ((C9357B) obj).f25922a;
        }
        return this.f25922a.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25922a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f25922a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25922a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25922a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25922a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25922a.hashCode();
    }

    /* renamed from: j */
    public final /* synthetic */ boolean mo25178j(C9475o oVar) {
        return this.f25922a.tryAdvance(C9473n.m34831a(oVar));
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return this.f25922a.tryAdvance(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f25922a.tryAdvance(obj);
    }
}
