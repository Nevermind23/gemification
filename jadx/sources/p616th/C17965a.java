package p616th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.C41536l;

/* renamed from: th.a */
public final class C17965a extends ReplacementSpan {

    /* renamed from: d */
    private final int f51159d;

    public C17965a(int i) {
        this.f51159d = i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C41536l.m120489i(canvas, "canvas");
        C41536l.m120489i(charSequence, "text");
        C41536l.m120489i(paint, "paint");
        float f2 = (float) i3;
        canvas.drawRect(f + ((float) this.f51159d), f2, f, f2, paint);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C41536l.m120489i(paint, "paint");
        C41536l.m120489i(charSequence, "text");
        return this.f51159d;
    }
}
