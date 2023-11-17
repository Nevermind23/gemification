package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;

/* renamed from: j$.util.stream.o1 */
final class C9696o1 extends C9711r1 implements C9647e2 {

    /* renamed from: h */
    private final int[] f26440h;

    C9696o1(C9371P p, C9735w0 w0Var, int[] iArr) {
        super(iArr.length, p, w0Var);
        this.f26440h = iArr;
    }

    C9696o1(C9696o1 o1Var, C9371P p, long j, long j2) {
        super(o1Var, p, j, j2, o1Var.f26440h.length);
        this.f26440h = o1Var.f26440h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C9711r1 mo26160a(C9371P p, long j, long j2) {
        return new C9696o1(this, p, j, j2);
    }

    public final void accept(int i) {
        int i2 = this.f26470f;
        if (i2 < this.f26471g) {
            int[] iArr = this.f26440h;
            this.f26470f = i2 + 1;
            iArr[i2] = i;
            return;
        }
        throw new IndexOutOfBoundsException(Integer.toString(this.f26470f));
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo25881q((Integer) obj);
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }

    /* renamed from: q */
    public final /* synthetic */ void mo25881q(Integer num) {
        C9735w0.m35829s0(this, num);
    }
}
