package p342j$.util.stream;

import p342j$.util.C9359D;
import p342j$.util.C9371P;
import p342j$.util.function.C9431J;

/* renamed from: j$.util.stream.o2 */
final class C9697o2 extends C9518B {

    /* renamed from: v */
    public static final /* synthetic */ int f26441v = 0;

    /* renamed from: t */
    final /* synthetic */ long f26442t;

    /* renamed from: u */
    final /* synthetic */ long f26443u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9697o2(C9634c cVar, int i, long j, long j2) {
        super(cVar, i);
        this.f26442t = j;
        this.f26443u = j2;
    }

    /* renamed from: R1 */
    static C9359D m35687R1(C9359D d, long j, long j2, long j3) {
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
        return new C9728u3(d, j5, j4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H1 */
    public final C9539F0 mo25684H1(C9371P p, C9431J j, C9634c cVar) {
        C9371P p2 = p;
        C9634c cVar2 = cVar;
        long a1 = cVar2.mo26034a1(p);
        if (a1 > 0 && p.hasCharacteristics(16384)) {
            return C9735w0.m35804R0(cVar2, C9735w0.m35797K0(cVar.mo26026E1(), p, this.f26442t, this.f26443u), true);
        } else if (!C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return C9735w0.m35804R0(this, m35687R1((C9359D) cVar2.mo26031O1(p), this.f26442t, this.f26443u, a1), true);
        } else {
            return (C9539F0) new C9707q2(this, cVar, p, j, this.f26442t, this.f26443u).invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I1 */
    public final C9371P mo26029I1(C9634c cVar, C9371P p) {
        long a1 = cVar.mo26034a1(p);
        if (a1 > 0 && p.hasCharacteristics(16384)) {
            long j = this.f26442t;
            return new C9688m3((C9359D) cVar.mo26031O1(p), j, C9735w0.m35796J0(j, this.f26443u));
        } else if (!C9607V2.ORDERED.mo26013f(cVar.mo26036g1())) {
            return m35687R1((C9359D) cVar.mo26031O1(p), this.f26442t, this.f26443u, a1);
        } else {
            return ((C9539F0) new C9707q2(this, cVar, p, new C9566L0(6), this.f26442t, this.f26443u).invoke()).spliterator();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K1 */
    public final C9657g2 mo25677K1(int i, C9657g2 g2Var) {
        return new C9692n2(this, g2Var);
    }
}
