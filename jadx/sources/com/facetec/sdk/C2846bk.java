package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.Random;

/* renamed from: com.facetec.sdk.bk */
final class C2846bk extends View {

    /* renamed from: a */
    int f9228a;

    /* renamed from: b */
    int f9229b;

    /* renamed from: c */
    Paint f9230c;

    /* renamed from: d */
    C2847b f9231d = C2847b.DEFAULT;

    /* renamed from: e */
    float f9232e;

    /* renamed from: f */
    private final Context f9233f;

    /* renamed from: g */
    private boolean f9234g = false;

    /* renamed from: h */
    private RectF f9235h;

    /* renamed from: i */
    float f9236i;

    /* renamed from: j */
    private boolean f9237j = false;

    /* renamed from: l */
    private float f9238l;

    /* renamed from: m */
    private Paint f9239m;

    /* renamed from: o */
    private float f9240o;

    /* renamed from: com.facetec.sdk.bk$b */
    enum C2847b {
        DEFAULT,
        SMALL_FOR_OVERZOOMED
    }

    public C2846bk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9233f = context;
        post(new C3186h6(this));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        RectF rectF;
        Paint paint;
        canvas.drawColor(C2938dc.m12312b(C2938dc.m12313b(this.f9233f), (int) C11051p3.f31759c));
        if (this.f9237j && (rectF = this.f9235h) != null && (paint = this.f9239m) != null && this.f9230c != null) {
            int i = this.f9229b;
            canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
            RectF rectF2 = this.f9235h;
            int i2 = this.f9229b;
            canvas.drawRoundRect(rectF2, (float) i2, (float) i2, this.f9230c);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo8961b(true);
        mo8960a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8960a() {
        this.f9237j = true;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo8961b(boolean z) {
        if (!this.f9234g || z) {
            this.f9234g = true;
            int width = getWidth();
            int height = getHeight();
            float f = (float) width;
            float d = (f - (((float) C2938dc.m12393d()) * 2.0f)) * m11424b();
            float f2 = (float) height;
            float f3 = (f2 - (0.632f * d)) / 2.0f;
            float f4 = (f - d) / 2.0f;
            m11430d(f4);
            RectF rectF = new RectF();
            this.f9235h = rectF;
            rectF.set(f4, f3, f - f4, f2 - f3);
            C2780ai.f8829f = this.f9235h.centerX();
            C2780ai.f8830g = this.f9235h.centerY();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m11427c() {
        this.f9229b = Math.round(C2810ax.m10988b(C2938dc.m12228G()) * C2938dc.m12404e());
        this.f9228a = Math.round(C2810ax.m10988b(C2938dc.m12447q()) * C2938dc.m12404e());
        m11430d((float) C2938dc.m12393d());
        setLayerType(1, (Paint) null);
        Paint paint = new Paint(1);
        this.f9239m = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f9239m.setAlpha(0);
        this.f9239m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(2, (Paint) null);
        Paint paint2 = new Paint(1);
        this.f9230c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f9230c.setStrokeWidth((float) Math.round((float) this.f9228a));
        this.f9230c.setColor(C2938dc.m12248a(this.f9233f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final RectF mo8964e() {
        if (this.f9235h == null) {
            mo8961b(false);
        }
        return this.f9235h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo8962c(Runnable runnable) {
        C3409m6 m6Var = new C3409m6(this, runnable);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f9236i, this.f9238l});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new C3455n6(this));
        ofFloat.addListener(new C3478o6(m6Var));
        ofFloat.start();
    }

    /* renamed from: e */
    private RectF m11435e(float f) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float f2 = (height - ((width - (f * 2.0f)) * 0.632f)) / 2.0f;
        return new RectF(f, f2, width - f, height - f2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11436e(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f9236i = floatValue;
        this.f9235h = m11435e(floatValue);
        mo8960a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m11429c(Runnable runnable, Animator animator) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m11438e(Runnable runnable, Animator animator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) this.f9228a, 0.0f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addUpdateListener(new C3208i6(this));
        ofFloat.addListener(new C3230j6(runnable));
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m11425b(ValueAnimator valueAnimator) {
        this.f9230c.setStrokeWidth(((Float) valueAnimator.getAnimatedValue()).floatValue());
        mo8960a();
    }

    /* renamed from: d */
    private void m11430d(float f) {
        this.f9232e = f;
        this.f9238l = f / 1.5f;
        this.f9240o = ((float) getWidth()) / 2.0f;
        this.f9236i = this.f9232e;
    }

    /* renamed from: b */
    private float m11424b() {
        if (this.f9231d != C2847b.SMALL_FOR_OVERZOOMED) {
            return 1.0f;
        }
        return 1.0f / (((((float) new Random().nextInt(Math.round(0.050000004f) + 1)) / 100.0f) + 0.1f) + 1.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11431d(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f9236i = floatValue;
        this.f9235h = m11435e(floatValue);
        this.f9229b = Math.min(Math.round(((((float) getWidth()) - (this.f9236i * 2.0f)) * 0.632f) / 2.0f), this.f9229b);
        mo8960a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m11434d(Runnable runnable, Animator animator) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m11433d(Runnable runnable) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f9236i, this.f9240o});
        ofFloat.setDuration(400);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.addUpdateListener(new C3287k6(this));
        ofFloat.addListener(new C3337l6(this, runnable));
        ofFloat.start();
    }
}
