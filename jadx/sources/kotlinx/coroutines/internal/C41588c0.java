package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.c0 */
abstract /* synthetic */ class C41588c0 {

    /* renamed from: a */
    private static final int f97777a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m120638a() {
        return f97777a;
    }

    /* renamed from: b */
    public static final String m120639b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
