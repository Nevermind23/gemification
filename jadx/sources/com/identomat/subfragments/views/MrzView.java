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

public final class MrzView extends View {

    /* renamed from: d */
    private RectF f30309d = new RectF();

    /* renamed from: e */
    private Path f30310e = new Path();

    /* renamed from: f */
    private float f30311f = 3.0f;

    /* renamed from: g */
    private double f30312g;

    /* renamed from: h */
    private double f30313h;

    /* renamed from: i */
    private double f30314i;

    /* renamed from: j */
    private double f30315j;

    /* renamed from: k */
    private double f30316k;

    /* renamed from: l */
    private double f30317l;

    /* renamed from: m */
    private Paint f30318m;

    /* renamed from: n */
    private Paint f30319n;

    /* renamed from: o */
    private Paint f30320o;

    /* renamed from: p */
    private Paint f30321p;

    /* renamed from: q */
    private final float f30322q = 15.0f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MrzView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        m38798a();
    }

    /* renamed from: a */
    private final void m38798a() {
        Paint paint = new Paint();
        this.f30318m = paint;
        paint.setColor(-1);
        Paint paint2 = this.f30318m;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = this.f30318m;
            if (paint3 != null) {
                paint3.setStrokeWidth(5.0f);
                Paint paint4 = new Paint();
                this.f30319n = paint4;
                paint4.setColor(-1);
                Paint paint5 = this.f30319n;
                if (paint5 != null) {
                    paint5.setStyle(Paint.Style.STROKE);
                    Paint paint6 = this.f30319n;
                    if (paint6 != null) {
                        paint6.setStrokeWidth(5.0f);
                        Paint paint7 = new Paint();
                        this.f30320o = paint7;
                        paint7.setColor(Color.argb(50, 0, 0, 0));
                        Paint paint8 = this.f30320o;
                        if (paint8 != null) {
                            paint8.setStyle(Paint.Style.STROKE);
                            Paint paint9 = this.f30320o;
                            if (paint9 != null) {
                                paint9.setStrokeWidth(5.0f);
                                Paint paint10 = new Paint();
                                this.f30321p = paint10;
                                paint10.setColor(Color.argb(100, C11051p3.f31759c, C11051p3.f31759c, C11051p3.f31759c));
                                Paint paint11 = this.f30321p;
                                if (paint11 != null) {
                                    paint11.setStyle(Paint.Style.FILL);
                                    Paint paint12 = this.f30320o;
                                    if (paint12 != null) {
                                        paint12.setStrokeWidth(5.0f);
                                    } else {
                                        C41536l.m120506z("backgroundPaint");
                                        throw null;
                                    }
                                } else {
                                    C41536l.m120506z("docBackBackgroundPaint");
                                    throw null;
                                }
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
    private final void m38799b() {
        double width = ((double) getWidth()) * 0.95d;
        this.f30312g = width;
        this.f30313h = width / ((double) this.f30311f);
        double d = this.f30312g;
        double d2 = (double) 2;
        double width2 = (((double) getWidth()) - d) / d2;
        this.f30314i = width2;
        this.f30317l = width2 + d;
        double d3 = this.f30313h;
        double height = (((double) getHeight()) - d3) / d2;
        this.f30315j = height;
        this.f30316k = height + d3;
        this.f30309d = new RectF((float) this.f30314i, (float) this.f30315j, (float) this.f30317l, (float) this.f30316k);
    }

    public final float getAspect() {
        return this.f30311f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m38799b();
        if (canvas != null) {
            RectF rectF = this.f30309d;
            float f = this.f30322q;
            Paint paint = this.f30318m;
            if (paint != null) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                C41536l.m120506z("docStrokePaint");
                throw null;
            }
        }
        this.f30310e.reset();
        Path path = this.f30310e;
        RectF rectF2 = this.f30309d;
        float f2 = this.f30322q;
        path.addRoundRect(rectF2, f2, f2, Path.Direction.CW);
        this.f30310e.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        if (canvas != null) {
            canvas.clipPath(this.f30310e);
        }
        if (canvas != null) {
            canvas.drawARGB(BogInputLayout.INPUT_NORMAL_STATE, 0, 0, 0);
        }
    }

    public final void setAspect(float f) {
        this.f30311f = f;
    }
}
