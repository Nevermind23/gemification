package p342j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p342j$.util.C9371P;

/* renamed from: j$.util.stream.R1 */
final class C9590R1 extends C9649f {

    /* renamed from: h */
    private final C9735w0 f26272h;

    C9590R1(C9590R1 r1, C9371P p) {
        super((C9649f) r1, p);
        this.f26272h = r1.f26272h;
    }

    C9590R1(C9735w0 w0Var, C9735w0 w0Var2, C9371P p) {
        super(w0Var2, p);
        this.f26272h = w0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo25896a() {
        C9735w0 w0Var = this.f26375a;
        C9583P1 u1 = this.f26272h.mo25683u1();
        w0Var.mo26037w1(this.f26376b, u1);
        return u1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C9649f mo25897d(C9371P p) {
        return new C9590R1(this, p);
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C9649f fVar = this.f26378d;
        if (!(fVar == null)) {
            C9583P1 p1 = (C9583P1) ((C9590R1) fVar).mo26041b();
            p1.mo25693i((C9583P1) ((C9590R1) this.f26379e).mo26041b());
            mo26043e(p1);
        }
        super.onCompletion(countedCompleter);
    }
}
