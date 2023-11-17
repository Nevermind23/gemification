package p342j$.util.stream;

import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.b2 */
public abstract class C9632b2 implements C9652f2 {

    /* renamed from: a */
    protected final C9657g2 f26347a;

    public C9632b2(C9657g2 g2Var) {
        g2Var.getClass();
        this.f26347a = g2Var;
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public final /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
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

    /* renamed from: k */
    public final /* synthetic */ void mo25901k(Long l) {
        C9735w0.m35833u0(this, l);
    }

    /* renamed from: o */
    public void mo25694o() {
        this.f26347a.mo25694o();
    }

    /* renamed from: r */
    public boolean mo25696r() {
        return this.f26347a.mo25696r();
    }
}
