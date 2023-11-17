package p342j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import p342j$.util.C9371P;
import p342j$.util.Comparator;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.B2 */
final class C9521B2 extends C9610W1 {

    /* renamed from: t */
    private final boolean f26170t;

    /* renamed from: u */
    private final Comparator f26171u;

    C9521B2(C9634c cVar) {
        super(cVar, C9607V2.f26309q | C9607V2.f26307o);
        this.f26170t = true;
        this.f26171u = Comparator.CC.m34571a();
    }

    C9521B2(C9634c cVar, java.util.Comparator comparator) {
        super(cVar, C9607V2.f26309q | C9607V2.f26308p);
        this.f26170t = false;
        comparator.getClass();
        this.f26171u = comparator;
    }

    /* renamed from: H1 */
    public final C9539F0 mo25684H1(C9371P p, C9431J j, C9634c cVar) {
        if (C9607V2.SORTED.mo26013f(cVar.mo26036g1()) && this.f26170t) {
            return cVar.mo26039y1(p, false, j);
        }
        Object[] u = cVar.mo26039y1(p, true, j).mo25798u(j);
        Arrays.sort(u, this.f26171u);
        return new C9554I0(u);
    }

    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        g2Var.getClass();
        return (!C9607V2.SORTED.mo26013f(i) || !this.f26170t) ? C9607V2.SIZED.mo26013f(i) ? new C9546G2(g2Var, this.f26171u) : new C9526C2(g2Var, this.f26171u) : g2Var;
    }
}
