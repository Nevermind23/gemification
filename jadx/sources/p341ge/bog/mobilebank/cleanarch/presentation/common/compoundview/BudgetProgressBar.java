package p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.github.mikephil.charting.utils.Utils;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p124j0.C6633b;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.BudgetProgressBar */
public final class BudgetProgressBar extends FrameLayout {

    /* renamed from: d */
    private final C41217g f57399d = C41219i.m119470b(new C21485a(this));

    /* renamed from: e */
    private final C41217g f57400e = C41219i.m119470b(new C21486b(this));

    /* renamed from: f */
    private int f57401f;

    /* renamed from: g */
    private int f57402g;

    /* renamed from: h */
    private int f57403h;

    /* renamed from: i */
    private float f57404i;

    /* renamed from: j */
    private float f57405j;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.BudgetProgressBar$a */
    static final class C21485a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetProgressBar f57406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21485a(BudgetProgressBar budgetProgressBar) {
            super(0);
            this.f57406d = budgetProgressBar;
        }

        /* renamed from: b */
        public final LinearLayout invoke() {
            return (LinearLayout) this.f57406d.findViewById(C10322k.progressContainer);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.BudgetProgressBar$b */
    static final class C21486b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BudgetProgressBar f57407d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21486b(BudgetProgressBar budgetProgressBar) {
            super(0);
            this.f57407d = budgetProgressBar;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f57407d.findViewById(C10322k.progressView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BudgetProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        View.inflate(context, C10324m.budget_progressbar_layout, this);
        if (attributeSet != null) {
            m69422e(attributeSet);
        }
        m69423f();
    }

    /* renamed from: b */
    private final GradientDrawable m69419b(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius((float) getContext().getResources().getDimensionPixelSize(C10319h.progress_radius_dp));
        return gradientDrawable;
    }

    /* renamed from: c */
    private final ScaleAnimation m69420c(float f) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(Utils.FLOAT_EPSILON, 1.0f, 1.0f, 1.0f, 1, f, 1, Utils.FLOAT_EPSILON);
        scaleAnimation.setInterpolator(new C6633b());
        scaleAnimation.setDuration(600);
        return scaleAnimation;
    }

    /* renamed from: d */
    static /* synthetic */ ScaleAnimation m69421d(BudgetProgressBar budgetProgressBar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Utils.FLOAT_EPSILON;
        }
        return budgetProgressBar.m69420c(f);
    }

    /* renamed from: e */
    private final void m69422e(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29219Y0);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…leable.BudgetProgressBar)");
        setProgressBackgroundColor(obtainStyledAttributes.getColor(C10330s.f29262c1, 0));
        this.f57402g = obtainStyledAttributes.getColor(C10330s.f29251b1, 0);
        this.f57403h = obtainStyledAttributes.getColor(C10330s.f29240a1, 0);
        this.f57404i = obtainStyledAttributes.getFloat(C10330s.f29229Z0, Utils.FLOAT_EPSILON);
        this.f57405j = obtainStyledAttributes.getFloat(C10330s.f29273d1, Utils.FLOAT_EPSILON);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    private final void m69423f() {
        getProgressView().setBackground(m69419b(0));
        m69424h(this, this.f57404i, this.f57405j, false, 4, (Object) null);
    }

    private final LinearLayout getProgressContainer() {
        Object value = this.f57399d.getValue();
        C41536l.m120488h(value, "<get-progressContainer>(...)");
        return (LinearLayout) value;
    }

    private final View getProgressView() {
        Object value = this.f57400e.getValue();
        C41536l.m120488h(value, "<get-progressView>(...)");
        return (View) value;
    }

    /* renamed from: h */
    public static /* synthetic */ void m69424h(BudgetProgressBar budgetProgressBar, float f, float f2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        budgetProgressBar.mo53614g(f, f2, z);
    }

    private final void setProgressBackgroundColor(int i) {
        this.f57401f = i;
        setBackground(m69419b(i));
    }

    /* renamed from: a */
    public final void mo53613a() {
        getProgressView().startAnimation(m69421d(this, Utils.FLOAT_EPSILON, 1, (Object) null));
    }

    /* renamed from: g */
    public final void mo53614g(float f, float f2, boolean z) {
        int i;
        this.f57404i = f;
        this.f57405j = f2;
        getProgressContainer().setWeightSum(Math.max(f, f2));
        Drawable background = getProgressView().getBackground();
        C41536l.m120487g(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (f2 > f) {
            i = this.f57403h;
        } else {
            i = this.f57402g;
        }
        gradientDrawable.setColor(i);
        getProgressView().setLayoutParams(new LinearLayout.LayoutParams(0, -1, f2));
        if (z) {
            mo53613a();
        }
        getProgressContainer().invalidate();
    }

    public final float getBudget() {
        return this.f57404i;
    }

    public final int getNegativeProgressColor() {
        return this.f57403h;
    }

    public final int getPositiveProgressColor() {
        return this.f57402g;
    }

    public final float getSpentAmount() {
        return this.f57405j;
    }

    public final void setBudget(float f) {
        this.f57404i = f;
    }

    public final void setNegativeProgressColor(int i) {
        this.f57403h = i;
    }

    public final void setPositiveProgressColor(int i) {
        this.f57402g = i;
    }

    public final void setSpentAmount(float f) {
        this.f57405j = f;
    }
}
