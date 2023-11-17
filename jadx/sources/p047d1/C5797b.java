package p047d1;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: d1.b */
public abstract class C5797b {

    /* renamed from: a */
    private static long f18272a;

    /* renamed from: b */
    private static Method f18273b;

    /* renamed from: a */
    public static void m23308a(String str) {
        C5798c.m23313a(str);
    }

    /* renamed from: b */
    public static void m23309b() {
        C5798c.m23314b();
    }

    /* renamed from: c */
    private static void m23310c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* renamed from: d */
    public static boolean m23311d() {
        try {
            if (f18273b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m23312e();
    }

    /* renamed from: e */
    private static boolean m23312e() {
        Class<Trace> cls = Trace.class;
        try {
            if (f18273b == null) {
                f18272a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f18273b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f18273b.invoke((Object) null, new Object[]{Long.valueOf(f18272a)})).booleanValue();
        } catch (Exception e) {
            m23310c("isTagEnabled", e);
            return false;
        }
    }
}
