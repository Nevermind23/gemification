package androidx.core.p016os;

import android.os.Build;
import android.os.LocaleList;
import androidx.core.text.C0971f;
import java.util.Locale;

/* renamed from: androidx.core.os.j */
public final class C0918j {

    /* renamed from: b */
    private static final C0918j f3540b = m3349a(new Locale[0]);

    /* renamed from: a */
    private final C0926p f3541a;

    /* renamed from: androidx.core.os.j$a */
    static class C0919a {

        /* renamed from: a */
        private static final Locale[] f3542a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        /* renamed from: a */
        static Locale m3358a(String str) {
            return Locale.forLanguageTag(str);
        }

        /* renamed from: b */
        private static boolean m3359b(Locale locale) {
            for (Locale equals : f3542a) {
                if (equals.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        static boolean m3360c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || m3359b(locale) || m3359b(locale2)) {
                return false;
            }
            String a = C0971f.m3474a(locale);
            if (!a.isEmpty()) {
                return a.equals(C0971f.m3474a(locale2));
            }
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.core.os.j$b */
    static class C0920b {
        /* renamed from: a */
        static LocaleList m3361a(Locale... localeArr) {
            C0924n.m3367a();
            return C0923m.m3366a(localeArr);
        }

        /* renamed from: b */
        static LocaleList m3362b() {
            return LocaleList.getAdjustedDefault();
        }

        /* renamed from: c */
        static LocaleList m3363c() {
            return LocaleList.getDefault();
        }
    }

    private C0918j(C0926p pVar) {
        this.f3541a = pVar;
    }

    /* renamed from: a */
    public static C0918j m3349a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m3353i(C0920b.m3361a(localeArr));
        }
        return new C0918j(new C0925o(localeArr));
    }

    /* renamed from: b */
    static Locale m3350b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else if (!str.contains("_")) {
            return new Locale(str);
        } else {
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    /* renamed from: c */
    public static C0918j m3351c(String str) {
        if (str == null || str.isEmpty()) {
            return m3352e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = C0919a.m3358a(split[i]);
        }
        return m3349a(localeArr);
    }

    /* renamed from: e */
    public static C0918j m3352e() {
        return f3540b;
    }

    /* renamed from: i */
    public static C0918j m3353i(LocaleList localeList) {
        return new C0918j(new C0933w(localeList));
    }

    /* renamed from: d */
    public Locale mo3364d(int i) {
        return this.f3541a.get(i);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0918j) && this.f3541a.equals(((C0918j) obj).f3541a);
    }

    /* renamed from: f */
    public boolean mo3366f() {
        return this.f3541a.isEmpty();
    }

    /* renamed from: g */
    public int mo3367g() {
        return this.f3541a.size();
    }

    /* renamed from: h */
    public String mo3368h() {
        return this.f3541a.mo3371a();
    }

    public int hashCode() {
        return this.f3541a.hashCode();
    }

    public String toString() {
        return this.f3541a.toString();
    }
}
