package p342j$.util.stream;

import java.util.Arrays;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.z2 */
final class C9752z2 extends C9635c0 {
    C9752z2(C9634c cVar) {
        super(cVar, C9607V2.f26309q | C9607V2.f26307o);
    }

    /* renamed from: H1 */
    public final C9539F0 mo25684H1(C9371P p, C9431J j, C9634c cVar) {
        if (C9607V2.SORTED.mo26013f(cVar.mo26036g1())) {
            return cVar.mo26039y1(p, false, j);
        }
        int[] iArr = (int[]) ((C9524C0) cVar.mo26039y1(p, true, j)).mo25749g();
        Arrays.sort(iArr);
        return new C9631b1(iArr);
    }

    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        g2Var.getClass();
        return C9607V2.SORTED.mo26013f(i) ? g2Var : C9607V2.SIZED.mo26013f(i) ? new C9536E2(g2Var) : new C9737w2(g2Var);
    }
}
