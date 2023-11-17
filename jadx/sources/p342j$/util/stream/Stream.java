package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.Optional;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;
import p342j$.util.function.Function;
import p342j$.util.function.Predicate;
import p342j$.util.function.ToDoubleFunction;
import p342j$.util.function.ToIntFunction;
import p342j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.Stream */
public interface Stream<T> extends C9664i {
    /* renamed from: B */
    C9543G mo25928B(Function function);

    /* renamed from: S */
    Stream mo25929S(Consumer consumer);

    /* renamed from: T */
    boolean mo25930T(Predicate predicate);

    /* renamed from: V */
    C9690n0 mo25931V(Function function);

    /* renamed from: a */
    void mo25932a(Consumer consumer);

    /* renamed from: b */
    boolean mo25933b(Predicate predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    /* renamed from: d */
    IntStream mo25937d(Function function);

    /* renamed from: d0 */
    boolean mo25938d0(Predicate predicate);

    Stream distinct();

    /* renamed from: f0 */
    C9690n0 mo25941f0(ToLongFunction toLongFunction);

    Stream<T> filter(Predicate<? super T> predicate);

    Optional findAny();

    Optional findFirst();

    /* renamed from: g */
    void mo25945g(Consumer consumer);

    /* renamed from: i0 */
    C9543G mo25947i0(ToDoubleFunction toDoubleFunction);

    /* renamed from: j */
    Object mo25948j(C9494x0 x0Var, BiConsumer biConsumer, BiConsumer biConsumer2);

    Stream limit(long j);

    /* renamed from: m */
    Object[] mo25950m(C9431J j);

    Optional max(Comparator comparator);

    Optional min(Comparator comparator);

    /* renamed from: n */
    IntStream mo25953n(ToIntFunction toIntFunction);

    /* renamed from: o */
    Stream mo25954o(Function function);

    /* renamed from: o0 */
    Object mo25955o0(Object obj, C9457f fVar);

    /* renamed from: p */
    Stream mo25956p(Function function);

    /* renamed from: s */
    Optional mo25957s(C9457f fVar);

    Stream skip(long j);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Object[] toArray();

    /* renamed from: z */
    Object mo25962z(Object obj, BiFunction biFunction, C9457f fVar);
}
