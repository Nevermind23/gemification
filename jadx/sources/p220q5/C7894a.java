package p220q5;

import android.os.Build;
import android.util.Log;

/* renamed from: q5.a */
public abstract class C7894a {
    /* renamed from: a */
    private static String m29863a(String str, String str2) {
        String str3 = str + str2;
        if (str3.length() > 23) {
            return str3.substring(0, 23);
        }
        return str3;
    }

    /* renamed from: b */
    public static void m29864b(String str, String str2, Object obj) {
        String e = m29867e(str);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: c */
    public static void m29865c(String str, String str2, Object... objArr) {
        String e = m29867e(str);
        if (Log.isLoggable(e, 3)) {
            Log.d(e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m29866d(String str, String str2, Throwable th) {
        String e = m29867e(str);
        if (Log.isLoggable(e, 6)) {
            Log.e(e, str2, th);
        }
    }

    /* renamed from: e */
    private static String m29867e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m29863a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m29868f(String str, String str2, Object obj) {
        String e = m29867e(str);
        if (Log.isLoggable(e, 4)) {
            Log.i(e, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: g */
    public static void m29869g(String str, String str2, Object obj) {
        String e = m29867e(str);
        if (Log.isLoggable(e, 5)) {
            Log.w(e, String.format(str2, new Object[]{obj}));
        }
    }
}
