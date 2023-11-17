package p342j$.util.stream;

import java.util.stream.LongStream;
import p342j$.util.C9381a;
import p342j$.util.C9503j;
import p342j$.util.C9504k;
import p342j$.util.C9506m;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9439S;
import p342j$.util.function.C9440T;
import p342j$.util.function.C9443W;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9446Z;
import p342j$.util.function.C9447a;
import p342j$.util.function.C9448a0;
import p342j$.util.function.C9450b0;
import p342j$.util.function.C9452c0;
import p342j$.util.function.C9454d0;
import p342j$.util.function.C9460g0;
import p342j$.util.function.C9462h0;
import p342j$.util.function.C9478p0;
import p342j$.util.function.C9480q0;
import p342j$.util.function.C9492w0;
import p342j$.util.function.C9494x0;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.stream.l0 */
public final /* synthetic */ class C9680l0 implements C9690n0 {

    /* renamed from: a */
    public final /* synthetic */ LongStream f26415a;

    private /* synthetic */ C9680l0(LongStream longStream) {
        this.f26415a = longStream;
    }

    /* renamed from: u */
    public static /* synthetic */ C9690n0 m35610u(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C9685m0 ? ((C9685m0) longStream).f26421a : new C9680l0(longStream);
    }

    /* renamed from: A */
    public final /* synthetic */ long mo26077A(long j, C9440T t) {
        return this.f26415a.reduce(j, C9439S.m34795a(t));
    }

    /* renamed from: D */
    public final /* synthetic */ IntStream mo26078D(C9454d0 d0Var) {
        return IntStream.VivifiedWrapper.convert(this.f26415a.mapToInt(d0Var == null ? null : d0Var.f26102a));
    }

    /* renamed from: H */
    public final /* synthetic */ boolean mo26079H(C9450b0 b0Var) {
        return this.f26415a.anyMatch(b0Var == null ? null : b0Var.f26097a);
    }

    /* renamed from: J */
    public final /* synthetic */ boolean mo26080J(C9450b0 b0Var) {
        return this.f26415a.noneMatch(b0Var == null ? null : b0Var.f26097a);
    }

    /* renamed from: O */
    public final /* synthetic */ Stream mo26081O(C9448a0 a0Var) {
        return C9591R2.m35206u(this.f26415a.mapToObj(C9446Z.m34802a(a0Var)));
    }

    /* renamed from: Q */
    public final /* synthetic */ C9690n0 mo26082Q(C9450b0 b0Var) {
        return m35610u(this.f26415a.filter(b0Var == null ? null : b0Var.f26097a));
    }

    /* renamed from: a0 */
    public final /* synthetic */ void mo26065a0(C9444X x) {
        this.f26415a.forEachOrdered(C9443W.m34799a(x));
    }

    public final /* synthetic */ C9543G asDoubleStream() {
        return C9533E.m34952u(this.f26415a.asDoubleStream());
    }

    public final /* synthetic */ C9504k average() {
        return C9381a.m34663w(this.f26415a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return C9591R2.m35206u(this.f26415a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f26415a.close();
    }

    public final /* synthetic */ long count() {
        return this.f26415a.count();
    }

    public final /* synthetic */ C9690n0 distinct() {
        return m35610u(this.f26415a.distinct());
    }

    /* renamed from: e */
    public final /* synthetic */ void mo26066e(C9444X x) {
        this.f26415a.forEach(C9443W.m34799a(x));
    }

    /* renamed from: e0 */
    public final /* synthetic */ Object mo26088e0(C9494x0 x0Var, C9480q0 q0Var, BiConsumer biConsumer) {
        return this.f26415a.collect(C9492w0.m34848a(x0Var), C9478p0.m34835a(q0Var), C9447a.m34803a(biConsumer));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.f26415a;
        if (obj instanceof C9680l0) {
            obj = ((C9680l0) obj).f26415a;
        }
        return longStream.equals(obj);
    }

    public final /* synthetic */ C9506m findAny() {
        return C9381a.m34665y(this.f26415a.findAny());
    }

    public final /* synthetic */ C9506m findFirst() {
        return C9381a.m34665y(this.f26415a.findFirst());
    }

    public final /* synthetic */ int hashCode() {
        return this.f26415a.hashCode();
    }

    /* renamed from: i */
    public final /* synthetic */ C9506m mo26091i(C9440T t) {
        return C9381a.m34665y(this.f26415a.reduce(C9439S.m34795a(t)));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f26415a.isParallel();
    }

    public final /* synthetic */ C9690n0 limit(long j) {
        return m35610u(this.f26415a.limit(j));
    }

    public final /* synthetic */ C9506m max() {
        return C9381a.m34665y(this.f26415a.max());
    }

    public final /* synthetic */ C9506m min() {
        return C9381a.m34665y(this.f26415a.min());
    }

    public final /* synthetic */ C9664i onClose(Runnable runnable) {
        return C9654g.m35510u(this.f26415a.onClose(runnable));
    }

    /* renamed from: q */
    public final /* synthetic */ C9690n0 mo26095q(C9444X x) {
        return m35610u(this.f26415a.peek(C9443W.m34799a(x)));
    }

    /* renamed from: r */
    public final /* synthetic */ C9690n0 mo26096r(C9448a0 a0Var) {
        return m35610u(this.f26415a.flatMap(C9446Z.m34802a(a0Var)));
    }

    public final /* synthetic */ C9690n0 skip(long j) {
        return m35610u(this.f26415a.skip(j));
    }

    public final /* synthetic */ C9690n0 sorted() {
        return m35610u(this.f26415a.sorted());
    }

    public final /* synthetic */ long sum() {
        return this.f26415a.sum();
    }

    public final C9503j summaryStatistics() {
        this.f26415a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    /* renamed from: t */
    public final /* synthetic */ C9543G mo26101t(C9452c0 c0Var) {
        return C9533E.m34952u(this.f26415a.mapToDouble(c0Var == null ? null : c0Var.f26100a));
    }

    public final /* synthetic */ long[] toArray() {
        return this.f26415a.toArray();
    }

    public final /* synthetic */ C9664i unordered() {
        return C9654g.m35510u(this.f26415a.unordered());
    }

    /* renamed from: x */
    public final /* synthetic */ boolean mo26103x(C9450b0 b0Var) {
        return this.f26415a.allMatch(b0Var == null ? null : b0Var.f26097a);
    }

    /* renamed from: y */
    public final /* synthetic */ C9690n0 mo26104y(C9462h0 h0Var) {
        return m35610u(this.f26415a.map(C9460g0.m34818a(h0Var)));
    }
}
