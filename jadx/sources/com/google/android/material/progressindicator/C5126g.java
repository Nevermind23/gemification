package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import p026b8.C2170a;
import p158l8.C7014a;

/* renamed from: com.google.android.material.progressindicator.g */
abstract class C5126g extends Drawable implements Animatable {

    /* renamed from: r */
    private static final Property f16403r = new C5129c(Float.class, "growFraction");

    /* renamed from: d */
    final Context f16404d;

    /* renamed from: e */
    final C5116b f16405e;

    /* renamed from: f */
    C7014a f16406f;

    /* renamed from: g */
    private ValueAnimator f16407g;

    /* renamed from: h */
    private ValueAnimator f16408h;

    /* renamed from: i */
    private boolean f16409i;

    /* renamed from: j */
    private boolean f16410j;

    /* renamed from: k */
    private float f16411k;

    /* renamed from: l */
    private List f16412l;

    /* renamed from: m */
    private Animatable2Compat$AnimationCallback f16413m;

    /* renamed from: n */
    private boolean f16414n;

    /* renamed from: o */
    private float f16415o;

    /* renamed from: p */
    final Paint f16416p = new Paint();

    /* renamed from: q */
    private int f16417q;

    /* renamed from: com.google.android.material.progressindicator.g$a */
    class C5127a extends AnimatorListenerAdapter {
        C5127a() {
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C5126g.this.m20074e();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$b */
    class C5128b extends AnimatorListenerAdapter {
        C5128b() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            boolean unused = C5126g.super.setVisible(false, false);
            C5126g.this.m20073d();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.g$c */
    class C5129c extends Property {
        C5129c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C5126g gVar) {
            return Float.valueOf(gVar.mo16799g());
        }

        /* renamed from: b */
        public void set(C5126g gVar, Float f) {
            gVar.mo16800m(f.floatValue());
        }
    }

    C5126g(Context context, C5116b bVar) {
        this.f16404d = context;
        this.f16405e = bVar;
        this.f16406f = new C7014a();
        setAlpha(C11051p3.f31759c);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m20073d() {
        Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = this.f16413m;
        if (animatable2Compat$AnimationCallback != null) {
            animatable2Compat$AnimationCallback.onAnimationEnd(this);
        }
        List<Animatable2Compat$AnimationCallback> list = this.f16412l;
        if (list != null && !this.f16414n) {
            for (Animatable2Compat$AnimationCallback onAnimationEnd : list) {
                onAnimationEnd.onAnimationEnd(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m20074e() {
        Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = this.f16413m;
        if (animatable2Compat$AnimationCallback != null) {
            animatable2Compat$AnimationCallback.onAnimationStart(this);
        }
        List<Animatable2Compat$AnimationCallback> list = this.f16412l;
        if (list != null && !this.f16414n) {
            for (Animatable2Compat$AnimationCallback onAnimationStart : list) {
                onAnimationStart.onAnimationStart(this);
            }
        }
    }

    /* renamed from: f */
    private void m20075f(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f16414n;
        this.f16414n = true;
        for (ValueAnimator end : valueAnimatorArr) {
            end.end();
        }
        this.f16414n = z;
    }

    /* renamed from: k */
    private void m20076k() {
        if (this.f16407g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f16403r, new float[]{Utils.FLOAT_EPSILON, 1.0f});
            this.f16407g = ofFloat;
            ofFloat.setDuration(500);
            this.f16407g.setInterpolator(C2170a.f6351b);
            m20078o(this.f16407g);
        }
        if (this.f16408h == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f16403r, new float[]{1.0f, Utils.FLOAT_EPSILON});
            this.f16408h = ofFloat2;
            ofFloat2.setDuration(500);
            this.f16408h.setInterpolator(C2170a.f6351b);
            m20077n(this.f16408h);
        }
    }

    /* renamed from: n */
    private void m20077n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f16408h;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f16408h = valueAnimator;
            valueAnimator.addListener(new C5128b());
            return;
        }
        throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
    }

    /* renamed from: o */
    private void m20078o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f16407g;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            this.f16407g = valueAnimator;
            valueAnimator.addListener(new C5127a());
            return;
        }
        throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo16799g() {
        if (!this.f16405e.mo16747b() && !this.f16405e.mo16746a()) {
            return 1.0f;
        }
        if (this.f16410j || this.f16409i) {
            return this.f16411k;
        }
        return this.f16415o;
    }

    public int getAlpha() {
        return this.f16417q;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public boolean mo16777h() {
        return mo16784p(false, false, false);
    }

    /* renamed from: i */
    public boolean mo16778i() {
        ValueAnimator valueAnimator = this.f16408h;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f16410j;
    }

    public boolean isRunning() {
        return mo16780j() || mo16778i();
    }

    /* renamed from: j */
    public boolean mo16780j() {
        ValueAnimator valueAnimator = this.f16407g;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f16409i;
    }

    /* renamed from: l */
    public void mo16782l(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        if (this.f16412l == null) {
            this.f16412l = new ArrayList();
        }
        if (!this.f16412l.contains(animatable2Compat$AnimationCallback)) {
            this.f16412l.add(animatable2Compat$AnimationCallback);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo16800m(float f) {
        if (this.f16415o != f) {
            this.f16415o = f;
            invalidateSelf();
        }
    }

    /* renamed from: p */
    public boolean mo16784p(boolean z, boolean z2, boolean z3) {
        boolean z4;
        float a = this.f16406f.mo21227a(this.f16404d.getContentResolver());
        if (!z3 || a <= Utils.FLOAT_EPSILON) {
            z4 = false;
        } else {
            z4 = true;
        }
        return mo16785q(z, z2, z4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo16785q(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        boolean z4;
        boolean z5;
        m20076k();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f16407g;
        } else {
            valueAnimator = this.f16408h;
        }
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m20075f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (!z || super.setVisible(z, false)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z) {
                z5 = this.f16405e.mo16747b();
            } else {
                z5 = this.f16405e.mo16746a();
            }
            if (!z5) {
                m20075f(valueAnimator);
                return z4;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z4;
        }
    }

    /* renamed from: r */
    public boolean mo16786r(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        List list = this.f16412l;
        if (list == null || !list.contains(animatable2Compat$AnimationCallback)) {
            return false;
        }
        this.f16412l.remove(animatable2Compat$AnimationCallback);
        if (!this.f16412l.isEmpty()) {
            return true;
        }
        this.f16412l = null;
        return true;
    }

    public void setAlpha(int i) {
        this.f16417q = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f16416p.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public boolean setVisible(boolean z, boolean z2) {
        return mo16784p(z, z2, true);
    }

    public void start() {
        mo16785q(true, true, false);
    }

    public void stop() {
        mo16785q(false, true, false);
    }
}
