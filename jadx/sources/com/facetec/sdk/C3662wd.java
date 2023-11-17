package com.facetec.sdk;

import android.animation.Animator;

/* renamed from: com.facetec.sdk.wd */
public final /* synthetic */ class C3662wd implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2900cm f11680d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f11681e;

    public /* synthetic */ C3662wd(C2900cm cmVar, Runnable runnable) {
        this.f11680d = cmVar;
        this.f11681e = runnable;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11680d.m11995a(this.f11681e, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
