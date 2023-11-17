package p342j$.util.stream;

import p342j$.util.function.C9425D;
import p342j$.util.function.C9428G;

/* renamed from: j$.util.stream.Z2 */
final class C9623Z2 extends C9633b3 implements C9428G {

    /* renamed from: c */
    final int[] f26339c = new int[128];

    C9623Z2() {
    }

    /* renamed from: a */
    public final void mo26020a(Object obj, long j) {
        C9428G g = (C9428G) obj;
        for (int i = 0; ((long) i) < j; i++) {
            g.accept(this.f26339c[i]);
        }
    }

    public final void accept(int i) {
        int i2 = this.f26348b;
        this.f26348b = i2 + 1;
        this.f26339c[i2] = i;
    }

    /* renamed from: n */
    public final C9428G mo25284n(C9428G g) {
        g.getClass();
        return new C9425D(this, g);
    }
}
