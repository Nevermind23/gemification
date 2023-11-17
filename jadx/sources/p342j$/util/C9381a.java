package p342j$.util;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.concurrent.ConcurrentMap;
import p342j$.lang.C9284a;
import p342j$.util.Comparator;
import p342j$.util.Map;
import p342j$.util.concurrent.C9407t;
import p342j$.util.concurrent.C9408u;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.BiFunction;
import p342j$.util.function.C9428G;
import p342j$.util.function.C9444X;
import p342j$.util.function.C9475o;
import p342j$.util.function.Consumer;
import p342j$.util.function.Predicate;
import p342j$.util.stream.C9735w0;
import p342j$.util.stream.Stream;

/* renamed from: j$.util.a */
public abstract /* synthetic */ class C9381a {
    /* renamed from: A */
    public static OptionalDouble m34636A(C9504k kVar) {
        if (kVar == null) {
            return null;
        }
        return kVar.mo25645c() ? OptionalDouble.of(kVar.mo25644b()) : OptionalDouble.empty();
    }

    /* renamed from: B */
    public static OptionalInt m34637B(C9505l lVar) {
        if (lVar == null) {
            return null;
        }
        return lVar.mo25650c() ? OptionalInt.of(lVar.mo25649b()) : OptionalInt.empty();
    }

    /* renamed from: C */
    public static OptionalLong m34638C(C9506m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar.mo25655c() ? OptionalLong.of(mVar.mo25654b()) : OptionalLong.empty();
    }

    /* renamed from: D */
    public static boolean m34639D(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: E */
    public static /* synthetic */ void m34640E(Map map, BiConsumer biConsumer) {
        if (map instanceof Map) {
            ((Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            C9284a.m34174a((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    /* renamed from: F */
    public static Object m34641F(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).getOrDefault(obj, obj2);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$getOrDefault(map, obj, obj2);
        }
        Object obj3 = ((ConcurrentMap) map).get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* renamed from: G */
    public static Object m34642G(java.util.Map map, Object obj, Object obj2, BiFunction biFunction) {
        if (map instanceof Map) {
            return ((Map) map).merge(obj, obj2, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$merge(map, obj, obj2, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        biFunction.getClass();
        obj2.getClass();
        while (true) {
            Object obj3 = concurrentMap.get(obj);
            while (obj3 == null) {
                obj3 = concurrentMap.putIfAbsent(obj, obj2);
                if (obj3 == null) {
                    return obj2;
                }
            }
            Object apply = biFunction.apply(obj3, obj2);
            if (apply != null) {
                if (concurrentMap.replace(obj, obj3, apply)) {
                    return apply;
                }
            } else if (concurrentMap.remove(obj, obj3)) {
                return null;
            }
        }
    }

    /* renamed from: H */
    public static Object m34643H(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).putIfAbsent(obj, obj2);
        }
        Object obj3 = map.get(obj);
        return obj3 == null ? map.put(obj, obj2) : obj3;
    }

    /* renamed from: I */
    public static boolean m34644I(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).remove(obj, obj2);
        }
        Object obj3 = map.get(obj);
        if (!m34639D(obj3, obj2) || (obj3 == null && !map.containsKey(obj))) {
            return false;
        }
        map.remove(obj);
        return true;
    }

    /* renamed from: J */
    public static Object m34645J(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof Map) {
            return ((Map) map).replace(obj, obj2);
        }
        Object obj3 = map.get(obj);
        return (obj3 != null || map.containsKey(obj)) ? map.put(obj, obj2) : obj3;
    }

    /* renamed from: K */
    public static boolean m34646K(java.util.Map map, Object obj, Object obj2, Object obj3) {
        if (map instanceof Map) {
            return ((Map) map).replace(obj, obj2, obj3);
        }
        Object obj4 = map.get(obj);
        if (!m34639D(obj4, obj2) || (obj4 == null && !map.containsKey(obj))) {
            return false;
        }
        map.put(obj, obj3);
        return true;
    }

    /* renamed from: L */
    public static void m34647L(java.util.Map map, BiFunction biFunction) {
        if (map instanceof Map) {
            ((Map) map).replaceAll(biFunction);
        } else if (map instanceof ConcurrentMap) {
            ConcurrentMap concurrentMap = (ConcurrentMap) map;
            biFunction.getClass();
            C9407t tVar = new C9407t(0, concurrentMap, biFunction);
            if (concurrentMap instanceof C9408u) {
                ((C9408u) concurrentMap).forEach(tVar);
            } else {
                C9284a.m34174a(concurrentMap, tVar);
            }
        } else {
            Map.CC.$default$replaceAll(map, biFunction);
        }
    }

    /* renamed from: M */
    public static /* synthetic */ Comparator m34648M(Comparator comparator, Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    /* renamed from: b */
    public static void m34649b(C9359D d, Consumer consumer) {
        if (consumer instanceof C9475o) {
            d.mo25171e((C9475o) consumer);
        } else if (!C9500g0.f26146a) {
            consumer.getClass();
            d.mo25171e(new C9507n(consumer));
        } else {
            C9500g0.m34857a(d.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: f */
    public static void m34650f(C9362G g, Consumer consumer) {
        if (consumer instanceof C9428G) {
            g.mo25203c((C9428G) consumer);
        } else if (!C9500g0.f26146a) {
            consumer.getClass();
            g.mo25203c(new C9511r(consumer));
        } else {
            C9500g0.m34857a(g.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: i */
    public static void m34651i(C9365J j, Consumer consumer) {
        if (consumer instanceof C9444X) {
            j.mo25221d((C9444X) consumer);
        } else if (!C9500g0.f26146a) {
            consumer.getClass();
            j.mo25221d(new C9756v(consumer));
        } else {
            C9500g0.m34857a(j.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: k */
    public static long m34652k(C9371P p) {
        if ((p.characteristics() & 64) == 0) {
            return -1;
        }
        return p.estimateSize();
    }

    /* renamed from: l */
    public static boolean m34653l(C9371P p, int i) {
        return (p.characteristics() & i) == i;
    }

    /* renamed from: n */
    public static boolean m34654n(Collection collection, Predicate predicate) {
        if (DesugarCollections.f25924a.isInstance(collection)) {
            return DesugarCollections.m34577d(collection, predicate);
        }
        predicate.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* renamed from: o */
    public static Stream m34655o(Collection collection) {
        return C9735w0.m35835v1(Collection$EL.m34570b(collection), false);
    }

    /* renamed from: p */
    public static boolean m34656p(C9359D d, Consumer consumer) {
        if (consumer instanceof C9475o) {
            return d.mo25178j((C9475o) consumer);
        }
        if (!C9500g0.f26146a) {
            consumer.getClass();
            return d.mo25178j(new C9507n(consumer));
        }
        C9500g0.m34857a(d.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    /* renamed from: q */
    public static boolean m34657q(C9362G g, Consumer consumer) {
        if (consumer instanceof C9428G) {
            return g.mo25205g((C9428G) consumer);
        }
        if (!C9500g0.f26146a) {
            consumer.getClass();
            return g.mo25205g(new C9511r(consumer));
        }
        C9500g0.m34857a(g.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    /* renamed from: r */
    public static boolean m34658r(C9365J j, Consumer consumer) {
        if (consumer instanceof C9444X) {
            return j.mo25223h((C9444X) consumer);
        }
        if (!C9500g0.f26146a) {
            consumer.getClass();
            return j.mo25223h(new C9756v(consumer));
        }
        C9500g0.m34857a(j.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    /* renamed from: s */
    public static Object m34659s(java.util.Map map, Object obj, BiFunction biFunction) {
        Object apply;
        if (map instanceof Map) {
            return ((Map) map).compute(obj, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$compute(map, obj, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        biFunction.getClass();
        loop0:
        while (true) {
            Object obj2 = concurrentMap.get(obj);
            while (true) {
                apply = biFunction.apply(obj, obj2);
                if (apply != null) {
                    if (obj2 == null) {
                        obj2 = concurrentMap.putIfAbsent(obj, apply);
                        if (obj2 == null) {
                            break loop0;
                        }
                    } else if (concurrentMap.replace(obj, obj2, apply)) {
                        break;
                    }
                } else {
                    apply = null;
                    if ((obj2 == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, obj2)) {
                        break;
                    }
                }
            }
        }
        return apply;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r0 = r1.putIfAbsent(r2, (r3 = r3.apply(r2)));
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m34660t(java.util.Map r1, java.lang.Object r2, p342j$.util.function.Function r3) {
        /*
            boolean r0 = r1 instanceof p342j$.util.Map
            if (r0 == 0) goto L_0x000b
            j$.util.Map r1 = (p342j$.util.Map) r1
            java.lang.Object r1 = r1.computeIfAbsent(r2, r3)
            return r1
        L_0x000b:
            boolean r0 = r1 instanceof java.util.concurrent.ConcurrentMap
            if (r0 == 0) goto L_0x0029
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1
            r3.getClass()
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x0027
            java.lang.Object r3 = r3.apply(r2)
            if (r3 == 0) goto L_0x0027
            java.lang.Object r0 = r1.putIfAbsent(r2, r3)
            if (r0 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r3 = r0
        L_0x0028:
            return r3
        L_0x0029:
            java.lang.Object r1 = p342j$.util.Map.CC.$default$computeIfAbsent(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p342j$.util.C9381a.m34660t(java.util.Map, java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    /* renamed from: u */
    public static Object m34661u(java.util.Map map, Object obj, BiFunction biFunction) {
        if (map instanceof Map) {
            return ((Map) map).computeIfPresent(obj, biFunction);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$computeIfPresent(map, obj, biFunction);
        }
        ConcurrentMap concurrentMap = (ConcurrentMap) map;
        biFunction.getClass();
        while (true) {
            Object obj2 = concurrentMap.get(obj);
            if (obj2 == null) {
                return obj2;
            }
            Object apply = biFunction.apply(obj, obj2);
            if (apply != null) {
                if (concurrentMap.replace(obj, obj2, apply)) {
                    return apply;
                }
            } else if (concurrentMap.remove(obj, obj2)) {
                return null;
            }
        }
    }

    /* renamed from: v */
    public static Optional m34662v(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.m34604d(optional.get()) : Optional.m34603a();
    }

    /* renamed from: w */
    public static C9504k m34663w(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C9504k.m34865d(optionalDouble.getAsDouble()) : C9504k.m34864a();
    }

    /* renamed from: x */
    public static C9505l m34664x(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C9505l.m34869d(optionalInt.getAsInt()) : C9505l.m34868a();
    }

    /* renamed from: y */
    public static C9506m m34665y(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C9506m.m34873d(optionalLong.getAsLong()) : C9506m.m34872a();
    }

    /* renamed from: z */
    public static Optional m34666z(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.mo25271c() ? Optional.of(optional.mo25270b()) : Optional.empty();
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public C9371P trySplit() {
        return null;
    }
}
