package p341ge.bog.mobilebank.p975ui.views.widgets.util;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.res.C0808h;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import p366bk.C10321j;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.util.InstallmentSpannableTextUtil */
public final class InstallmentSpannableTextUtil {
    public static final InstallmentSpannableTextUtil INSTANCE = new InstallmentSpannableTextUtil();

    private InstallmentSpannableTextUtil() {
    }

    public static final SpannableString getColorizedText(String str, String str2, int i) {
        C41536l.m120489i(str, "leadingText");
        C41536l.m120489i(str2, "trailingText");
        String str3 = str + " " + str2;
        int length = str.length() + 1;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new ForegroundColorSpan(i), 0, str3.length(), 33);
        spannableString.setSpan(new CustomTypefaceSpan(C0808h.m3033h(C36546y.m108285N(), C10321j.f28707e)), length, str3.length(), 33);
        spannableString.setSpan(new CustomTypefaceSpan(C0808h.m3033h(C36546y.m108285N(), C10321j.f28705a)), length, str3.length(), 33);
        return spannableString;
    }
}
