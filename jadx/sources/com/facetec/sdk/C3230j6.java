package com.facetec.sdk;

import android.animation.Animator;

/* renamed from: com.facetec.sdk.j6 */
public final /* synthetic */ class C3230j6 implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ Runnable f10536d;

    public /* synthetic */ C3230j6(Runnable runnable) {
        this.f10536d = runnable;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        C2846bk.m11434d(this.f10536d, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
