package p342j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Stream;
import p342j$.util.C9369N;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.Optional;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.C9421A0;
import p342j$.util.function.C9430I;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9447a;
import p342j$.util.function.C9449b;
import p342j$.util.function.C9455e;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9461h;
import p342j$.util.function.C9488u0;
import p342j$.util.function.C9492w0;
import p342j$.util.function.C9494x0;
import p342j$.util.function.C9496y0;
import p342j$.util.function.C9497z;
import p342j$.util.function.C9498z0;
import p342j$.util.function.Consumer;
import p342j$.util.function.Function;
import p342j$.util.function.Predicate;
import p342j$.util.function.ToDoubleFunction;
import p342j$.util.function.ToIntFunction;
import p342j$.util.function.ToLongFunction;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.stream.R2 */
public final /* synthetic */ class C9591R2 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ Stream f26273a;

    private /* synthetic */ C9591R2(Stream stream) {
        this.f26273a = stream;
    }

    /* renamed from: u */
    public static /* synthetic */ Stream m35206u(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C9595S2 ? ((C9595S2) stream).f26279a : new C9591R2(stream);
    }

    /* renamed from: B */
    public final /* synthetic */ C9543G mo25928B(Function function) {
        return C9533E.m34952u(this.f26273a.flatMapToDouble(C9497z.m34853a(function)));
    }

    /* renamed from: S */
    public final /* synthetic */ Stream mo25929S(Consumer consumer) {
        return m35206u(this.f26273a.peek(C9461h.m34819a(consumer)));
    }

    /* renamed from: T */
    public final /* synthetic */ boolean mo25930T(Predicate predicate) {
        return this.f26273a.allMatch(C9488u0.m34844a(predicate));
    }

    /* renamed from: V */
    public final /* synthetic */ C9690n0 mo25931V(Function function) {
        return C9680l0.m35610u(this.f26273a.flatMapToLong(C9497z.m34853a(function)));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25932a(Consumer consumer) {
        this.f26273a.forEach(C9461h.m34819a(consumer));
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo25933b(Predicate predicate) {
        return this.f26273a.anyMatch(C9488u0.m34844a(predicate));
    }

    public final /* synthetic */ void close() {
        this.f26273a.close();
    }

    public final /* synthetic */ Object collect(Collector collector) {
        return this.f26273a.collect(C9679l.m35609a(collector));
    }

    public final /* synthetic */ long count() {
        return this.f26273a.count();
    }

    /* renamed from: d */
    public final /* synthetic */ IntStream mo25937d(Function function) {
        return IntStream.VivifiedWrapper.convert(this.f26273a.flatMapToInt(C9497z.m34853a(function)));
    }

    /* renamed from: d0 */
    public final /* synthetic */ boolean mo25938d0(Predicate predicate) {
        return this.f26273a.noneMatch(C9488u0.m34844a(predicate));
    }

    public final /* synthetic */ Stream distinct() {
        return m35206u(this.f26273a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.f26273a;
        if (obj instanceof C9591R2) {
            obj = ((C9591R2) obj).f26273a;
        }
        return stream.equals(obj);
    }

    /* renamed from: f0 */
    public final /* synthetic */ C9690n0 mo25941f0(ToLongFunction toLongFunction) {
        return C9680l0.m35610u(this.f26273a.mapToLong(C9421A0.m34768a(toLongFunction)));
    }

    public final /* synthetic */ Stream filter(Predicate predicate) {
        return m35206u(this.f26273a.filter(C9488u0.m34844a(predicate)));
    }

    public final /* synthetic */ Optional findAny() {
        return C9381a.m34662v(this.f26273a.findAny());
    }

    public final /* synthetic */ Optional findFirst() {
        return C9381a.m34662v(this.f26273a.findFirst());
    }

    /* renamed from: g */
    public final /* synthetic */ void mo25945g(Consumer consumer) {
        this.f26273a.forEachOrdered(C9461h.m34819a(consumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f26273a.hashCode();
    }

    /* renamed from: i0 */
    public final /* synthetic */ C9543G mo25947i0(ToDoubleFunction toDoubleFunction) {
        return C9533E.m34952u(this.f26273a.mapToDouble(C9496y0.m34852a(toDoubleFunction)));
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f26273a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f26273a.iterator();
    }

    /* renamed from: j */
    public final /* synthetic */ Object mo25948j(C9494x0 x0Var, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f26273a.collect(C9492w0.m34848a(x0Var), C9447a.m34803a(biConsumer), C9447a.m34803a(biConsumer2));
    }

    public final /* synthetic */ Stream limit(long j) {
        return m35206u(this.f26273a.limit(j));
    }

    /* renamed from: m */
    public final /* synthetic */ Object[] mo25950m(C9431J j) {
        return this.f26273a.toArray(C9430I.m34787a(j));
    }

    public final /* synthetic */ Optional max(Comparator comparator) {
        return C9381a.m34662v(this.f26273a.max(comparator));
    }

    public final /* synthetic */ Optional min(Comparator comparator) {
        return C9381a.m34662v(this.f26273a.min(comparator));
    }

    /* renamed from: n */
    public final /* synthetic */ IntStream mo25953n(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.f26273a.mapToInt(C9498z0.m34854a(toIntFunction)));
    }

    /* renamed from: o */
    public final /* synthetic */ Stream mo25954o(Function function) {
        return m35206u(this.f26273a.map(C9497z.m34853a(function)));
    }

    /* renamed from: o0 */
    public final /* synthetic */ Object mo25955o0(Object obj, C9457f fVar) {
        return this.f26273a.reduce(obj, C9455e.m34811a(fVar));
    }

    public final /* synthetic */ C9664i onClose(Runnable runnable) {
        return C9654g.m35510u(this.f26273a.onClose(runnable));
    }

    /* renamed from: p */
    public final /* synthetic */ Stream mo25956p(Function function) {
        return m35206u(this.f26273a.flatMap(C9497z.m34853a(function)));
    }

    public final /* synthetic */ C9664i parallel() {
        return C9654g.m35510u(this.f26273a.parallel());
    }

    /* renamed from: s */
    public final /* synthetic */ Optional mo25957s(C9457f fVar) {
        return C9381a.m34662v(this.f26273a.reduce(C9455e.m34811a(fVar)));
    }

    public final /* synthetic */ C9664i sequential() {
        return C9654g.m35510u(this.f26273a.sequential());
    }

    public final /* synthetic */ Stream skip(long j) {
        return m35206u(this.f26273a.skip(j));
    }

    public final /* synthetic */ Stream sorted() {
        return m35206u(this.f26273a.sorted());
    }

    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return m35206u(this.f26273a.sorted(comparator));
    }

    public final /* synthetic */ C9371P spliterator() {
        return C9369N.m34599b(this.f26273a.spliterator());
    }

    public final /* synthetic */ Object[] toArray() {
        return this.f26273a.toArray();
    }

    public final /* synthetic */ C9664i unordered() {
        return C9654g.m35510u(this.f26273a.unordered());
    }

    /* renamed from: z */
    public final /* synthetic */ Object mo25962z(Object obj, BiFunction biFunction, C9457f fVar) {
        return this.f26273a.reduce(obj, C9449b.m34804a(biFunction), C9455e.m34811a(fVar));
    }
}
