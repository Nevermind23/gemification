package xh1;

import android.content.Context;

/* renamed from: xh1.d */
public abstract class C43300d {

    /* renamed from: a */
    private static Context f101059a;

    /* renamed from: a */
    public static Context m124330a() {
        return f101059a;
    }

    /* renamed from: b */
    public static void m124331b(Context context) {
        if (context != null) {
            f101059a = context;
            return;
        }
        throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
    }
}
