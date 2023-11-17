package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p342j$.util.function.C9459g;

/* renamed from: j$.util.L */
public final /* synthetic */ class C9367L implements Spliterator.OfPrimitive {

    /* renamed from: a */
    public final /* synthetic */ C9368M f25935a;

    private /* synthetic */ C9367L(C9368M m) {
        this.f25935a = m;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m34598a(C9368M m) {
        if (m == null) {
            return null;
        }
        return m instanceof C9366K ? ((C9366K) m).f25934a : m instanceof C9359D ? C9358C.m34568a((C9359D) m) : m instanceof C9362G ? C9361F.m34584a((C9362G) m) : m instanceof C9365J ? C9364I.m34592a((C9365J) m) : new C9367L(m);
    }

    public final /* synthetic */ int characteristics() {
        return this.f25935a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9368M m = this.f25935a;
        if (obj instanceof C9367L) {
            obj = ((C9367L) obj).f25935a;
        }
        return m.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25935a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f25935a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f25935a.mo25169a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25935a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25935a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25935a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25935a.hashCode();
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f25935a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f25935a.mo25179m(C9459g.m34817a(consumer));
    }
}
