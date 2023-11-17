package p342j$.util.stream;

import com.github.mikephil.charting.utils.Utils;
import java.util.Set;
import p342j$.util.C9359D;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.C9499g;
import p342j$.util.C9504k;
import p342j$.util.C9510q;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9467k;
import p342j$.util.function.C9468k0;
import p342j$.util.function.C9475o;
import p342j$.util.function.C9481r;
import p342j$.util.function.C9483s;
import p342j$.util.function.C9485t;
import p342j$.util.function.C9491w;
import p342j$.util.function.C9493x;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.D */
abstract class C9528D extends C9634c implements C9543G {

    /* renamed from: s */
    public static final /* synthetic */ int f26179s = 0;

    C9528D(C9371P p, int i) {
        super(p, i, false);
    }

    C9528D(C9634c cVar, int i) {
        super(cVar, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static C9359D m34925Q1(C9371P p) {
        if (p instanceof C9359D) {
            return (C9359D) p;
        }
        if (C9552H3.f26222a) {
            C9552H3.m35026a(C9634c.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public final C9539F0 mo25705B1(C9735w0 w0Var, C9371P p, boolean z, C9431J j) {
        return C9735w0.m35804R0(w0Var, p, z);
    }

    /* renamed from: C */
    public final C9504k mo25706C(C9467k kVar) {
        kVar.getClass();
        return (C9504k) mo26040z1(new C9515A1(C9611W2.DOUBLE_VALUE, kVar, 0));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[LOOP:0: B:6:0x0019->B:9:0x0023, LOOP_START] */
    /* renamed from: C1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25707C1(p342j$.util.C9371P r3, p342j$.util.stream.C9657g2 r4) {
        /*
            r2 = this;
            j$.util.D r3 = m34925Q1(r3)
            boolean r0 = r4 instanceof p342j$.util.function.C9475o
            if (r0 == 0) goto L_0x000c
            r0 = r4
            j$.util.function.o r0 = (p342j$.util.function.C9475o) r0
            goto L_0x0019
        L_0x000c:
            boolean r0 = p342j$.util.stream.C9552H3.f26222a
            if (r0 != 0) goto L_0x0026
            r4.getClass()
            j$.util.stream.t r0 = new j$.util.stream.t
            r1 = 0
            r0.<init>(r1, r4)
        L_0x0019:
            boolean r1 = r4.mo25696r()
            if (r1 != 0) goto L_0x0025
            boolean r1 = r3.mo25178j(r0)
            if (r1 != 0) goto L_0x0019
        L_0x0025:
            return
        L_0x0026:
            java.lang.Class<j$.util.stream.c> r3 = p342j$.util.stream.C9634c.class
            java.lang.String r4 = "using DoubleStream.adapt(Sink<Double> s)"
            p342j$.util.stream.C9552H3.m35026a(r3, r4)
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9528D.mo25707C1(j$.util.P, j$.util.stream.g2):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public final C9611W2 mo25708D1() {
        return C9611W2.DOUBLE_VALUE;
    }

    /* renamed from: E */
    public final Object mo25709E(C9494x0 x0Var, C9468k0 k0Var, BiConsumer biConsumer) {
        C9714s sVar = new C9714s(biConsumer, 0);
        x0Var.getClass();
        k0Var.getClass();
        return mo26040z1(new C9736w1(C9611W2.DOUBLE_VALUE, sVar, k0Var, x0Var, 1));
    }

    /* renamed from: I */
    public final double mo25710I(double d, C9467k kVar) {
        kVar.getClass();
        return ((Double) mo26040z1(new C9746y1(C9611W2.DOUBLE_VALUE, kVar, d))).doubleValue();
    }

    /* renamed from: L */
    public final Stream mo25711L(C9481r rVar) {
        rVar.getClass();
        return new C9734w(this, C9607V2.f26308p | C9607V2.f26306n, rVar, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public final C9371P mo25712N1(C9735w0 w0Var, C9624a aVar, boolean z) {
        return new C9658g3(w0Var, aVar, z);
    }

    /* renamed from: R */
    public final C9543G mo25713R(C9493x xVar) {
        xVar.getClass();
        return new C9729v(this, C9607V2.f26308p | C9607V2.f26306n, xVar, 0);
    }

    /* renamed from: W */
    public final IntStream mo25714W(C9485t tVar) {
        tVar.getClass();
        return new C9739x(this, C9607V2.f26308p | C9607V2.f26306n, tVar, 0);
    }

    /* renamed from: Z */
    public final C9543G mo25715Z(C9483s sVar) {
        sVar.getClass();
        return new C9729v(this, C9607V2.f26312t, sVar, 2);
    }

    public final C9504k average() {
        double[] dArr = (double[]) mo25709E(new C9629b(6), new C9629b(7), new C9629b(8));
        if (dArr[2] <= Utils.DOUBLE_EPSILON) {
            return C9504k.m34864a();
        }
        Set set = Collectors.f26178a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return C9504k.m34865d(d / dArr[2]);
    }

    public final Stream boxed() {
        return mo25711L(new C9566L0(19));
    }

    /* renamed from: c */
    public final C9543G mo25718c(C9475o oVar) {
        oVar.getClass();
        return new C9729v(this, 0, oVar, 3);
    }

    public final long count() {
        return ((C9675k0) mo25739w(new C9629b(5))).sum();
    }

    public final C9543G distinct() {
        return ((C9618Y1) ((C9618Y1) boxed()).distinct()).mo25947i0(new C9629b(9));
    }

    public final C9504k findAny() {
        return (C9504k) mo26040z1(new C9548H(false, C9611W2.DOUBLE_VALUE, C9504k.m34864a(), new C9566L0(22), new C9629b(11)));
    }

    public final C9504k findFirst() {
        return (C9504k) mo26040z1(new C9548H(true, C9611W2.DOUBLE_VALUE, C9504k.m34864a(), new C9566L0(22), new C9629b(11)));
    }

    public final C9510q iterator() {
        return C9417e0.m34758f(spliterator());
    }

    /* renamed from: j0 */
    public final boolean mo25724j0(C9483s sVar) {
        return ((Boolean) mo26040z1(C9735w0.m35821m1(sVar, C9720t0.ANY))).booleanValue();
    }

    /* renamed from: k */
    public void mo25678k(C9475o oVar) {
        oVar.getClass();
        mo26040z1(new C9577O(oVar, false));
    }

    /* renamed from: l */
    public final boolean mo25725l(C9483s sVar) {
        return ((Boolean) mo26040z1(C9735w0.m35821m1(sVar, C9720t0.NONE))).booleanValue();
    }

    /* renamed from: l0 */
    public void mo25679l0(C9475o oVar) {
        oVar.getClass();
        mo26040z1(new C9577O(oVar, true));
    }

    public final C9543G limit(long j) {
        if (j >= 0) {
            return C9735w0.m35820l1(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    /* renamed from: m0 */
    public final boolean mo25727m0(C9483s sVar) {
        return ((Boolean) mo26040z1(C9735w0.m35821m1(sVar, C9720t0.ALL))).booleanValue();
    }

    public final C9504k max() {
        return mo25706C(new C9566L0(18));
    }

    public final C9504k min() {
        return mo25706C(new C9566L0(17));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final C9514A0 mo25730r1(long j, C9431J j2) {
        return C9735w0.m35808X0(j);
    }

    public final C9543G skip(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : C9735w0.m35820l1(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final C9543G sorted() {
        return new C9747y2(this);
    }

    public final C9359D spliterator() {
        return m34925Q1(super.spliterator());
    }

    public final double sum() {
        double[] dArr = (double[]) mo25709E(new C9629b(10), new C9629b(3), new C9629b(4));
        Set set = Collectors.f26178a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (!Double.isNaN(d) || !Double.isInfinite(d2)) ? d : d2;
    }

    public final C9499g summaryStatistics() {
        return (C9499g) mo25709E(new C9566L0(9), new C9566L0(20), new C9566L0(21));
    }

    public final double[] toArray() {
        return (double[]) C9735w0.m35813d1((C9519B0) mo26025A1(new C9629b(2))).mo25749g();
    }

    public final C9664i unordered() {
        return !mo26027F1() ? this : new C9749z(this, C9607V2.f26310r, 0);
    }

    /* renamed from: v */
    public final C9543G mo25738v(C9481r rVar) {
        return new C9729v(this, C9607V2.f26308p | C9607V2.f26306n | C9607V2.f26312t, rVar, 1);
    }

    /* renamed from: w */
    public final C9690n0 mo25739w(C9491w wVar) {
        wVar.getClass();
        return new C9744y(this, C9607V2.f26308p | C9607V2.f26306n, wVar, 0);
    }
}
