package com.identomat.subfragments.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0767a;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

public final class DocumentView extends View {

    /* renamed from: A */
    private float f30252A;

    /* renamed from: B */
    private float f30253B;

    /* renamed from: C */
    private C43064a f30254C;

    /* renamed from: d */
    private int f30255d;

    /* renamed from: e */
    private int f30256e;

    /* renamed from: f */
    private float f30257f = 1.558f;

    /* renamed from: g */
    private boolean f30258g;

    /* renamed from: h */
    private boolean f30259h;

    /* renamed from: i */
    private RectF f30260i = new RectF();

    /* renamed from: j */
    private RectF f30261j = new RectF();

    /* renamed from: k */
    private RectF f30262k = new RectF();

    /* renamed from: l */
    private Path f30263l = new Path();

    /* renamed from: m */
    private double f30264m;

    /* renamed from: n */
    private double f30265n;

    /* renamed from: o */
    private double f30266o = 0.95d;

    /* renamed from: p */
    private double f30267p;

    /* renamed from: q */
    private double f30268q;

    /* renamed from: r */
    private double f30269r;

    /* renamed from: s */
    private double f30270s;

    /* renamed from: t */
    private Paint f30271t;

    /* renamed from: u */
    private Paint f30272u;

    /* renamed from: v */
    private Paint f30273v;

    /* renamed from: w */
    private Paint f30274w;

    /* renamed from: x */
    private final float f30275x = 15.0f;

    /* renamed from: y */
    private float f30276y;

    /* renamed from: z */
    private float f30277z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocumentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attrs");
        m38778c();
    }

    /* renamed from: a */
    private final void m38776a(Canvas canvas) {
        if (this.f30255d != 5) {
            Paint paint = this.f30271t;
            if (paint != null) {
                paint.setStrokeWidth(7.0f);
                double d = this.f30268q;
                double d2 = this.f30265n;
                double d3 = (d2 / 1.78d) + d;
                if (this.f30255d == 3) {
                    d3 = d + (d2 / 1.33d);
                }
                double d4 = this.f30267p;
                double d5 = this.f30264m + d4;
                if (canvas != null) {
                    float f = (float) d4;
                    float f2 = (float) d3;
                    float f3 = (float) d5;
                    Paint paint2 = this.f30272u;
                    if (paint2 != null) {
                        canvas.drawLine(f, f2, f3, f2, paint2);
                    } else {
                        C41536l.m120506z("docStrokeWhitePaint");
                        throw null;
                    }
                }
                RectF rectF = new RectF((float) this.f30267p, (float) d3, (float) this.f30270s, (float) this.f30269r);
                if (canvas != null) {
                    float f4 = this.f30275x;
                    Paint paint3 = this.f30274w;
                    if (paint3 != null) {
                        canvas.drawRoundRect(rectF, f4, f4, paint3);
                    } else {
                        C41536l.m120506z("docBackBackgroundPaint");
                        throw null;
                    }
                }
            } else {
                C41536l.m120506z("docStrokePaint");
                throw null;
            }
        }
    }

    /* renamed from: b */
    private final void m38777b(Canvas canvas) {
        Paint paint = this.f30271t;
        if (paint != null) {
            paint.setStrokeWidth(2.0f);
            if (canvas != null) {
                RectF rectF = this.f30262k;
                Paint paint2 = this.f30271t;
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, 2.0f, 2.0f, paint2);
                } else {
                    C41536l.m120506z("docStrokePaint");
                    throw null;
                }
            }
        } else {
            C41536l.m120506z("docStrokePaint");
            throw null;
        }
    }

    /* renamed from: c */
    private final void m38778c() {
        Paint paint = new Paint();
        this.f30271t = paint;
        paint.setColor(-1);
        Paint paint2 = this.f30271t;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
            Paint paint3 = this.f30271t;
            if (paint3 != null) {
                paint3.setStrokeWidth(5.0f);
                Paint paint4 = new Paint();
                this.f30272u = paint4;
                paint4.setColor(-1);
                Paint paint5 = this.f30272u;
                if (paint5 != null) {
                    paint5.setStyle(Paint.Style.STROKE);
                    Paint paint6 = this.f30272u;
                    if (paint6 != null) {
                        paint6.setStrokeWidth(5.0f);
                        Paint paint7 = new Paint();
                        this.f30273v = paint7;
                        paint7.setColor(Color.argb(50, 0, 0, 0));
                        Paint paint8 = this.f30273v;
                        if (paint8 != null) {
                            paint8.setStyle(Paint.Style.STROKE);
                            Paint paint9 = this.f30273v;
                            if (paint9 != null) {
                                paint9.setStrokeWidth(5.0f);
                                Paint paint10 = new Paint();
                                this.f30274w = paint10;
                                paint10.setColor(Color.argb(100, C11051p3.f31759c, C11051p3.f31759c, C11051p3.f31759c));
                                Paint paint11 = this.f30274w;
                                if (paint11 != null) {
                                    paint11.setStyle(Paint.Style.FILL);
                                    Paint paint12 = this.f30273v;
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

    /* renamed from: d */
    private final void m38779d(int i, int i2) {
        double d;
        double d2 = (double) i;
        double d3 = this.f30266o * d2;
        this.f30264m = d3;
        double d4 = d3 / ((double) this.f30257f);
        this.f30265n = d4;
        double d5 = (double) 2;
        double d6 = (d2 - d3) / d5;
        this.f30267p = d6;
        this.f30270s = d6 + d3;
        if (this.f30259h) {
            d = ((double) i2) / 2.0d;
        } else {
            d = (((double) i2) - d4) / d5;
        }
        this.f30268q = d;
        this.f30269r = d + d4;
        this.f30260i = new RectF((float) this.f30267p, (float) this.f30268q, (float) this.f30270s, (float) this.f30269r);
        double d7 = this.f30268q;
        this.f30276y = (float) d7;
        this.f30277z = (float) this.f30269r;
        if (this.f30259h) {
            RectF rectF = new RectF((float) this.f30267p, (float) (d7 - this.f30265n), (float) this.f30270s, (float) d7);
            this.f30261j = rectF;
            this.f30276y = rectF.top;
            this.f30277z = (float) this.f30269r;
        }
        float f = this.f30277z - this.f30276y;
        this.f30252A = f;
        this.f30253B = ((float) i) / f;
        double d8 = this.f30264m;
        double d9 = (d8 / ((double) 10)) * 2.8d;
        double d12 = (double) 4;
        double d13 = (d9 * d12) / ((double) 3);
        double d14 = this.f30267p + (d8 / ((double) 30));
        double d15 = d9 + d14;
        double d16 = this.f30268q;
        double d17 = this.f30265n;
        double d18 = (d17 / d12) + d16;
        int i3 = this.f30255d;
        if (i3 == 3 || i3 == 4) {
            d18 = d16 + (d17 / ((double) 6));
        }
        this.f30262k = new RectF((float) d14, (float) d18, (float) d15, (float) (d13 + d18));
    }

    /* renamed from: f */
    public static /* synthetic */ void m38780f(DocumentView documentView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        documentView.mo27337e(i, z);
    }

    /* renamed from: e */
    public final void mo27337e(int i, boolean z) {
        this.f30255d = i;
        if (i == 3) {
            this.f30257f = 1.33f;
            this.f30259h = z;
        }
        if (i == 6) {
            this.f30258g = true;
            this.f30257f = 0.9f;
        }
        invalidate();
    }

    public final int getDocument() {
        return this.f30255d;
    }

    public final C43064a getOnMeasureCallBack() {
        return this.f30254C;
    }

    public final float getPanelAspect() {
        return this.f30253B;
    }

    public final float getPanelBottom() {
        return this.f30277z;
    }

    public final float getPanelHeight() {
        return this.f30252A;
    }

    public final float getPanelTop() {
        return this.f30276y;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            RectF rectF = this.f30260i;
            float f = this.f30275x;
            Paint paint = this.f30271t;
            if (paint != null) {
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                C41536l.m120506z("docStrokePaint");
                throw null;
            }
        }
        if (canvas != null) {
            RectF rectF2 = this.f30261j;
            float f2 = this.f30275x;
            Paint paint2 = this.f30271t;
            if (paint2 != null) {
                canvas.drawRoundRect(rectF2, f2, f2, paint2);
            } else {
                C41536l.m120506z("docStrokePaint");
                throw null;
            }
        }
        if (!this.f30258g) {
            if (this.f30256e == 0) {
                if (this.f30255d != 4) {
                    m38777b(canvas);
                    if (this.f30255d == 3) {
                        m38776a(canvas);
                    }
                }
            } else if (this.f30255d != 1) {
                m38776a(canvas);
            }
        }
        this.f30263l.reset();
        Path path = this.f30263l;
        RectF rectF3 = this.f30260i;
        float f3 = this.f30275x;
        path.addRoundRect(rectF3, f3, f3, Path.Direction.CW);
        if (this.f30259h) {
            Path path2 = this.f30263l;
            RectF rectF4 = this.f30261j;
            float f4 = this.f30275x;
            path2.addRoundRect(rectF4, f4, f4, Path.Direction.CW);
        }
        this.f30263l.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        if (canvas != null) {
            canvas.clipPath(this.f30263l);
        }
        if (canvas != null) {
            canvas.drawARGB(C11051p3.f31759c, 0, 0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m38779d(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        C43064a aVar = this.f30254C;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setOnMeasureCallBack(C43064a aVar) {
        this.f30254C = aVar;
    }

    public final void setPanelAspect(float f) {
        this.f30253B = f;
    }

    public final void setPanelBottom(float f) {
        this.f30277z = f;
    }

    public final void setPanelHeight(float f) {
        this.f30252A = f;
    }

    public final void setPanelTop(float f) {
        this.f30276y = f;
    }

    public final void setSide(int i) {
        this.f30256e = i;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        Paint paint = this.f30271t;
        if (paint != null) {
            paint.setColor(C0767a.m2893c(getContext(), i));
            invalidate();
            return;
        }
        C41536l.m120506z("docStrokePaint");
        throw null;
    }
}
