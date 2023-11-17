package p342j$.util.stream;

import p342j$.util.C9359D;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.g3 */
final class C9658g3 extends C9615X2 implements C9359D {
    C9658g3(C9735w0 w0Var, C9371P p, boolean z) {
        super(w0Var, p, z);
    }

    C9658g3(C9735w0 w0Var, C9624a aVar, boolean z) {
        super(w0Var, aVar, z);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34649b(this, consumer);
    }

    /* renamed from: e */
    public final void forEachRemaining(C9475o oVar) {
        if (this.f26331h != null || this.f26332i) {
            do {
            } while (tryAdvance(oVar));
            return;
        }
        oVar.getClass();
        mo26018i();
        C9653f3 f3Var = new C9653f3(oVar, 1);
        this.f26325b.mo26037w1(this.f26327d, f3Var);
        this.f26332i = true;
    }

    /* renamed from: j */
    public final boolean tryAdvance(C9475o oVar) {
        oVar.getClass();
        boolean b = mo26017b();
        if (b) {
            C9560J2 j2 = (C9560J2) this.f26331h;
            long j = this.f26330g;
            int y = j2.mo25918y(j);
            oVar.accept((j2.f26367c == 0 && y == 0) ? ((double[]) j2.f26266e)[(int) j] : ((double[][]) j2.f26267f)[y][(int) (j - j2.f26368d[y])]);
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo25698k() {
        C9560J2 j2 = new C9560J2();
        this.f26331h = j2;
        this.f26328e = this.f26325b.mo26038x1(new C9653f3(j2, 0));
        this.f26329f = new C9624a(this, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C9615X2 mo25699l(C9371P p) {
        return new C9658g3(this.f26325b, p, this.f26324a);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34656p(this, consumer);
    }

    public final C9359D trySplit() {
        return (C9359D) super.trySplit();
    }
}
