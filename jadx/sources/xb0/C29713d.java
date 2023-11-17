package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.actioncard.ActionCardView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import rb0.C27985d;
import rb0.C27986e;

/* renamed from: xb0.d */
public final class C29713d implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f74987d;

    /* renamed from: e */
    public final Button f74988e;

    /* renamed from: f */
    public final ActionCardView f74989f;

    /* renamed from: g */
    public final ActionCardView f74990g;

    /* renamed from: h */
    public final InlineFeedback2 f74991h;

    /* renamed from: i */
    public final ActionCardView f74992i;

    /* renamed from: j */
    public final PageDescriptionView f74993j;

    private C29713d(NestedScrollView nestedScrollView, Button button, ActionCardView actionCardView, ActionCardView actionCardView2, InlineFeedback2 inlineFeedback2, ActionCardView actionCardView3, PageDescriptionView pageDescriptionView) {
        this.f74987d = nestedScrollView;
        this.f74988e = button;
        this.f74989f = actionCardView;
        this.f74990g = actionCardView2;
        this.f74991h = inlineFeedback2;
        this.f74992i = actionCardView3;
        this.f74993j = pageDescriptionView;
    }

    /* renamed from: a */
    public static C29713d m90217a(View view) {
        int i = C27985d.dont_want_to_renew;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C27985d.initial_amount;
            ActionCardView actionCardView = (ActionCardView) C6202b.m24689a(view, i);
            if (actionCardView != null) {
                i = C27985d.initial_amount_interest;
                ActionCardView actionCardView2 = (ActionCardView) C6202b.m24689a(view, i);
                if (actionCardView2 != null) {
                    i = C27985d.f71289q0;
                    InlineFeedback2 inlineFeedback2 = (InlineFeedback2) C6202b.m24689a(view, i);
                    if (inlineFeedback2 != null) {
                        i = C27985d.lower_then_initial_amount;
                        ActionCardView actionCardView3 = (ActionCardView) C6202b.m24689a(view, i);
                        if (actionCardView3 != null) {
                            i = C27985d.f71257E0;
                            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                            if (pageDescriptionView != null) {
                                return new C29713d((NestedScrollView) view, button, actionCardView, actionCardView2, inlineFeedback2, actionCardView3, pageDescriptionView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C29713d m90218d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.action_sheet_deposit_prolongation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90217a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f74987d;
    }
}
