package com.facetec.sdk;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facetec.sdk.bb */
class C2828bb extends C2916cu {

    /* renamed from: d */
    Paint f9072d;

    /* renamed from: k */
    private final Matrix f9073k = new Matrix();

    /* renamed from: m */
    private Drawable f9074m;

    /* renamed from: o */
    private final Context f9075o;

    /* renamed from: p */
    private boolean f9076p = false;

    /* renamed from: q */
    private float f9077q = Utils.FLOAT_EPSILON;

    /* renamed from: r */
    private float f9078r = Utils.FLOAT_EPSILON;

    /* renamed from: s */
    private int f9079s = -1;

    /* renamed from: t */
    private final float[] f9080t = new float[9];

    public C2828bb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9075o = context;
        post(new C3451n2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m11057a(ValueAnimator valueAnimator) {
        Drawable drawable = this.f9074m;
        if (drawable != null) {
            drawable.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11058b(ValueAnimator valueAnimator) {
        Paint paint = this.f9772b;
        if (paint != null) {
            paint.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11060d(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{255, i});
        ofInt.setDuration((long) i2);
        ofInt.addUpdateListener(new C3693y2(this));
        ofInt.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m11065g(ValueAnimator valueAnimator) {
        Paint paint = this.f9072d;
        if (paint != null) {
            paint.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8904c() {
        postDelayed(new C3474o2(this, 1000), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8905e() {
        postDelayed(new C3495p2(this), 0);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.f9074m;
        if (drawable != null) {
            drawable.draw(canvas);
            if (this.f9076p && this.f9775e != null && this.f9777g != null && this.f9778h != null && this.f9072d != null && this.f9771a != null && this.f9772b != null) {
                canvas.concat(this.f9073k);
                canvas.drawOval(this.f9775e, this.f9771a);
                canvas.drawOval(this.f9778h, this.f9072d);
                canvas.drawOval(this.f9777g, this.f9772b);
                return;
            }
            return;
        }
        canvas.drawColor(C2938dc.m12312b(C2938dc.m12435k(this.f9075o), (int) C11051p3.f31759c));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        if (width != this.f9079s) {
            if (this.f9074m == null) {
                Drawable q = C2938dc.m12448q(this.f9075o);
                this.f9074m = q;
                q.setAlpha(C11051p3.f31759c);
            }
            this.f9074m.setBounds(0, 0, getWidth(), getHeight());
            if (this.f9079s != -1) {
                mo9060b(true);
            }
            this.f9079s = width;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m11059c(ValueAnimator valueAnimator) {
        Paint paint = this.f9772b;
        if (paint != null) {
            paint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11063e(int i, ValueAnimator valueAnimator) {
        if (this.f9074m != null) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f9074m.setColorFilter(C2938dc.m12405e(i, floatValue), PorterDuff.Mode.SRC_ATOP);
            double d = (double) floatValue;
            if (d == Utils.DOUBLE_EPSILON || d == 1.0d) {
                if (d == 1.0d) {
                    C2938dc.m12411e(this.f9074m, i);
                }
                this.f9074m.setColorFilter((ColorFilter) null);
            }
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m11066k() {
        setLayerType(2, (Paint) null);
        Paint paint = new Paint(1);
        this.f9072d = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f9072d.setColor(C2938dc.m12440m(this.f9075o));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m11069m() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f9077q, 0.0f});
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.setDuration(800);
        ofFloat.addUpdateListener(new C3672x2(this));
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m11071n() {
        int color = this.f9072d.getColor();
        int m = C2938dc.m12440m(this.f9075o);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color), Integer.valueOf(m)});
        ofObject.setDuration(1000);
        ofObject.addUpdateListener(new C3607u2(this));
        ofObject.start();
        int color2 = this.f9772b.getColor();
        int o = C2938dc.m12444o(this.f9075o);
        ValueAnimator ofObject2 = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(color2), Integer.valueOf(o)});
        ofObject2.setDuration(1000);
        ofObject2.addUpdateListener(new C3630v2(this));
        ofObject2.start();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 1.0f});
        int K = C2938dc.m12232K();
        ofFloat.setDuration(1000);
        ofFloat.addUpdateListener(new C3651w2(this, K));
        ofFloat.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8902a() {
        this.f9076p = true;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8903b() {
        this.f9076p = true;
        float e = ((float) getResources().getDisplayMetrics().widthPixels) * C2938dc.m12404e();
        this.f9077q = e;
        this.f9073k.setTranslate(e, Utils.FLOAT_EPSILON);
        post(new C3537r2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11061d(ValueAnimator valueAnimator) {
        Paint paint = this.f9072d;
        if (paint != null) {
            paint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            postInvalidateOnAnimation();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8906e(int i, int i2, int i3) {
        postDelayed(new C3516q2(this, i, i2), (long) i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11062e(int i) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{255, C2938dc.m12374c(this.f9075o, FaceTecSDK.f8630e.f8606i.readyScreenOvalFillColor)});
        long j = (long) i;
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C3565s2(this));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{255, C2938dc.m12374c(this.f9075o, FaceTecSDK.f8630e.f8610m.strokeColor)});
        ofInt2.setDuration(j);
        ofInt2.addUpdateListener(new C3586t2(this));
        ofInt.start();
        ofInt2.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11064e(ValueAnimator valueAnimator) {
        Matrix matrix = this.f9073k;
        if (matrix != null) {
            matrix.getValues(this.f9080t);
            float f = -((valueAnimator.getAnimatedFraction() * this.f9077q) - (this.f9077q - this.f9080t[2]));
            this.f9078r = f;
            this.f9073k.postTranslate(f, Utils.FLOAT_EPSILON);
            postInvalidateOnAnimation();
        }
    }
}
