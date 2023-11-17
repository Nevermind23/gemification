package p342j$.util.stream;

import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9474n0;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.L1 */
final class C9567L1 extends C9587Q1 implements C9583P1, C9647e2 {

    /* renamed from: b */
    final /* synthetic */ C9494x0 f26240b;

    /* renamed from: c */
    final /* synthetic */ C9474n0 f26241c;

    /* renamed from: d */
    final /* synthetic */ C9457f f26242d;

    C9567L1(C9494x0 x0Var, C9474n0 n0Var, C9457f fVar) {
        this.f26240b = x0Var;
        this.f26241c = n0Var;
        this.f26242d = fVar;
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final void accept(int i) {
        this.f26241c.accept(this.f26269a, i);
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25881q((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        this.f26269a = this.f26242d.apply(this.f26269a, ((C9567L1) p1).f26269a);
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26269a = this.f26240b.get();
    }

    /* renamed from: q */
    public final /* synthetic */ void mo25881q(Integer num) {
        C9735w0.m35829s0(this, num);
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }
}
