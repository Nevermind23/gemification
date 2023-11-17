package e10;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* renamed from: e10.b */
public final /* synthetic */ class C20122b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ GradientDrawable f54781d;

    /* renamed from: e */
    public final /* synthetic */ View f54782e;

    public /* synthetic */ C20122b(GradientDrawable gradientDrawable, View view) {
        this.f54781d = gradientDrawable;
        this.f54782e = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C20126f.m66098k(this.f54781d, this.f54782e, valueAnimator);
    }
}
