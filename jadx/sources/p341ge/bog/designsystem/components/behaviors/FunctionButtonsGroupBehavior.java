package p341ge.bog.designsystem.components.behaviors;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.mikephil.charting.utils.Utils;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p124j0.C6633b;

/* renamed from: ge.bog.designsystem.components.behaviors.FunctionButtonsGroupBehavior */
public final class FunctionButtonsGroupBehavior extends CoordinatorLayout.C0644c {

    /* renamed from: d */
    public static final C13166a f38833d = new C13166a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Interpolator f38834a = new C6633b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f38835b;

    /* renamed from: c */
    private int f38836c;

    /* renamed from: ge.bog.designsystem.components.behaviors.FunctionButtonsGroupBehavior$a */
    public static final class C13166a {
        private C13166a() {
        }

        public /* synthetic */ C13166a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.behaviors.FunctionButtonsGroupBehavior$b */
    public static final class C13167b extends AnimatorListenerAdapter {

        /* renamed from: d */
        private boolean f38837d;

        /* renamed from: e */
        final /* synthetic */ View f38838e;

        /* renamed from: f */
        final /* synthetic */ FunctionButtonsGroupBehavior f38839f;

        C13167b(View view, FunctionButtonsGroupBehavior functionButtonsGroupBehavior) {
            this.f38838e = view;
            this.f38839f = functionButtonsGroupBehavior;
        }

        public void onAnimationCancel(Animator animator) {
            C41536l.m120489i(animator, "animation");
            this.f38837d = true;
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animation");
            if (!this.f38837d) {
                this.f38838e.setVisibility(4);
            }
            this.f38839f.f38835b = 0;
        }

        public void onAnimationStart(Animator animator) {
            C41536l.m120489i(animator, "animation");
            this.f38838e.setVisibility(0);
            this.f38839f.f38835b = 1;
            this.f38837d = false;
        }
    }

    /* renamed from: ge.bog.designsystem.components.behaviors.FunctionButtonsGroupBehavior$c */
    public static final class C13168c extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ View f38840d;

        /* renamed from: e */
        final /* synthetic */ FunctionButtonsGroupBehavior f38841e;

        C13168c(View view, FunctionButtonsGroupBehavior functionButtonsGroupBehavior) {
            this.f38840d = view;
            this.f38841e = functionButtonsGroupBehavior;
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animator");
            this.f38841e.f38835b = 0;
        }

        public void onAnimationStart(Animator animator) {
            C41536l.m120489i(animator, "animator");
            this.f38840d.setVisibility(0);
            this.f38841e.f38835b = 2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunctionButtonsGroupBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: F */
    private final void m49590F(View view) {
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY((float) view.getHeight()).setInterpolator(this.f38834a).setDuration(450).setListener(new C13167b(view, this));
    }

    /* renamed from: G */
    private final boolean m49591G(View view) {
        if (view.getVisibility() == 0) {
            if (this.f38835b != 1) {
                return false;
            }
        } else if (this.f38835b == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: H */
    private final boolean m49592H(View view) {
        if (view.getVisibility() != 0) {
            if (this.f38835b != 2) {
                return false;
            }
        } else if (this.f38835b == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    private final void m49593I(View view) {
        ViewPropertyAnimator animate = view.animate();
        animate.cancel();
        animate.translationY(Utils.FLOAT_EPSILON).setInterpolator(this.f38834a).setDuration(450).setListener(new C13168c(view, this));
    }

    /* renamed from: A */
    public boolean mo3031A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        C41536l.m120489i(coordinatorLayout, "coordinatorLayout");
        C41536l.m120489i(view, "child");
        C41536l.m120489i(view2, "directTargetChild");
        C41536l.m120489i(view3, "target");
        return (i & 2) != 0;
    }

    /* renamed from: C */
    public void mo3033C(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        C41536l.m120489i(coordinatorLayout, "coordinatorLayout");
        C41536l.m120489i(view, "child");
        C41536l.m120489i(view2, "target");
        if (!m49592H(view)) {
            m49593I(view);
        }
    }

    /* renamed from: q */
    public void mo3051q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        C41536l.m120489i(coordinatorLayout, "coordinatorLayout");
        C41536l.m120489i(view, "child");
        C41536l.m120489i(view2, "target");
        C41536l.m120489i(iArr, "consumed");
        if ((i2 > 0 && this.f38836c < 0) || (i2 < 0 && this.f38836c > 0)) {
            this.f38836c = 0;
        }
        int i4 = this.f38836c + i2;
        this.f38836c = i4;
        if (i4 > 0 && !m49591G(view)) {
            m49590F(view);
        } else if (this.f38836c < 0 && !m49592H(view)) {
            m49593I(view);
        }
    }
}
