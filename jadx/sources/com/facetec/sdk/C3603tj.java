package com.facetec.sdk;

import android.animation.Animator;

/* renamed from: com.facetec.sdk.tj */
public final /* synthetic */ class C3603tj implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2983e f11557d;

    public /* synthetic */ C3603tj(C2983e eVar) {
        this.f11557d = eVar;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11557d.m12579e(animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
