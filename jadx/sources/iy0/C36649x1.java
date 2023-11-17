package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCheckboxView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.loading.LoadingView;

/* renamed from: iy0.x1 */
public final class C36649x1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88455d;

    /* renamed from: e */
    public final FixedButtonCheckboxView f88456e;

    /* renamed from: f */
    public final InlineFeedback f88457f;

    /* renamed from: g */
    public final Guideline f88458g;

    /* renamed from: h */
    public final Guideline f88459h;

    /* renamed from: i */
    public final LoadingView f88460i;

    /* renamed from: j */
    public final RecyclerView f88461j;

    private C36649x1(ConstraintLayout constraintLayout, FixedButtonCheckboxView fixedButtonCheckboxView, InlineFeedback inlineFeedback, Guideline guideline, Guideline guideline2, LoadingView loadingView, RecyclerView recyclerView) {
        this.f88455d = constraintLayout;
        this.f88456e = fixedButtonCheckboxView;
        this.f88457f = inlineFeedback;
        this.f88458g = guideline;
        this.f88459h = guideline2;
        this.f88460i = loadingView;
        this.f88461j = recyclerView;
    }

    /* renamed from: a */
    public static C36649x1 m108731a(View view) {
        int i = C36271e.choose_insurance_button;
        FixedButtonCheckboxView fixedButtonCheckboxView = (FixedButtonCheckboxView) C6202b.m24689a(view, i);
        if (fixedButtonCheckboxView != null) {
            i = C36271e.expiration_feedback;
            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
            if (inlineFeedback != null) {
                i = C36271e.f87483B0;
                Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                if (guideline != null) {
                    i = C36271e.f87484C0;
                    Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline2 != null) {
                        i = C36271e.insurance_types_loader;
                        LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                        if (loadingView != null) {
                            i = C36271e.insurance_types_recycler;
                            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                            if (recyclerView != null) {
                                return new C36649x1((ConstraintLayout) view, fixedButtonCheckboxView, inlineFeedback, guideline, guideline2, loadingView, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36649x1 m108732d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.layout_action_sheet_select_card_insurance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108731a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88455d;
    }
}
