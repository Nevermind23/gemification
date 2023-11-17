package com.facetec.sdk;

import android.animation.ValueAnimator;
import com.facetec.sdk.C2836be;

/* renamed from: com.facetec.sdk.t5 */
public final /* synthetic */ class C3589t5 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C2836be f11537d;

    /* renamed from: e */
    public final /* synthetic */ C2836be.C2838b f11538e;

    public /* synthetic */ C3589t5(C2836be beVar, C2836be.C2838b bVar) {
        this.f11537d = beVar;
        this.f11538e = bVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f11537d.m11344e(this.f11538e, valueAnimator);
    }
}
