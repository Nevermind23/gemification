package p342j$.util.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p342j$.util.C9362G;
import p342j$.util.C9381a;
import p342j$.util.C9501h;
import p342j$.util.C9504k;
import p342j$.util.C9505l;
import p342j$.util.C9755u;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9420A;
import p342j$.util.function.C9422B;
import p342j$.util.function.C9424C;
import p342j$.util.function.C9426E;
import p342j$.util.function.C9427F;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9429H;
import p342j$.util.function.C9430I;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9432K;
import p342j$.util.function.C9433L;
import p342j$.util.function.C9434M;
import p342j$.util.function.C9435N;
import p342j$.util.function.C9436O;
import p342j$.util.function.C9437P;
import p342j$.util.function.C9447a;
import p342j$.util.function.C9470l0;
import p342j$.util.function.C9472m0;
import p342j$.util.function.C9474n0;
import p342j$.util.function.C9490v0;
import p342j$.util.function.C9492w0;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.IntStream */
public interface IntStream extends C9664i {

    /* renamed from: j$.util.stream.IntStream$VivifiedWrapper */
    public final /* synthetic */ class VivifiedWrapper implements IntStream {

        /* renamed from: a */
        public final /* synthetic */ java.util.stream.IntStream f26228a;

        private /* synthetic */ VivifiedWrapper(java.util.stream.IntStream intStream) {
            this.f26228a = intStream;
        }

        public static /* synthetic */ IntStream convert(java.util.stream.IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof Wrapper ? IntStream.this : new VivifiedWrapper(intStream);
        }

        /* renamed from: F */
        public final /* synthetic */ void mo25805F(C9428G g) {
            this.f26228a.forEachOrdered(C9427F.m34780a(g));
        }

        /* renamed from: G */
        public final /* synthetic */ Stream mo25806G(C9431J j) {
            return C9591R2.m35206u(this.f26228a.mapToObj(C9430I.m34787a(j)));
        }

        /* renamed from: K */
        public final /* synthetic */ IntStream mo25807K(C9437P p) {
            return convert(this.f26228a.map(p == null ? null : p.f26083a));
        }

        /* renamed from: M */
        public final /* synthetic */ int mo25808M(int i, C9424C c) {
            return this.f26228a.reduce(i, C9422B.m34769a(c));
        }

        /* renamed from: N */
        public final /* synthetic */ IntStream mo25809N(C9431J j) {
            return convert(this.f26228a.flatMap(C9430I.m34787a(j)));
        }

        /* renamed from: P */
        public final /* synthetic */ void mo25810P(C9428G g) {
            this.f26228a.forEach(C9427F.m34780a(g));
        }

        /* renamed from: U */
        public final /* synthetic */ IntStream mo25811U(C9432K k) {
            return convert(this.f26228a.filter(k == null ? null : k.f26079a));
        }

        /* renamed from: Y */
        public final /* synthetic */ boolean mo25812Y(C9432K k) {
            return this.f26228a.allMatch(k == null ? null : k.f26079a);
        }

        public final /* synthetic */ C9543G asDoubleStream() {
            return C9533E.m34952u(this.f26228a.asDoubleStream());
        }

        public final /* synthetic */ C9690n0 asLongStream() {
            return C9680l0.m35610u(this.f26228a.asLongStream());
        }

        public final /* synthetic */ C9504k average() {
            return C9381a.m34663w(this.f26228a.average());
        }

        /* renamed from: b0 */
        public final /* synthetic */ C9505l mo25816b0(C9424C c) {
            return C9381a.m34664x(this.f26228a.reduce(C9422B.m34769a(c)));
        }

        public final /* synthetic */ Stream boxed() {
            return C9591R2.m35206u(this.f26228a.boxed());
        }

        /* renamed from: c0 */
        public final /* synthetic */ IntStream mo25818c0(C9428G g) {
            return convert(this.f26228a.peek(C9427F.m34780a(g)));
        }

        public final /* synthetic */ void close() {
            this.f26228a.close();
        }

        public final /* synthetic */ long count() {
            return this.f26228a.count();
        }

        public final /* synthetic */ IntStream distinct() {
            return convert(this.f26228a.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.stream.IntStream intStream = this.f26228a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).f26228a;
            }
            return intStream.equals(obj);
        }

        /* renamed from: f */
        public final /* synthetic */ C9543G mo25821f(C9433L l) {
            return C9533E.m34952u(this.f26228a.mapToDouble(l == null ? null : l.f26080a));
        }

        public final /* synthetic */ C9505l findAny() {
            return C9381a.m34664x(this.f26228a.findAny());
        }

        public final /* synthetic */ C9505l findFirst() {
            return C9381a.m34664x(this.f26228a.findFirst());
        }

        /* renamed from: g0 */
        public final /* synthetic */ boolean mo25824g0(C9432K k) {
            return this.f26228a.anyMatch(k == null ? null : k.f26079a);
        }

        /* renamed from: h */
        public final /* synthetic */ C9690n0 mo25825h(C9436O o) {
            return C9680l0.m35610u(this.f26228a.mapToLong(C9435N.m34791a(o)));
        }

        /* renamed from: h0 */
        public final /* synthetic */ boolean mo25826h0(C9432K k) {
            return this.f26228a.noneMatch(k == null ? null : k.f26079a);
        }

        public final /* synthetic */ int hashCode() {
            return this.f26228a.hashCode();
        }

        public final /* synthetic */ boolean isParallel() {
            return this.f26228a.isParallel();
        }

        /* renamed from: k0 */
        public final /* synthetic */ Object mo25827k0(C9494x0 x0Var, C9474n0 n0Var, BiConsumer biConsumer) {
            return this.f26228a.collect(C9492w0.m34848a(x0Var), C9472m0.m34830a(n0Var), C9447a.m34803a(biConsumer));
        }

        public final /* synthetic */ IntStream limit(long j) {
            return convert(this.f26228a.limit(j));
        }

        public final /* synthetic */ C9505l max() {
            return C9381a.m34664x(this.f26228a.max());
        }

        public final /* synthetic */ C9505l min() {
            return C9381a.m34664x(this.f26228a.min());
        }

        public final /* synthetic */ C9664i onClose(Runnable runnable) {
            return C9654g.m35510u(this.f26228a.onClose(runnable));
        }

        public final /* synthetic */ IntStream skip(long j) {
            return convert(this.f26228a.skip(j));
        }

        public final /* synthetic */ IntStream sorted() {
            return convert(this.f26228a.sorted());
        }

        public final /* synthetic */ int sum() {
            return this.f26228a.sum();
        }

        public final C9501h summaryStatistics() {
            this.f26228a.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
        }

        public final /* synthetic */ int[] toArray() {
            return this.f26228a.toArray();
        }

        public final /* synthetic */ C9664i unordered() {
            return C9654g.m35510u(this.f26228a.unordered());
        }
    }

    /* renamed from: j$.util.stream.IntStream$Wrapper */
    public final /* synthetic */ class Wrapper implements java.util.stream.IntStream {
        private /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.stream.IntStream convert(IntStream intStream) {
            if (intStream == null) {
                return null;
            }
            return intStream instanceof VivifiedWrapper ? ((VivifiedWrapper) intStream).f26228a : new Wrapper();
        }

        public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
            return IntStream.this.mo25812Y(C9432K.m34788a(intPredicate));
        }

        public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
            return IntStream.this.mo25824g0(C9432K.m34788a(intPredicate));
        }

        public final /* synthetic */ DoubleStream asDoubleStream() {
            return C9538F.m34982u(IntStream.this.asDoubleStream());
        }

        public final /* synthetic */ LongStream asLongStream() {
            return C9685m0.m35637u(IntStream.this.asLongStream());
        }

        public final /* synthetic */ OptionalDouble average() {
            return C9381a.m34636A(IntStream.this.average());
        }

        public final /* synthetic */ Stream boxed() {
            return C9595S2.m35238u(IntStream.this.boxed());
        }

        public final /* synthetic */ void close() {
            IntStream.this.close();
        }

        public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, java.util.function.BiConsumer biConsumer) {
            return IntStream.this.mo25827k0(C9490v0.m34847a(supplier), C9470l0.m34827a(objIntConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
        }

        public final /* synthetic */ long count() {
            return IntStream.this.count();
        }

        public final /* synthetic */ java.util.stream.IntStream distinct() {
            return convert(IntStream.this.distinct());
        }

        public final /* synthetic */ boolean equals(Object obj) {
            IntStream intStream = IntStream.this;
            if (obj instanceof Wrapper) {
                obj = IntStream.this;
            }
            return intStream.equals(obj);
        }

        public final /* synthetic */ java.util.stream.IntStream filter(IntPredicate intPredicate) {
            return convert(IntStream.this.mo25811U(C9432K.m34788a(intPredicate)));
        }

        public final /* synthetic */ OptionalInt findAny() {
            return C9381a.m34637B(IntStream.this.findAny());
        }

        public final /* synthetic */ OptionalInt findFirst() {
            return C9381a.m34637B(IntStream.this.findFirst());
        }

        public final /* synthetic */ java.util.stream.IntStream flatMap(IntFunction intFunction) {
            return convert(IntStream.this.mo25809N(C9429H.m34786a(intFunction)));
        }

        public final /* synthetic */ void forEach(IntConsumer intConsumer) {
            IntStream.this.mo25810P(C9426E.m34778a(intConsumer));
        }

        public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
            IntStream.this.mo25805F(C9426E.m34778a(intConsumer));
        }

        public final /* synthetic */ int hashCode() {
            return IntStream.this.hashCode();
        }

        public final /* synthetic */ boolean isParallel() {
            return IntStream.this.isParallel();
        }

        public final /* synthetic */ java.util.stream.IntStream limit(long j) {
            return convert(IntStream.this.limit(j));
        }

        public final /* synthetic */ java.util.stream.IntStream map(IntUnaryOperator intUnaryOperator) {
            return convert(IntStream.this.mo25807K(C9437P.m34792a(intUnaryOperator)));
        }

        public final /* synthetic */ DoubleStream mapToDouble(IntToDoubleFunction intToDoubleFunction) {
            return C9538F.m34982u(IntStream.this.mo25821f(C9433L.m34789a(intToDoubleFunction)));
        }

        public final /* synthetic */ LongStream mapToLong(IntToLongFunction intToLongFunction) {
            return C9685m0.m35637u(IntStream.this.mo25825h(C9434M.m34790a(intToLongFunction)));
        }

        public final /* synthetic */ Stream mapToObj(IntFunction intFunction) {
            return C9595S2.m35238u(IntStream.this.mo25806G(C9429H.m34786a(intFunction)));
        }

        public final /* synthetic */ OptionalInt max() {
            return C9381a.m34637B(IntStream.this.max());
        }

        public final /* synthetic */ OptionalInt min() {
            return C9381a.m34637B(IntStream.this.min());
        }

        public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
            return IntStream.this.mo25826h0(C9432K.m34788a(intPredicate));
        }

        public final /* synthetic */ BaseStream onClose(Runnable runnable) {
            return C9659h.m35523u(IntStream.this.onClose(runnable));
        }

        public final /* synthetic */ java.util.stream.IntStream peek(IntConsumer intConsumer) {
            return convert(IntStream.this.mo25818c0(C9426E.m34778a(intConsumer)));
        }

        public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
            return IntStream.this.mo25808M(i, C9420A.m34767a(intBinaryOperator));
        }

        public final /* synthetic */ OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
            return C9381a.m34637B(IntStream.this.mo25816b0(C9420A.m34767a(intBinaryOperator)));
        }

        public final /* synthetic */ java.util.stream.IntStream skip(long j) {
            return convert(IntStream.this.skip(j));
        }

        public final /* synthetic */ java.util.stream.IntStream sorted() {
            return convert(IntStream.this.sorted());
        }

        public final /* synthetic */ int sum() {
            return IntStream.this.sum();
        }

        public final IntSummaryStatistics summaryStatistics() {
            IntStream.this.summaryStatistics();
            throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.IntSummaryStatistics");
        }

        public final /* synthetic */ int[] toArray() {
            return IntStream.this.toArray();
        }

        public final /* synthetic */ BaseStream unordered() {
            return C9659h.m35523u(IntStream.this.unordered());
        }
    }

    /* renamed from: F */
    void mo25805F(C9428G g);

    /* renamed from: G */
    Stream mo25806G(C9431J j);

    /* renamed from: K */
    IntStream mo25807K(C9437P p);

    /* renamed from: M */
    int mo25808M(int i, C9424C c);

    /* renamed from: N */
    IntStream mo25809N(C9431J j);

    /* renamed from: P */
    void mo25810P(C9428G g);

    /* renamed from: U */
    IntStream mo25811U(C9432K k);

    /* renamed from: Y */
    boolean mo25812Y(C9432K k);

    C9543G asDoubleStream();

    C9690n0 asLongStream();

    C9504k average();

    /* renamed from: b0 */
    C9505l mo25816b0(C9424C c);

    Stream boxed();

    /* renamed from: c0 */
    IntStream mo25818c0(C9428G g);

    long count();

    IntStream distinct();

    /* renamed from: f */
    C9543G mo25821f(C9433L l);

    C9505l findAny();

    C9505l findFirst();

    /* renamed from: g0 */
    boolean mo25824g0(C9432K k);

    /* renamed from: h */
    C9690n0 mo25825h(C9436O o);

    /* renamed from: h0 */
    boolean mo25826h0(C9432K k);

    C9755u iterator();

    /* renamed from: k0 */
    Object mo25827k0(C9494x0 x0Var, C9474n0 n0Var, BiConsumer biConsumer);

    IntStream limit(long j);

    C9505l max();

    C9505l min();

    IntStream parallel();

    IntStream sequential();

    IntStream skip(long j);

    IntStream sorted();

    C9362G spliterator();

    int sum();

    C9501h summaryStatistics();

    int[] toArray();
}
