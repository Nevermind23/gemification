package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.f */
public abstract class C0971f {

    /* renamed from: a */
    private static Method f3628a;

    /* renamed from: androidx.core.text.f$a */
    static class C0972a {
        /* renamed from: a */
        static String m3475a(Locale locale) {
            return locale.getScript();
        }
    }

    /* renamed from: androidx.core.text.f$b */
    static class C0973b {
        /* renamed from: a */
        static ULocale m3476a(Object obj) {
            return ULocale.addLikelySubtags(C0974g.m3479a(obj));
        }

        /* renamed from: b */
        static ULocale m3477b(Locale locale) {
            return ULocale.forLocale(locale);
        }

        /* renamed from: c */
        static String m3478c(Object obj) {
            return C0974g.m3479a(obj).getScript();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f3628a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    public static String m3474a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0973b.m3478c(C0973b.m3476a(C0973b.m3477b(locale)));
        }
        try {
            return C0972a.m3475a((Locale) f3628a.invoke((Object) null, new Object[]{locale}));
        } catch (InvocationTargetException e) {
            Log.w("ICUCompat", e);
            return C0972a.m3475a(locale);
        } catch (IllegalAccessException e2) {
            Log.w("ICUCompat", e2);
            return C0972a.m3475a(locale);
        }
    }
}
