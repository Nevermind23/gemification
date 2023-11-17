package e10;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.constraintlayout.widget.C0630d;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: e10.d */
public final /* synthetic */ class C20124d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C0630d f54784d;

    /* renamed from: e */
    public final /* synthetic */ View f54785e;

    /* renamed from: f */
    public final /* synthetic */ ConstraintLayout f54786f;

    public /* synthetic */ C20124d(C0630d dVar, View view, ConstraintLayout constraintLayout) {
        this.f54784d = dVar;
        this.f54785e = view;
        this.f54786f = constraintLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C20126f.m66102o(this.f54784d, this.f54785e, this.f54786f, valueAnimator);
    }
}
