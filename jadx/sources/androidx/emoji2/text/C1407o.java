package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* renamed from: androidx.emoji2.text.o */
public final class C1407o extends C1394i {

    /* renamed from: i */
    private static Paint f4016i;

    public C1407o(C1390g gVar) {
        super(gVar);
    }

    /* renamed from: c */
    private static Paint m4843c() {
        if (f4016i == null) {
            TextPaint textPaint = new TextPaint();
            f4016i = textPaint;
            textPaint.setColor(C1378e.m4730b().mo3988c());
            f4016i.setStyle(Paint.Style.FILL);
        }
        return f4016i;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C1378e.m4730b().mo3990i()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo4027b()), (float) i5, m4843c());
        }
        mo4026a().mo4010a(canvas, f, (float) i4, paint);
    }
}
