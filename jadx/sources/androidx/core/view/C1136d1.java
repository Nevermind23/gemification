package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: androidx.core.view.d1 */
public final class C1136d1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d */
    private final View f3800d;

    /* renamed from: e */
    private ViewTreeObserver f3801e;

    /* renamed from: f */
    private final Runnable f3802f;

    private C1136d1(View view, Runnable runnable) {
        this.f3800d = view;
        this.f3801e = view.getViewTreeObserver();
        this.f3802f = runnable;
    }

    /* renamed from: a */
    public static C1136d1 m4184a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            C1136d1 d1Var = new C1136d1(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(d1Var);
            view.addOnAttachStateChangeListener(d1Var);
            return d1Var;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    /* renamed from: b */
    public void mo3694b() {
        if (this.f3801e.isAlive()) {
            this.f3801e.removeOnPreDrawListener(this);
        } else {
            this.f3800d.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3800d.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo3694b();
        this.f3802f.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f3801e = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo3694b();
    }
}
