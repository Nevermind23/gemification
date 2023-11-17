package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import com.github.mikephil.charting.utils.Utils;
import p026b8.C2172c;
import p080f8.C6170a;
import p124j0.C6633b;

/* renamed from: com.google.android.material.progressindicator.d */
final class C5118d extends C5131i {

    /* renamed from: l */
    private static final int[] f16379l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    private static final int[] f16380m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    private static final int[] f16381n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    private static final Property f16382o;

    /* renamed from: p */
    private static final Property f16383p;

    /* renamed from: d */
    private ObjectAnimator f16384d;

    /* renamed from: e */
    private ObjectAnimator f16385e;

    /* renamed from: f */
    private final C6633b f16386f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5116b f16387g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f16388h = 0;

    /* renamed from: i */
    private float f16389i;

    /* renamed from: j */
    private float f16390j;

    /* renamed from: k */
    Animatable2Compat$AnimationCallback f16391k = null;

    /* renamed from: com.google.android.material.progressindicator.d$a */
    class C5119a extends AnimatorListenerAdapter {
        C5119a() {
        }

        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C5118d dVar = C5118d.this;
            int unused = dVar.f16388h = (dVar.f16388h + 4) % C5118d.this.f16387g.f16371c.length;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$b */
    class C5120b extends AnimatorListenerAdapter {
        C5120b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C5118d.this.mo16754a();
            C5118d dVar = C5118d.this;
            Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = dVar.f16391k;
            if (animatable2Compat$AnimationCallback != null) {
                animatable2Compat$AnimationCallback.onAnimationEnd(dVar.f16422a);
            }
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$c */
    class C5121c extends Property {
        C5121c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C5118d dVar) {
            return Float.valueOf(dVar.m20032o());
        }

        /* renamed from: b */
        public void set(C5118d dVar, Float f) {
            dVar.mo16761t(f.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$d */
    class C5122d extends Property {
        C5122d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C5118d dVar) {
            return Float.valueOf(dVar.m20033p());
        }

        /* renamed from: b */
        public void set(C5118d dVar, Float f) {
            dVar.m20036u(f.floatValue());
        }
    }

    static {
        Class<Float> cls = Float.class;
        f16382o = new C5121c(cls, "animationFraction");
        f16383p = new C5122d(cls, "completeEndFraction");
    }

    public C5118d(C5123e eVar) {
        super(1);
        this.f16387g = eVar;
        this.f16386f = new C6633b();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public float m20032o() {
        return this.f16389i;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public float m20033p() {
        return this.f16390j;
    }

    /* renamed from: q */
    private void m20034q() {
        if (this.f16384d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f16382o, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f16384d = ofFloat;
            ofFloat.setDuration(5400);
            this.f16384d.setInterpolator((TimeInterpolator) null);
            this.f16384d.setRepeatCount(-1);
            this.f16384d.addListener(new C5119a());
        }
        if (this.f16385e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f16383p, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f16385e = ofFloat2;
            ofFloat2.setDuration(333);
            this.f16385e.setInterpolator(this.f16386f);
            this.f16385e.addListener(new C5120b());
        }
    }

    /* renamed from: r */
    private void m20035r(int i) {
        int i2 = 0;
        while (i2 < 4) {
            float b = mo16809b(i, f16381n[i2], 333);
            if (b < Utils.FLOAT_EPSILON || b > 1.0f) {
                i2++;
            } else {
                int i3 = i2 + this.f16388h;
                int[] iArr = this.f16387g.f16371c;
                int length = i3 % iArr.length;
                this.f16424c[0] = C2172c.m8294b().evaluate(this.f16386f.getInterpolation(b), Integer.valueOf(C6170a.m24580a(iArr[length], this.f16422a.getAlpha())), Integer.valueOf(C6170a.m24580a(this.f16387g.f16371c[(length + 1) % iArr.length], this.f16422a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m20036u(float f) {
        this.f16390j = f;
    }

    /* renamed from: v */
    private void m20037v(int i) {
        float[] fArr = this.f16423b;
        float f = this.f16389i;
        fArr[0] = (f * 1520.0f) - 0.21875f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float b = mo16809b(i, f16379l[i2], 667);
            float[] fArr2 = this.f16423b;
            fArr2[1] = fArr2[1] + (this.f16386f.getInterpolation(b) * 250.0f);
            float b2 = mo16809b(i, f16380m[i2], 667);
            float[] fArr3 = this.f16423b;
            fArr3[0] = fArr3[0] + (this.f16386f.getInterpolation(b2) * 250.0f);
        }
        float[] fArr4 = this.f16423b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f16390j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16754a() {
        ObjectAnimator objectAnimator = this.f16384d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    public void mo16755c() {
        mo16760s();
    }

    /* renamed from: d */
    public void mo16756d(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        this.f16391k = animatable2Compat$AnimationCallback;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16757f() {
        ObjectAnimator objectAnimator = this.f16385e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f16422a.isVisible()) {
                this.f16385e.start();
            } else {
                mo16754a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16758g() {
        m20034q();
        mo16760s();
        this.f16384d.start();
    }

    /* renamed from: h */
    public void mo16759h() {
        this.f16391k = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo16760s() {
        this.f16388h = 0;
        this.f16424c[0] = C6170a.m24580a(this.f16387g.f16371c[0], this.f16422a.getAlpha());
        this.f16390j = Utils.FLOAT_EPSILON;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo16761t(float f) {
        this.f16389i = f;
        int i = (int) (f * 5400.0f);
        m20037v(i);
        m20035r(i);
        this.f16422a.invalidateSelf();
    }
}
