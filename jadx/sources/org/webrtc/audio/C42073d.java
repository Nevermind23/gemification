package org.webrtc.audio;

import android.os.Build;

/* renamed from: org.webrtc.audio.d */
abstract class C42073d {
    /* renamed from: a */
    public static String m122224a() {
        return "@[name=" + Thread.currentThread().getName() + ", id=" + Thread.currentThread().getId() + "]";
    }

    /* renamed from: b */
    public static boolean m122225b() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }
}
