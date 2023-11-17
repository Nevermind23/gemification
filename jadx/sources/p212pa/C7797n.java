package p212pa;

import android.content.Context;
import android.content.pm.PackageManager;
import of1.C41931v;
import p134ja.C6763a;

/* renamed from: pa.n */
public abstract class C7797n {

    /* renamed from: a */
    private static Boolean f22521a;

    /* renamed from: a */
    public static void m29502a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static boolean m29503b(Context context) {
        Boolean bool = f22521a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f22521a = valueOf;
            return valueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C6763a e2 = C6763a.m26371e();
            e2.mo20804a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    /* renamed from: c */
    public static int m29504c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static String m29505d(String str) {
        C41931v m = C41931v.m121622m(str);
        if (m != null) {
            return m.mo96956k().mo96978L("").mo96995t("").mo96998x((String) null).mo96984g((String) null).toString();
        }
        return str;
    }

    /* renamed from: e */
    public static String m29506e(String str, int i) {
        int lastIndexOf;
        if (str.length() <= i) {
            return str;
        }
        if (str.charAt(i) == '/') {
            return str.substring(0, i);
        }
        C41931v m = C41931v.m121622m(str);
        if (m == null) {
            return str.substring(0, i);
        }
        if (m.mo96948d().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, i - 1)) < 0) {
            return str.substring(0, i);
        }
        return str.substring(0, lastIndexOf);
    }
}
