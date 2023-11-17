package p342j$.util.stream;

import p342j$.util.C9362G;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.C9501h;
import p342j$.util.C9504k;
import p342j$.util.C9505l;
import p342j$.util.C9755u;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9424C;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9432K;
import p342j$.util.function.C9433L;
import p342j$.util.function.C9436O;
import p342j$.util.function.C9437P;
import p342j$.util.function.C9474n0;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.e0 */
abstract class C9645e0 extends C9634c implements IntStream {

    /* renamed from: s */
    public static final /* synthetic */ int f26369s = 0;

    C9645e0(C9371P p, int i) {
        super(p, i, false);
    }

    C9645e0(C9634c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static C9362G m35468Q1(C9371P p) {
        if (p instanceof C9362G) {
            return (C9362G) p;
        }
        if (C9552H3.f26222a) {
            C9552H3.m35026a(C9634c.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public final C9539F0 mo25705B1(C9735w0 w0Var, C9371P p, boolean z, C9431J j) {
        return C9735w0.m35805S0(w0Var, p, z);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[LOOP:0: B:6:0x0019->B:9:0x0023, LOOP_START] */
    /* renamed from: C1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25707C1(p342j$.util.C9371P r3, p342j$.util.stream.C9657g2 r4) {
        /*
            r2 = this;
            j$.util.G r3 = m35468Q1(r3)
            boolean r0 = r4 instanceof p342j$.util.function.C9428G
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.G r0 = (p342j$.util.function.C9428G) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = p342j$.util.stream.C9552H3.f26222a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.W r0 = new j$.util.stream.W
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.mo25696r()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.mo25205g(r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = p342j$.util.stream.C9634c.class
            java.lang.String r4 = "using IntStream.adapt(Sink<Integer> s)"
            p342j$.util.stream.C9552H3.m35026a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9645e0.mo25707C1(j$.util.P, j$.util.stream.g2):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public final C9611W2 mo25708D1() {
        return C9611W2.INT_VALUE;
    }

    /* renamed from: F */
    public void mo25805F(C9428G g) {
        g.getClass();
        mo26040z1(new C9581P(g, true));
    }

    /* renamed from: G */
    public final Stream mo25806G(C9431J j) {
        j.getClass();
        return new C9734w(this, C9607V2.f26308p | C9607V2.f26306n, j, 1);
    }

    /* renamed from: K */
    public final IntStream mo25807K(C9437P p) {
        p.getClass();
        return new C9739x(this, C9607V2.f26308p | C9607V2.f26306n, p, 2);
    }

    /* renamed from: M */
    public final int mo25808M(int i, C9424C c) {
        c.getClass();
        return ((Integer) mo26040z1(new C9555I1(C9611W2.INT_VALUE, c, i))).intValue();
    }

    /* renamed from: N */
    public final IntStream mo25809N(C9431J j) {
        return new C9739x(this, C9607V2.f26308p | C9607V2.f26306n | C9607V2.f26312t, j, 3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public final C9371P mo25712N1(C9735w0 w0Var, C9624a aVar, boolean z) {
        return new C9668i3(w0Var, aVar, z);
    }

    /* renamed from: P */
    public void mo25810P(C9428G g) {
        g.getClass();
        mo26040z1(new C9581P(g, false));
    }

    /* renamed from: U */
    public final IntStream mo25811U(C9432K k) {
        k.getClass();
        return new C9739x(this, C9607V2.f26312t, k, 4);
    }

    /* renamed from: Y */
    public final boolean mo25812Y(C9432K k) {
        return ((Boolean) mo26040z1(C9735w0.m35823o1(k, C9720t0.ALL))).booleanValue();
    }

    public final C9543G asDoubleStream() {
        return new C9749z(this, C9607V2.f26308p | C9607V2.f26306n, 1);
    }

    public final C9690n0 asLongStream() {
        return new C9620Z(this, C9607V2.f26308p | C9607V2.f26306n, 0);
    }

    public final C9504k average() {
        long[] jArr = (long[]) mo25827k0(new C9629b(18), new C9629b(19), new C9629b(20));
        long j = jArr[0];
        return j > 0 ? C9504k.m34865d(((double) jArr[1]) / ((double) j)) : C9504k.m34864a();
    }

    /* renamed from: b0 */
    public final C9505l mo25816b0(C9424C c) {
        c.getClass();
        return (C9505l) mo26040z1(new C9515A1(C9611W2.INT_VALUE, c, 2));
    }

    public final Stream boxed() {
        return mo25806G(new C9612X(0));
    }

    /* renamed from: c0 */
    public final IntStream mo25818c0(C9428G g) {
        g.getClass();
        return new C9739x(this, 0, g, 1);
    }

    public final long count() {
        return ((C9675k0) mo25825h(new C9629b(17))).sum();
    }

    public final IntStream distinct() {
        return ((C9618Y1) ((C9618Y1) boxed()).distinct()).mo25953n(new C9629b(16));
    }

    /* renamed from: f */
    public final C9543G mo25821f(C9433L l) {
        l.getClass();
        return new C9729v(this, C9607V2.f26308p | C9607V2.f26306n, l, 4);
    }

    public final C9505l findAny() {
        return (C9505l) mo26040z1(new C9548H(false, C9611W2.INT_VALUE, C9505l.m34868a(), new C9566L0(25), new C9629b(14)));
    }

    public final C9505l findFirst() {
        return (C9505l) mo26040z1(new C9548H(true, C9611W2.INT_VALUE, C9505l.m34868a(), new C9566L0(25), new C9629b(14)));
    }

    /* renamed from: g0 */
    public final boolean mo25824g0(C9432K k) {
        return ((Boolean) mo26040z1(C9735w0.m35823o1(k, C9720t0.ANY))).booleanValue();
    }

    /* renamed from: h */
    public final C9690n0 mo25825h(C9436O o) {
        o.getClass();
        return new C9744y(this, C9607V2.f26308p | C9607V2.f26306n, o, 1);
    }

    /* renamed from: h0 */
    public final boolean mo25826h0(C9432K k) {
        return ((Boolean) mo26040z1(C9735w0.m35823o1(k, C9720t0.NONE))).booleanValue();
    }

    public final C9755u iterator() {
        return C9417e0.m34759g(spliterator());
    }

    /* renamed from: k0 */
    public final Object mo25827k0(C9494x0 x0Var, C9474n0 n0Var, BiConsumer biConsumer) {
        C9714s sVar = new C9714s(biConsumer, 1);
        x0Var.getClass();
        n0Var.getClass();
        return mo26040z1(new C9736w1(C9611W2.INT_VALUE, sVar, n0Var, x0Var, 4));
    }

    public final IntStream limit(long j) {
        if (j >= 0) {
            return C9735w0.m35822n1(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final C9505l max() {
        return mo25816b0(new C9612X(1));
    }

    public final C9505l min() {
        return mo25816b0(new C9566L0(26));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final C9514A0 mo25730r1(long j, C9431J j2) {
        return C9735w0.m35816h1(j);
    }

    public final IntStream skip(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : C9735w0.m35822n1(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final IntStream sorted() {
        return new C9752z2(this);
    }

    public final C9362G spliterator() {
        return m35468Q1(super.spliterator());
    }

    public final int sum() {
        return mo25808M(0, new C9566L0(27));
    }

    public final C9501h summaryStatistics() {
        return (C9501h) mo25827k0(new C9566L0(10), new C9566L0(28), new C9566L0(29));
    }

    public final int[] toArray() {
        return (int[]) C9735w0.m35814e1((C9524C0) mo26025A1(new C9629b(21))).mo25749g();
    }

    public final C9664i unordered() {
        return !mo26027F1() ? this : new C9625a0(this, C9607V2.f26310r);
    }
}
