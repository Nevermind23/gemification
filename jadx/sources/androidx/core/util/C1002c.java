package androidx.core.util;

import java.util.Objects;

/* renamed from: androidx.core.util.c */
public abstract class C1002c {

    /* renamed from: androidx.core.util.c$a */
    static class C1003a {
        /* renamed from: a */
        static boolean m3514a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        static int m3515b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m3509a(Object obj, Object obj2) {
        return C1003a.m3514a(obj, obj2);
    }

    /* renamed from: b */
    public static int m3510b(Object... objArr) {
        return C1003a.m3515b(objArr);
    }

    /* renamed from: c */
    public static Object m3511c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: d */
    public static Object m3512d(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: e */
    public static String m3513e(Object obj, String str) {
        return obj != null ? obj.toString() : str;
    }
}
