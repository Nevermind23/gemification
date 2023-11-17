package p051d5;

import java.util.HashMap;
import java.util.Map;
import p334z4.C9207a;

/* renamed from: d5.a */
public class C5829a {

    /* renamed from: b */
    private static C5829a f18336b;

    /* renamed from: a */
    private final Map f18337a = new HashMap();

    private C5829a() {
    }

    /* renamed from: a */
    public static synchronized C5829a m23496a() {
        synchronized (C5829a.class) {
            if (C9207a.m34024c(C5829a.class)) {
                return null;
            }
            try {
                if (f18336b == null) {
                    f18336b = new C5829a();
                }
                C5829a aVar = f18336b;
                return aVar;
            } catch (Throwable th) {
                C9207a.m34023b(th, C5829a.class);
                return null;
            }
        }
    }
}
