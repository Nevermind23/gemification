package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9475o;

/* renamed from: j$.util.stream.A */
final class C9513A extends C9528D {
    C9513A(C9371P p, int i) {
        super(p, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J1 */
    public final boolean mo25676J1() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public final void mo25678k(C9475o oVar) {
        if (!isParallel()) {
            C9528D.m34925Q1(mo26030M1()).mo25171e(oVar);
        } else {
            super.mo25678k(oVar);
        }
    }

    /* renamed from: l0 */
    public final void mo25679l0(C9475o oVar) {
        if (!isParallel()) {
            C9528D.m34925Q1(mo26030M1()).mo25171e(oVar);
        } else {
            super.mo25679l0(oVar);
        }
    }

    public final /* bridge */ /* synthetic */ C9543G parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ C9543G sequential() {
        sequential();
        return this;
    }
}
