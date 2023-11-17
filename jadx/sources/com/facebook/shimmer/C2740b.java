package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: com.facebook.shimmer.b */
public final class C2740b extends Drawable {

    /* renamed from: a */
    private final ValueAnimator.AnimatorUpdateListener f8582a = new C2741a();

    /* renamed from: b */
    private final Paint f8583b;

    /* renamed from: c */
    private final Rect f8584c;

    /* renamed from: d */
    private final Matrix f8585d;

    /* renamed from: e */
    private ValueAnimator f8586e;

    /* renamed from: f */
    private C2736a f8587f;

    /* renamed from: com.facebook.shimmer.b$a */
    class C2741a implements ValueAnimator.AnimatorUpdateListener {
        C2741a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C2740b.this.invalidateSelf();
        }
    }

    public C2740b() {
        Paint paint = new Paint();
        this.f8583b = paint;
        this.f8584c = new Rect();
        this.f8585d = new Matrix();
        paint.setAntiAlias(true);
    }

    /* renamed from: c */
    private float m10639c(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r12v1, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v9, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10640g() {
        /*
            r19 = this;
            r0 = r19
            android.graphics.Rect r1 = r19.getBounds()
            int r2 = r1.width()
            int r1 = r1.height()
            if (r2 == 0) goto L_0x0078
            if (r1 == 0) goto L_0x0078
            com.facebook.shimmer.a r3 = r0.f8587f
            if (r3 != 0) goto L_0x0017
            goto L_0x0078
        L_0x0017:
            int r2 = r3.mo8665d(r2)
            com.facebook.shimmer.a r3 = r0.f8587f
            int r1 = r3.mo8662a(r1)
            com.facebook.shimmer.a r3 = r0.f8587f
            int r4 = r3.f8566g
            r5 = 1
            if (r4 == r5) goto L_0x004c
            int r3 = r3.f8563d
            r4 = 0
            if (r3 == r5) goto L_0x0032
            r6 = 3
            if (r3 != r6) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r5 == 0) goto L_0x0035
            r2 = r4
        L_0x0035:
            if (r5 == 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = r4
        L_0x0039:
            android.graphics.LinearGradient r11 = new android.graphics.LinearGradient
            r4 = 0
            r5 = 0
            float r6 = (float) r2
            float r7 = (float) r1
            com.facebook.shimmer.a r1 = r0.f8587f
            int[] r8 = r1.f8561b
            float[] r9 = r1.f8560a
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.CLAMP
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0073
        L_0x004c:
            android.graphics.RadialGradient r11 = new android.graphics.RadialGradient
            float r3 = (float) r2
            r4 = 1073741824(0x40000000, float:2.0)
            float r13 = r3 / r4
            float r3 = (float) r1
            float r14 = r3 / r4
            int r1 = java.lang.Math.max(r2, r1)
            double r1 = (double) r1
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r3 = java.lang.Math.sqrt(r3)
            double r1 = r1 / r3
            float r15 = (float) r1
            com.facebook.shimmer.a r1 = r0.f8587f
            int[] r2 = r1.f8561b
            float[] r1 = r1.f8560a
            android.graphics.Shader$TileMode r18 = android.graphics.Shader.TileMode.CLAMP
            r12 = r11
            r16 = r2
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0073:
            android.graphics.Paint r1 = r0.f8583b
            r1.setShader(r11)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.C2740b.m10640g():void");
    }

    /* renamed from: h */
    private void m10641h() {
        boolean z;
        if (this.f8587f != null) {
            ValueAnimator valueAnimator = this.f8586e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                this.f8586e.cancel();
                this.f8586e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            C2736a aVar = this.f8587f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (aVar.f8580u / aVar.f8579t)) + 1.0f});
            this.f8586e = ofFloat;
            ofFloat.setRepeatMode(this.f8587f.f8578s);
            this.f8586e.setRepeatCount(this.f8587f.f8577r);
            ValueAnimator valueAnimator2 = this.f8586e;
            C2736a aVar2 = this.f8587f;
            valueAnimator2.setDuration(aVar2.f8579t + aVar2.f8580u);
            this.f8586e.addUpdateListener(this.f8582a);
            if (z) {
                this.f8586e.start();
            }
        }
    }

    /* renamed from: a */
    public boolean mo8691a() {
        ValueAnimator valueAnimator = this.f8586e;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8692b() {
        C2736a aVar;
        ValueAnimator valueAnimator = this.f8586e;
        if (valueAnimator != null && !valueAnimator.isStarted() && (aVar = this.f8587f) != null && aVar.f8575p && getCallback() != null) {
            this.f8586e.start();
        }
    }

    /* renamed from: d */
    public void mo8693d(C2736a aVar) {
        PorterDuff.Mode mode;
        this.f8587f = aVar;
        if (aVar != null) {
            Paint paint = this.f8583b;
            if (this.f8587f.f8576q) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        m10640g();
        m10641h();
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        float c;
        if (this.f8587f != null && this.f8583b.getShader() != null) {
            float tan = (float) Math.tan(Math.toRadians((double) this.f8587f.f8573n));
            float height = ((float) this.f8584c.height()) + (((float) this.f8584c.width()) * tan);
            float width = ((float) this.f8584c.width()) + (tan * ((float) this.f8584c.height()));
            ValueAnimator valueAnimator = this.f8586e;
            float f3 = Utils.FLOAT_EPSILON;
            if (valueAnimator != null) {
                f = valueAnimator.getAnimatedFraction();
            } else {
                f = 0.0f;
            }
            int i = this.f8587f.f8563d;
            if (i != 1) {
                if (i == 2) {
                    c = m10639c(width, -width, f);
                } else if (i != 3) {
                    c = m10639c(-width, width, f);
                } else {
                    f2 = m10639c(height, -height, f);
                }
                f3 = c;
                f2 = 0.0f;
            } else {
                f2 = m10639c(-height, height, f);
            }
            this.f8585d.reset();
            this.f8585d.setRotate(this.f8587f.f8573n, ((float) this.f8584c.width()) / 2.0f, ((float) this.f8584c.height()) / 2.0f);
            this.f8585d.postTranslate(f3, f2);
            this.f8583b.getShader().setLocalMatrix(this.f8585d);
            canvas.drawRect(this.f8584c, this.f8583b);
        }
    }

    /* renamed from: e */
    public void mo8695e() {
        if (this.f8586e != null && !mo8691a() && getCallback() != null) {
            this.f8586e.start();
        }
    }

    /* renamed from: f */
    public void mo8696f() {
        if (this.f8586e != null && mo8691a()) {
            this.f8586e.cancel();
        }
    }

    public int getOpacity() {
        C2736a aVar = this.f8587f;
        return (aVar == null || (!aVar.f8574o && !aVar.f8576q)) ? -1 : -3;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f8584c.set(0, 0, rect.width(), rect.height());
        m10640g();
        mo8692b();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
