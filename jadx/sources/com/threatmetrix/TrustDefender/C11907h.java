package com.threatmetrix.TrustDefender;

import android.util.Log;
import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.threatmetrix.TrustDefender.h */
public abstract class C11907h {

    /* renamed from: a */
    private static final Pattern f34836a = Pattern.compile("\\{\\}");

    /* renamed from: b */
    private static boolean f34837b = false;

    /* renamed from: com.threatmetrix.TrustDefender.h$a */
    public static class C11908a {
        /* renamed from: a */
        public static void m43623a(String str, String str2) {
        }

        /* renamed from: b */
        public static void m43624b(String str, String str2) {
        }

        /* renamed from: c */
        public static void m43625c(String str, String str2, Object obj) {
            m43631i(str, C11907h.m43617l(str2, obj));
        }

        /* renamed from: d */
        public static void m43626d(String str, String str2, Object obj, Object obj2) {
            m43623a(str, C11907h.m43617l(str2, obj, obj2));
        }

        /* renamed from: e */
        public static void m43627e(String str, String str2, Object obj) {
            m43623a(str, C11907h.m43617l(str2, obj));
        }

        /* renamed from: f */
        public static void m43628f(String str, String str2, Object obj) {
            m43624b(str, C11907h.m43617l(str2, obj));
        }

        /* renamed from: g */
        public static void m43629g(String str, String str2, Throwable th) {
        }

        /* renamed from: h */
        public static void m43630h(String str, String str2) {
        }

        /* renamed from: i */
        public static void m43631i(String str, String str2) {
        }
    }

    /* renamed from: a */
    public static void m43606a(String str, String str2, String... strArr) {
        m43610e(str, m43617l(str2, strArr));
    }

    /* renamed from: b */
    public static void m43607b(String str, String str2) {
        if (m43608c(str, 4)) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    private static boolean m43608c(String str, int i) {
        return !f34837b && Log.isLoggable(str, i);
    }

    /* renamed from: d */
    public static void m43609d(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    /* renamed from: e */
    public static void m43610e(String str, String str2) {
        if (m43608c(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: f */
    public static void m43611f(String str, String str2, String... strArr) {
        m43609d(str, m43617l(str2, strArr));
    }

    /* renamed from: g */
    public static void m43612g(String str, String str2, String... strArr) {
        if (m43608c(str, 4)) {
            Log.i(str, m43617l(str2, strArr));
        }
    }

    /* renamed from: h */
    public static boolean m43613h() {
        C11996u0 s;
        boolean z;
        if (m43608c("TrustDefender", 2)) {
            s = C11996u0.m44036s();
            z = true;
        } else {
            s = C11996u0.m44036s();
            z = false;
        }
        s.mo32068a(z ? 1 : 0);
        return z;
    }

    /* renamed from: i */
    public static void m43614i(String str, String str2, Throwable th) {
        if (m43608c(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: j */
    public static String m43615j(Class cls) {
        String str = "c.t.tdm." + cls.getSimpleName();
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    /* renamed from: k */
    public static boolean m43616k() {
        return false;
    }

    /* renamed from: l */
    public static String m43617l(String str, Object... objArr) {
        if (str == null || objArr == null) {
            return "";
        }
        Matcher matcher = f34836a.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (matcher.find()) {
                matcher.appendReplacement(stringBuffer, obj != null ? String.valueOf(obj) : "null");
                i++;
            } else {
                throw new InvalidParameterException("Incorrect number of arguments for this format string");
            }
        }
        if (!matcher.find()) {
            return matcher.appendTail(stringBuffer).toString();
        }
        throw new InvalidParameterException("Incorrect number of arguments for this format string");
    }

    /* renamed from: m */
    public static void m43618m(boolean z) {
        f34837b = z;
    }

    /* renamed from: n */
    public static void m43619n(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: o */
    public static void m43620o(String str, String str2, Throwable th) {
        if (m43608c(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: p */
    public static boolean m43621p() {
        return !f34837b;
    }

    /* renamed from: q */
    public static void m43622q(String str, String str2) {
        Log.w(str, "Unexpected ERROR: " + str2);
    }
}
