package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.text.y */
public abstract class C0998y {

    /* renamed from: a */
    private static final Locale f3641a = new Locale("", "");

    /* renamed from: androidx.core.text.y$a */
    static class C0999a {
        /* renamed from: a */
        static int m3507a(Locale locale) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
    }

    /* renamed from: a */
    public static int m3506a(Locale locale) {
        return C0999a.m3507a(locale);
    }
}
