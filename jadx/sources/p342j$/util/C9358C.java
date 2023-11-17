package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p342j$.util.function.C9459g;
import p342j$.util.function.C9471m;

/* renamed from: j$.util.C */
public final /* synthetic */ class C9358C implements Spliterator.OfDouble {

    /* renamed from: a */
    public final /* synthetic */ C9359D f25923a;

    private /* synthetic */ C9358C(C9359D d) {
        this.f25923a = d;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfDouble m34568a(C9359D d) {
        if (d == null) {
            return null;
        }
        return d instanceof C9357B ? ((C9357B) d).f25922a : new C9358C(d);
    }

    public final /* synthetic */ int characteristics() {
        return this.f25923a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9359D d = this.f25923a;
        if (obj instanceof C9358C) {
            obj = ((C9358C) obj).f25923a;
        }
        return d.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25923a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f25923a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f25923a.mo25169a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f25923a.mo25171e(C9471m.m34828a(doubleConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25923a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25923a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25923a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25923a.hashCode();
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f25923a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f25923a.mo25179m(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f25923a.mo25178j(C9471m.m34828a(doubleConsumer));
    }
}
