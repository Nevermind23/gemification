package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* renamed from: com.google.android.material.floatingactionbutton.a */
class C5061a {

    /* renamed from: a */
    private Animator f16121a;

    C5061a() {
    }

    /* renamed from: a */
    public void mo16377a() {
        Animator animator = this.f16121a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void mo16378b() {
        this.f16121a = null;
    }

    /* renamed from: c */
    public void mo16379c(Animator animator) {
        mo16377a();
        this.f16121a = animator;
    }
}
