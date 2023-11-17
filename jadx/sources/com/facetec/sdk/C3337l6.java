package com.facetec.sdk;

import android.animation.Animator;

/* renamed from: com.facetec.sdk.l6 */
public final /* synthetic */ class C3337l6 implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2846bk f10962d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f10963e;

    public /* synthetic */ C3337l6(C2846bk bkVar, Runnable runnable) {
        this.f10962d = bkVar;
        this.f10963e = runnable;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f10962d.m11438e(this.f10963e, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
