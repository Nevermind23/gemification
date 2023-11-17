package p341ge.bog.mobilebank.p975ui.views.widgets.util;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.util.CustomTypefaceSpan */
public final class CustomTypefaceSpan extends MetricAffectingSpan {
    private final Typeface typeface;

    public CustomTypefaceSpan(Typeface typeface2) {
        this.typeface = typeface2;
    }

    public void updateDrawState(TextPaint textPaint) {
        C41536l.m120489i(textPaint, "paint");
        textPaint.setTypeface(this.typeface);
    }

    public void updateMeasureState(TextPaint textPaint) {
        C41536l.m120489i(textPaint, "paint");
        textPaint.setTypeface(this.typeface);
    }
}
