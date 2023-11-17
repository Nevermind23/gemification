package androidx.core.p016os;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* renamed from: androidx.core.os.b */
public abstract class C0904b {

    /* renamed from: a */
    public static final int f3525a;

    /* renamed from: b */
    public static final int f3526b;

    /* renamed from: c */
    public static final int f3527c;

    /* renamed from: d */
    public static final int f3528d;

    /* renamed from: androidx.core.os.b$a */
    private static final class C0905a {

        /* renamed from: a */
        static final int f3529a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b */
        static final int f3530b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c */
        static final int f3531c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d */
        static final int f3532d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i;
        int i2;
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = 0;
        if (i4 >= 30) {
            i = C0905a.f3529a;
        } else {
            i = 0;
        }
        f3525a = i;
        if (i4 >= 30) {
            i2 = C0905a.f3530b;
        } else {
            i2 = 0;
        }
        f3526b = i2;
        if (i4 >= 30) {
            i3 = C0905a.f3531c;
        } else {
            i3 = 0;
        }
        f3527c = i3;
        if (i4 >= 30) {
            i5 = C0905a.f3532d;
        }
        f3528d = i5;
    }

    /* renamed from: a */
    protected static boolean m3329a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        if (str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3330b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    /* renamed from: c */
    public static boolean m3331c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 32 && m3329a("Tiramisu", Build.VERSION.CODENAME))) {
            return true;
        }
        return false;
    }
}
