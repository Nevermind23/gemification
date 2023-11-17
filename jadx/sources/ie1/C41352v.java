package ie1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;
import ze1.C43420e;

/* renamed from: ie1.v */
abstract class C41352v extends C41349u {
    /* renamed from: A */
    public static boolean m119956A(Collection collection, Object[] objArr) {
        C41536l.m120489i(collection, "<this>");
        C41536l.m120489i(objArr, "elements");
        return collection.addAll(C41331l.m119759c(objArr));
    }

    /* renamed from: B */
    public static final Collection m119957B(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return C41358y.m120036z0(iterable);
    }

    /* renamed from: C */
    private static final boolean m119958C(Iterable iterable, C43075l lVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: D */
    private static final boolean m119959D(List list, C43075l lVar, boolean z) {
        if (!(list instanceof RandomAccess)) {
            C41536l.m120487g(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m119958C(C41527d0.m120455b(list), lVar, z);
        }
        C41330k0 o = new C43420e(0, C41341q.m119909l(list)).iterator();
        int i = 0;
        while (o.hasNext()) {
            int nextInt = o.nextInt();
            Object obj = list.get(nextInt);
            if (((Boolean) lVar.invoke(obj)).booleanValue() != z) {
                if (i != nextInt) {
                    list.set(i, obj);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int l = C41341q.m119909l(list);
        if (i > l) {
            return true;
        }
        while (true) {
            list.remove(l);
            if (l == i) {
                return true;
            }
            l--;
        }
    }

    /* renamed from: E */
    public static boolean m119960E(Iterable iterable, C43075l lVar) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(lVar, "predicate");
        return m119958C(iterable, lVar, true);
    }

    /* renamed from: F */
    public static boolean m119961F(List list, C43075l lVar) {
        C41536l.m120489i(list, "<this>");
        C41536l.m120489i(lVar, "predicate");
        return m119959D(list, lVar, true);
    }

    /* renamed from: G */
    public static Object m119962G(List list) {
        C41536l.m120489i(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C41341q.m119909l(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: H */
    public static Object m119963H(List list) {
        C41536l.m120489i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C41341q.m119909l(list));
    }

    /* renamed from: I */
    public static final boolean m119964I(Collection collection, Iterable iterable) {
        C41536l.m120489i(collection, "<this>");
        C41536l.m120489i(iterable, "elements");
        return collection.retainAll(m119957B(iterable));
    }

    /* renamed from: z */
    public static boolean m119965z(Collection collection, Iterable iterable) {
        C41536l.m120489i(collection, "<this>");
        C41536l.m120489i(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }
}
