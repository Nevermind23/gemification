package p342j$.util.stream;

import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p342j$.util.C9381a;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9438Q;
import p342j$.util.function.C9442V;
import p342j$.util.function.C9445Y;
import p342j$.util.function.C9450b0;
import p342j$.util.function.C9452c0;
import p342j$.util.function.C9454d0;
import p342j$.util.function.C9458f0;
import p342j$.util.function.C9476o0;
import p342j$.util.function.C9490v0;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.stream.m0 */
public final /* synthetic */ class C9685m0 implements LongStream {

    /* renamed from: a */
    public final /* synthetic */ C9690n0 f26421a;

    private /* synthetic */ C9685m0(C9690n0 n0Var) {
        this.f26421a = n0Var;
    }

    /* renamed from: u */
    public static /* synthetic */ LongStream m35637u(C9690n0 n0Var) {
        if (n0Var == null) {
            return null;
        }
        return n0Var instanceof C9680l0 ? ((C9680l0) n0Var).f26415a : new C9685m0(n0Var);
    }

    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.f26421a.mo26103x(C9450b0.m34805a(longPredicate));
    }

    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.f26421a.mo26079H(C9450b0.m34805a(longPredicate));
    }

    public final /* synthetic */ DoubleStream asDoubleStream() {
        return C9538F.m34982u(this.f26421a.asDoubleStream());
    }

    public final /* synthetic */ OptionalDouble average() {
        return C9381a.m34636A(this.f26421a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return C9595S2.m35238u(this.f26421a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f26421a.close();
    }

    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.f26421a.mo26088e0(C9490v0.m34847a(supplier), C9476o0.m34833a(objLongConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ long count() {
        return this.f26421a.count();
    }

    public final /* synthetic */ LongStream distinct() {
        return m35637u(this.f26421a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9690n0 n0Var = this.f26421a;
        if (obj instanceof C9685m0) {
            obj = ((C9685m0) obj).f26421a;
        }
        return n0Var.equals(obj);
    }

    public final /* synthetic */ LongStream filter(LongPredicate longPredicate) {
        return m35637u(this.f26421a.mo26082Q(C9450b0.m34805a(longPredicate)));
    }

    public final /* synthetic */ OptionalLong findAny() {
        return C9381a.m34638C(this.f26421a.findAny());
    }

    public final /* synthetic */ OptionalLong findFirst() {
        return C9381a.m34638C(this.f26421a.findFirst());
    }

    public final /* synthetic */ LongStream flatMap(LongFunction longFunction) {
        return m35637u(this.f26421a.mo26096r(C9445Y.m34801a(longFunction)));
    }

    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.f26421a.mo26066e(C9442V.m34797a(longConsumer));
    }

    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.f26421a.mo26065a0(C9442V.m34797a(longConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f26421a.hashCode();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f26421a.isParallel();
    }

    public final /* synthetic */ LongStream limit(long j) {
        return m35637u(this.f26421a.limit(j));
    }

    public final /* synthetic */ LongStream map(LongUnaryOperator longUnaryOperator) {
        return m35637u(this.f26421a.mo26104y(C9458f0.m34814a(longUnaryOperator)));
    }

    public final /* synthetic */ DoubleStream mapToDouble(LongToDoubleFunction longToDoubleFunction) {
        return C9538F.m34982u(this.f26421a.mo26101t(C9452c0.m34807a(longToDoubleFunction)));
    }

    public final /* synthetic */ IntStream mapToInt(LongToIntFunction longToIntFunction) {
        return IntStream.Wrapper.convert(this.f26421a.mo26078D(C9454d0.m34810a(longToIntFunction)));
    }

    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return C9595S2.m35238u(this.f26421a.mo26081O(C9445Y.m34801a(longFunction)));
    }

    public final /* synthetic */ OptionalLong max() {
        return C9381a.m34638C(this.f26421a.max());
    }

    public final /* synthetic */ OptionalLong min() {
        return C9381a.m34638C(this.f26421a.min());
    }

    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.f26421a.mo26080J(C9450b0.m34805a(longPredicate));
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C9659h.m35523u(this.f26421a.onClose(runnable));
    }

    public final /* synthetic */ LongStream peek(LongConsumer longConsumer) {
        return m35637u(this.f26421a.mo26095q(C9442V.m34797a(longConsumer)));
    }

    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.f26421a.mo26077A(j, C9438Q.m34794a(longBinaryOperator));
    }

    public final /* synthetic */ OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        return C9381a.m34638C(this.f26421a.mo26091i(C9438Q.m34794a(longBinaryOperator)));
    }

    public final /* synthetic */ LongStream skip(long j) {
        return m35637u(this.f26421a.skip(j));
    }

    public final /* synthetic */ LongStream sorted() {
        return m35637u(this.f26421a.sorted());
    }

    public final /* synthetic */ long sum() {
        return this.f26421a.sum();
    }

    public final LongSummaryStatistics summaryStatistics() {
        this.f26421a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.LongSummaryStatistics");
    }

    public final /* synthetic */ long[] toArray() {
        return this.f26421a.toArray();
    }

    public final /* synthetic */ BaseStream unordered() {
        return C9659h.m35523u(this.f26421a.unordered());
    }
}
