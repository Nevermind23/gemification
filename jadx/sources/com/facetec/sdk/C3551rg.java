package com.facetec.sdk;

import android.animation.Animator;

/* renamed from: com.facetec.sdk.rg */
public final /* synthetic */ class C3551rg implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2906co f11467d;

    public /* synthetic */ C3551rg(C2906co coVar) {
        this.f11467d = coVar;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11467d.m12125d(animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
