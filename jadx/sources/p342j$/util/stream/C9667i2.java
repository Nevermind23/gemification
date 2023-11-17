package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.i2 */
final class C9667i2 extends C9610W1 {

    /* renamed from: t */
    final /* synthetic */ long f26394t;

    /* renamed from: u */
    final /* synthetic */ long f26395u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9667i2(C9634c cVar, int i, long j, long j2) {
        super(cVar, i);
        this.f26394t = j;
        this.f26395u = j2;
    }

    /* renamed from: P1 */
    static C9371P m35544P1(C9371P p, long j, long j2, long j3) {
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
        return new C9748y3(p, j5, j4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public final C9539F0 mo25684H1(C9371P p, C9431J j, C9634c cVar) {
        C9371P p2 = p;
        C9431J j2 = j;
        C9634c cVar2 = cVar;
        long a1 = cVar2.mo26034a1(p2);
        if (a1 > 0 && p2.hasCharacteristics(16384)) {
            return C9735w0.m35803Q0(cVar2, C9735w0.m35797K0(cVar.mo26026E1(), p, this.f26394t, this.f26395u), true, j2);
        } else if (!C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return C9735w0.m35803Q0(this, m35544P1(cVar2.mo26031O1(p2), this.f26394t, this.f26395u, a1), true, j2);
        } else {
            return (C9539F0) new C9707q2(this, cVar, p, j, this.f26394t, this.f26395u).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public final C9371P mo26029I1(C9634c cVar, C9371P p) {
        long a1 = cVar.mo26034a1(p);
        if (a1 > 0 && p.hasCharacteristics(16384)) {
            C9371P O1 = cVar.mo26031O1(p);
            long j = this.f26394t;
            return new C9718s3(O1, j, C9735w0.m35796J0(j, this.f26395u));
        } else if (!C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return m35544P1(cVar.mo26031O1(p), this.f26394t, this.f26395u, a1);
        } else {
            return ((C9539F0) new C9707q2(this, cVar, p, new C9566L0(3), this.f26394t, this.f26395u).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        return new C9662h2(this, g2Var);
    }
}
