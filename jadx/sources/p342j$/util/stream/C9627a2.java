package p342j$.util.stream;

import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.a2 */
public abstract class C9627a2 implements C9647e2 {

    /* renamed from: a */
    protected final C9657g2 f26342a;

    public C9627a2(C9657g2 g2Var) {
        g2Var.getClass();
        this.f26342a = g2Var;
    }

    public final /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
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

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    /* renamed from: o */
    public void mo25694o() {
        this.f26342a.mo25694o();
    }

    /* renamed from: q */
    public final /* synthetic */ void mo25881q(Integer num) {
        C9735w0.m35829s0(this, num);
    }

    /* renamed from: r */
    public boolean mo25696r() {
        return this.f26342a.mo25696r();
    }
}
