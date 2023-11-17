package p342j$.util.stream;

import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9432K;

/* renamed from: j$.util.stream.p0 */
final class C9700p0 extends C9715s0 implements C9647e2 {

    /* renamed from: c */
    final /* synthetic */ C9720t0 f26446c;

    /* renamed from: d */
    final /* synthetic */ C9432K f26447d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9700p0(C9432K k, C9720t0 t0Var) {
        super(t0Var);
        this.f26446c = t0Var;
        this.f26447d = k;
    }

    public final void accept(int i) {
        if (!this.f26475a) {
            boolean test = this.f26447d.f26079a.test(i);
            C9720t0 t0Var = this.f26446c;
            if (test == t0Var.f26481a) {
                this.f26475a = true;
                this.f26476b = t0Var.f26482b;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25881q((Integer) obj);
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    /* renamed from: q */
    public final /* synthetic */ void mo25881q(Integer num) {
        C9735w0.m35829s0(this, num);
    }
}
