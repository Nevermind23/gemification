package p342j$.util;

import java.util.PrimitiveIterator;
import p342j$.util.function.C9427F;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9461h;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.s */
public final /* synthetic */ class C9512s implements C9755u, C9502i {

    /* renamed from: a */
    public final /* synthetic */ PrimitiveIterator.OfInt f26160a;

    private /* synthetic */ C9512s(PrimitiveIterator.OfInt ofInt) {
        this.f26160a = ofInt;
    }

    /* renamed from: b */
    public static /* synthetic */ C9755u m34884b(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C9754t ? ((C9754t) ofInt).f26536a : new C9512s(ofInt);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25279a(Consumer consumer) {
        this.f26160a.forEachRemaining(C9461h.m34819a(consumer));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25281c(C9428G g) {
        this.f26160a.forEachRemaining(C9427F.m34780a(g));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PrimitiveIterator.OfInt ofInt = this.f26160a;
        if (obj instanceof C9512s) {
            obj = ((C9512s) obj).f26160a;
        }
        return ofInt.equals(obj);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f26160a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f26160a.hasNext();
    }

    public final /* synthetic */ int hashCode() {
        return this.f26160a.hashCode();
    }

    public final /* synthetic */ int nextInt() {
        return this.f26160a.nextInt();
    }

    public final /* synthetic */ void remove() {
        this.f26160a.remove();
    }
}
