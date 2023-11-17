package androidx.core.text;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* renamed from: androidx.core.text.e */
public abstract class C0969e {

    /* renamed from: androidx.core.text.e$a */
    static class C0970a {
        /* renamed from: a */
        static Spanned m3471a(String str, int i) {
            return Html.fromHtml(str, i);
        }

        /* renamed from: b */
        static Spanned m3472b(String str, int i, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
            return Html.fromHtml(str, i, imageGetter, tagHandler);
        }

        /* renamed from: c */
        static String m3473c(Spanned spanned, int i) {
            return Html.toHtml(spanned, i);
        }
    }

    /* renamed from: a */
    public static Spanned m3470a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0970a.m3471a(str, i);
        }
        return Html.fromHtml(str);
    }
}
