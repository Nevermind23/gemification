package p089g4;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: g4.k */
public abstract class C6223k {
    /* renamed from: a */
    public static void m24727a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m24728b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static Collection m24729c(Collection collection) {
        if (!collection.isEmpty()) {
            return collection;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static Object m24730d(Object obj) {
        return m24731e(obj, "Argument must not be null");
    }

    /* renamed from: e */
    public static Object m24731e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
