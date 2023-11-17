package p342j$.util.stream;

import p342j$.util.Optional;
import p342j$.util.function.C9457f;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.E1 */
final class C9535E1 implements C9583P1 {

    /* renamed from: a */
    private boolean f26188a;

    /* renamed from: b */
    private Object f26189b;

    /* renamed from: c */
    final /* synthetic */ C9457f f26190c;

    C9535E1(C9457f fVar) {
        this.f26190c = fVar;
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final void accept(Object obj) {
        if (this.f26188a) {
            this.f26188a = false;
        } else {
            obj = this.f26190c.apply(this.f26189b, obj);
        }
        this.f26189b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final Object get() {
        return this.f26188a ? Optional.m34603a() : Optional.m34604d(this.f26189b);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        C9535E1 e1 = (C9535E1) p1;
        if (!e1.f26188a) {
            accept(e1.f26189b);
        }
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26188a = true;
        this.f26189b = null;
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
