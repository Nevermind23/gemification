package p342j$.util.stream;

import java.util.DoubleSummaryStatistics;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p342j$.util.C9381a;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9463i;
import p342j$.util.function.C9464i0;
import p342j$.util.function.C9471m;
import p342j$.util.function.C9477p;
import p342j$.util.function.C9483s;
import p342j$.util.function.C9485t;
import p342j$.util.function.C9487u;
import p342j$.util.function.C9490v0;
import p342j$.util.function.C9493x;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.stream.F */
public final /* synthetic */ class C9538F implements DoubleStream {

    /* renamed from: a */
    public final /* synthetic */ C9543G f26193a;

    private /* synthetic */ C9538F(C9543G g) {
        this.f26193a = g;
    }

    /* renamed from: u */
    public static /* synthetic */ DoubleStream m34982u(C9543G g) {
        if (g == null) {
            return null;
        }
        return g instanceof C9533E ? ((C9533E) g).f26187a : new C9538F(g);
    }

    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.f26193a.mo25727m0(C9483s.m34838a(doublePredicate));
    }

    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.f26193a.mo25724j0(C9483s.m34838a(doublePredicate));
    }

    public final /* synthetic */ OptionalDouble average() {
        return C9381a.m34636A(this.f26193a.average());
    }

    public final /* synthetic */ Stream boxed() {
        return C9595S2.m35238u(this.f26193a.boxed());
    }

    public final /* synthetic */ void close() {
        this.f26193a.close();
    }

    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.f26193a.mo25709E(C9490v0.m34847a(supplier), C9464i0.m34823a(objDoubleConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    public final /* synthetic */ long count() {
        return this.f26193a.count();
    }

    public final /* synthetic */ DoubleStream distinct() {
        return m34982u(this.f26193a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9543G g = this.f26193a;
        if (obj instanceof C9538F) {
            obj = ((C9538F) obj).f26193a;
        }
        return g.equals(obj);
    }

    public final /* synthetic */ DoubleStream filter(DoublePredicate doublePredicate) {
        return m34982u(this.f26193a.mo25715Z(C9483s.m34838a(doublePredicate)));
    }

    public final /* synthetic */ OptionalDouble findAny() {
        return C9381a.m34636A(this.f26193a.findAny());
    }

    public final /* synthetic */ OptionalDouble findFirst() {
        return C9381a.m34636A(this.f26193a.findFirst());
    }

    public final /* synthetic */ DoubleStream flatMap(DoubleFunction doubleFunction) {
        return m34982u(this.f26193a.mo25738v(C9477p.m34834a(doubleFunction)));
    }

    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.f26193a.mo25678k(C9471m.m34828a(doubleConsumer));
    }

    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.f26193a.mo25679l0(C9471m.m34828a(doubleConsumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f26193a.hashCode();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f26193a.isParallel();
    }

    public final /* synthetic */ DoubleStream limit(long j) {
        return m34982u(this.f26193a.limit(j));
    }

    public final /* synthetic */ DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        return m34982u(this.f26193a.mo25713R(C9493x.m34849a(doubleUnaryOperator)));
    }

    public final /* synthetic */ IntStream mapToInt(DoubleToIntFunction doubleToIntFunction) {
        return IntStream.Wrapper.convert(this.f26193a.mo25714W(C9485t.m34840a(doubleToIntFunction)));
    }

    public final /* synthetic */ LongStream mapToLong(DoubleToLongFunction doubleToLongFunction) {
        return C9685m0.m35637u(this.f26193a.mo25739w(C9487u.m34843a(doubleToLongFunction)));
    }

    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return C9595S2.m35238u(this.f26193a.mo25711L(C9477p.m34834a(doubleFunction)));
    }

    public final /* synthetic */ OptionalDouble max() {
        return C9381a.m34636A(this.f26193a.max());
    }

    public final /* synthetic */ OptionalDouble min() {
        return C9381a.m34636A(this.f26193a.min());
    }

    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.f26193a.mo25725l(C9483s.m34838a(doublePredicate));
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C9659h.m35523u(this.f26193a.onClose(runnable));
    }

    public final /* synthetic */ DoubleStream peek(DoubleConsumer doubleConsumer) {
        return m34982u(this.f26193a.mo25718c(C9471m.m34828a(doubleConsumer)));
    }

    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.f26193a.mo25710I(d, C9463i.m34822a(doubleBinaryOperator));
    }

    public final /* synthetic */ OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return C9381a.m34636A(this.f26193a.mo25706C(C9463i.m34822a(doubleBinaryOperator)));
    }

    public final /* synthetic */ DoubleStream skip(long j) {
        return m34982u(this.f26193a.skip(j));
    }

    public final /* synthetic */ DoubleStream sorted() {
        return m34982u(this.f26193a.sorted());
    }

    public final /* synthetic */ double sum() {
        return this.f26193a.sum();
    }

    public final DoubleSummaryStatistics summaryStatistics() {
        this.f26193a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert to java.util.DoubleSummaryStatistics");
    }

    public final /* synthetic */ double[] toArray() {
        return this.f26193a.toArray();
    }

    public final /* synthetic */ BaseStream unordered() {
        return C9659h.m35523u(this.f26193a.unordered());
    }
}
