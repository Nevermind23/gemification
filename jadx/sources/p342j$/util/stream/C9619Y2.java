package p342j$.util.stream;

import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;

/* renamed from: j$.util.stream.Y2 */
final class C9619Y2 extends C9633b3 implements C9475o {

    /* renamed from: c */
    final double[] f26336c = new double[128];

    C9619Y2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo26020a(Object obj, long j) {
        C9475o oVar = (C9475o) obj;
        for (int i = 0; ((long) i) < j; i++) {
            oVar.accept(this.f26336c[i]);
        }
    }

    public final void accept(double d) {
        int i = this.f26348b;
        this.f26348b = i + 1;
        this.f26336c[i] = d;
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }
}
