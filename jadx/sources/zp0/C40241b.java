package zp0;

import android.animation.ValueAnimator;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity;

/* renamed from: zp0.b */
public final /* synthetic */ class C40241b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ ProgressBarView f95630d;

    public /* synthetic */ C40241b(ProgressBarView progressBarView) {
        this.f95630d = progressBarView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        LoanActivationActivity.m95678K2(this.f95630d, valueAnimator);
    }
}
