package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: androidx.core.view.i3 */
public final /* synthetic */ class C1176i3 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C1194l3 f3822d;

    /* renamed from: e */
    public final /* synthetic */ View f3823e;

    public /* synthetic */ C1176i3(C1194l3 l3Var, View view) {
        this.f3822d = l3Var;
        this.f3823e = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3822d.mo683a(this.f3823e);
    }
}
