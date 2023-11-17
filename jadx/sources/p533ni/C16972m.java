package p533ni;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.C41536l;

/* renamed from: ni.m */
public final class C16972m extends ReplacementSpan {

    /* renamed from: d */
    private final float f47402d;

    /* renamed from: e */
    private final int f47403e;

    public C16972m(float f, int i) {
        this.f47402d = f;
        this.f47403e = i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C41536l.m120489i(canvas, "canvas");
        C41536l.m120489i(charSequence, "text");
        Paint paint2 = paint;
        C41536l.m120489i(paint2, "paint");
        int i6 = this.f47403e;
        canvas.drawText(charSequence, i6, i6 + 1, f, (float) i4, paint2);
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C41536l.m120489i(paint, "paint");
        C41536l.m120489i(charSequence, "text");
        return ((int) paint.measureText(charSequence, i, i2)) + ((int) this.f47402d);
    }
}
