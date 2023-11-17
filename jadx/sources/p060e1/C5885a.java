package p060e1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: e1.a */
abstract class C5885a {
    /* renamed from: a */
    static void m23678a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: b */
    static void m23679b(Animator animator) {
        animator.pause();
    }

    /* renamed from: c */
    static void m23680c(Animator animator) {
        animator.resume();
    }
}
