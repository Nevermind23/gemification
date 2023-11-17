package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.T */
abstract class C9596T implements C9537E3, C9542F3 {

    /* renamed from: a */
    private final boolean f26280a;

    protected C9596T(boolean z) {
        this.f26280a = z;
    }

    /* renamed from: X */
    public final Object mo25752X(C9735w0 w0Var, C9371P p) {
        (this.f26280a ? new C9600U(w0Var, p, (C9657g2) this) : new C9604V(w0Var, p, w0Var.mo26038x1(this))).invoke();
        return null;
    }

    public /* synthetic */ void accept(double d) {
        C9735w0.m35824p0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        C9735w0.m35836w0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        C9735w0.m35837x0();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    /* renamed from: n0 */
    public final Object mo25753n0(C9735w0 w0Var, C9371P p) {
        w0Var.mo26037w1(p, this);
        return null;
    }

    /* renamed from: o */
    public final /* synthetic */ void mo25694o() {
    }

    /* renamed from: p */
    public final /* synthetic */ void mo25695p(long j) {
    }

    /* renamed from: r */
    public final /* synthetic */ boolean mo25696r() {
        return false;
    }

    /* renamed from: u */
    public final int mo25754u() {
        if (this.f26280a) {
            return 0;
        }
        return C9607V2.f26310r;
    }
}
