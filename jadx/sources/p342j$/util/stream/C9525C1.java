package p342j$.util.stream;

import p342j$.util.function.C9457f;
import p342j$.util.function.C9468k0;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.C1 */
final class C9525C1 extends C9587Q1 implements C9583P1, C9642d2 {

    /* renamed from: b */
    final /* synthetic */ C9494x0 f26174b;

    /* renamed from: c */
    final /* synthetic */ C9468k0 f26175c;

    /* renamed from: d */
    final /* synthetic */ C9457f f26176d;

    C9525C1(C9494x0 x0Var, C9468k0 k0Var, C9457f fVar) {
        this.f26174b = x0Var;
        this.f26175c = k0Var;
        this.f26176d = fVar;
    }

    public final void accept(double d) {
        this.f26175c.accept(this.f26269a, d);
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public final /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25697s((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        this.f26269a = this.f26176d.apply(this.f26269a, ((C9525C1) p1).f26269a);
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final void mo25695p(long j) {
        this.f26269a = this.f26174b.get();
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    /* renamed from: s */
    public final /* synthetic */ void mo25697s(Double d) {
        C9735w0.m35826q0(this, d);
    }
}
