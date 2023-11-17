package p342j$.util.stream;

import p342j$.util.function.C9467k;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.z1 */
final class C9751z1 implements C9583P1, C9642d2 {

    /* renamed from: a */
    private double f26532a;

    /* renamed from: b */
    final /* synthetic */ double f26533b;

    /* renamed from: c */
    final /* synthetic */ C9467k f26534c;

    C9751z1(double d, C9467k kVar) {
        this.f26533b = d;
        this.f26534c = kVar;
    }

    public final void accept(double d) {
        this.f26532a = this.f26534c.applyAsDouble(this.f26532a, d);
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

    public final Object get() {
        return Double.valueOf(this.f26532a);
    }

    /* renamed from: i */
    public final void mo25693i(C9583P1 p1) {
        accept(((C9751z1) p1).f26532a);
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
        this.f26532a = this.f26533b;
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
