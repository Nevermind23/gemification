package com.facetec.sdk;

import android.animation.ValueAnimator;
import android.content.Context;

/* renamed from: com.facetec.sdk.qj */
public final /* synthetic */ class C3533qj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C2983e f11416d;

    /* renamed from: e */
    public final /* synthetic */ Context f11417e;

    public /* synthetic */ C3533qj(C2983e eVar, Context context) {
        this.f11416d = eVar;
        this.f11417e = context;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11416d.m12577d(this.f11417e, valueAnimator);
    }
}
