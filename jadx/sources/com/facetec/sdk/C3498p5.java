package com.facetec.sdk;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;

/* renamed from: com.facetec.sdk.p5 */
public final /* synthetic */ class C3498p5 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C2831bd f11363d;

    /* renamed from: e */
    public final /* synthetic */ GradientDrawable f11364e;

    /* renamed from: f */
    public final /* synthetic */ int f11365f;

    public /* synthetic */ C3498p5(C2831bd bdVar, GradientDrawable gradientDrawable, int i) {
        this.f11363d = bdVar;
        this.f11364e = gradientDrawable;
        this.f11365f = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11363d.m11248d(this.f11364e, this.f11365f, valueAnimator);
    }
}
