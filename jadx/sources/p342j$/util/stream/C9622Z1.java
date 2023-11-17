package p342j$.util.stream;

import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.Z1 */
public abstract class C9622Z1 implements C9642d2 {

    /* renamed from: a */
    protected final C9657g2 f26338a;

    public C9622Z1(C9657g2 g2Var) {
        g2Var.getClass();
        this.f26338a = g2Var;
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

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    /* renamed from: o */
    public void mo25694o() {
        this.f26338a.mo25694o();
    }

    /* renamed from: r */
    public boolean mo25696r() {
        return this.f26338a.mo25696r();
    }

    /* renamed from: s */
    public final /* synthetic */ void mo25697s(Double d) {
        C9735w0.m35826q0(this, d);
    }
}
