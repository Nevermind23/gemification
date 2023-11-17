package p342j$.util;

import java.util.NoSuchElementException;
import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.T */
final class C9374T implements C9759y, C9444X, C9502i {

    /* renamed from: a */
    boolean f25946a = false;

    /* renamed from: b */
    long f25947b;

    /* renamed from: c */
    final /* synthetic */ C9365J f25948c;

    C9374T(C9365J j) {
        this.f25948c = j;
    }

    /* renamed from: a */
    public final void mo25279a(Consumer consumer) {
        if (consumer instanceof C9444X) {
            forEachRemaining((C9444X) consumer);
            return;
        }
        consumer.getClass();
        if (!C9500g0.f26146a) {
            forEachRemaining(new C9756v(consumer));
        } else {
            C9500g0.m34857a(C9374T.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
    }

    public final void accept(long j) {
        this.f25946a = true;
        this.f25947b = j;
    }

    /* renamed from: d */
    public final void forEachRemaining(C9444X x) {
        x.getClass();
        while (hasNext()) {
            x.accept(nextLong());
        }
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }

    public final boolean hasNext() {
        if (!this.f25946a) {
            this.f25948c.mo25223h(this);
        }
        return this.f25946a;
    }

    public final Long next() {
        if (!C9500g0.f26146a) {
            return Long.valueOf(nextLong());
        }
        C9500g0.m34857a(C9374T.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    public final long nextLong() {
        if (this.f25946a || hasNext()) {
            this.f25946a = false;
            return this.f25947b;
        }
        throw new NoSuchElementException();
    }
}
