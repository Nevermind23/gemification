package p640vf;

/* renamed from: vf.d */
public abstract class C18329d {
    /* renamed from: a */
    public static void m62674a(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    /* renamed from: b */
    public static Object m62675b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m62676c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static Object m62677d(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
