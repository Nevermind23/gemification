package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.messagingsteps.StepView;
import p341ge.bog.designsystem.components.pagestate.PageState;

/* renamed from: ua1.v */
public final class C28687v implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73008d;

    /* renamed from: e */
    public final PageState f73009e;

    /* renamed from: f */
    public final Button f73010f;

    /* renamed from: g */
    public final AppCompatTextView f73011g;

    /* renamed from: h */
    public final StepView f73012h;

    /* renamed from: i */
    public final StepView f73013i;

    /* renamed from: j */
    public final StepView f73014j;

    private C28687v(ConstraintLayout constraintLayout, PageState pageState, Button button, AppCompatTextView appCompatTextView, StepView stepView, StepView stepView2, StepView stepView3) {
        this.f73008d = constraintLayout;
        this.f73009e = pageState;
        this.f73010f = button;
        this.f73011g = appCompatTextView;
        this.f73012h = stepView;
        this.f73013i = stepView2;
        this.f73014j = stepView3;
    }

    /* renamed from: a */
    public static C28687v m87864a(View view) {
        int i = C10216u.error_state;
        PageState pageState = (PageState) C6202b.m24689a(view, i);
        if (pageState != null) {
            i = C10216u.f28342v1;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10216u.onboarding_identify_desc;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C10216u.step_1;
                    StepView stepView = (StepView) C6202b.m24689a(view, i);
                    if (stepView != null) {
                        i = C10216u.step_2;
                        StepView stepView2 = (StepView) C6202b.m24689a(view, i);
                        if (stepView2 != null) {
                            i = C10216u.step_3;
                            StepView stepView3 = (StepView) C6202b.m24689a(view, i);
                            if (stepView3 != null) {
                                return new C28687v((ConstraintLayout) view, pageState, button, appCompatTextView, stepView, stepView2, stepView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28687v m87865d(LayoutInflater layoutInflater) {
        return m87866e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28687v m87866e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_identificaton_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87864a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73008d;
    }
}
