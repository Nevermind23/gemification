package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.C1008h;

/* renamed from: androidx.emoji2.text.i */
public abstract class C1394i extends ReplacementSpan {

    /* renamed from: d */
    private final Paint.FontMetricsInt f3986d = new Paint.FontMetricsInt();

    /* renamed from: e */
    private final C1390g f3987e;

    /* renamed from: f */
    private short f3988f = -1;

    /* renamed from: g */
    private short f3989g = -1;

    /* renamed from: h */
    private float f3990h = 1.0f;

    C1394i(C1390g gVar) {
        C1008h.m3531h(gVar, "metadata cannot be null");
        this.f3987e = gVar;
    }

    /* renamed from: a */
    public final C1390g mo4026a() {
        return this.f3987e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo4027b() {
        return this.f3988f;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f3986d);
        Paint.FontMetricsInt fontMetricsInt2 = this.f3986d;
        this.f3990h = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f3987e.mo4014e());
        this.f3989g = (short) ((int) (((float) this.f3987e.mo4014e()) * this.f3990h));
        short i3 = (short) ((int) (((float) this.f3987e.mo4017i()) * this.f3990h));
        this.f3988f = i3;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f3986d;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i3;
    }
}
