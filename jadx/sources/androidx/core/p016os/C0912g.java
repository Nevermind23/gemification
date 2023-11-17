package androidx.core.p016os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* renamed from: androidx.core.os.g */
public abstract class C0912g {

    /* renamed from: androidx.core.os.g$a */
    static class C0913a {
        /* renamed from: a */
        static LocaleList m3345a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    /* renamed from: a */
    public static C0918j m3344a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0918j.m3353i(C0913a.m3345a(configuration));
        }
        return C0918j.m3349a(configuration.locale);
    }
}
