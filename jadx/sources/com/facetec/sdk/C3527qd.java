package com.facetec.sdk;

import android.animation.Animator;
import com.facetec.sdk.C2792ao;

/* renamed from: com.facetec.sdk.qd */
public final /* synthetic */ class C3527qd implements C2816b {

    /* renamed from: d */
    public final /* synthetic */ C2900cm f11410d;

    /* renamed from: e */
    public final /* synthetic */ C2792ao.C2793e f11411e;

    public /* synthetic */ C3527qd(C2900cm cmVar, C2792ao.C2793e eVar) {
        this.f11410d = cmVar;
        this.f11411e = eVar;
    }

    public /* synthetic */ void onAnimationCancel(Animator animator) {
        C3405m2.m13567a(this, animator);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f11410d.m12017e(this.f11411e, animator);
    }

    public /* synthetic */ void onAnimationRepeat(Animator animator) {
        C3405m2.m13568b(this, animator);
    }

    public /* synthetic */ void onAnimationStart(Animator animator) {
        C3405m2.m13569c(this, animator);
    }
}
