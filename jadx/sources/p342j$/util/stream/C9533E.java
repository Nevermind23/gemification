package p342j$.util.stream;

import java.util.stream.DoubleStream;
import p342j$.util.C9381a;
import p342j$.util.C9499g;
import p342j$.util.C9504k;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9447a;
import p342j$.util.function.C9465j;
import p342j$.util.function.C9466j0;
import p342j$.util.function.C9467k;
import p342j$.util.function.C9468k0;
import p342j$.util.function.C9473n;
import p342j$.util.function.C9475o;
import p342j$.util.function.C9479q;
import p342j$.util.function.C9481r;
import p342j$.util.function.C9483s;
import p342j$.util.function.C9485t;
import p342j$.util.function.C9489v;
import p342j$.util.function.C9491w;
import p342j$.util.function.C9492w0;
import p342j$.util.function.C9493x;
import p342j$.util.function.C9494x0;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.stream.E */
public final /* synthetic */ class C9533E implements C9543G {

    /* renamed from: a */
    public final /* synthetic */ DoubleStream f26187a;

    private /* synthetic */ C9533E(DoubleStream doubleStream) {
        this.f26187a = doubleStream;
    }

    /* renamed from: u */
    public static /* synthetic */ C9543G m34952u(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C9538F ? ((C9538F) doubleStream).f26193a : new C9533E(doubleStream);
    }

    /* renamed from: C */
    public final /* synthetic */ C9504k mo25706C(C9467k kVar) {
        return C9381a.m34663w(this.f26187a.reduce(C9465j.m34824a(kVar)));
    }

    /* renamed from: E */
    public final /* synthetic */ Object mo25709E(C9494x0 x0Var, C9468k0 k0Var, BiConsumer biConsumer) {
        return this.f26187a.collect(C9492w0.m34848a(x0Var), C9466j0.m34825a(k0Var), C9447a.m34803a(biConsumer));
    }

    /* renamed from: I */
    public final /* synthetic */ double mo25710I(double d, C9467k kVar) {
        return this.f26187a.reduce(d, C9465j.m34824a(kVar));
    }

    /* renamed from: L */
    public final /* synthetic */ Stream mo25711L(C9481r rVar) {
        return C9591R2.m35206u(this.f26187a.mapToObj(C9479q.m34836a(rVar)));
    }

    /* renamed from: R */
    public final /* synthetic */ C9543G mo25713R(C9493x xVar) {
        return m34952u(this.f26187a.map(xVar == null ? null : xVar.f26137a));
    }

    /* renamed from: W */
    public final /* synthetic */ IntStream mo25714W(C9485t tVar) {
        return IntStream.VivifiedWrapper.convert(this.f26187a.mapToInt(tVar == null ? null : tVar.f26130a));
    }

    /* renamed from: Z */
    public final /* synthetic */ C9543G mo25715Z(C9483s sVar) {
        return m34952u(this.f26187a.filter(sVar == null ? null : sVar.f26128a));
    }

    public final /* synthetic */ C9504k average() {
        return C9381a.m34663w(this.f26187a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return C9591R2.m35206u(this.f26187a.boxed());
    }

    /* renamed from: c */
    public final /* synthetic */ C9543G mo25718c(C9475o oVar) {
        return m34952u(this.f26187a.peek(C9473n.m34831a(oVar)));
    }

    public final /* synthetic */ void close() {
        this.f26187a.close();
    }

    public final /* synthetic */ long count() {
        return this.f26187a.count();
    }

    public final /* synthetic */ C9543G distinct() {
        return m34952u(this.f26187a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.f26187a;
        if (obj instanceof C9533E) {
            obj = ((C9533E) obj).f26187a;
        }
        return doubleStream.equals(obj);
    }

    public final /* synthetic */ C9504k findAny() {
        return C9381a.m34663w(this.f26187a.findAny());
    }

    public final /* synthetic */ C9504k findFirst() {
        return C9381a.m34663w(this.f26187a.findFirst());
    }

    public final /* synthetic */ int hashCode() {
        return this.f26187a.hashCode();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f26187a.isParallel();
    }

    /* renamed from: j0 */
    public final /* synthetic */ boolean mo25724j0(C9483s sVar) {
        return this.f26187a.anyMatch(sVar == null ? null : sVar.f26128a);
    }

    /* renamed from: k */
    public final /* synthetic */ void mo25678k(C9475o oVar) {
        this.f26187a.forEach(C9473n.m34831a(oVar));
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo25725l(C9483s sVar) {
        return this.f26187a.noneMatch(sVar == null ? null : sVar.f26128a);
    }

    /* renamed from: l0 */
    public final /* synthetic */ void mo25679l0(C9475o oVar) {
        this.f26187a.forEachOrdered(C9473n.m34831a(oVar));
    }

    public final /* synthetic */ C9543G limit(long j) {
        return m34952u(this.f26187a.limit(j));
    }

    /* renamed from: m0 */
    public final /* synthetic */ boolean mo25727m0(C9483s sVar) {
        return this.f26187a.allMatch(sVar == null ? null : sVar.f26128a);
    }

    public final /* synthetic */ C9504k max() {
        return C9381a.m34663w(this.f26187a.max());
    }

    public final /* synthetic */ C9504k min() {
        return C9381a.m34663w(this.f26187a.min());
    }

    public final /* synthetic */ C9664i onClose(Runnable runnable) {
        return C9654g.m35510u(this.f26187a.onClose(runnable));
    }

    public final /* synthetic */ C9543G skip(long j) {
        return m34952u(this.f26187a.skip(j));
    }

    public final /* synthetic */ C9543G sorted() {
        return m34952u(this.f26187a.sorted());
    }

    public final /* synthetic */ double sum() {
        return this.f26187a.sum();
    }

    public final C9499g summaryStatistics() {
        this.f26187a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    public final /* synthetic */ double[] toArray() {
        return this.f26187a.toArray();
    }

    public final /* synthetic */ C9664i unordered() {
        return C9654g.m35510u(this.f26187a.unordered());
    }

    /* renamed from: v */
    public final /* synthetic */ C9543G mo25738v(C9481r rVar) {
        return m34952u(this.f26187a.flatMap(C9479q.m34836a(rVar)));
    }

    /* renamed from: w */
    public final /* synthetic */ C9690n0 mo25739w(C9491w wVar) {
        return C9680l0.m35610u(this.f26187a.mapToLong(C9489v.m34846a(wVar)));
    }
}
