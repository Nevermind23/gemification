package com.facetec.sdk;

import android.animation.Animator;

@FunctionalInterface
/* renamed from: com.facetec.sdk.b */
interface C2816b extends Animator.AnimatorListener {
    void onAnimationCancel(Animator animator);

    void onAnimationRepeat(Animator animator);

    void onAnimationStart(Animator animator);
}
