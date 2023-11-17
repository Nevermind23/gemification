package p182n6;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import p260t6.C8419u;

/* renamed from: n6.i */
public abstract class C7264i {
    /* renamed from: a */
    public static void m27892a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m27893b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m27894c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m27895d(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name + " thread, but got " + str + ".");
        }
    }

    /* renamed from: e */
    public static void m27896e(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static void m27897f(String str) {
        if (!C8419u.m31585a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    public static String m27898g(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: h */
    public static String m27899h(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: i */
    public static void m27900i() {
        m27901j("Must not be called on the main application thread");
    }

    /* renamed from: j */
    public static void m27901j(String str) {
        if (C8419u.m31585a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: k */
    public static Object m27902k(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: l */
    public static Object m27903l(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: m */
    public static int m27904m(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: n */
    public static void m27905n(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    public static void m27906o(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: p */
    public static void m27907p(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
