package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.l */
public abstract class C41536l {
    /* renamed from: a */
    public static boolean m120481a(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    /* renamed from: b */
    public static boolean m120482b(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    /* renamed from: c */
    public static boolean m120483c(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m120484d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    public static void m120485e(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) m120495o(new IllegalStateException(str + " must not be null")));
        }
    }

    /* renamed from: f */
    public static void m120486f(Object obj) {
        if (obj == null) {
            m120498r();
        }
    }

    /* renamed from: g */
    public static void m120487g(Object obj, String str) {
        if (obj == null) {
            m120499s(str);
        }
    }

    /* renamed from: h */
    public static void m120488h(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) m120495o(new NullPointerException(str + " must not be null")));
        }
    }

    /* renamed from: i */
    public static void m120489i(Object obj, String str) {
        if (obj == null) {
            m120502v(str);
        }
    }

    /* renamed from: j */
    public static void m120490j(Object obj, String str) {
        if (obj == null) {
            m120501u(str);
        }
    }

    /* renamed from: k */
    public static int m120491k(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: l */
    public static int m120492l(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: m */
    private static String m120493m(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C41536l.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: n */
    public static void m120494n(int i, String str) {
        m120503w();
    }

    /* renamed from: o */
    private static Throwable m120495o(Throwable th) {
        return m120496p(th, C41536l.class.getName());
    }

    /* renamed from: p */
    static Throwable m120496p(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return th;
    }

    /* renamed from: q */
    public static String m120497q(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: r */
    public static void m120498r() {
        throw ((NullPointerException) m120495o(new NullPointerException()));
    }

    /* renamed from: s */
    public static void m120499s(String str) {
        throw ((NullPointerException) m120495o(new NullPointerException(str)));
    }

    /* renamed from: t */
    public static void m120500t() {
        throw ((KotlinNullPointerException) m120495o(new KotlinNullPointerException()));
    }

    /* renamed from: u */
    private static void m120501u(String str) {
        throw ((IllegalArgumentException) m120495o(new IllegalArgumentException(m120493m(str))));
    }

    /* renamed from: v */
    private static void m120502v(String str) {
        throw ((NullPointerException) m120495o(new NullPointerException(m120493m(str))));
    }

    /* renamed from: w */
    public static void m120503w() {
        m120504x("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: x */
    public static void m120504x(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: y */
    public static void m120505y(String str) {
        throw ((UninitializedPropertyAccessException) m120495o(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: z */
    public static void m120506z(String str) {
        m120505y("lateinit property " + str + " has not been initialized");
    }
}
