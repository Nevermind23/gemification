package p420fh;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: fh.f */
public final /* synthetic */ class C12911f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup.LayoutParams f38107d;

    /* renamed from: e */
    public final /* synthetic */ C12912g f38108e;

    public /* synthetic */ C12911f(ViewGroup.LayoutParams layoutParams, C12912g gVar) {
        this.f38107d = layoutParams;
        this.f38108e = gVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C12912g.m48807f(this.f38107d, this.f38108e, valueAnimator);
    }
}
