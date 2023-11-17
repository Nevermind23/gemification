package p334z4;

import com.facebook.C2626d;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p310x4.C8953a;
import p310x4.C8955b;

/* renamed from: z4.a */
public abstract class C9207a {

    /* renamed from: a */
    private static final Set f25626a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private static boolean f25627b = false;

    /* renamed from: a */
    public static void m34022a() {
        f25627b = true;
    }

    /* renamed from: b */
    public static void m34023b(Throwable th, Object obj) {
        if (f25627b) {
            f25626a.add(obj);
            if (C2626d.m10138i()) {
                C8953a.m33209b(th);
                C8955b.C8957b.m33220a(th, C8955b.C8958c.CrashShield).mo24375h();
            }
            m34025d(th);
        }
    }

    /* renamed from: c */
    public static boolean m34024c(Object obj) {
        return f25626a.contains(obj);
    }

    /* renamed from: d */
    private static void m34025d(Throwable th) {
    }
}
