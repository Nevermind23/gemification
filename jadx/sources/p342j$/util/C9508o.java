package p342j$.util;

import java.util.PrimitiveIterator;
import p342j$.util.function.C9461h;
import p342j$.util.function.C9473n;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.o */
public final /* synthetic */ class C9508o implements C9510q, C9502i {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfDouble f26157a;

    private /* synthetic */ C9508o(PrimitiveIterator.OfDouble ofDouble) {
        this.f26157a = ofDouble;
    }

    /* renamed from: b */
    public static /* synthetic */ C9510q m34877b(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C9509p ? ((C9509p) ofDouble).f26158a : new C9508o(ofDouble);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25279a(Consumer consumer) {
        this.f26157a.forEachRemaining(C9461h.m34819a(consumer));
    }

    /* renamed from: e */
    public final /* synthetic */ void mo25294e(C9475o oVar) {
        this.f26157a.forEachRemaining(C9473n.m34831a(oVar));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfDouble ofDouble = this.f26157a;
        if (obj instanceof C9508o) {
            obj = ((C9508o) obj).f26157a;
        }
        return ofDouble.equals(obj);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26157a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f26157a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26157a.hashCode();
    }

    public final /* synthetic */ double nextDouble() {
        return this.f26157a.nextDouble();
    }

    public final /* synthetic */ void remove() {
        this.f26157a.remove();
    }
}
