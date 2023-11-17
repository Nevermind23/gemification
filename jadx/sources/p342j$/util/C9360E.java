package p342j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p342j$.util.function.C9427F;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9461h;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.E */
public final /* synthetic */ class C9360E implements C9362G {

    /* renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f25930a;

    private /* synthetic */ C9360E(Spliterator.OfInt ofInt) {
        this.f25930a = ofInt;
    }

    /* renamed from: b */
    public static /* synthetic */ C9362G m34579b(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C9361F ? ((C9361F) ofInt).f25931a : new C9360E(ofInt);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        this.f25930a.forEachRemaining(C9461h.m34819a(consumer));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25203c(C9428G g) {
        this.f25930a.forEachRemaining(C9427F.m34780a(g));
    }

    public final /* synthetic */ int characteristics() {
        return this.f25930a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C9360E) {
            obj = ((C9360E) obj).f25930a;
        }
        return this.f25930a.equals(obj);
    }

    public final /* synthetic */ long estimateSize() {
        return this.f25930a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f25930a.forEachRemaining(obj);
    }

    /* renamed from: g */
    public final /* synthetic */ boolean mo25205g(C9428G g) {
        return this.f25930a.tryAdvance(C9427F.m34780a(g));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f25930a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f25930a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f25930a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25930a.hashCode();
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return this.f25930a.tryAdvance(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f25930a.tryAdvance(obj);
    }
}
