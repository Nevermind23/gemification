package p627uf;

/* renamed from: uf.d */
public abstract class C18156d {
    /* renamed from: a */
    public static void m62246a(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static Object m62247b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m62248c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m62249d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
