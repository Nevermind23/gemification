package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.V1 */
final class C9606V1 extends C9618Y1 {
    C9606V1(C9371P p, int i, boolean z) {
        super(p, i, z);
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

    /* renamed from: a */
    public final void mo25932a(Consumer consumer) {
        if (!isParallel()) {
            mo26030M1().mo25169a(consumer);
        } else {
            super.mo25932a(consumer);
        }
    }

    /* renamed from: g */
    public final void mo25945g(Consumer consumer) {
        if (!isParallel()) {
            mo26030M1().mo25169a(consumer);
        } else {
            super.mo25945g(consumer);
        }
    }
}
