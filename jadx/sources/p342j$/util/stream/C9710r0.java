package p342j$.util.stream;

import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.C9483s;

/* renamed from: j$.util.stream.r0 */
final class C9710r0 extends C9715s0 implements C9642d2 {

    /* renamed from: c */
    final /* synthetic */ C9720t0 f26463c;

    /* renamed from: d */
    final /* synthetic */ C9483s f26464d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9710r0(C9483s sVar, C9720t0 t0Var) {
        super(t0Var);
        this.f26463c = t0Var;
        this.f26464d = sVar;
    }

    public final void accept(double d) {
        if (!this.f26475a) {
            boolean test = this.f26464d.f26128a.test(d);
            C9720t0 t0Var = this.f26463c;
            if (test == t0Var.f26481a) {
                this.f26475a = true;
                this.f26476b = t0Var.f26482b;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25697s((Double) obj);
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    /* renamed from: s */
    public final /* synthetic */ void mo25697s(Double d) {
        C9735w0.m35826q0(this, d);
    }
}
