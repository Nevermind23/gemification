package com.facetec.sdk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.facetec.sdk.C2836be;

/* renamed from: com.facetec.sdk.u5 */
public final /* synthetic */ class C3610u5 implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2836be f11577d;

    /* renamed from: e */
    public final /* synthetic */ C2836be.C2838b f11578e;

    /* renamed from: f */
    public final /* synthetic */ ValueAnimator f11579f;

    public /* synthetic */ C3610u5(C2836be beVar, C2836be.C2838b bVar, ValueAnimator valueAnimator) {
        this.f11577d = beVar;
        this.f11578e = bVar;
        this.f11579f = valueAnimator;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11577d.m11338a(this.f11578e, this.f11579f, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
