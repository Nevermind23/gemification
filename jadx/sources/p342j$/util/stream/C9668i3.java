package p342j$.util.stream;

import p342j$.util.C9362G;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.i3 */
final class C9668i3 extends C9615X2 implements C9362G {
    C9668i3(C9735w0 w0Var, C9371P p, boolean z) {
        super(w0Var, p, z);
    }

    C9668i3(C9735w0 w0Var, C9624a aVar, boolean z) {
        super(w0Var, aVar, z);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34650f(this, consumer);
    }

    /* renamed from: c */
    public final void forEachRemaining(C9428G g) {
        if (this.f26331h != null || this.f26332i) {
            do {
            } while (tryAdvance(g));
            return;
        }
        g.getClass();
        mo26018i();
        C9663h3 h3Var = new C9663h3(g, 1);
        this.f26325b.mo26037w1(this.f26327d, h3Var);
        this.f26332i = true;
    }

    /* renamed from: g */
    public final boolean tryAdvance(C9428G g) {
        g.getClass();
        boolean b = mo26017b();
        if (b) {
            C9568L2 l2 = (C9568L2) this.f26331h;
            long j = this.f26330g;
            int y = l2.mo25918y(j);
            g.accept((l2.f26367c == 0 && y == 0) ? ((int[]) l2.f26266e)[(int) j] : ((int[][]) l2.f26267f)[y][(int) (j - l2.f26368d[y])]);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo25698k() {
        C9568L2 l2 = new C9568L2();
        this.f26331h = l2;
        this.f26328e = this.f26325b.mo26038x1(new C9663h3(l2, 0));
        this.f26329f = new C9624a(this, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C9615X2 mo25699l(C9371P p) {
        return new C9668i3(this.f26325b, p, this.f26324a);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34657q(this, consumer);
    }

    public final C9362G trySplit() {
        return (C9362G) super.trySplit();
    }
}
