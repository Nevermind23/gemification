package p342j$.util.stream;

import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9480q0;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.x1 */
final class C9741x1 extends C9587Q1 implements C9583P1, C9652f2 {

    /* renamed from: b */
    final /* synthetic */ C9494x0 f26522b;

    /* renamed from: c */
    final /* synthetic */ C9480q0 f26523c;

    /* renamed from: d */
    final /* synthetic */ C9457f f26524d;

    C9741x1(C9494x0 x0Var, C9480q0 q0Var, C9457f fVar) {
        this.f26522b = x0Var;
        this.f26523c = q0Var;
        this.f26524d = fVar;
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final void accept(long j) {
        this.f26523c.accept(this.f26269a, j);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25901k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        this.f26269a = this.f26524d.apply(this.f26269a, ((C9741x1) p1).f26269a);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo25901k(Long l) {
        C9735w0.m35833u0(this, l);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26269a = this.f26522b.get();
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
