package p342j$.util.stream;

import p342j$.util.C9371P;

/* renamed from: j$.util.stream.N */
final class C9573N extends C9639d {

    /* renamed from: j */
    private final C9548H f26251j;

    C9573N(C9548H h, C9735w0 w0Var, C9371P p) {
        super(w0Var, p);
        this.f26251j = h;
    }

    C9573N(C9573N n, C9371P p) {
        super((C9639d) n, p);
        this.f26251j = n.f26251j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[LOOP:2: B:21:0x0046->B:24:0x0051, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0020 A[LOOP:0: B:4:0x0020->B:7:0x002b, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo25896a() {
        /*
            r5 = this;
            j$.util.stream.w0 r0 = r5.f26375a
            j$.util.stream.H r1 = r5.f26251j
            j$.util.function.x0 r1 = r1.f26209d
            java.lang.Object r1 = r1.get()
            j$.util.stream.F3 r1 = (p342j$.util.stream.C9542F3) r1
            j$.util.P r2 = r5.f26376b
            r0.mo26037w1(r2, r1)
            java.lang.Object r0 = r1.get()
            j$.util.stream.H r1 = r5.f26251j
            boolean r1 = r1.f26206a
            r2 = 0
            if (r1 != 0) goto L_0x002e
            if (r0 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReference r1 = r5.f26362h
        L_0x0020:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0020
        L_0x002d:
            return r2
        L_0x002e:
            if (r0 == 0) goto L_0x0058
            r1 = r5
        L_0x0031:
            if (r1 == 0) goto L_0x0041
            j$.util.stream.f r3 = r1.mo26050c()
            if (r3 == 0) goto L_0x003f
            j$.util.stream.f r4 = r3.f26378d
            if (r4 == r1) goto L_0x003f
            r1 = 0
            goto L_0x0042
        L_0x003f:
            r1 = r3
            goto L_0x0031
        L_0x0041:
            r1 = 1
        L_0x0042:
            if (r1 == 0) goto L_0x0054
            java.util.concurrent.atomic.AtomicReference r1 = r5.f26362h
        L_0x0046:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x004d
            goto L_0x0057
        L_0x004d:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0054:
            r5.mo26046h()
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9573N.mo25896a():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C9649f mo25897d(C9371P p) {
        return new C9573N(this, p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Object mo25899i() {
        return this.f26251j.f26207b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[LOOP:2: B:19:0x0037->B:22:0x0042, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCompletion(java.util.concurrent.CountedCompleter r7) {
        /*
            r6 = this;
            j$.util.stream.H r0 = r6.f26251j
            boolean r0 = r0.f26206a
            if (r0 == 0) goto L_0x0051
            j$.util.stream.f r0 = r6.f26378d
            j$.util.stream.N r0 = (p342j$.util.stream.C9573N) r0
            r1 = 0
            r2 = r1
        L_0x000c:
            if (r0 == r2) goto L_0x0051
            java.lang.Object r2 = r0.mo26041b()
            if (r2 == 0) goto L_0x0049
            j$.util.stream.H r3 = r6.f26251j
            j$.util.function.Predicate r3 = r3.f26208c
            boolean r3 = r3.test(r2)
            if (r3 == 0) goto L_0x0049
            r6.mo26043e(r2)
            r0 = r6
        L_0x0022:
            if (r0 == 0) goto L_0x0032
            j$.util.stream.f r3 = r0.mo26050c()
            if (r3 == 0) goto L_0x0030
            j$.util.stream.f r4 = r3.f26378d
            if (r4 == r0) goto L_0x0030
            r0 = 0
            goto L_0x0033
        L_0x0030:
            r0 = r3
            goto L_0x0022
        L_0x0032:
            r0 = 1
        L_0x0033:
            if (r0 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicReference r0 = r6.f26362h
        L_0x0037:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x003e
            goto L_0x0051
        L_0x003e:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0037
            goto L_0x0051
        L_0x0045:
            r6.mo26046h()
            goto L_0x0051
        L_0x0049:
            j$.util.stream.f r2 = r6.f26379e
            j$.util.stream.N r2 = (p342j$.util.stream.C9573N) r2
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x000c
        L_0x0051:
            super.onCompletion(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9573N.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
