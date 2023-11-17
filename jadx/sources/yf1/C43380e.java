package yf1;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.C41536l;
import of1.C41944z;
import sf1.C42562e;
import wf1.C43201d;

/* renamed from: yf1.e */
public final class C43380e {

    /* renamed from: a */
    public static final C43380e f101221a = new C43380e();

    /* renamed from: b */
    private static final CopyOnWriteArraySet f101222b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private static final Map f101223c;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<C41944z> cls = C41944z.class;
        Package packageR = cls.getPackage();
        if (packageR == null) {
            str = null;
        } else {
            str = packageR.getName();
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = cls.getName();
        C41536l.m120488h(name, "OkHttpClient::class.java.name");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = C43201d.class.getName();
        C41536l.m120488h(name2, "Http2::class.java.name");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = C42562e.class.getName();
        C41536l.m120488h(name3, "TaskRunner::class.java.name");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f101223c = C41344r0.m119941w(linkedHashMap);
    }

    private C43380e() {
    }

    /* renamed from: c */
    private final void m124449c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (f101222b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(C43381f.f101224a);
        }
    }

    /* renamed from: d */
    private final String m124450d(String str) {
        String str2 = (String) f101223c.get(str);
        return str2 == null ? C40445z.m117194Y0(str, 23) : str2;
    }

    /* renamed from: a */
    public final void mo102059a(String str, int i, String str2, Throwable th) {
        int min;
        C41536l.m120489i(str, "loggerName");
        C41536l.m120489i(str2, "message");
        String d = m124450d(str);
        if (Log.isLoggable(d, i)) {
            if (th != null) {
                str2 = str2 + 10 + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int W = C40440x.m117155W(str2, 10, i2, false, 4, (Object) null);
                if (W == -1) {
                    W = length;
                }
                while (true) {
                    min = Math.min(W, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, d, substring);
                    if (min >= W) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    /* renamed from: b */
    public final void mo102060b() {
        for (Map.Entry entry : f101223c.entrySet()) {
            m124449c((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
