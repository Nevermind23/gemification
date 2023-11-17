package org.webrtc;

import xh1.C43319m;

/* renamed from: org.webrtc.o */
abstract class C42103o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static String f99029a = "NativeLibrary";

    /* renamed from: b */
    private static Object f99030b = new Object();

    /* renamed from: c */
    private static boolean f99031c;

    /* renamed from: org.webrtc.o$a */
    static class C42104a implements C43319m {
        C42104a() {
        }

        /* renamed from: a */
        public boolean mo97614a(String str) {
            String a = C42103o.f99029a;
            Logging.m122183b(a, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    /* renamed from: b */
    static void m122304b(C43319m mVar, String str) {
        synchronized (f99030b) {
            if (f99031c) {
                Logging.m122183b(f99029a, "Native library has already been loaded.");
                return;
            }
            String str2 = f99029a;
            Logging.m122183b(str2, "Loading native library: " + str);
            f99031c = mVar.mo97614a(str);
        }
    }

    /* renamed from: c */
    static boolean m122305c() {
        boolean z;
        synchronized (f99030b) {
            z = f99031c;
        }
        return z;
    }
}
