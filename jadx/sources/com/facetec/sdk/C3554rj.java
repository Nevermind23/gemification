package com.facetec.sdk;

import android.animation.ValueAnimator;
import android.content.Context;

/* renamed from: com.facetec.sdk.rj */
public final /* synthetic */ class C3554rj implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C2983e f11472d;

    /* renamed from: e */
    public final /* synthetic */ Context f11473e;

    /* renamed from: f */
    public final /* synthetic */ float f11474f;

    public /* synthetic */ C3554rj(C2983e eVar, Context context, float f) {
        this.f11472d = eVar;
        this.f11473e = context;
        this.f11474f = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11472d.m12580e(this.f11473e, this.f11474f, valueAnimator);
    }
}
