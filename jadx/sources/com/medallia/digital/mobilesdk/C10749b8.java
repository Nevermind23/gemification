package com.medallia.digital.mobilesdk;

import android.text.format.DateFormat;
import java.util.Calendar;

/* renamed from: com.medallia.digital.mobilesdk.b8 */
public final class C10749b8 {

    /* renamed from: a */
    private static final String f30736a = "yyyy-MM-dd";

    /* renamed from: b */
    private static final String f30737b = "HH:mm:ss";

    /* renamed from: com.medallia.digital.mobilesdk.b8$a */
    protected static class C10750a {

        /* renamed from: a */
        protected static final int f30738a = 1024;

        /* renamed from: b */
        protected static final int f30739b = 1048576;

        /* renamed from: c */
        private static final double f30740c = 8.0d;

        /* renamed from: d */
        protected static final double f30741d = 7.62939453125E-6d;

        protected C10750a() {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.b8$b */
    protected static class C10751b {

        /* renamed from: a */
        public static final long f30742a = 1000;

        /* renamed from: b */
        public static final long f30743b = 60000;

        /* renamed from: c */
        public static final long f30744c = 3600000;

        /* renamed from: d */
        public static final long f30745d = 86400000;

        protected C10751b() {
        }
    }

    /* renamed from: a */
    protected static String m39170a(long j) {
        return m39171a(j, "yyyy-MM-dd HH:mm:ss");
    }

    /* renamed from: b */
    public static String m39172b(long j) {
        return m39171a(j, f30737b);
    }

    /* renamed from: a */
    private static String m39171a(long j, String str) {
        if (j <= 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return DateFormat.format(str, instance).toString();
    }
}
