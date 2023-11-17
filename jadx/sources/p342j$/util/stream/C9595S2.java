package p342j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p342j$.util.C9370O;
import p342j$.util.C9381a;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.C9429H;
import p342j$.util.function.C9453d;
import p342j$.util.function.C9459g;
import p342j$.util.function.C9486t0;
import p342j$.util.function.C9490v0;
import p342j$.util.function.Function;
import p342j$.util.function.ToDoubleFunction;
import p342j$.util.function.ToIntFunction;
import p342j$.util.function.ToLongFunction;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.stream.S2 */
public final /* synthetic */ class C9595S2 implements Stream {

    /* renamed from: a */
    public final /* synthetic */ Stream f26279a;

    private /* synthetic */ C9595S2(Stream stream) {
        this.f26279a = stream;
    }

    /* renamed from: u */
    public static /* synthetic */ Stream m35238u(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C9591R2 ? ((C9591R2) stream).f26273a : new C9595S2(stream);
    }

    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.f26279a.mo25930T(C9486t0.m34841a(predicate));
    }

    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.f26279a.mo25933b(C9486t0.m34841a(predicate));
    }

    public final /* synthetic */ void close() {
        this.f26279a.close();
    }

    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.f26279a.mo25948j(C9490v0.m34847a(supplier), BiConsumer.VivifiedWrapper.convert(biConsumer), BiConsumer.VivifiedWrapper.convert(biConsumer2));
    }

    public final /* synthetic */ Object collect(Collector collector) {
        return this.f26279a.collect(C9674k.m35565a(collector));
    }

    public final /* synthetic */ long count() {
        return this.f26279a.count();
    }

    public final /* synthetic */ Stream distinct() {
        return m35238u(this.f26279a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.f26279a;
        if (obj instanceof C9595S2) {
            obj = ((C9595S2) obj).f26279a;
        }
        return stream.equals(obj);
    }

    public final /* synthetic */ Stream filter(Predicate predicate) {
        return m35238u(this.f26279a.filter(C9486t0.m34841a(predicate)));
    }

    public final /* synthetic */ Optional findAny() {
        return C9381a.m34666z(this.f26279a.findAny());
    }

    public final /* synthetic */ Optional findFirst() {
        return C9381a.m34666z(this.f26279a.findFirst());
    }

    public final /* synthetic */ Stream flatMap(Function function) {
        return m35238u(this.f26279a.mo25956p(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ DoubleStream flatMapToDouble(java.util.function.Function function) {
        return C9538F.m34982u(this.f26279a.mo25928B(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ IntStream flatMapToInt(java.util.function.Function function) {
        return IntStream.Wrapper.convert(this.f26279a.mo25937d(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ LongStream flatMapToLong(java.util.function.Function function) {
        return C9685m0.m35637u(this.f26279a.mo25931V(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ void forEach(Consumer consumer) {
        this.f26279a.mo25932a(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.f26279a.mo25945g(C9459g.m34817a(consumer));
    }

    public final /* synthetic */ int hashCode() {
        return this.f26279a.hashCode();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f26279a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f26279a.iterator();
    }

    public final /* synthetic */ Stream limit(long j) {
        return m35238u(this.f26279a.limit(j));
    }

    public final /* synthetic */ Stream map(java.util.function.Function function) {
        return m35238u(this.f26279a.mo25954o(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C9538F.m34982u(this.f26279a.mo25947i0(ToDoubleFunction.VivifiedWrapper.convert(toDoubleFunction)));
    }

    public final /* synthetic */ java.util.stream.IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.Wrapper.convert(this.f26279a.mo25953n(ToIntFunction.VivifiedWrapper.convert(toIntFunction)));
    }

    public final /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return C9685m0.m35637u(this.f26279a.mo25941f0(ToLongFunction.VivifiedWrapper.convert(toLongFunction)));
    }

    public final /* synthetic */ Optional max(Comparator comparator) {
        return C9381a.m34666z(this.f26279a.max(comparator));
    }

    public final /* synthetic */ Optional min(Comparator comparator) {
        return C9381a.m34666z(this.f26279a.min(comparator));
    }

    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.f26279a.mo25938d0(C9486t0.m34841a(predicate));
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return C9659h.m35523u(this.f26279a.onClose(runnable));
    }

    public final /* synthetic */ BaseStream parallel() {
        return C9659h.m35523u(this.f26279a.parallel());
    }

    public final /* synthetic */ Stream peek(Consumer consumer) {
        return m35238u(this.f26279a.mo25929S(C9459g.m34817a(consumer)));
    }

    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.f26279a.mo25962z(obj, BiFunction.VivifiedWrapper.convert(biFunction), C9453d.m34808b(binaryOperator));
    }

    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.f26279a.mo25955o0(obj, C9453d.m34808b(binaryOperator));
    }

    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return C9381a.m34666z(this.f26279a.mo25957s(C9453d.m34808b(binaryOperator)));
    }

    public final /* synthetic */ BaseStream sequential() {
        return C9659h.m35523u(this.f26279a.sequential());
    }

    public final /* synthetic */ Stream skip(long j) {
        return m35238u(this.f26279a.skip(j));
    }

    public final /* synthetic */ Stream sorted() {
        return m35238u(this.f26279a.sorted());
    }

    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return m35238u(this.f26279a.sorted(comparator));
    }

    public final /* synthetic */ Spliterator spliterator() {
        return C9370O.m34602a(this.f26279a.spliterator());
    }

    public final /* synthetic */ Object[] toArray() {
        return this.f26279a.toArray();
    }

    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.f26279a.mo25950m(C9429H.m34786a(intFunction));
    }

    public final /* synthetic */ BaseStream unordered() {
        return C9659h.m35523u(this.f26279a.unordered());
    }
}
