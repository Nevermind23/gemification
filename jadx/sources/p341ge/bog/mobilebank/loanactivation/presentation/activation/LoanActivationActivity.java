package p341ge.bog.mobilebank.loanactivation.presentation.activation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq0.C37124a;
import np0.C37436b;
import np0.C37439e;
import np0.C37441g;
import p202p0.C7556l;
import p202p0.C7589q;
import p202p0.C7594s;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.ActivationFormFragment;
import sp0.C38488g;
import ue1.C43064a;
import zp0.C40240a;
import zp0.C40241b;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity */
public final class LoanActivationActivity extends C32400a {

    /* renamed from: H */
    public static final C32396a f79851H = new C32396a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f79852G = C41219i.m119470b(new C32399d(this));

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity$a */
    public static final class C32396a {
        private C32396a() {
        }

        public /* synthetic */ C32396a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo73160a(Context context, String str, String str2, OfferProductCode offerProductCode) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "limitId");
            C41536l.m120489i(str2, "operationType");
            C41536l.m120489i(offerProductCode, "productCode");
            Intent intent = new Intent(context, LoanActivationActivity.class);
            intent.putExtras(ActivationFormFragment.f79876k.mo73189a(str, str2, C37124a.f89339i0.mo90116a(offerProductCode.mo51954a())));
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity$b */
    public static final class C32397b implements Animator.AnimatorListener {

        /* renamed from: d */
        final /* synthetic */ ValueAnimator f79853d;

        public C32397b(ValueAnimator valueAnimator) {
            this.f79853d = valueAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C41536l.m120489i(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animator");
            this.f79853d.start();
        }

        public void onAnimationRepeat(Animator animator) {
            C41536l.m120489i(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C41536l.m120489i(animator, "animator");
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity$c */
    public static final class C32398c implements Animator.AnimatorListener {

        /* renamed from: d */
        final /* synthetic */ ValueAnimator f79854d;

        public C32398c(ValueAnimator valueAnimator) {
            this.f79854d = valueAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            C41536l.m120489i(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animator");
            this.f79854d.start();
        }

        public void onAnimationRepeat(Animator animator) {
            C41536l.m120489i(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C41536l.m120489i(animator, "animator");
        }
    }

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity$d */
    static final class C32399d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoanActivationActivity f79855d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32399d(LoanActivationActivity loanActivationActivity) {
            super(0);
            this.f79855d = loanActivationActivity;
        }

        /* renamed from: b */
        public final C38488g invoke() {
            C38488g d = C38488g.m112965d(this.f79855d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: G2 */
    private final void m95674G2(C7556l lVar) {
        m95676I2().f92192h.setProgress(Utils.FLOAT_EPSILON);
        lVar.mo22137p(new C40240a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m95675H2(LoanActivationActivity loanActivationActivity, C7556l lVar, C7589q qVar, Bundle bundle) {
        boolean z;
        C41536l.m120489i(loanActivationActivity, "this$0");
        C41536l.m120489i(lVar, "<anonymous parameter 0>");
        C41536l.m120489i(qVar, "destination");
        int w = qVar.mo22214w();
        if (w == C37439e.fragment_activation_result) {
            ConstraintLayout constraintLayout = loanActivationActivity.m95676I2().f92189e;
            C41536l.m120488h(constraintLayout, "binding.activationProgressContainer");
            C32343x.m95455i0(constraintLayout);
        } else if (w == C37439e.fragment_activation_form) {
            ConstraintLayout constraintLayout2 = loanActivationActivity.m95676I2().f92189e;
            C41536l.m120488h(constraintLayout2, "binding.activationProgressContainer");
            C32343x.m95447f1(constraintLayout2);
            if (loanActivationActivity.m95676I2().f92192h.getProgress() == Utils.FLOAT_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{100.0f, 50.0f});
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{50.0f, Utils.FLOAT_EPSILON});
                ProgressBarView progressBarView = loanActivationActivity.m95676I2().f92191g;
                C41536l.m120488h(progressBarView, "binding.orderProgressStep1");
                C41536l.m120488h(ofFloat, "animatorOneBack");
                loanActivationActivity.m95677J2(progressBarView, ofFloat);
                ProgressBarView progressBarView2 = loanActivationActivity.m95676I2().f92192h;
                C41536l.m120488h(progressBarView2, "binding.orderProgressStep2");
                C41536l.m120488h(ofFloat2, "animatorSecondBack");
                loanActivationActivity.m95677J2(progressBarView2, ofFloat2);
                ofFloat2.addListener(new C32397b(ofFloat));
                ofFloat2.start();
                return;
            }
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 50.0f});
            ProgressBarView progressBarView3 = loanActivationActivity.m95676I2().f92191g;
            C41536l.m120488h(progressBarView3, "binding.orderProgressStep1");
            C41536l.m120488h(ofFloat3, "animatorStart");
            loanActivationActivity.m95677J2(progressBarView3, ofFloat3);
            ofFloat3.start();
        } else if (w == C37439e.fragment_activation_details) {
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(new float[]{50.0f, 100.0f});
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{Utils.FLOAT_EPSILON, 50.0f});
            ProgressBarView progressBarView4 = loanActivationActivity.m95676I2().f92191g;
            C41536l.m120488h(progressBarView4, "binding.orderProgressStep1");
            C41536l.m120488h(ofFloat4, "animatorOne");
            loanActivationActivity.m95677J2(progressBarView4, ofFloat4);
            ProgressBarView progressBarView5 = loanActivationActivity.m95676I2().f92192h;
            C41536l.m120488h(progressBarView5, "binding.orderProgressStep2");
            C41536l.m120488h(ofFloat5, "animatorSecond");
            loanActivationActivity.m95677J2(progressBarView5, ofFloat5);
            ofFloat4.addListener(new C32398c(ofFloat5));
            ofFloat4.start();
        }
    }

    /* renamed from: I2 */
    private final C38488g m95676I2() {
        return (C38488g) this.f79852G.getValue();
    }

    /* renamed from: J2 */
    private final void m95677J2(ProgressBarView progressBarView, ValueAnimator valueAnimator) {
        valueAnimator.setDuration(200);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new C40241b(progressBarView));
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public static final void m95678K2(ProgressBarView progressBarView, ValueAnimator valueAnimator) {
        C41536l.m120489i(progressBarView, "$this_setAnimation");
        C41536l.m120489i(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        progressBarView.setProgress(((Float) animatedValue).floatValue());
    }

    /* renamed from: L2 */
    private final void m95679L2() {
        Fragment j0 = getSupportFragmentManager().mo4415j0(C37439e.f90008m0);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C7556l k1 = ((NavHostFragment) j0).mo5009k1();
        C7594s b = k1.mo22114F().mo22243b(C37441g.loan_activation_nav_graph);
        b.mo22234T(C37439e.fragment_activation_form);
        k1.mo22133k0(b, getIntent().getExtras());
        m95674G2(k1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m95676I2());
        getWindow().setStatusBarColor(C32343x.m95418U(C37436b.f89967a, this));
        m95679L2();
        mo86429X1(C32343x.m95388F("loan.activation.details.page.main.header", new Object[0]));
    }
}
