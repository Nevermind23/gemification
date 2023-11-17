package ie1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ze1.C43420e;

/* renamed from: ie1.q */
abstract class C41341q extends C41339p {
    /* renamed from: f */
    public static ArrayList m119903f(Object... objArr) {
        C41536l.m120489i(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C41320g(objArr, true));
    }

    /* renamed from: g */
    public static final Collection m119904g(Object[] objArr) {
        C41536l.m120489i(objArr, "<this>");
        return new C41320g(objArr, false);
    }

    /* renamed from: h */
    public static final int m119905h(List list, Comparable comparable, int i, int i2) {
        C41536l.m120489i(list, "<this>");
        m119915r(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int e = C41506d.m120406e((Comparable) list.get(i4), comparable);
            if (e < 0) {
                i = i4 + 1;
            } else if (e <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: i */
    public static /* synthetic */ int m119906i(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m119905h(list, comparable, i, i2);
    }

    /* renamed from: j */
    public static List m119907j() {
        return C41303a0.f97353d;
    }

    /* renamed from: k */
    public static C43420e m119908k(Collection collection) {
        C41536l.m120489i(collection, "<this>");
        return new C43420e(0, collection.size() - 1);
    }

    /* renamed from: l */
    public static int m119909l(List list) {
        C41536l.m120489i(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: m */
    public static List m119910m(Object... objArr) {
        C41536l.m120489i(objArr, "elements");
        if (objArr.length > 0) {
            return C41331l.m119759c(objArr);
        }
        return m119907j();
    }

    /* renamed from: n */
    public static List m119911n(Object obj) {
        return obj != null ? C41339p.m119900e(obj) : m119907j();
    }

    /* renamed from: o */
    public static List m119912o(Object... objArr) {
        C41536l.m120489i(objArr, "elements");
        return C41333m.m119795t(objArr);
    }

    /* renamed from: p */
    public static List m119913p(Object... objArr) {
        C41536l.m120489i(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C41320g(objArr, true));
    }

    /* renamed from: q */
    public static List m119914q(List list) {
        C41536l.m120489i(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return m119907j();
        }
        if (size != 1) {
            return list;
        }
        return C41339p.m119900e(list.get(0));
    }

    /* renamed from: r */
    private static final void m119915r(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    /* renamed from: s */
    public static void m119916s() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    /* renamed from: t */
    public static void m119917t() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
