package p326y8;

/* renamed from: y8.a0 */
public abstract class C9100a0 {
    /* renamed from: a */
    public static void m33552a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static Object m33553b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m33554c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m33555d(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }
}
