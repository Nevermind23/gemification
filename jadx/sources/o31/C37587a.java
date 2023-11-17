package o31;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.C41536l;

/* renamed from: o31.a */
public final class C37587a extends ReplacementSpan {

    /* renamed from: d */
    private final String f90325d;

    public C37587a(String str) {
        C41536l.m120489i(str, "replaceString");
        this.f90325d = str;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C41536l.m120489i(canvas, "canvas");
        C41536l.m120489i(charSequence, "text");
        C41536l.m120489i(paint, "paint");
        CharSequence subSequence = charSequence.subSequence(i, i2);
        String str = this.f90325d;
        canvas.drawText(subSequence + str, f, (float) i4, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C41536l.m120489i(paint, "paint");
        C41536l.m120489i(charSequence, "text");
        return (int) (paint.measureText(this.f90325d, 0, 1) + paint.measureText(charSequence, i, i2));
    }
}
