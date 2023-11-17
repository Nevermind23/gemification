package org.webrtc;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Logging {

    /* renamed from: a */
    private static final Logger f98820a = m122182a();

    /* renamed from: b */
    private static volatile boolean f98821b;

    /* renamed from: org.webrtc.Logging$a */
    static /* synthetic */ class C42053a {

        /* renamed from: a */
        static final /* synthetic */ int[] f98822a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.webrtc.Logging$b[] r0 = org.webrtc.Logging.C42054b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f98822a = r0
                org.webrtc.Logging$b r1 = org.webrtc.Logging.C42054b.LS_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f98822a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.webrtc.Logging$b r1 = org.webrtc.Logging.C42054b.LS_WARNING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f98822a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.webrtc.Logging$b r1 = org.webrtc.Logging.C42054b.LS_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Logging.C42053a.<clinit>():void");
        }
    }

    /* renamed from: org.webrtc.Logging$b */
    public enum C42054b {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    /* renamed from: a */
    private static Logger m122182a() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    /* renamed from: b */
    public static void m122183b(String str, String str2) {
        m122187f(C42054b.LS_INFO, str, str2);
    }

    /* renamed from: c */
    static void m122184c() {
    }

    /* renamed from: d */
    public static void m122185d(String str, String str2, Throwable th) {
        C42054b bVar = C42054b.LS_ERROR;
        m122187f(bVar, str, str2);
        m122187f(bVar, str, th.toString());
        m122187f(bVar, str, m122186e(th));
    }

    /* renamed from: e */
    private static String m122186e(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: f */
    public static void m122187f(C42054b bVar, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Logging tag or message may not be null.");
        } else if (f98821b) {
            nativeLog(bVar.ordinal(), str, str2);
        } else {
            int i = C42053a.f98822a[bVar.ordinal()];
            if (i == 1) {
                level = Level.SEVERE;
            } else if (i == 2) {
                level = Level.WARNING;
            } else if (i != 3) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            Logger logger = f98820a;
            logger.log(level, str + ": " + str2);
        }
    }

    /* renamed from: g */
    public static void m122188g(String str, String str2) {
        m122187f(C42054b.LS_WARNING, str, str2);
    }

    private static native void nativeLog(int i, String str, String str2);
}
