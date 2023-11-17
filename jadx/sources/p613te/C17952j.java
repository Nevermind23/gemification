package p613te;

import android.util.Log;
import java.security.InvalidParameterException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: te.j */
public abstract class C17952j {

    /* renamed from: a */
    private static final Pattern f51128a = Pattern.compile(C17931a.m61772g("1Q3U", 'O', 5, 3));

    /* renamed from: b */
    public static boolean f51129b = false;

    /* renamed from: c */
    public static int f51130c = m61851d();

    /* renamed from: d */
    public static int f51131d = 1;

    /* renamed from: e */
    public static int f51132e = 2;

    /* renamed from: f */
    public static int f51133f = m61851d();

    /* renamed from: te.j$a */
    public static class C17953a {

        /* renamed from: a */
        public static int f51134a = 51;

        /* renamed from: b */
        public static int f51135b = 1;

        /* renamed from: c */
        public static int f51136c = 2;

        /* renamed from: d */
        public static int f51137d;

        /* renamed from: a */
        public static void m61856a(String str, String str2) {
        }

        /* renamed from: b */
        public static void m61857b(String str, String str2, Object obj) {
            m61860e(str, C17952j.m61849b(str2, obj));
            int g = m61862g();
            if ((g * (f51135b + g)) % f51136c != 0) {
                f51134a = m61862g();
                f51137d = m61862g();
            }
        }

        /* renamed from: c */
        public static void m61858c(String str, String str2) {
        }

        /* renamed from: d */
        public static void m61859d(String str, String str2, Throwable th) {
        }

        /* renamed from: e */
        public static void m61860e(String str, String str2) {
        }

        /* renamed from: f */
        public static void m61861f(String str, String str2) {
        }

        /* renamed from: g */
        public static int m61862g() {
            return 8;
        }
    }

    static {
        int i = f51130c;
        if (((f51131d + i) * i) % f51132e != f51133f) {
        }
    }

    /* renamed from: a */
    public static void m61848a(String str, String str2, Throwable th) {
        int i = f51130c;
        if ((i * (f51131d + i)) % f51132e != 0) {
            f51130c = m61851d();
            f51133f = 36;
        }
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: b */
    public static String m61849b(String str, Object... objArr) {
        if (str == null || objArr == null) {
            return "";
        }
        Matcher matcher = f51128a.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            if (matcher.find()) {
                if (obj != null) {
                    matcher.appendReplacement(stringBuffer, String.valueOf(obj));
                    int i2 = f51130c;
                    if (((f51131d + i2) * i2) % f51132e != f51133f) {
                        f51130c = m61851d();
                        f51133f = m61851d();
                    }
                } else {
                    matcher.appendReplacement(stringBuffer, C17931a.m61772g("dlde", 30, 167, 0));
                }
                i++;
            } else {
                throw new InvalidParameterException(C17931a.m61772g("Qwmz~sr\u00051\u0001\t\u0002w{\n8\t\u0001;}\u0010\u0006\u0015\u000e\u0007\u0011\u0018\u0018E\r\u0017\u001bI\u001f\u0014\u0016!N\u0016 $ \u0015)U*,+#)#", '6', 173, 0));
            }
        }
        if (!matcher.find()) {
            return matcher.appendTail(stringBuffer).toString();
        }
        throw new InvalidParameterException(C17931a.m61768c("\u0017=3@DE98JvFNG=AO}NF\u0001CUKZSLV]]\u000bR\\`\u000fdY[f\u0014[eieZn\u001boqphnh", 229, 1));
    }

    /* renamed from: c */
    public static String m61850c(Class cls) {
        int i = f51130c;
        if ((i * (f51131d + i)) % f51132e != 0) {
            f51130c = 41;
            f51133f = m61851d();
        }
        String str = C17931a.m61772g("=\u0007L\u0005J9A\u0001", 'F', ' ', 1) + cls.getSimpleName();
        return str.length() > 23 ? str.substring(0, 23) : str;
    }

    /* renamed from: d */
    public static int m61851d() {
        return 64;
    }

    /* renamed from: e */
    private static boolean m61852e(String str, int i) {
        int i2 = f51130c;
        if ((i2 * (f51131d + i2)) % f51132e != 0) {
            f51130c = m61851d();
            f51131d = 52;
        }
        return !f51129b && Log.isLoggable(str, i);
    }

    /* renamed from: f */
    public static void m61853f(String str, String str2) {
        if (Log.isLoggable(str, 6)) {
            Log.e(str, str2);
        }
    }

    /* renamed from: g */
    public static void m61854g(String str, String str2, String... strArr) {
        m61853f(str, m61849b(str2, strArr));
    }

    /* renamed from: h */
    public static void m61855h(String str, String str2) {
        int d = m61851d();
        if ((d * (f51131d + d)) % f51132e != 0) {
            f51130c = 94;
            f51133f = 43;
        }
        if (m61852e(str, 5)) {
            Log.w(str, str2);
        }
    }
}
