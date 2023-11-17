package com.facetec.sdk;

import android.animation.Animator;

/* renamed from: com.facetec.sdk.wh */
public final /* synthetic */ class C3666wh implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2916cu f11685d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f11686e;

    public /* synthetic */ C3666wh(C2916cu cuVar, Runnable runnable) {
        this.f11685d = cuVar;
        this.f11686e = runnable;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11685d.m12176b(this.f11686e, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
