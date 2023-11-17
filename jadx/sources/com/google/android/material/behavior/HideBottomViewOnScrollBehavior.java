package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.p013v4.media.session.C0125b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p026b8.C2170a;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.C0644c {

    /* renamed from: a */
    private final LinkedHashSet f15558a = new LinkedHashSet();

    /* renamed from: b */
    private int f15559b = 0;

    /* renamed from: c */
    private int f15560c = 2;

    /* renamed from: d */
    private int f15561d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ViewPropertyAnimator f15562e;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C4936a extends AnimatorListenerAdapter {
        C4936a() {
        }

        public void onAnimationEnd(Animator animator) {
            ViewPropertyAnimator unused = HideBottomViewOnScrollBehavior.this.f15562e = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* renamed from: F */
    private void m18858F(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f15562e = view.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C4936a());
    }

    /* renamed from: M */
    private void m18859M(View view, int i) {
        this.f15560c = i;
        Iterator it = this.f15558a.iterator();
        if (it.hasNext()) {
            C0125b.m366a(it.next());
            throw null;
        }
    }

    /* renamed from: A */
    public boolean mo3031A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    /* renamed from: G */
    public boolean mo15536G() {
        return this.f15560c == 1;
    }

    /* renamed from: H */
    public boolean mo15537H() {
        return this.f15560c == 2;
    }

    /* renamed from: I */
    public void mo15538I(View view) {
        mo15539J(view, true);
    }

    /* renamed from: J */
    public void mo15539J(View view, boolean z) {
        if (!mo15536G()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f15562e;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m18859M(view, 1);
            int i = this.f15559b + this.f15561d;
            if (z) {
                m18858F(view, i, 175, C2170a.f6352c);
                return;
            }
            view.setTranslationY((float) i);
        }
    }

    /* renamed from: K */
    public void mo15540K(View view) {
        mo15541L(view, true);
    }

    /* renamed from: L */
    public void mo15541L(View view, boolean z) {
        if (!mo15537H()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f15562e;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m18859M(view, 2);
            if (z) {
                m18858F(view, 0, 225, C2170a.f6353d);
                return;
            }
            view.setTranslationY((float) 0);
        }
    }

    /* renamed from: l */
    public boolean mo3046l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f15559b = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.mo3046l(coordinatorLayout, view, i);
    }

    /* renamed from: t */
    public void mo3054t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            mo15538I(view);
        } else if (i2 < 0) {
            mo15540K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
