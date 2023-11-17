package ld1;

import jd1.C41397d;

/* renamed from: ld1.b */
public abstract class C41692b {

    /* renamed from: a */
    static final C41397d f97957a = new C41693a();

    /* renamed from: ld1.b$a */
    static final class C41693a implements C41397d {
        C41693a() {
        }

        /* renamed from: a */
        public boolean mo27080a(Object obj, Object obj2) {
            return C41692b.m120932c(obj, obj2);
        }
    }

    /* renamed from: a */
    public static int m120930a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m120931b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    /* renamed from: c */
    public static boolean m120932c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: d */
    public static C41397d m120933d() {
        return f97957a;
    }

    /* renamed from: e */
    public static Object m120934e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: f */
    public static int m120935f(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}
