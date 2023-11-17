package androidx.core.p016os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: androidx.core.os.x */
public abstract class C0934x {

    /* renamed from: a */
    private static long f3550a;

    /* renamed from: b */
    private static Method f3551b;

    /* renamed from: c */
    private static Method f3552c;

    /* renamed from: d */
    private static Method f3553d;

    /* renamed from: e */
    private static Method f3554e;

    /* renamed from: androidx.core.os.x$a */
    static class C0935a {
        /* renamed from: a */
        static void m3383a(String str) {
            Trace.beginSection(str);
        }

        /* renamed from: b */
        static void m3384b() {
            Trace.endSection();
        }
    }

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f3550a = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                f3551b = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                f3552c = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                f3553d = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                f3554e = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m3381a(String str) {
        C0935a.m3383a(str);
    }

    /* renamed from: b */
    public static void m3382b() {
        C0935a.m3384b();
    }
}
