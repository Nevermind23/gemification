package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9428G;

/* renamed from: j$.util.stream.b0 */
final class C9630b0 extends C9645e0 {
    C9630b0(C9371P p, int i) {
        super(p, i);
    }

    /* renamed from: F */
    public final void mo25805F(C9428G g) {
        if (!isParallel()) {
            C9645e0.m35468Q1(mo26030M1()).mo25203c(g);
        } else {
            super.mo25805F(g);
        }
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

    /* renamed from: P */
    public final void mo25810P(C9428G g) {
        if (!isParallel()) {
            C9645e0.m35468Q1(mo26030M1()).mo25203c(g);
        } else {
            super.mo25810P(g);
        }
    }

    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
