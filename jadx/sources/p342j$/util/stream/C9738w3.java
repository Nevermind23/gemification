package p342j$.util.stream;

import p342j$.util.C9365J;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.w3 */
final class C9738w3 extends C9743x3 implements C9365J, C9444X {

    /* renamed from: e */
    long f26519e;

    C9738w3(C9365J j, long j2, long j3) {
        super(j, j2, j3);
    }

    C9738w3(C9365J j, C9738w3 w3Var) {
        super(j, w3Var);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34651i(this, consumer);
    }

    public final void accept(long j) {
        this.f26519e = j;
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34658r(this, consumer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C9371P mo25689u(C9371P p) {
        return new C9738w3((C9365J) p, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo26174w(Object obj) {
        ((C9444X) obj).accept(this.f26519e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final C9633b3 mo26175x() {
        return new C9628a3();
    }
}
