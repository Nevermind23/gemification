package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.core.widget.NestedScrollView;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: pr0.a */
public final class C37942a implements C6201a {

    /* renamed from: d */
    private final NestedScrollView f91077d;

    /* renamed from: e */
    public final LinearLayout f91078e;

    /* renamed from: f */
    public final LinearLayout f91079f;

    /* renamed from: g */
    public final FixedButtonView f91080g;

    /* renamed from: h */
    public final InlineFeedback2 f91081h;

    /* renamed from: i */
    public final LoadingView f91082i;

    /* renamed from: j */
    public final RadioGroup f91083j;

    /* renamed from: k */
    public final Button f91084k;

    /* renamed from: l */
    public final StateView f91085l;

    private C37942a(NestedScrollView nestedScrollView, LinearLayout linearLayout, LinearLayout linearLayout2, FixedButtonView fixedButtonView, InlineFeedback2 inlineFeedback2, LoadingView loadingView, RadioGroup radioGroup, Button button, StateView stateView) {
        this.f91077d = nestedScrollView;
        this.f91078e = linearLayout;
        this.f91079f = linearLayout2;
        this.f91080g = fixedButtonView;
        this.f91081h = inlineFeedback2;
        this.f91082i = loadingView;
        this.f91083j = radioGroup;
        this.f91084k = button;
        this.f91085l = stateView;
    }

    /* renamed from: a */
    public static C37942a m111511a(View view) {
        int i = C37130e.installment_action_sheet_content;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C37130e.installment_action_sheet_error_layout;
            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout2 != null) {
                i = C37130e.installment_cancel_button;
                FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
                if (fixedButtonView != null) {
                    i = C37130e.installment_feedback;
                    InlineFeedback2 inlineFeedback2 = (InlineFeedback2) C6202b.m24689a(view, i);
                    if (inlineFeedback2 != null) {
                        i = C37130e.loan_installment_action_sheet_skeleton;
                        LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                        if (loadingView != null) {
                            i = C37130e.f89430d1;
                            RadioGroup radioGroup = (RadioGroup) C6202b.m24689a(view, i);
                            if (radioGroup != null) {
                                i = C37130e.f89432f1;
                                Button button = (Button) C6202b.m24689a(view, i);
                                if (button != null) {
                                    i = C37130e.f89443r1;
                                    StateView stateView = (StateView) C6202b.m24689a(view, i);
                                    if (stateView != null) {
                                        return new C37942a((NestedScrollView) view, linearLayout, linearLayout2, fixedButtonView, inlineFeedback2, loadingView, radioGroup, button, stateView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37942a m111512d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.action_sheet_loan_cancelation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111511a(inflate);
    }

    /* renamed from: c */
    public NestedScrollView mo3946b() {
        return this.f91077d;
    }
}
