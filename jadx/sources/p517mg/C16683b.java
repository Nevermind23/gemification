package p517mg;

import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;

/* renamed from: mg.b */
public abstract class C16683b {
    /* renamed from: a */
    public static final boolean m59024a(TextView textView) {
        Spanned spanned;
        ClickableSpan[] clickableSpanArr;
        boolean z;
        C41536l.m120489i(textView, "<this>");
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            spanned = (Spanned) text;
        } else {
            spanned = null;
        }
        if (spanned == null || (clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) == null) {
            return false;
        }
        if (clickableSpanArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m59025b(View view, int i) {
        C41536l.m120489i(view, "<this>");
        view.setVisibility(i);
        if (i == 0) {
            view.animate().setStartDelay(150).alpha(1.0f).setDuration(150);
        } else {
            view.animate().alpha(Utils.FLOAT_EPSILON).setDuration(0);
        }
    }
}
