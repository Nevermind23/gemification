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

public final class HoldDocumentView extends View {

    /* renamed from: d */
    private Paint f30284d;

    /* renamed from: e */
    private Paint f30285e;

    /* renamed from: f */
    private Paint f30286f;

    /* renamed from: g */
    private RectF f30287g = new RectF();

    /* renamed from: h */
    private final float f30288h = 15.0f;

    /* renamed from: i */
    private RectF f30289i = new RectF();

    /* renamed from: j */
    private Path f30290j = new Path();

    /* renamed from: k */
    private float f30291k = 1.37f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HoldDocumentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        m38784a();
    }

    /* renamed from: a */
    private final void m38784a() {
        Paint paint = new Paint();
        this.f30284d = paint;
        paint.setColor(-1);
        Paint paint2 = this.f30284d;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = this.f30284d;
            if (paint3 != null) {
                paint3.setStrokeWidth(5.0f);
                Paint paint4 = new Paint();
                this.f30285e = paint4;
                paint4.setColor(-1);
                Paint paint5 = this.f30285e;
                if (paint5 != null) {
                    paint5.setStyle(Paint.Style.STROKE);
                    Paint paint6 = this.f30285e;
                    if (paint6 != null) {
                        paint6.setStrokeWidth(5.0f);
                        Paint paint7 = new Paint();
                        this.f30286f = paint7;
                        paint7.setColor(Color.argb(50, 0, 0, 0));
                        Paint paint8 = this.f30286f;
                        if (paint8 != null) {
                            paint8.setStyle(Paint.Style.STROKE);
                            Paint paint9 = this.f30286f;
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
    private final void m38785b() {
        int width = (getWidth() / 6) * 5;
        float f = ((float) width) / this.f30291k;
        int width2 = (getWidth() - width) / 2;
        float height = (float) (getHeight() - width2);
        float f2 = height - f;
        this.f30287g = new RectF((float) width2, f2, (float) (width + width2), height);
        float f3 = f2 - ((float) BogInputLayout.INPUT_NORMAL_STATE);
        float f4 = f3 / this.f30291k;
        float f5 = f2 - ((float) 100);
        float width3 = (((float) getWidth()) - f4) / ((float) 2);
        this.f30289i = new RectF(width3, f5 - f3, f4 + width3, f5);
    }

    public final float getAspect() {
        return this.f30291k;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m38785b();
        if (canvas != null) {
            RectF rectF = this.f30289i;
            Paint paint = this.f30284d;
            if (paint != null) {
                canvas.drawOval(rectF, paint);
            } else {
                C41536l.m120506z("docStrokePaint");
                throw null;
            }
        }
        if (canvas != null) {
            RectF rectF2 = this.f30287g;
            float f = this.f30288h;
            Paint paint2 = this.f30284d;
            if (paint2 != null) {
                canvas.drawRoundRect(rectF2, f, f, paint2);
            } else {
                C41536l.m120506z("docStrokePaint");
                throw null;
            }
        }
        Path path = new Path();
        this.f30290j = path;
        path.addOval(this.f30289i, Path.Direction.CW);
        this.f30290j.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        Path path2 = this.f30290j;
        RectF rectF3 = this.f30287g;
        float f2 = this.f30288h;
        path2.addRoundRect(rectF3, f2, f2, Path.Direction.CW);
        this.f30290j.setFillType(Path.FillType.INVERSE_WINDING);
        if (canvas != null) {
            canvas.clipPath(this.f30290j);
        }
        if (canvas != null) {
            canvas.drawARGB(BogInputLayout.INPUT_NORMAL_STATE, 0, 0, 0);
        }
    }

    public final void setAspect(float f) {
        this.f30291k = f;
    }
}
