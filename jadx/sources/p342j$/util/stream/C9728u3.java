package p342j$.util.stream;

import p342j$.util.C9359D;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.u3 */
final class C9728u3 extends C9743x3 implements C9359D, C9475o {

    /* renamed from: e */
    double f26497e;

    C9728u3(C9359D d, long j, long j2) {
        super(d, j, j2);
    }

    C9728u3(C9359D d, C9728u3 u3Var) {
        super(d, u3Var);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25169a(Consumer consumer) {
        C9381a.m34649b(this, consumer);
    }

    public final void accept(double d) {
        this.f26497e = d;
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    /* renamed from: m */
    public final /* synthetic */ boolean mo25179m(Consumer consumer) {
        return C9381a.m34656p(this, consumer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final C9371P mo25689u(C9371P p) {
        return new C9728u3((C9359D) p, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo26174w(Object obj) {
        ((C9475o) obj).accept(this.f26497e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final C9633b3 mo26175x() {
        return new C9619Y2();
    }
}
