package p342j$.util.stream;

import p342j$.util.function.BiFunction;
import p342j$.util.function.C9457f;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.D1 */
final class C9530D1 extends C9587Q1 implements C9583P1 {

    /* renamed from: b */
    final /* synthetic */ Object f26180b;

    /* renamed from: c */
    final /* synthetic */ BiFunction f26181c;

    /* renamed from: d */
    final /* synthetic */ C9457f f26182d;

    C9530D1(Object obj, BiFunction biFunction, C9457f fVar) {
        this.f26180b = obj;
        this.f26181c = biFunction;
        this.f26182d = fVar;
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
        this.f26269a = this.f26181c.apply(this.f26269a, obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        this.f26269a = this.f26182d.apply(this.f26269a, ((C9530D1) p1).f26269a);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26269a = this.f26180b;
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
