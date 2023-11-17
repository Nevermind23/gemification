package p342j$.util.stream;

import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;

/* renamed from: j$.util.stream.f0 */
public final /* synthetic */ class C9650f0 implements C9444X {

    /* renamed from: a */
    public final /* synthetic */ int f26381a;

    /* renamed from: b */
    public final /* synthetic */ C9657g2 f26382b;

    public /* synthetic */ C9650f0(int i, C9657g2 g2Var) {
        this.f26381a = i;
        this.f26382b = g2Var;
    }

    public final void accept(long j) {
        int i = this.f26381a;
        C9657g2 g2Var = this.f26382b;
        switch (i) {
            case 0:
                g2Var.accept(j);
                return;
            default:
                ((C9655g0) g2Var).f26347a.accept(j);
                return;
        }
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        switch (this.f26381a) {
            case 0:
                x.getClass();
                return new C9441U(this, x);
            default:
                x.getClass();
                return new C9441U(this, x);
        }
    }
}
