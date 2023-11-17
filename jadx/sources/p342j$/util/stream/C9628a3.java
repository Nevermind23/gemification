package p342j$.util.stream;

import p342j$.util.function.C9441U;
import p342j$.util.function.C9444X;

/* renamed from: j$.util.stream.a3 */
final class C9628a3 extends C9633b3 implements C9444X {

    /* renamed from: c */
    final long[] f26343c = new long[128];

    C9628a3() {
    }

    /* renamed from: a */
    public final void mo26020a(Object obj, long j) {
        C9444X x = (C9444X) obj;
        for (int i = 0; ((long) i) < j; i++) {
            x.accept(this.f26343c[i]);
        }
    }

    public final void accept(long j) {
        int i = this.f26348b;
        this.f26348b = i + 1;
        this.f26343c[i] = j;
    }

    /* renamed from: f */
    public final C9444X mo25289f(C9444X x) {
        x.getClass();
        return new C9441U(this, x);
    }
}
