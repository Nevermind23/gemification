package com.identomat.subfragments.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;

public final class FaceView extends View {

    /* renamed from: d */
    private Paint f30278d;

    /* renamed from: e */
    private Paint f30279e;

    /* renamed from: f */
    private Paint f30280f;

    /* renamed from: g */
    private RectF f30281g = new RectF();

    /* renamed from: h */
    private final Path f30282h = new Path();

    /* renamed from: i */
    private float f30283i = 1.37f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        m38782a();
    }

    /* renamed from: a */
    private final void m38782a() {
        Paint paint = new Paint();
        this.f30278d = paint;
        paint.setColor(-1);
        Paint paint2 = this.f30278d;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = this.f30278d;
            if (paint3 != null) {
                paint3.setStrokeWidth(5.0f);
                Paint paint4 = new Paint();
                this.f30279e = paint4;
                paint4.setColor(-1);
                Paint paint5 = this.f30279e;
                if (paint5 != null) {
                    paint5.setStyle(Paint.Style.STROKE);
                    Paint paint6 = this.f30279e;
                    if (paint6 != null) {
                        paint6.setStrokeWidth(5.0f);
                        Paint paint7 = new Paint();
                        this.f30280f = paint7;
                        paint7.setColor(Color.argb(50, 0, 0, 0));
                        Paint paint8 = this.f30280f;
                        if (paint8 != null) {
                            paint8.setStyle(Paint.Style.STROKE);
                            Paint paint9 = this.f30280f;
                            if (paint9 != null) {
                                paint9.setStrokeWidth(5.0f);
                            } else {
                                C41536l.m120506z("backgroundPaint");
                                throw null;
                            }
                        } else {
                            C41536l.m120506z("backgroundPaint");
                            throw null;
                        }
                    } else {
                        C41536l.m120506z("docStrokeWhitePaint");
                        throw null;
                    }
                } else {
                    C41536l.m120506z("docStrokeWhitePaint");
                    throw null;
                }
            } else {
                C41536l.m120506z("docStrokePaint");
                throw null;
            }
        } else {
            C41536l.m120506z("docStrokePaint");
            throw null;
        }
    }

    /* renamed from: b */
    private final void m38783b() {
        int width = (getWidth() / 6) * 5;
        float f = ((float) width) * this.f30283i;
        int width2 = (getWidth() - width) / 2;
        float height = (((float) getHeight()) - f) / ((float) 2);
        int i = width + width2;
        this.f30281g = new RectF((float) width2, height, (float) i, f + height);
    }

    public final float getAspect() {
        return this.f30283i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m38783b();
        if (canvas != null) {
            RectF rectF = this.f30281g;
            Paint paint = this.f30278d;
            if (paint != null) {
                canvas.drawOval(rectF, paint);
            } else {
                C41536l.m120506z("docStrokePaint");
                throw null;
            }
        }
        this.f30282h.reset();
        this.f30282h.addOval(this.f30281g, Path.Direction.CW);
        this.f30282h.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        if (canvas != null) {
            canvas.clipPath(this.f30282h);
        }
        if (canvas != null) {
            canvas.drawARGB(BogInputLayout.INPUT_NORMAL_STATE, 0, 0, 0);
        }
    }

    public final void setAspect(float f) {
        this.f30283i = f;
    }
}
