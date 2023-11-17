package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.github.mikephil.charting.utils.Utils;
import p080f8.C6170a;

/* renamed from: com.google.android.material.progressindicator.c */
final class C5117c extends C5130h {

    /* renamed from: c */
    private int f16375c = 1;

    /* renamed from: d */
    private float f16376d;

    /* renamed from: e */
    private float f16377e;

    /* renamed from: f */
    private float f16378f;

    public C5117c(C5123e eVar) {
        super(eVar);
    }

    /* renamed from: h */
    private void m20019h(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f16378f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: i */
    private int m20020i() {
        C5116b bVar = this.f16420a;
        return ((C5123e) bVar).f16394g + (((C5123e) bVar).f16395h * 2);
    }

    /* renamed from: a */
    public void mo16749a(Canvas canvas, Rect rect, float f) {
        int i;
        float width = ((float) rect.width()) / ((float) mo16753e());
        float height = ((float) rect.height()) / ((float) mo16752d());
        C5116b bVar = this.f16420a;
        float f2 = (((float) ((C5123e) bVar).f16394g) / 2.0f) + ((float) ((C5123e) bVar).f16395h);
        canvas.translate((f2 * width) + ((float) rect.left), (f2 * height) + ((float) rect.top));
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        C5116b bVar2 = this.f16420a;
        if (((C5123e) bVar2).f16396i == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f16375c = i;
        this.f16376d = ((float) ((C5123e) bVar2).f16369a) * f;
        this.f16377e = ((float) ((C5123e) bVar2).f16370b) * f;
        this.f16378f = ((float) (((C5123e) bVar2).f16394g - ((C5123e) bVar2).f16369a)) / 2.0f;
        if ((this.f16421b.mo16780j() && ((C5123e) this.f16420a).f16373e == 2) || (this.f16421b.mo16778i() && ((C5123e) this.f16420a).f16374f == 1)) {
            this.f16378f += ((1.0f - f) * ((float) ((C5123e) this.f16420a).f16369a)) / 2.0f;
        } else if ((this.f16421b.mo16780j() && ((C5123e) this.f16420a).f16373e == 1) || (this.f16421b.mo16778i() && ((C5123e) this.f16420a).f16374f == 2)) {
            this.f16378f -= ((1.0f - f) * ((float) ((C5123e) this.f16420a).f16369a)) / 2.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16750b(Canvas canvas, Paint paint, float f, float f2, int i) {
        float f3;
        Paint paint2 = paint;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f16376d);
            int i2 = this.f16375c;
            float f4 = f * 360.0f * ((float) i2);
            if (f2 >= f) {
                f3 = f2 - f;
            } else {
                f3 = (1.0f + f2) - f;
            }
            float f5 = f3 * 360.0f * ((float) i2);
            float f6 = this.f16378f;
            canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
            if (this.f16377e > Utils.FLOAT_EPSILON && Math.abs(f5) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                m20019h(canvas2, paint3, this.f16376d, this.f16377e, f4);
                m20019h(canvas2, paint3, this.f16376d, this.f16377e, f4 + f5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo16751c(Canvas canvas, Paint paint) {
        int a = C6170a.m24580a(((C5123e) this.f16420a).f16372d, this.f16421b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f16376d);
        float f = this.f16378f;
        canvas.drawArc(new RectF(-f, -f, f, f), Utils.FLOAT_EPSILON, 360.0f, false, paint);
    }

    /* renamed from: d */
    public int mo16752d() {
        return m20020i();
    }

    /* renamed from: e */
    public int mo16753e() {
        return m20020i();
    }
}
