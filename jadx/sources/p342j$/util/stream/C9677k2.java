package p342j$.util.stream;

import p342j$.util.C9362G;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.k2 */
final class C9677k2 extends C9635c0 {

    /* renamed from: v */
    public static final /* synthetic */ int f26411v = 0;

    /* renamed from: t */
    final /* synthetic */ long f26412t;

    /* renamed from: u */
    final /* synthetic */ long f26413u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9677k2(C9634c cVar, int i, long j, long j2) {
        super(cVar, i);
        this.f26412t = j;
        this.f26413u = j2;
    }

    /* renamed from: R1 */
    static C9362G m35599R1(C9362G g, long j, long j2, long j3) {
        long j4;
        long j5;
        if (j <= j3) {
            long j6 = j3 - j;
            j4 = j2 >= 0 ? Math.min(j2, j6) : j6;
            j5 = 0;
        } else {
            j5 = j;
            j4 = j2;
        }
        return new C9733v3(g, j5, j4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public final C9539F0 mo25684H1(C9371P p, C9431J j, C9634c cVar) {
        C9371P p2 = p;
        C9634c cVar2 = cVar;
        long a1 = cVar2.mo26034a1(p);
        if (a1 > 0 && p.hasCharacteristics(16384)) {
            return C9735w0.m35805S0(cVar2, C9735w0.m35797K0(cVar.mo26026E1(), p, this.f26412t, this.f26413u), true);
        } else if (!C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return C9735w0.m35805S0(this, m35599R1((C9362G) cVar2.mo26031O1(p), this.f26412t, this.f26413u, a1), true);
        } else {
            return (C9539F0) new C9707q2(this, cVar, p, j, this.f26412t, this.f26413u).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public final C9371P mo26029I1(C9634c cVar, C9371P p) {
        long a1 = cVar.mo26034a1(p);
        if (a1 > 0 && p.hasCharacteristics(16384)) {
            long j = this.f26412t;
            return new C9698o3((C9362G) cVar.mo26031O1(p), j, C9735w0.m35796J0(j, this.f26413u));
        } else if (!C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return m35599R1((C9362G) cVar.mo26031O1(p), this.f26412t, this.f26413u, a1);
        } else {
            return ((C9539F0) new C9707q2(this, cVar, p, new C9566L0(4), this.f26412t, this.f26413u).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        return new C9672j2(this, g2Var);
    }
}
