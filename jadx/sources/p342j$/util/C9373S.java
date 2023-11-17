package p342j$.util;

import java.util.NoSuchElementException;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.S */
final class C9373S implements C9755u, C9428G, C9502i {

    /* renamed from: a */
    boolean f25943a = false;

    /* renamed from: b */
    int f25944b;

    /* renamed from: c */
    final /* synthetic */ C9362G f25945c;

    C9373S(C9362G g) {
        this.f25945c = g;
    }

    /* renamed from: a */
    public final void mo25279a(Consumer consumer) {
        if (consumer instanceof C9428G) {
            forEachRemaining((C9428G) consumer);
            return;
        }
        consumer.getClass();
        if (!C9500g0.f26146a) {
            forEachRemaining(new C9511r(consumer));
        } else {
            C9500g0.m34857a(C9373S.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
    }

    public final void accept(int i) {
        this.f25943a = true;
        this.f25944b = i;
    }

    /* renamed from: c */
    public final void forEachRemaining(C9428G g) {
        g.getClass();
        while (hasNext()) {
            g.accept(nextInt());
        }
    }

    public final boolean hasNext() {
        if (!this.f25943a) {
            this.f25945c.mo25205g(this);
        }
        return this.f25943a;
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    public final Integer next() {
        if (!C9500g0.f26146a) {
            return Integer.valueOf(nextInt());
        }
        C9500g0.m34857a(C9373S.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    public final int nextInt() {
        if (this.f25943a || hasNext()) {
            this.f25943a = false;
            return this.f25944b;
        }
        throw new NoSuchElementException();
    }
}
