package e10;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0630d;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p124j0.C6633b;

/* renamed from: e10.f */
public final class C20126f {

    /* renamed from: a */
    public static final C20126f f54788a = new C20126f();

    /* renamed from: b */
    private static final int f54789b = C32343x.m95394I(16);

    /* renamed from: c */
    private static final float f54790c = ((float) C32343x.m95394I(50));

    private C20126f() {
    }

    /* renamed from: h */
    private final void m66095h(int i, int i2, View view, long j) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        ofObject.setDuration(j);
        ofObject.addUpdateListener(new C20121a(view));
        ofObject.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m66096i(View view, ValueAnimator valueAnimator) {
        C41536l.m120489i(view, "$view");
        C41536l.m120489i(valueAnimator, "it");
        Drawable background = view.getBackground();
        C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        gradientDrawable.setColor(((Integer) animatedValue).intValue());
        view.setBackground(gradientDrawable);
    }

    /* renamed from: j */
    private final void m66097j(float f, float f2, View view, long j) {
        Drawable background = view.getBackground();
        C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C20122b((GradientDrawable) background, view));
        ofFloat.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m66098k(GradientDrawable gradientDrawable, View view, ValueAnimator valueAnimator) {
        C41536l.m120489i(gradientDrawable, "$background");
        C41536l.m120489i(view, "$view");
        C41536l.m120489i(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        gradientDrawable.setCornerRadius(((Float) animatedValue).floatValue());
        view.setBackground(gradientDrawable);
    }

    /* renamed from: l */
    private final void m66099l(int i, View view, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getMeasuredHeight(), i});
        ofInt.setInterpolator(new C6633b());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C20123c(view));
        ofInt.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m66100m(View view, ValueAnimator valueAnimator) {
        C41536l.m120489i(view, "$view");
        C41536l.m120489i(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = intValue;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: n */
    private final void m66101n(int i, int i2, ConstraintLayout constraintLayout, View view, long j) {
        C0630d dVar = new C0630d();
        dVar.mo2942h(constraintLayout);
        dVar.mo2939e(view.getId());
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C20124d(dVar, view, constraintLayout));
        ofInt.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m66102o(C0630d dVar, View view, ConstraintLayout constraintLayout, ValueAnimator valueAnimator) {
        C41536l.m120489i(dVar, "$constraintSet");
        C41536l.m120489i(view, "$view");
        C41536l.m120489i(constraintLayout, "$root");
        C41536l.m120489i(valueAnimator, "it");
        int id = view.getId();
        int id2 = constraintLayout.getId();
        Object animatedValue = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        dVar.mo2944j(id, 7, id2, 7, ((Integer) animatedValue).intValue());
        int id3 = view.getId();
        int id4 = constraintLayout.getId();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        dVar.mo2944j(id3, 4, id4, 4, ((Integer) animatedValue2).intValue());
        dVar.mo2937c(constraintLayout);
    }

    /* renamed from: p */
    private final void m66103p(int i, int i2, View view, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getMeasuredWidth(), i});
        ofInt.setInterpolator(new C6633b());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new C20125e(view));
        ofInt.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m66104q(View view, ValueAnimator valueAnimator) {
        C41536l.m120489i(view, "$view");
        C41536l.m120489i(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        C41536l.m120487g(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = intValue;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    public final void mo48555f(int i, int i2, int i3, int i4, ConstraintLayout constraintLayout, View view) {
        View view2 = view;
        ConstraintLayout constraintLayout2 = constraintLayout;
        C41536l.m120489i(constraintLayout, "root");
        C41536l.m120489i(view2, "animatedView");
        m66097j(f54790c, Utils.FLOAT_EPSILON, view, 300);
        m66101n(f54789b, 0, constraintLayout, view, 300);
        View view3 = view;
        m66095h(i3, i4, view3, 300);
        m66103p(i, i2, view3, 300);
        int i5 = i2;
        m66099l(i2, view2, 300);
    }

    /* renamed from: g */
    public final void mo48556g(View... viewArr) {
        C41536l.m120489i(viewArr, "views");
        for (View animate : viewArr) {
            animate.animate().alpha(1.0f).setDuration(200).setStartDelay(250).start();
        }
    }
}
