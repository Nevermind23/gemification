package com.facetec.sdk;

import android.animation.Animator;
import com.facetec.sdk.C2792ao;

/* renamed from: com.facetec.sdk.xd */
public final /* synthetic */ class C3683xd implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2900cm f11719d;

    /* renamed from: e */
    public final /* synthetic */ C2792ao.C2793e f11720e;

    public /* synthetic */ C3683xd(C2900cm cmVar, C2792ao.C2793e eVar) {
        this.f11719d = cmVar;
        this.f11720e = eVar;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11719d.m12000b(this.f11720e, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
