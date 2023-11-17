package com.facetec.sdk;

import android.animation.Animator;

/* renamed from: com.facetec.sdk.u3 */
public final /* synthetic */ class C3608u3 implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2831bd f11573d;

    /* renamed from: e */
    public final /* synthetic */ float f11574e;

    /* renamed from: f */
    public final /* synthetic */ float f11575f;

    public /* synthetic */ C3608u3(C2831bd bdVar, float f, float f2) {
        this.f11573d = bdVar;
        this.f11574e = f;
        this.f11575f = f2;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11573d.m11227b(this.f11574e, this.f11575f, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
