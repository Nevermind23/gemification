package p342j$.util.stream;

import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9450b0;

/* renamed from: j$.util.stream.q0 */
final class C9705q0 extends C9715s0 implements C9652f2 {

    /* renamed from: c */
    final /* synthetic */ C9720t0 f26454c;

    /* renamed from: d */
    final /* synthetic */ C9450b0 f26455d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9705q0(C9450b0 b0Var, C9720t0 t0Var) {
        super(t0Var);
        this.f26454c = t0Var;
        this.f26455d = b0Var;
    }

    public final void accept(long j) {
        if (!this.f26475a) {
            boolean test = this.f26455d.f26097a.test(j);
            C9720t0 t0Var = this.f26454c;
            if (test == t0Var.f26481a) {
                this.f26475a = true;
                this.f26476b = t0Var.f26482b;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25901k((Long) obj);
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
}
