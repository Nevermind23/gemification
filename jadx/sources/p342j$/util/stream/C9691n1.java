package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;

/* renamed from: j$.util.stream.n1 */
final class C9691n1 extends C9711r1 implements C9642d2 {

    /* renamed from: h */
    private final double[] f26430h;

    C9691n1(C9371P p, C9735w0 w0Var, double[] dArr) {
        super(dArr.length, p, w0Var);
        this.f26430h = dArr;
    }

    C9691n1(C9691n1 n1Var, C9371P p, long j, long j2) {
        super(n1Var, p, j, j2, n1Var.f26430h.length);
        this.f26430h = n1Var.f26430h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9711r1 mo26160a(C9371P p, long j, long j2) {
        return new C9691n1(this, p, j, j2);
    }

    public final void accept(double d) {
        int i = this.f26470f;
        if (i < this.f26471g) {
            double[] dArr = this.f26430h;
            this.f26470f = i + 1;
            dArr[i] = d;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f26470f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25697s((Double) obj);
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }

    /* renamed from: s */
    public final /* synthetic */ void mo25697s(Double d) {
        C9735w0.m35826q0(this, d);
    }
}
