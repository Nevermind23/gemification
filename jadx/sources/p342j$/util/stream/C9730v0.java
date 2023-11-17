package p342j$.util.stream;

import p342j$.util.C9371P;

/* renamed from: j$.util.stream.v0 */
final class C9730v0 extends C9639d {

    /* renamed from: j */
    private final C9725u0 f26500j;

    C9730v0(C9725u0 u0Var, C9735w0 w0Var, C9371P p) {
        super(w0Var, p);
        this.f26500j = u0Var;
    }

    C9730v0(C9730v0 v0Var, C9371P p) {
        super((C9639d) v0Var, p);
        this.f26500j = v0Var.f26500j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026 A[LOOP:0: B:5:0x0026->B:8:0x0031, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo25896a() {
        /*
            r4 = this;
            j$.util.stream.w0 r0 = r4.f26375a
            j$.util.stream.u0 r1 = r4.f26500j
            j$.util.function.x0 r1 = r1.f26492b
            java.lang.Object r1 = r1.get()
            j$.util.stream.s0 r1 = (p342j$.util.stream.C9715s0) r1
            j$.util.P r2 = r4.f26376b
            r0.mo26037w1(r2, r1)
            boolean r0 = r1.f26476b
            j$.util.stream.u0 r1 = r4.f26500j
            j$.util.stream.t0 r1 = r1.f26491a
            boolean r1 = r1.f26482b
            r2 = 0
            if (r0 != r1) goto L_0x0033
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicReference r1 = r4.f26362h
        L_0x0026:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0026
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9730v0.mo25896a():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C9649f mo25897d(C9371P p) {
        return new C9730v0(this, p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Object mo25899i() {
        return Boolean.valueOf(!this.f26500j.f26491a.f26482b);
    }
}
