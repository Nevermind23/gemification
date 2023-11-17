package p342j$.util;

import java.util.NoSuchElementException;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.U */
final class C9375U implements C9510q, C9475o, C9502i {

    /* renamed from: a */
    boolean f25949a = false;

    /* renamed from: b */
    double f25950b;

    /* renamed from: c */
    final /* synthetic */ C9359D f25951c;

    C9375U(C9359D d) {
        this.f25951c = d;
    }

    /* renamed from: a */
    public final void mo25279a(Consumer consumer) {
        if (consumer instanceof C9475o) {
            forEachRemaining((C9475o) consumer);
            return;
        }
        consumer.getClass();
        if (!C9500g0.f26146a) {
            forEachRemaining(new C9507n(consumer));
        } else {
            C9500g0.m34857a(C9375U.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
    }

    public final void accept(double d) {
        this.f25949a = true;
        this.f25950b = d;
    }

    /* renamed from: e */
    public final void forEachRemaining(C9475o oVar) {
        oVar.getClass();
        while (hasNext()) {
            oVar.accept(nextDouble());
        }
    }

    public final boolean hasNext() {
        if (!this.f25949a) {
            this.f25951c.mo25178j(this);
        }
        return this.f25949a;
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    public final Double next() {
        if (!C9500g0.f26146a) {
            return Double.valueOf(nextDouble());
        }
        C9500g0.m34857a(C9375U.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    public final double nextDouble() {
        if (this.f25949a || hasNext()) {
            this.f25949a = false;
            return this.f25950b;
        }
        throw new NoSuchElementException();
    }
}
