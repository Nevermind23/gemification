package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9444X;

/* renamed from: j$.util.stream.h0 */
final class C9660h0 extends C9675k0 {
    C9660h0(C9371P p, int i) {
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

    /* renamed from: a0 */
    public final void mo26065a0(C9444X x) {
        if (!isParallel()) {
            C9675k0.m35567Q1(mo26030M1()).mo25221d(x);
        } else {
            super.mo26065a0(x);
        }
    }

    /* renamed from: e */
    public final void mo26066e(C9444X x) {
        if (!isParallel()) {
            C9675k0.m35567Q1(mo26030M1()).mo25221d(x);
        } else {
            super.mo26066e(x);
        }
    }

    public final /* bridge */ /* synthetic */ C9690n0 parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ C9690n0 sequential() {
        sequential();
        return this;
    }
}
