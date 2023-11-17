package com.facetec.sdk;

import android.animation.ValueAnimator;

/* renamed from: com.facetec.sdk.w2 */
public final /* synthetic */ class C3651w2 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C2828bb f11666d;

    /* renamed from: e */
    public final /* synthetic */ int f11667e;

    public /* synthetic */ C3651w2(C2828bb bbVar, int i) {
        this.f11666d = bbVar;
        this.f11667e = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11666d.m11063e(this.f11667e, valueAnimator);
    }
}
