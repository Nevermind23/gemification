package p342j$.util.stream;

import p342j$.util.C9359D;
import p342j$.util.C9362G;
import p342j$.util.C9365J;
import p342j$.util.C9371P;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9432K;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9450b0;
import p342j$.util.function.C9475o;
import p342j$.util.function.C9483s;
import p342j$.util.function.Consumer;
import p342j$.util.function.Predicate;

/* renamed from: j$.util.stream.w0 */
public abstract /* synthetic */ class C9735w0 implements C9537E3 {

    /* renamed from: a */
    private static final C9617Y0 f26507a = new C9617Y0();

    /* renamed from: b */
    private static final C9524C0 f26508b = new C9609W0();

    /* renamed from: c */
    private static final C9529D0 f26509c = new C9613X0();

    /* renamed from: d */
    private static final C9519B0 f26510d = new C9605V0();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f26511e = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final long[] f26512f = new long[0];
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final double[] f26513g = new double[0];

    public C9735w0() {
    }

    public C9735w0(C9611W2 w2) {
    }

    /* renamed from: A0 */
    public static void m35787A0(C9524C0 c0, Integer[] numArr, int i) {
        if (!C9552H3.f26222a) {
            int[] iArr = (int[]) c0.mo25749g();
            for (int i2 = 0; i2 < iArr.length; i2++) {
                numArr[i + i2] = Integer.valueOf(iArr[i2]);
            }
            return;
        }
        C9552H3.m35026a(c0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
        throw null;
    }

    /* renamed from: B0 */
    public static void m35788B0(C9529D0 d0, Long[] lArr, int i) {
        if (!C9552H3.f26222a) {
            long[] jArr = (long[]) d0.mo25749g();
            for (int i2 = 0; i2 < jArr.length; i2++) {
                lArr[i + i2] = Long.valueOf(jArr[i2]);
            }
            return;
        }
        C9552H3.m35026a(d0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
        throw null;
    }

    /* renamed from: C0 */
    public static void m35789C0(C9519B0 b0, Consumer consumer) {
        if (consumer instanceof C9475o) {
            b0.mo25750h((C9475o) consumer);
        } else if (!C9552H3.f26222a) {
            ((C9359D) b0.spliterator()).mo25169a(consumer);
        } else {
            C9552H3.m35026a(b0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: D0 */
    public static void m35790D0(C9524C0 c0, Consumer consumer) {
        if (consumer instanceof C9428G) {
            c0.mo25750h((C9428G) consumer);
        } else if (!C9552H3.f26222a) {
            ((C9362G) c0.spliterator()).mo25169a(consumer);
        } else {
            C9552H3.m35026a(c0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: E0 */
    public static void m35791E0(C9529D0 d0, Consumer consumer) {
        if (consumer instanceof C9444X) {
            d0.mo25750h((C9444X) consumer);
        } else if (!C9552H3.f26222a) {
            ((C9365J) d0.spliterator()).mo25169a(consumer);
        } else {
            C9552H3.m35026a(d0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
            throw null;
        }
    }

    /* renamed from: F0 */
    public static C9519B0 m35792F0(C9519B0 b0, long j, long j2) {
        if (j == 0 && j2 == b0.count()) {
            return b0;
        }
        long j3 = j2 - j;
        C9359D d = (C9359D) b0.spliterator();
        C9740x0 X0 = m35808X0(j3);
        X0.mo25695p(j3);
        for (int i = 0; ((long) i) < j && d.mo25178j(new C9683l3(1)); i++) {
        }
        for (int i2 = 0; ((long) i2) < j3 && d.mo25178j(X0); i2++) {
        }
        X0.mo25694o();
        return X0.mo25682b();
    }

    /* renamed from: G0 */
    public static C9524C0 m35793G0(C9524C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        C9362G g = (C9362G) c0.spliterator();
        C9745y0 h1 = m35816h1(j3);
        h1.mo25695p(j3);
        for (int i = 0; ((long) i) < j && g.mo25205g(new C9693n3(1)); i++) {
        }
        for (int i2 = 0; ((long) i2) < j3 && g.mo25205g(h1); i2++) {
        }
        h1.mo25694o();
        return h1.mo25682b();
    }

    /* renamed from: H0 */
    public static C9529D0 m35794H0(C9529D0 d0, long j, long j2) {
        if (j == 0 && j2 == d0.count()) {
            return d0;
        }
        long j3 = j2 - j;
        C9365J j4 = (C9365J) d0.spliterator();
        C9750z0 j1 = m35818j1(j3);
        j1.mo25695p(j3);
        for (int i = 0; ((long) i) < j && j4.mo25223h(new C9703p3(1)); i++) {
        }
        for (int i2 = 0; ((long) i2) < j3 && j4.mo25223h(j1); i2++) {
        }
        j1.mo25694o();
        return j1.mo25682b();
    }

    /* renamed from: I0 */
    public static C9539F0 m35795I0(C9539F0 f0, long j, long j2, C9431J j3) {
        if (j == 0 && j2 == f0.count()) {
            return f0;
        }
        C9371P spliterator = f0.spliterator();
        long j4 = j2 - j;
        C9514A0 P0 = m35802P0(j4, j3);
        P0.mo25695p(j4);
        for (int i = 0; ((long) i) < j && spliterator.mo25179m(new C9612X(8)); i++) {
        }
        for (int i2 = 0; ((long) i2) < j4 && spliterator.mo25179m(P0); i2++) {
        }
        P0.mo25694o();
        return P0.mo25682b();
    }

    /* renamed from: J0 */
    static long m35796J0(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: K0 */
    static C9371P m35797K0(C9611W2 w2, C9371P p, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = C9702p2.f26449a[w2.ordinal()];
        if (i == 1) {
            return new C9718s3(p, j, j4);
        }
        if (i == 2) {
            return new C9698o3((C9362G) p, j, j4);
        }
        if (i == 3) {
            return new C9708q3((C9365J) p, j, j4);
        }
        if (i == 4) {
            return new C9688m3((C9359D) p, j, j4);
        }
        StringBuilder sb = new StringBuilder("Unknown shape ");
        C9611W2 w22 = w2;
        sb.append(w2);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: L0 */
    static long m35798L0(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1, Math.min(j - j2, j3));
        }
        return -1;
    }

    /* renamed from: P0 */
    static C9514A0 m35802P0(long j, C9431J j2) {
        return (j < 0 || j >= 2147483639) ? new C9716s1() : new C9626a1(j, j2);
    }

    /* renamed from: Q0 */
    public static C9539F0 m35803Q0(C9735w0 w0Var, C9371P p, boolean z, C9431J j) {
        long a1 = w0Var.mo26034a1(p);
        if (a1 < 0 || !p.hasCharacteristics(16384)) {
            C9539F0 f0 = (C9539F0) new C9562K0(p, j, w0Var).invoke();
            return z ? m35812c1(f0, j) : f0;
        } else if (a1 < 2147483639) {
            Object[] objArr = (Object[]) j.apply((int) a1);
            new C9706q1(p, w0Var, objArr).invoke();
            return new C9554I0(objArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: R0 */
    public static C9519B0 m35804R0(C9735w0 w0Var, C9371P p, boolean z) {
        long a1 = w0Var.mo26034a1(p);
        if (a1 < 0 || !p.hasCharacteristics(16384)) {
            C9519B0 b0 = (C9519B0) new C9562K0(0, p, w0Var).invoke();
            return z ? m35813d1(b0) : b0;
        } else if (a1 < 2147483639) {
            double[] dArr = new double[((int) a1)];
            new C9691n1(p, w0Var, dArr).invoke();
            return new C9593S0(dArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: S0 */
    public static C9524C0 m35805S0(C9735w0 w0Var, C9371P p, boolean z) {
        long a1 = w0Var.mo26034a1(p);
        if (a1 < 0 || !p.hasCharacteristics(16384)) {
            C9524C0 c0 = (C9524C0) new C9562K0(1, p, w0Var).invoke();
            return z ? m35814e1(c0) : c0;
        } else if (a1 < 2147483639) {
            int[] iArr = new int[((int) a1)];
            new C9696o1(p, w0Var, iArr).invoke();
            return new C9631b1(iArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: T0 */
    public static C9529D0 m35806T0(C9735w0 w0Var, C9371P p, boolean z) {
        long a1 = w0Var.mo26034a1(p);
        if (a1 < 0 || !p.hasCharacteristics(16384)) {
            C9529D0 d0 = (C9529D0) new C9562K0(2, p, w0Var).invoke();
            return z ? m35815f1(d0) : d0;
        } else if (a1 < 2147483639) {
            long[] jArr = new long[((int) a1)];
            new C9701p1(p, w0Var, jArr).invoke();
            return new C9676k1(jArr);
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: U0 */
    static C9549H0 m35807U0(C9611W2 w2, C9539F0 f0, C9539F0 f02) {
        int i = C9544G0.f26200a[w2.ordinal()];
        if (i == 1) {
            return new C9589R0(f0, f02);
        }
        if (i == 2) {
            return new C9578O0((C9524C0) f0, (C9524C0) f02);
        }
        if (i == 3) {
            return new C9582P0((C9529D0) f0, (C9529D0) f02);
        }
        if (i == 4) {
            return new C9574N0((C9519B0) f0, (C9519B0) f02);
        }
        throw new IllegalStateException("Unknown shape " + w2);
    }

    /* renamed from: X0 */
    static C9740x0 m35808X0(long j) {
        return (j < 0 || j >= 2147483639) ? new C9601U0() : new C9597T0(j);
    }

    /* renamed from: Y0 */
    public static C9543G m35809Y0(C9359D d) {
        return new C9513A(d, C9607V2.m35304e(d));
    }

    /* renamed from: Z0 */
    static C9621Z0 m35810Z0(C9611W2 w2) {
        Object obj;
        int i = C9544G0.f26200a[w2.ordinal()];
        if (i == 1) {
            return f26507a;
        }
        if (i == 2) {
            obj = f26508b;
        } else if (i == 3) {
            obj = f26509c;
        } else if (i == 4) {
            obj = f26510d;
        } else {
            throw new IllegalStateException("Unknown shape " + w2);
        }
        return (C9621Z0) obj;
    }

    /* renamed from: b1 */
    private static int m35811b1(long j) {
        return (j != -1 ? C9607V2.f26313u : 0) | C9607V2.f26312t;
    }

    /* renamed from: c1 */
    public static C9539F0 m35812c1(C9539F0 f0, C9431J j) {
        if (f0.mo25797t() <= 0) {
            return f0;
        }
        long count = f0.count();
        if (count < 2147483639) {
            Object[] objArr = (Object[]) j.apply((int) count);
            new C9726u1(f0, objArr).invoke();
            return new C9554I0(objArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: d1 */
    public static C9519B0 m35813d1(C9519B0 b0) {
        if (b0.mo25797t() <= 0) {
            return b0;
        }
        long count = b0.count();
        if (count < 2147483639) {
            double[] dArr = new double[((int) count)];
            new C9721t1(b0, dArr).invoke();
            return new C9593S0(dArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: e1 */
    public static C9524C0 m35814e1(C9524C0 c0) {
        if (c0.mo25797t() <= 0) {
            return c0;
        }
        long count = c0.count();
        if (count < 2147483639) {
            int[] iArr = new int[((int) count)];
            new C9721t1(c0, iArr).invoke();
            return new C9631b1(iArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: f1 */
    public static C9529D0 m35815f1(C9529D0 d0) {
        if (d0.mo25797t() <= 0) {
            return d0;
        }
        long count = d0.count();
        if (count < 2147483639) {
            long[] jArr = new long[((int) count)];
            new C9721t1(d0, jArr).invoke();
            return new C9676k1(jArr);
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: h1 */
    static C9745y0 m35816h1(long j) {
        return (j < 0 || j >= 2147483639) ? new C9641d1() : new C9636c1(j);
    }

    /* renamed from: i1 */
    public static IntStream m35817i1(C9362G g) {
        return new C9630b0(g, C9607V2.m35304e(g));
    }

    /* renamed from: j1 */
    static C9750z0 m35818j1(long j) {
        return (j < 0 || j >= 2147483639) ? new C9686m1() : new C9681l1(j);
    }

    /* renamed from: k1 */
    public static C9690n0 m35819k1(C9365J j) {
        return new C9660h0(j, C9607V2.m35304e(j));
    }

    /* renamed from: l1 */
    public static C9543G m35820l1(C9634c cVar, long j, long j2) {
        if (j >= 0) {
            return new C9697o2(cVar, m35811b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: m1 */
    public static C9725u0 m35821m1(C9483s sVar, C9720t0 t0Var) {
        sVar.getClass();
        t0Var.getClass();
        return new C9725u0(C9611W2.DOUBLE_VALUE, t0Var, new C9694o(3, t0Var, sVar));
    }

    /* renamed from: n1 */
    public static IntStream m35822n1(C9634c cVar, long j, long j2) {
        if (j >= 0) {
            return new C9677k2(cVar, m35811b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: o1 */
    public static C9725u0 m35823o1(C9432K k, C9720t0 t0Var) {
        k.getClass();
        t0Var.getClass();
        return new C9725u0(C9611W2.INT_VALUE, t0Var, new C9694o(1, t0Var, k));
    }

    /* renamed from: p0 */
    public static void m35824p0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: p1 */
    public static C9690n0 m35825p1(C9634c cVar, long j, long j2) {
        if (j >= 0) {
            return new C9687m2(cVar, m35811b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: q0 */
    public static void m35826q0(C9642d2 d2Var, Double d) {
        if (!C9552H3.f26222a) {
            d2Var.accept(d.doubleValue());
        } else {
            C9552H3.m35026a(d2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
    }

    /* renamed from: q1 */
    public static C9725u0 m35827q1(C9450b0 b0Var, C9720t0 t0Var) {
        b0Var.getClass();
        t0Var.getClass();
        return new C9725u0(C9611W2.LONG_VALUE, t0Var, new C9694o(4, t0Var, b0Var));
    }

    /* renamed from: s0 */
    public static void m35829s0(C9647e2 e2Var, Integer num) {
        if (!C9552H3.f26222a) {
            e2Var.accept(num.intValue());
        } else {
            C9552H3.m35026a(e2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
    }

    /* renamed from: s1 */
    public static C9725u0 m35830s1(Predicate predicate, C9720t0 t0Var) {
        predicate.getClass();
        t0Var.getClass();
        return new C9725u0(C9611W2.REFERENCE, t0Var, new C9694o(2, t0Var, predicate));
    }

    /* renamed from: t1 */
    public static Stream m35832t1(C9634c cVar, long j, long j2) {
        if (j >= 0) {
            return new C9667i2(cVar, m35811b1(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    /* renamed from: u0 */
    public static void m35833u0(C9652f2 f2Var, Long l) {
        if (!C9552H3.f26222a) {
            f2Var.accept(l.longValue());
        } else {
            C9552H3.m35026a(f2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
    }

    /* renamed from: v1 */
    public static Stream m35835v1(C9371P p, boolean z) {
        p.getClass();
        return new C9606V1(p, C9607V2.m35304e(p), z);
    }

    /* renamed from: w0 */
    public static void m35836w0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: x0 */
    public static void m35837x0() {
        throw new IllegalStateException("called wrong accept method");
    }

    /* renamed from: y0 */
    public static Object[] m35838y0(C9534E0 e0, C9431J j) {
        if (C9552H3.f26222a) {
            C9552H3.m35026a(e0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        } else if (e0.count() < 2147483639) {
            Object[] objArr = (Object[]) j.apply((int) e0.count());
            e0.mo25796j(objArr, 0);
            return objArr;
        } else {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
    }

    /* renamed from: z0 */
    public static void m35839z0(C9519B0 b0, Double[] dArr, int i) {
        if (!C9552H3.f26222a) {
            double[] dArr2 = (double[]) b0.mo25749g();
            for (int i2 = 0; i2 < dArr2.length; i2++) {
                dArr[i + i2] = Double.valueOf(dArr2[i2]);
            }
            return;
        }
        C9552H3.m35026a(b0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V0 */
    public abstract void mo26032V0(C9371P p, C9657g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public abstract void mo26033W0(C9371P p, C9657g2 g2Var);

    /* renamed from: X */
    public Object mo25752X(C9735w0 w0Var, C9371P p) {
        return ((C9583P1) new C9590R1(this, w0Var, p).invoke()).get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public abstract long mo26034a1(C9371P p);

    /* access modifiers changed from: package-private */
    /* renamed from: g1 */
    public abstract int mo26036g1();

    /* renamed from: n0 */
    public Object mo25753n0(C9735w0 w0Var, C9371P p) {
        C9583P1 u1 = mo25683u1();
        w0Var.mo26037w1(p, u1);
        return u1.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public abstract C9514A0 mo25730r1(long j, C9431J j2);

    /* renamed from: u */
    public /* synthetic */ int mo25754u() {
        return 0;
    }

    /* renamed from: u1 */
    public abstract C9583P1 mo25683u1();

    /* access modifiers changed from: package-private */
    /* renamed from: w1 */
    public abstract C9657g2 mo26037w1(C9371P p, C9657g2 g2Var);

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public abstract C9657g2 mo26038x1(C9657g2 g2Var);
}
