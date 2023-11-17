package kotlin.jvm.internal;

import he1.C41212c;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;
import ue1.C43081r;
import ue1.C43082s;
import ue1.C43083t;
import ue1.C43086w;
import ve1.C43151a;
import ve1.C43152b;
import ve1.C43153c;
import ve1.C43154d;
import ve1.C43155e;

/* renamed from: kotlin.jvm.internal.d0 */
public abstract class C41527d0 {
    /* renamed from: a */
    public static Collection m120454a(Object obj) {
        if ((obj instanceof C43151a) && !(obj instanceof C43152b)) {
            m120469p(obj, "kotlin.collections.MutableCollection");
        }
        return m120460g(obj);
    }

    /* renamed from: b */
    public static Iterable m120455b(Object obj) {
        if ((obj instanceof C43151a) && !(obj instanceof C43153c)) {
            m120469p(obj, "kotlin.collections.MutableIterable");
        }
        return m120461h(obj);
    }

    /* renamed from: c */
    public static List m120456c(Object obj) {
        if ((obj instanceof C43151a) && !(obj instanceof C43154d)) {
            m120469p(obj, "kotlin.collections.MutableList");
        }
        return m120462i(obj);
    }

    /* renamed from: d */
    public static Map m120457d(Object obj) {
        if ((obj instanceof C43151a) && !(obj instanceof C43155e)) {
            m120469p(obj, "kotlin.collections.MutableMap");
        }
        return m120463j(obj);
    }

    /* renamed from: e */
    public static Map.Entry m120458e(Object obj) {
        if ((obj instanceof C43151a) && !(obj instanceof C43155e.C43156a)) {
            m120469p(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return m120464k(obj);
    }

    /* renamed from: f */
    public static Object m120459f(Object obj, int i) {
        if (obj != null && !m120466m(obj, i)) {
            m120469p(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    /* renamed from: g */
    public static Collection m120460g(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m120468o(e);
        }
    }

    /* renamed from: h */
    public static Iterable m120461h(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m120468o(e);
        }
    }

    /* renamed from: i */
    public static List m120462i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m120468o(e);
        }
    }

    /* renamed from: j */
    public static Map m120463j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m120468o(e);
        }
    }

    /* renamed from: k */
    public static Map.Entry m120464k(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw m120468o(e);
        }
    }

    /* renamed from: l */
    public static int m120465l(Object obj) {
        if (obj instanceof C41533i) {
            return ((C41533i) obj).getArity();
        }
        if (obj instanceof C43064a) {
            return 0;
        }
        if (obj instanceof C43075l) {
            return 1;
        }
        if (obj instanceof C43079p) {
            return 2;
        }
        if (obj instanceof C43080q) {
            return 3;
        }
        if (obj instanceof C43081r) {
            return 4;
        }
        if (obj instanceof C43082s) {
            return 5;
        }
        if (obj instanceof C43083t) {
            return 6;
        }
        if (obj instanceof C43086w) {
            return 9;
        }
        return -1;
    }

    /* renamed from: m */
    public static boolean m120466m(Object obj, int i) {
        return (obj instanceof C41212c) && m120465l(obj) == i;
    }

    /* renamed from: n */
    private static Throwable m120467n(Throwable th) {
        return C41536l.m120496p(th, C41527d0.class.getName());
    }

    /* renamed from: o */
    public static ClassCastException m120468o(ClassCastException classCastException) {
        throw ((ClassCastException) m120467n(classCastException));
    }

    /* renamed from: p */
    public static void m120469p(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        m120470q(str2 + " cannot be cast to " + str);
    }

    /* renamed from: q */
    public static void m120470q(String str) {
        throw m120468o(new ClassCastException(str));
    }
}
