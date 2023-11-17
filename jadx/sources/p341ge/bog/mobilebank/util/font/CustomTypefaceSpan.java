package p341ge.bog.mobilebank.util.font;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* renamed from: ge.bog.mobilebank.util.font.CustomTypefaceSpan */
public class CustomTypefaceSpan extends TypefaceSpan {

    /* renamed from: d */
    private final Typeface f86843d;

    public CustomTypefaceSpan(String str, Typeface typeface) {
        super(str);
        this.f86843d = typeface;
    }

    /* renamed from: a */
    private static void m106804a(Paint paint, Typeface typeface) {
        int i;
        Typeface typeface2 = paint.getTypeface();
        if (typeface2 == null) {
            i = 0;
        } else {
            i = typeface2.getStyle();
        }
        int i2 = i & (~typeface.getStyle());
        if ((i2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((i2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        paint.setTypeface(typeface);
    }

    public void updateDrawState(TextPaint textPaint) {
        m106804a(textPaint, this.f86843d);
    }

    public void updateMeasureState(TextPaint textPaint) {
        m106804a(textPaint, this.f86843d);
    }
}
