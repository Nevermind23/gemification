package p342j$.util.stream;

import p342j$.util.C9365J;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.C9444X;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.k3 */
final class C9678k3 extends C9615X2 implements C9365J {
    C9678k3(C9735w0 w0Var, C9371P p, boolean z) {
        super(w0Var, p, z);
    }

    C9678k3(C9735w0 w0Var, C9624a aVar, boolean z) {
        super(w0Var, aVar, z);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34651i(this, consumer);
    }

    /* renamed from: d */
    public final void forEachRemaining(C9444X x) {
        if (this.f26331h != null || this.f26332i) {
            do {
            } while (tryAdvance(x));
            return;
        }
        x.getClass();
        mo26018i();
        C9673j3 j3Var = new C9673j3(x, 1);
        this.f26325b.mo26037w1(this.f26327d, j3Var);
        this.f26332i = true;
    }

    /* renamed from: h */
    public final boolean tryAdvance(C9444X x) {
        x.getClass();
        boolean b = mo26017b();
        if (b) {
            C9576N2 n2 = (C9576N2) this.f26331h;
            long j = this.f26330g;
            int y = n2.mo25918y(j);
            x.accept((n2.f26367c == 0 && y == 0) ? ((long[]) n2.f26266e)[(int) j] : ((long[][]) n2.f26267f)[y][(int) (j - n2.f26368d[y])]);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo25698k() {
        C9576N2 n2 = new C9576N2();
        this.f26331h = n2;
        this.f26328e = this.f26325b.mo26038x1(new C9673j3(n2, 0));
        this.f26329f = new C9624a(this, 6);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C9615X2 mo25699l(C9371P p) {
        return new C9678k3(this.f26325b, p, this.f26324a);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34658r(this, consumer);
    }

    public final C9365J trySplit() {
        return (C9365J) super.trySplit();
    }
}
