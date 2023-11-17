package com.google.android.material.progressindicator;

import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;

/* renamed from: com.google.android.material.progressindicator.i */
abstract class C5131i {

    /* renamed from: a */
    protected C5132j f16422a;

    /* renamed from: b */
    protected final float[] f16423b;

    /* renamed from: c */
    protected final int[] f16424c;

    protected C5131i(int i) {
        this.f16423b = new float[(i * 2)];
        this.f16424c = new int[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo16754a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo16809b(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    /* renamed from: c */
    public abstract void mo16755c();

    /* renamed from: d */
    public abstract void mo16756d(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo16810e(C5132j jVar) {
        this.f16422a = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo16757f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo16758g();

    /* renamed from: h */
    public abstract void mo16759h();
}
