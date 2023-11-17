package ie1;

import bf1.C40342g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ie1.y */
abstract class C41358y extends C41356x {

    /* renamed from: ie1.y$a */
    public static final class C41359a implements C40342g {

        /* renamed from: a */
        final /* synthetic */ Iterable f97392a;

        public C41359a(Iterable iterable) {
            this.f97392a = iterable;
        }

        public Iterator iterator() {
            return this.f97392a.iterator();
        }
    }

    /* renamed from: ie1.y$b */
    static final class C41360b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Iterable f97393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41360b(Iterable iterable) {
            super(0);
            this.f97393d = iterable;
        }

        /* renamed from: b */
        public final Iterator invoke() {
            return this.f97393d.iterator();
        }
    }

    /* renamed from: A0 */
    public static final List m119990A0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m119991B0((Collection) iterable);
        }
        return (List) m120033w0(iterable, new ArrayList());
    }

    /* renamed from: B0 */
    public static List m119991B0(Collection collection) {
        C41536l.m120489i(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: C0 */
    public static Set m119992C0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) m120033w0(iterable, new LinkedHashSet());
    }

    /* renamed from: D0 */
    public static Set m119993D0(Iterable iterable) {
        Object obj;
        C41536l.m120489i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C41357x0.m119988h((Set) m120033w0(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C41357x0.m119985e();
        }
        if (size != 1) {
            return (Set) m120033w0(iterable, new LinkedHashSet(C41342q0.m119921f(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C41355w0.m119981d(obj);
    }

    /* renamed from: E0 */
    public static final List m119994E0(Iterable iterable, int i, int i2, boolean z) {
        int i3;
        boolean z2;
        int g;
        C41536l.m120489i(iterable, "<this>");
        C41363z0.m120044a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator b = C41363z0.m120045b(iterable.iterator(), i, i2, z, false);
            while (b.hasNext()) {
                arrayList.add((List) b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i4 = size / i2;
        if (size % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ArrayList arrayList2 = new ArrayList(i4 + i3);
        int i5 = 0;
        while (true) {
            if (i5 < 0 || i5 >= size) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || ((g = C43429k.m124588g(i, size - i5)) < i && !z)) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(g);
            for (int i6 = 0; i6 < g; i6++) {
                arrayList3.add(list.get(i6 + i5));
            }
            arrayList2.add(arrayList3);
            i5 += i2;
        }
        return arrayList2;
    }

    /* renamed from: F0 */
    public static Iterable m119995F0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        return new C41326i0(new C41360b(iterable));
    }

    /* renamed from: G0 */
    public static List m119996G0(Iterable iterable, Iterable iterable2) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C41343r.m119925u(iterable, 10), C41343r.m119925u(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C41233s.m119492a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: M */
    public static C40342g m119997M(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        return new C41359a(iterable);
    }

    /* renamed from: N */
    public static List m119998N(Iterable iterable, int i) {
        C41536l.m120489i(iterable, "<this>");
        return m119994E0(iterable, i, i, true);
    }

    /* renamed from: O */
    public static boolean m119999O(Iterable iterable, Object obj) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (m120011a0(iterable, obj) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public static int m120000P(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C41341q.m119916s();
            }
        }
        return i;
    }

    /* renamed from: Q */
    public static List m120001Q(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        return m120036z0(m119992C0(iterable));
    }

    /* renamed from: R */
    public static List m120002R(Iterable iterable, int i) {
        boolean z;
        ArrayList arrayList;
        C41536l.m120489i(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return m120036z0(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return C41341q.m119907j();
                }
                if (size == 1) {
                    return C41339p.m119900e(m120018h0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return C41341q.m119914q(arrayList);
        }
    }

    /* renamed from: S */
    public static List m120003S(List list, int i) {
        boolean z;
        C41536l.m120489i(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m120032v0(list, C43429k.m124585d(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: T */
    public static List m120004T(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        return (List) m120005U(iterable, new ArrayList());
    }

    /* renamed from: U */
    public static final Collection m120005U(Iterable iterable, Collection collection) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(collection, "destination");
        for (Object next : iterable) {
            if (next != null) {
                collection.add(next);
            }
        }
        return collection;
    }

    /* renamed from: V */
    public static Object m120006V(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof List) {
            return m120007W((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: W */
    public static Object m120007W(List list) {
        C41536l.m120489i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: X */
    public static Object m120008X(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: Y */
    public static Object m120009Y(List list) {
        C41536l.m120489i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: Z */
    public static Object m120010Z(List list, int i) {
        C41536l.m120489i(list, "<this>");
        if (i < 0 || i > C41341q.m119909l(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: a0 */
    public static final int m120011a0(Iterable iterable, Object obj) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C41341q.m119917t();
            }
            if (C41536l.m120484d(obj, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b0 */
    public static int m120012b0(List list, Object obj) {
        C41536l.m120489i(list, "<this>");
        return list.indexOf(obj);
    }

    /* renamed from: c0 */
    public static Set m120013c0(Iterable iterable, Iterable iterable2) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(iterable2, "other");
        Set C0 = m119992C0(iterable);
        C41352v.m119964I(C0, iterable2);
        return C0;
    }

    /* renamed from: d0 */
    public static final Appendable m120014d0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(appendable, "buffer");
        C41536l.m120489i(charSequence, "separator");
        C41536l.m120489i(charSequence2, "prefix");
        C41536l.m120489i(charSequence3, "postfix");
        C41536l.m120489i(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C40429o.m117087a(appendable, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    /* renamed from: e0 */
    public static /* synthetic */ Appendable m120015e0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar, int i2, Object obj) {
        String str = (i2 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return m120014d0(iterable, appendable, str, charSequence6, charSequence5, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : lVar);
    }

    /* renamed from: f0 */
    public static final String m120016f0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(charSequence, "separator");
        C41536l.m120489i(charSequence2, "prefix");
        C41536l.m120489i(charSequence3, "postfix");
        C41536l.m120489i(charSequence4, "truncated");
        String sb = ((StringBuilder) m120014d0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C41536l.m120488h(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: g0 */
    public static /* synthetic */ String m120017g0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C43075l lVar, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m120016f0(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    /* renamed from: h0 */
    public static final Object m120018h0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof List) {
            return m120019i0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: i0 */
    public static Object m120019i0(List list) {
        C41536l.m120489i(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(C41341q.m119909l(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: j0 */
    public static Object m120020j0(List list) {
        C41536l.m120489i(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: k0 */
    public static Comparable m120021k0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    /* renamed from: l0 */
    public static List m120022l0(Iterable iterable, Object obj) {
        C41536l.m120489i(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(iterable, 10));
        boolean z = false;
        for (Object next : iterable) {
            boolean z2 = true;
            if (!z && C41536l.m120484d(next, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: m0 */
    public static List m120023m0(Collection collection, Iterable iterable) {
        C41536l.m120489i(collection, "<this>");
        C41536l.m120489i(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        boolean unused = C41352v.m119965z(arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: n0 */
    public static List m120024n0(Collection collection, Object obj) {
        C41536l.m120489i(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: o0 */
    public static List m120025o0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m120036z0(iterable);
        }
        List A0 = m119990A0(iterable);
        C41356x.m119984L(A0);
        return A0;
    }

    /* renamed from: p0 */
    public static Object m120026p0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof List) {
            return m120027q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: q0 */
    public static final Object m120027q0(List list) {
        C41536l.m120489i(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: r0 */
    public static void m120028r0(List list) {
        C41536l.m120489i(list, "<this>");
        C41349u.m119946y(list, C41506d.m120411j());
    }

    /* renamed from: s0 */
    public static List m120029s0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m120036z0(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C41331l.m119771o((Comparable[]) array);
            return C41331l.m119759c(array);
        }
        List A0 = m119990A0(iterable);
        C41349u.m119945x(A0);
        return A0;
    }

    /* renamed from: t0 */
    public static List m120030t0(Iterable iterable, Comparator comparator) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m120036z0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C41331l.m119772p(array, comparator);
            return C41331l.m119759c(array);
        }
        List A0 = m119990A0(iterable);
        C41349u.m119946y(A0, comparator);
        return A0;
    }

    /* renamed from: u0 */
    public static int m120031u0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Number) it.next()).intValue();
        }
        return i;
    }

    /* renamed from: v0 */
    public static List m120032v0(Iterable iterable, int i) {
        boolean z;
        C41536l.m120489i(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return C41341q.m119907j();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m120036z0(iterable);
                }
                if (i == 1) {
                    return C41339p.m119900e(m120006V(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C41341q.m119914q(arrayList);
        }
    }

    /* renamed from: w0 */
    public static final Collection m120033w0(Iterable iterable, Collection collection) {
        C41536l.m120489i(iterable, "<this>");
        C41536l.m120489i(collection, "destination");
        for (Object add : iterable) {
            collection.add(add);
        }
        return collection;
    }

    /* renamed from: x0 */
    public static HashSet m120034x0(Iterable iterable) {
        C41536l.m120489i(iterable, "<this>");
        return (HashSet) m120033w0(iterable, new HashSet(C41342q0.m119921f(C41343r.m119925u(iterable, 12))));
    }

    /* renamed from: y0 */
    public static int[] m120035y0(Collection collection) {
        C41536l.m120489i(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: z0 */
    public static List m120036z0(Iterable iterable) {
        Object obj;
        C41536l.m120489i(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C41341q.m119914q(m119990A0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C41341q.m119907j();
        }
        if (size != 1) {
            return m119991B0(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C41339p.m119900e(obj);
    }
}
