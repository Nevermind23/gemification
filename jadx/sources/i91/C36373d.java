package i91;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import androidx.core.content.C0767a;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.Iterator;
import p366bk.C10318g;

/* renamed from: i91.d */
public abstract class C36373d {
    /* renamed from: a */
    public static Spanned m107943a(String str, String str2, String str3, int i, Context context) {
        return C32359z0.m95532C(String.format("%s<font color=%s>%s</font>%s", new Object[]{str, "#" + Integer.toHexString(C0767a.m2893c(context, i) & 16777215), str2, str3}));
    }

    /* renamed from: b */
    public static Spanned m107944b(String str, String str2, int i, int i2, Context context) {
        return C32359z0.m95532C(String.format("<font color=%s>%s</font><font color=%s>%s</font>", new Object[]{"#" + Integer.toHexString(C0767a.m2893c(context, i) & 16777215), str, "#" + Integer.toHexString(C0767a.m2893c(context, i2) & 16777215), str2}));
    }

    /* renamed from: c */
    public static SpannableString m107945c(Context context, String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        if (str != null && str2 != null && !str.isEmpty() && !str2.isEmpty()) {
            int indexOf = str.indexOf(str2);
            int length = str2.length() + indexOf;
            if (indexOf >= 0 && length >= 1) {
                spannableString.setSpan(new ForegroundColorSpan(C0767a.m2893c(context, C10318g.orange_highlight_color)), indexOf, length, 0);
            }
        }
        return spannableString;
    }

    /* renamed from: d */
    public static void m107946d(TextView textView, String str, String str2) {
        m107947e(textView, str, str2, false);
    }

    /* renamed from: e */
    public static void m107947e(TextView textView, String str, String str2, boolean z) {
        String str3;
        if (textView != null && str != null && str2 != null) {
            ArrayList arrayList = new ArrayList();
            if (!z) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == ' ') {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                str3 = str.replace(" ", "");
            } else {
                str3 = str;
            }
            int indexOf = str3.toLowerCase().indexOf(str2.toLowerCase());
            if (indexOf < 0) {
                textView.setText(str);
                return;
            }
            int length = str2.length();
            if (!z) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (length > ((Integer) it.next()).intValue()) {
                        length++;
                    }
                }
            }
            int i2 = length + indexOf;
            textView.setText(m107943a(str.substring(0, indexOf), str.substring(indexOf, i2), str.substring(i2, str.length()), C10318g.orange_highlight_color, textView.getContext()));
        }
    }

    /* renamed from: f */
    public static void m107948f(TextView textView, String str) {
        if (textView != null && str != null) {
            textView.setText(str);
        }
    }
}
