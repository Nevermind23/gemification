package p342j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p342j$.util.C9371P;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9457f;

/* renamed from: j$.util.stream.M0 */
class C9570M0 extends C9649f {

    /* renamed from: h */
    protected final C9735w0 f26245h;

    /* renamed from: i */
    protected final C9448a0 f26246i;

    /* renamed from: j */
    protected final C9457f f26247j;

    C9570M0(C9570M0 m0, C9371P p) {
        super((C9649f) m0, p);
        this.f26245h = m0.f26245h;
        this.f26246i = m0.f26246i;
        this.f26247j = m0.f26247j;
    }

    C9570M0(C9735w0 w0Var, C9371P p, C9448a0 a0Var, C9684m mVar) {
        super(w0Var, p);
        this.f26245h = w0Var;
        this.f26246i = a0Var;
        this.f26247j = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo25896a() {
        C9514A0 a0 = (C9514A0) this.f26246i.apply(this.f26245h.mo26034a1(this.f26376b));
        this.f26245h.mo26037w1(this.f26376b, a0);
        return a0.mo25682b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C9649f mo25897d(C9371P p) {
        return new C9570M0(this, p);
    }

    public final void onCompletion(CountedCompleter countedCompleter) {
        C9649f fVar = this.f26378d;
        if (!(fVar == null)) {
            mo26043e((C9539F0) this.f26247j.apply((C9539F0) ((C9570M0) fVar).mo26041b(), (C9539F0) ((C9570M0) this.f26379e).mo26041b()));
        }
        super.onCompletion(countedCompleter);
    }
}
