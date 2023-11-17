package p194o5;

/* renamed from: o5.d */
public abstract class C7460d {
    /* renamed from: a */
    public static void m28359a(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static Object m28360b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m28361c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
