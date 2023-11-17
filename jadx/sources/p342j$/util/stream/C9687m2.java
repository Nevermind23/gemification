package p342j$.util.stream;

import p342j$.util.C9365J;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.m2 */
final class C9687m2 extends C9665i0 {

    /* renamed from: v */
    public static final /* synthetic */ int f26422v = 0;

    /* renamed from: t */
    final /* synthetic */ long f26423t;

    /* renamed from: u */
    final /* synthetic */ long f26424u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9687m2(C9634c cVar, int i, long j, long j2) {
        super(cVar, i);
        this.f26423t = j;
        this.f26424u = j2;
    }

    /* renamed from: R1 */
    static C9365J m35655R1(C9365J j, long j2, long j3, long j4) {
        long j5;
        long j6;
        if (j2 <= j4) {
            long j7 = j4 - j2;
            j5 = j3 >= 0 ? Math.min(j3, j7) : j7;
            j6 = 0;
        } else {
            j6 = j2;
            j5 = j3;
        }
        return new C9738w3(j, j6, j5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public final C9539F0 mo25684H1(C9371P p, C9431J j, C9634c cVar) {
        C9371P p2 = p;
        C9634c cVar2 = cVar;
        long a1 = cVar2.mo26034a1(p);
        if (a1 > 0 && p.hasCharacteristics(16384)) {
            return C9735w0.m35806T0(cVar2, C9735w0.m35797K0(cVar.mo26026E1(), p, this.f26423t, this.f26424u), true);
        } else if (!C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return C9735w0.m35806T0(this, m35655R1((C9365J) cVar2.mo26031O1(p), this.f26423t, this.f26424u, a1), true);
        } else {
            return (C9539F0) new C9707q2(this, cVar, p, j, this.f26423t, this.f26424u).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public final C9371P mo26029I1(C9634c cVar, C9371P p) {
        long a1 = cVar.mo26034a1(p);
        if (a1 > 0 && p.hasCharacteristics(16384)) {
            long j = this.f26423t;
            return new C9708q3((C9365J) cVar.mo26031O1(p), j, C9735w0.m35796J0(j, this.f26424u));
        } else if (!C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return m35655R1((C9365J) cVar.mo26031O1(p), this.f26423t, this.f26424u, a1);
        } else {
            return ((C9539F0) new C9707q2(this, cVar, p, new C9566L0(5), this.f26423t, this.f26424u).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        return new C9682l2(this, g2Var);
    }
}
