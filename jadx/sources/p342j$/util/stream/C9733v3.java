package p342j$.util.stream;

import p342j$.util.C9362G;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.v3 */
final class C9733v3 extends C9743x3 implements C9362G, C9428G {

    /* renamed from: e */
    int f26504e;

    C9733v3(C9362G g, long j, long j2) {
        super(g, j, j2);
    }

    C9733v3(C9362G g, C9733v3 v3Var) {
        super(g, v3Var);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34650f(this, consumer);
    }

    public final void accept(int i) {
        this.f26504e = i;
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34657q(this, consumer);
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C9371P mo25689u(C9371P p) {
        return new C9733v3((C9362G) p, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo26174w(Object obj) {
        ((C9428G) obj).accept(this.f26504e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final C9633b3 mo26175x() {
        return new C9623Z2();
    }
}
