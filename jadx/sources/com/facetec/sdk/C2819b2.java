package com.facetec.sdk;

import android.animation.Animator;

/* renamed from: com.facetec.sdk.b2 */
public final /* synthetic */ class C2819b2 implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ Runnable f9063d;

    public /* synthetic */ C2819b2(Runnable runnable) {
        this.f9063d = runnable;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9063d.run();
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
