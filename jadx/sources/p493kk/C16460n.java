package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.smallsteps.SmallStepsView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.n */
public final class C16460n implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46573d;

    /* renamed from: e */
    public final FixedButtonView f46574e;

    /* renamed from: f */
    public final SmallStepsView f46575f;

    /* renamed from: g */
    public final PageState f46576g;

    /* renamed from: h */
    public final InlineFeedback f46577h;

    private C16460n(ConstraintLayout constraintLayout, FixedButtonView fixedButtonView, SmallStepsView smallStepsView, PageState pageState, InlineFeedback inlineFeedback) {
        this.f46573d = constraintLayout;
        this.f46574e = fixedButtonView;
        this.f46575f = smallStepsView;
        this.f46576g = pageState;
        this.f46577h = inlineFeedback;
    }

    /* renamed from: a */
    public static C16460n m58645a(View view) {
        int i = C15526d.f44072i0;
        FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
        if (fixedButtonView != null) {
            i = C15526d.f44073k0;
            SmallStepsView smallStepsView = (SmallStepsView) C6202b.m24689a(view, i);
            if (smallStepsView != null) {
                i = C15526d.f44080o1;
                PageState pageState = (PageState) C6202b.m24689a(view, i);
                if (pageState != null) {
                    i = C15526d.policy_download_feedback;
                    InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                    if (inlineFeedback != null) {
                        return new C16460n((ConstraintLayout) view, fixedButtonView, smallStepsView, pageState, inlineFeedback);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16460n m58646d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.fragment_policy_download, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58645a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46573d;
    }
}
