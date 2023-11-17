package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Predicate;

/* renamed from: j$.util.stream.H */
final class C9548H implements C9537E3 {

    /* renamed from: a */
    final boolean f26206a;

    /* renamed from: b */
    final Object f26207b;

    /* renamed from: c */
    final Predicate f26208c;

    /* renamed from: d */
    final C9494x0 f26209d;

    C9548H(boolean z, C9611W2 w2, Object obj, C9566L0 l0, C9629b bVar) {
        this.f26206a = z;
        this.f26207b = obj;
        this.f26208c = l0;
        this.f26209d = bVar;
    }

    /* renamed from: X */
    public final Object mo25752X(C9735w0 w0Var, C9371P p) {
        return new C9573N(this, w0Var, p).invoke();
    }

    /* renamed from: n0 */
    public final Object mo25753n0(C9735w0 w0Var, C9371P p) {
        C9542F3 f3 = (C9542F3) this.f26209d.get();
        w0Var.mo26037w1(p, f3);
        Object obj = f3.get();
        return obj != null ? obj : this.f26207b;
    }

    /* renamed from: u */
    public final int mo25754u() {
        return C9607V2.f26313u | (this.f26206a ? 0 : C9607V2.f26310r);
    }
}
