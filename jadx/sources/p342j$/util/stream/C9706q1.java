package p342j$.util.stream;

import p342j$.util.C9371P;

/* renamed from: j$.util.stream.q1 */
final class C9706q1 extends C9711r1 {

    /* renamed from: h */
    private final Object[] f26456h;

    C9706q1(C9371P p, C9735w0 w0Var, Object[] objArr) {
        super(objArr.length, p, w0Var);
        this.f26456h = objArr;
    }

    C9706q1(C9706q1 q1Var, C9371P p, long j, long j2) {
        super(q1Var, p, j, j2, q1Var.f26456h.length);
        this.f26456h = q1Var.f26456h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9711r1 mo26160a(C9371P p, long j, long j2) {
        return new C9706q1(this, p, j, j2);
    }

    public final void accept(Object obj) {
        int i = this.f26470f;
        if (i < this.f26471g) {
            Object[] objArr = this.f26456h;
            this.f26470f = i + 1;
            objArr[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f26470f));
    }
}
