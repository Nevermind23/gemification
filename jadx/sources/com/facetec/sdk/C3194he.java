package com.facetec.sdk;

import android.animation.Animator;
import com.facetec.sdk.C2792ao;

/* renamed from: com.facetec.sdk.he */
public final /* synthetic */ class C3194he implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2792ao.C2793e f10490d;

    public /* synthetic */ C3194he(C2792ao.C2793e eVar) {
        this.f10490d = eVar;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        C2900cm.m11994a(this.f10490d, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
