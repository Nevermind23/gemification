package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class ViewPropertyAnimatorCompat {

    /* renamed from: a */
    private final WeakReference f3669a;

    /* renamed from: b */
    Runnable f3670b = null;

    /* renamed from: c */
    Runnable f3671c = null;

    /* renamed from: d */
    int f3672d = -1;

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$a */
    class C1033a extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ C1182j3 f3673d;

        /* renamed from: e */
        final /* synthetic */ View f3674e;

        C1033a(C1182j3 j3Var, View view) {
            this.f3673d = j3Var;
            this.f3674e = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3673d.mo1913a(this.f3674e);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3673d.mo513b(this.f3674e);
        }

        public void onAnimationStart(Animator animator) {
            this.f3673d.mo514c(this.f3674e);
        }
    }

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$b */
    static class C1034b {
        /* renamed from: a */
        static ViewPropertyAnimator m3807a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        /* renamed from: b */
        static ViewPropertyAnimator m3808b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        /* renamed from: c */
        static ViewPropertyAnimator m3809c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* renamed from: androidx.core.view.ViewPropertyAnimatorCompat$c */
    static class C1035c {
        /* renamed from: a */
        static ViewPropertyAnimator m3810a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    ViewPropertyAnimatorCompat(View view) {
        this.f3669a = new WeakReference(view);
    }

    /* renamed from: i */
    private void m3795i(View view, C1182j3 j3Var) {
        if (j3Var != null) {
            view.animate().setListener(new C1033a(j3Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: b */
    public ViewPropertyAnimatorCompat mo3469b(float f) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* renamed from: c */
    public void mo3470c() {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long mo3471d() {
        View view = (View) this.f3669a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0;
    }

    /* renamed from: f */
    public ViewPropertyAnimatorCompat mo3472f(long j) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    /* renamed from: g */
    public ViewPropertyAnimatorCompat mo3473g(Interpolator interpolator) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public ViewPropertyAnimatorCompat mo3474h(C1182j3 j3Var) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            m3795i(view, j3Var);
        }
        return this;
    }

    /* renamed from: j */
    public ViewPropertyAnimatorCompat mo3475j(long j) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    /* renamed from: k */
    public ViewPropertyAnimatorCompat mo3476k(C1194l3 l3Var) {
        C1176i3 i3Var;
        View view = (View) this.f3669a.get();
        if (view != null) {
            if (l3Var != null) {
                i3Var = new C1176i3(l3Var, view);
            } else {
                i3Var = null;
            }
            C1035c.m3810a(view.animate(), i3Var);
        }
        return this;
    }

    /* renamed from: l */
    public void mo3477l() {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public ViewPropertyAnimatorCompat mo3478m(float f) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    /* renamed from: n */
    public ViewPropertyAnimatorCompat mo3479n(Runnable runnable) {
        View view = (View) this.f3669a.get();
        if (view != null) {
            C1034b.m3807a(view.animate(), runnable);
        }
        return this;
    }
}
