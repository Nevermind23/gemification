package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;

/* renamed from: j$.util.stream.p1 */
final class C9701p1 extends C9711r1 implements C9652f2 {

    /* renamed from: h */
    private final long[] f26448h;

    C9701p1(C9371P p, C9735w0 w0Var, long[] jArr) {
        super(jArr.length, p, w0Var);
        this.f26448h = jArr;
    }

    C9701p1(C9701p1 p1Var, C9371P p, long j, long j2) {
        super(p1Var, p, j, j2, p1Var.f26448h.length);
        this.f26448h = p1Var.f26448h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9711r1 mo26160a(C9371P p, long j, long j2) {
        return new C9701p1(this, p, j, j2);
    }

    public final void accept(long j) {
        int i = this.f26470f;
        if (i < this.f26471g) {
            long[] jArr = this.f26448h;
            this.f26470f = i + 1;
            jArr[i] = j;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f26470f));
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
