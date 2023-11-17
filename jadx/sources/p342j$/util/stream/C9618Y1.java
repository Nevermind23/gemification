package p342j$.util.stream;

import java.util.Comparator;
import java.util.Iterator;
import p342j$.util.C9371P;
import p342j$.util.C9417e0;
import p342j$.util.Optional;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.C9431J;
import p342j$.util.function.C9451c;
import p342j$.util.function.C9457f;
import p342j$.util.function.C9494x0;
import p342j$.util.function.Consumer;
import p342j$.util.function.Function;
import p342j$.util.function.Predicate;
import p342j$.util.function.ToDoubleFunction;
import p342j$.util.function.ToIntFunction;
import p342j$.util.function.ToLongFunction;

/* renamed from: j$.util.stream.Y1 */
abstract class C9618Y1 extends C9634c implements Stream {

    /* renamed from: s */
    public static final /* synthetic */ int f26335s = 0;

    C9618Y1(C9371P p, int i, boolean z) {
        super(p, i, z);
    }

    C9618Y1(C9634c cVar, int i) {
        super(cVar, i);
    }

    /* renamed from: B */
    public final C9543G mo25928B(Function function) {
        function.getClass();
        return new C9729v(this, C9607V2.f26308p | C9607V2.f26306n | C9607V2.f26312t, function, 7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public final C9539F0 mo25705B1(C9735w0 w0Var, C9371P p, boolean z, C9431J j) {
        return C9735w0.m35803Q0(w0Var, p, z, j);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: C1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25707C1(p342j$.util.C9371P r2, p342j$.util.stream.C9657g2 r3) {
        /*
            r1 = this;
        L_0x0000:
            boolean r0 = r3.mo25696r()
            if (r0 != 0) goto L_0x000c
            boolean r0 = r2.mo25179m(r3)
            if (r0 != 0) goto L_0x0000
        L_0x000c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.stream.C9618Y1.mo25707C1(j$.util.P, j$.util.stream.g2):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D1 */
    public final C9611W2 mo25708D1() {
        return C9611W2.REFERENCE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N1 */
    public final C9371P mo25712N1(C9735w0 w0Var, C9624a aVar, boolean z) {
        return new C9527C3(w0Var, aVar, z);
    }

    /* renamed from: S */
    public final Stream mo25929S(Consumer consumer) {
        consumer.getClass();
        return new C9734w(this, 0, consumer, 3);
    }

    /* renamed from: T */
    public final boolean mo25930T(Predicate predicate) {
        return ((Boolean) mo26040z1(C9735w0.m35830s1(predicate, C9720t0.ALL))).booleanValue();
    }

    /* renamed from: V */
    public final C9690n0 mo25931V(Function function) {
        function.getClass();
        return new C9744y(this, C9607V2.f26308p | C9607V2.f26306n | C9607V2.f26312t, function, 6);
    }

    /* renamed from: a */
    public void mo25932a(Consumer consumer) {
        consumer.getClass();
        mo26040z1(new C9592S(consumer, false));
    }

    /* renamed from: b */
    public final boolean mo25933b(Predicate predicate) {
        return ((Boolean) mo26040z1(C9735w0.m35830s1(predicate, C9720t0.ANY))).booleanValue();
    }

    public final Object collect(Collector collector) {
        Object obj;
        if (!isParallel() || !collector.characteristics().contains(C9669j.CONCURRENT) || (mo26027F1() && !collector.characteristics().contains(C9669j.UNORDERED))) {
            collector.getClass();
            C9494x0 supplier = collector.supplier();
            obj = mo26040z1(new C9540F1(C9611W2.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector));
        } else {
            obj = collector.supplier().get();
            mo25932a(new C9694o(5, collector.accumulator(), obj));
        }
        return collector.characteristics().contains(C9669j.IDENTITY_FINISH) ? obj : collector.finisher().apply(obj);
    }

    public final long count() {
        return ((C9675k0) mo25941f0(new C9566L0(2))).sum();
    }

    /* renamed from: d */
    public final IntStream mo25937d(Function function) {
        function.getClass();
        return new C9739x(this, C9607V2.f26308p | C9607V2.f26306n | C9607V2.f26312t, function, 7);
    }

    /* renamed from: d0 */
    public final boolean mo25938d0(Predicate predicate) {
        return ((Boolean) mo26040z1(C9735w0.m35830s1(predicate, C9720t0.NONE))).booleanValue();
    }

    public final Stream distinct() {
        return new C9709r(this, C9607V2.f26305m | C9607V2.f26312t);
    }

    /* renamed from: f0 */
    public final C9690n0 mo25941f0(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C9744y(this, C9607V2.f26308p | C9607V2.f26306n, toLongFunction, 7);
    }

    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C9734w(this, C9607V2.f26312t, predicate, 4);
    }

    public final Optional findAny() {
        return (Optional) mo26040z1(new C9548H(false, C9611W2.REFERENCE, Optional.m34603a(), new C9566L0(24), new C9629b(13)));
    }

    public final Optional findFirst() {
        return (Optional) mo26040z1(new C9548H(true, C9611W2.REFERENCE, Optional.m34603a(), new C9566L0(24), new C9629b(13)));
    }

    /* renamed from: g */
    public void mo25945g(Consumer consumer) {
        consumer.getClass();
        mo26040z1(new C9592S(consumer, true));
    }

    /* renamed from: i0 */
    public final C9543G mo25947i0(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C9729v(this, C9607V2.f26308p | C9607V2.f26306n, toDoubleFunction, 6);
    }

    public final Iterator iterator() {
        return C9417e0.m34761i(spliterator());
    }

    /* renamed from: j */
    public final Object mo25948j(C9494x0 x0Var, BiConsumer biConsumer, BiConsumer biConsumer2) {
        x0Var.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return mo26040z1(new C9736w1(C9611W2.REFERENCE, biConsumer2, biConsumer, x0Var, 3));
    }

    public final Stream limit(long j) {
        if (j >= 0) {
            return C9735w0.m35832t1(this, 0, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    /* renamed from: m */
    public final Object[] mo25950m(C9431J j) {
        return C9735w0.m35812c1(mo26025A1(j), j).mo25798u(j);
    }

    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return mo25957s(new C9451c(comparator, 0));
    }

    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return mo25957s(new C9451c(comparator, 1));
    }

    /* renamed from: n */
    public final IntStream mo25953n(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new C9739x(this, C9607V2.f26308p | C9607V2.f26306n, toIntFunction, 6);
    }

    /* renamed from: o */
    public final Stream mo25954o(Function function) {
        function.getClass();
        return new C9602U1(this, C9607V2.f26308p | C9607V2.f26306n, function, 0);
    }

    /* renamed from: o0 */
    public final Object mo25955o0(Object obj, C9457f fVar) {
        fVar.getClass();
        return mo26040z1(new C9736w1(C9611W2.REFERENCE, fVar, fVar, obj, 2));
    }

    /* renamed from: p */
    public final Stream mo25956p(Function function) {
        function.getClass();
        return new C9602U1(this, C9607V2.f26308p | C9607V2.f26306n | C9607V2.f26312t, function, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r1 */
    public final C9514A0 mo25730r1(long j, C9431J j2) {
        return C9735w0.m35802P0(j, j2);
    }

    /* renamed from: s */
    public final Optional mo25957s(C9457f fVar) {
        fVar.getClass();
        return (Optional) mo26040z1(new C9515A1(C9611W2.REFERENCE, fVar, 1));
    }

    public final Stream skip(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? this : C9735w0.m35832t1(this, j, -1);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    public final Stream sorted() {
        return new C9521B2(this);
    }

    public final Stream sorted(Comparator comparator) {
        return new C9521B2(this, comparator);
    }

    public final Object[] toArray() {
        return mo25950m(new C9566L0(1));
    }

    public final C9664i unordered() {
        return !mo26027F1() ? this : new C9598T1(this, C9607V2.f26310r);
    }

    /* renamed from: z */
    public final Object mo25962z(Object obj, BiFunction biFunction, C9457f fVar) {
        biFunction.getClass();
        fVar.getClass();
        return mo26040z1(new C9736w1(C9611W2.REFERENCE, fVar, biFunction, obj, 2));
    }
}
