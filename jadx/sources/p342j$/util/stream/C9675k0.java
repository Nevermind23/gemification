package p342j$.util.stream;

import p342j$.util.C9365J;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.C9503j;
import p342j$.util.C9504k;
import p342j$.util.C9506m;
import p342j$.util.C9759y;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9440T;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9450b0;
import p342j$.util.function.C9452c0;
import p342j$.util.function.C9454d0;
import p342j$.util.function.C9462h0;
import p342j$.util.function.C9480q0;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.k0 */
abstract class C9675k0 extends C9634c implements C9690n0 {

    /* renamed from: s */
    public static final /* synthetic */ int f26408s = 0;

    C9675k0(C9371P p, int i) {
        super(p, i, false);
    }

    C9675k0(C9634c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static C9365J m35567Q1(C9371P p) {
        if (p instanceof C9365J) {
            return (C9365J) p;
        }
        if (C9552H3.f26222a) {
            C9552H3.m35026a(C9634c.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    /* renamed from: A */
    public final long mo26077A(long j, C9440T t) {
        t.getClass();
        return ((Long) mo26040z1(new C9571M1(C9611W2.LONG_VALUE, t, j))).longValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public final C9539F0 mo25705B1(C9735w0 w0Var, C9371P p, boolean z, C9431J j) {
        return C9735w0.m35806T0(w0Var, p, z);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[LOOP:0: B:6:0x0019->B:9:0x0023, LOOP_START] */
    /* renamed from: C1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25707C1(p342j$.util.C9371P r3, p342j$.util.stream.C9657g2 r4) {
        /*
            r2 = this;
            j$.util.J r3 = m35567Q1(r3)
            boolean r0 = r4 instanceof p342j$.util.function.C9444X
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.X r0 = (p342j$.util.function.C9444X) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = p342j$.util.stream.C9552H3.f26222a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.f0 r0 = new j$.util.stream.f0
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.mo25696r()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.mo25223h(r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = p342j$.util.stream.C9634c.class
            java.lang.String r4 = "using LongStream.adapt(Sink<Long> s)"
            p342j$.util.stream.C9552H3.m35026a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9675k0.mo25707C1(j$.util.P, j$.util.stream.g2):void");
    }

    /* renamed from: D */
    public final IntStream mo26078D(C9454d0 d0Var) {
        d0Var.getClass();
        return new C9739x(this, C9607V2.f26308p | C9607V2.f26306n, d0Var, 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public final C9611W2 mo25708D1() {
        return C9611W2.LONG_VALUE;
    }

    /* renamed from: H */
    public final boolean mo26079H(C9450b0 b0Var) {
        return ((Boolean) mo26040z1(C9735w0.m35827q1(b0Var, C9720t0.ANY))).booleanValue();
    }

    /* renamed from: J */
    public final boolean mo26080J(C9450b0 b0Var) {
        return ((Boolean) mo26040z1(C9735w0.m35827q1(b0Var, C9720t0.NONE))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public final C9371P mo25712N1(C9735w0 w0Var, C9624a aVar, boolean z) {
        return new C9678k3(w0Var, aVar, z);
    }

    /* renamed from: O */
    public final Stream mo26081O(C9448a0 a0Var) {
        a0Var.getClass();
        return new C9734w(this, C9607V2.f26308p | C9607V2.f26306n, a0Var, 2);
    }

    /* renamed from: Q */
    public final C9690n0 mo26082Q(C9450b0 b0Var) {
        b0Var.getClass();
        return new C9744y(this, C9607V2.f26312t, b0Var, 4);
    }

    /* renamed from: a0 */
    public void mo26065a0(C9444X x) {
        x.getClass();
        mo26040z1(new C9585Q(x, true));
    }

    public final C9543G asDoubleStream() {
        return new C9749z(this, C9607V2.f26308p | C9607V2.f26306n, 2);
    }

    public final C9504k average() {
        long[] jArr = (long[]) mo26088e0(new C9629b(25), new C9629b(26), new C9629b(27));
        long j = jArr[0];
        return j > 0 ? C9504k.m34865d(((double) jArr[1]) / ((double) j)) : C9504k.m34864a();
    }

    public final Stream boxed() {
        return mo26081O(new C9612X(4));
    }

    public final long count() {
        return ((C9675k0) mo26104y(new C9629b(22))).sum();
    }

    public final C9690n0 distinct() {
        return ((C9618Y1) ((C9618Y1) boxed()).distinct()).mo25941f0(new C9629b(23));
    }

    /* renamed from: e */
    public void mo26066e(C9444X x) {
        x.getClass();
        mo26040z1(new C9585Q(x, false));
    }

    /* renamed from: e0 */
    public final Object mo26088e0(C9494x0 x0Var, C9480q0 q0Var, BiConsumer biConsumer) {
        C9714s sVar = new C9714s(biConsumer, 2);
        x0Var.getClass();
        q0Var.getClass();
        return mo26040z1(new C9736w1(C9611W2.LONG_VALUE, sVar, q0Var, x0Var, 0));
    }

    public final C9506m findAny() {
        return (C9506m) mo26040z1(new C9548H(false, C9611W2.LONG_VALUE, C9506m.m34872a(), new C9566L0(23), new C9629b(12)));
    }

    public final C9506m findFirst() {
        return (C9506m) mo26040z1(new C9548H(true, C9611W2.LONG_VALUE, C9506m.m34872a(), new C9566L0(23), new C9629b(12)));
    }

    /* renamed from: i */
    public final C9506m mo26091i(C9440T t) {
        t.getClass();
        return (C9506m) mo26040z1(new C9515A1(C9611W2.LONG_VALUE, t, 3));
    }

    public final C9759y iterator() {
        return C9417e0.m34760h(spliterator());
    }

    public final C9690n0 limit(long j) {
        if (j >= 0) {
            return C9735w0.m35825p1(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final C9506m max() {
        return mo26091i(new C9612X(3));
    }

    public final C9506m min() {
        return mo26091i(new C9612X(2));
    }

    /* renamed from: q */
    public final C9690n0 mo26095q(C9444X x) {
        x.getClass();
        return new C9744y(this, 0, x, 5);
    }

    /* renamed from: r */
    public final C9690n0 mo26096r(C9448a0 a0Var) {
        return new C9744y(this, C9607V2.f26308p | C9607V2.f26306n | C9607V2.f26312t, a0Var, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final C9514A0 mo25730r1(long j, C9431J j2) {
        return C9735w0.m35818j1(j);
    }

    public final C9690n0 skip(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : C9735w0.m35825p1(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final C9690n0 sorted() {
        return new C9516A2(this);
    }

    public final C9365J spliterator() {
        return m35567Q1(super.spliterator());
    }

    public final long sum() {
        return mo26077A(0, new C9612X(5));
    }

    public final C9503j summaryStatistics() {
        return (C9503j) mo26088e0(new C9566L0(13), new C9612X(6), new C9612X(7));
    }

    /* renamed from: t */
    public final C9543G mo26101t(C9452c0 c0Var) {
        c0Var.getClass();
        return new C9729v(this, C9607V2.f26308p | C9607V2.f26306n, c0Var, 5);
    }

    public final long[] toArray() {
        return (long[]) C9735w0.m35815f1((C9529D0) mo26025A1(new C9629b(24))).mo25749g();
    }

    public final C9664i unordered() {
        return !mo26027F1() ? this : new C9620Z(this, C9607V2.f26310r, 1);
    }

    /* renamed from: x */
    public final boolean mo26103x(C9450b0 b0Var) {
        return ((Boolean) mo26040z1(C9735w0.m35827q1(b0Var, C9720t0.ALL))).booleanValue();
    }

    /* renamed from: y */
    public final C9690n0 mo26104y(C9462h0 h0Var) {
        h0Var.getClass();
        return new C9744y(this, C9607V2.f26308p | C9607V2.f26306n, h0Var, 2);
    }
}
