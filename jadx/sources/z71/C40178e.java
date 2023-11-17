package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.e */
public final class C40178e implements C6201a {

    /* renamed from: d */
    private final StateView f95478d;

    /* renamed from: e */
    public final ConstraintLayout f95479e;

    /* renamed from: f */
    public final FixedButtonView f95480f;

    /* renamed from: g */
    public final Input f95481g;

    /* renamed from: h */
    public final LinearLayout f95482h;

    /* renamed from: i */
    public final ProgressBarView f95483i;

    /* renamed from: j */
    public final Input f95484j;

    /* renamed from: k */
    public final Input f95485k;

    /* renamed from: l */
    public final TextView f95486l;

    /* renamed from: m */
    public final Input f95487m;

    /* renamed from: n */
    public final FrameLayout f95488n;

    /* renamed from: o */
    public final Button f95489o;

    /* renamed from: p */
    public final ProgressBarView f95490p;

    /* renamed from: q */
    public final StateView f95491q;

    /* renamed from: r */
    public final Input f95492r;

    /* renamed from: s */
    public final Input f95493s;

    /* renamed from: t */
    public final ProgressBarView f95494t;

    private C40178e(StateView stateView, ConstraintLayout constraintLayout, FixedButtonView fixedButtonView, Input input, LinearLayout linearLayout, ProgressBarView progressBarView, Input input2, Input input3, TextView textView, Input input4, FrameLayout frameLayout, Button button, ProgressBarView progressBarView2, StateView stateView2, Input input5, Input input6, ProgressBarView progressBarView3) {
        this.f95478d = stateView;
        this.f95479e = constraintLayout;
        this.f95480f = fixedButtonView;
        this.f95481g = input;
        this.f95482h = linearLayout;
        this.f95483i = progressBarView;
        this.f95484j = input2;
        this.f95485k = input3;
        this.f95486l = textView;
        this.f95487m = input4;
        this.f95488n = frameLayout;
        this.f95489o = button;
        this.f95490p = progressBarView2;
        this.f95491q = stateView2;
        this.f95492r = input5;
        this.f95493s = input6;
        this.f95494t = progressBarView3;
    }

    /* renamed from: a */
    public static C40178e m116419a(View view) {
        View view2 = view;
        int i = C40030d.f95112s;
        ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
        if (constraintLayout != null) {
            i = C40030d.f95114t;
            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
            if (fixedButtonView != null) {
                i = C40030d.f95117v;
                Input input = (Input) C6202b.m24689a(view2, i);
                if (input != null) {
                    i = C40030d.f95093D;
                    LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                    if (linearLayout != null) {
                        i = C40030d.first_progress_badge;
                        ProgressBarView progressBarView = (ProgressBarView) C6202b.m24689a(view2, i);
                        if (progressBarView != null) {
                            i = C40030d.name_eng;
                            Input input2 = (Input) C6202b.m24689a(view2, i);
                            if (input2 != null) {
                                i = C40030d.name_georgian;
                                Input input3 = (Input) C6202b.m24689a(view2, i);
                                if (input3 != null) {
                                    i = C40030d.person_info_card_description;
                                    TextView textView = (TextView) C6202b.m24689a(view2, i);
                                    if (textView != null) {
                                        i = C40030d.personal_id;
                                        Input input4 = (Input) C6202b.m24689a(view2, i);
                                        if (input4 != null) {
                                            i = C40030d.f95105j0;
                                            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view2, i);
                                            if (frameLayout != null) {
                                                i = C40030d.f95108m0;
                                                Button button = (Button) C6202b.m24689a(view2, i);
                                                if (button != null) {
                                                    i = C40030d.second_progress_badge;
                                                    ProgressBarView progressBarView2 = (ProgressBarView) C6202b.m24689a(view2, i);
                                                    if (progressBarView2 != null) {
                                                        StateView stateView = (StateView) view2;
                                                        i = C40030d.surname_eng;
                                                        Input input5 = (Input) C6202b.m24689a(view2, i);
                                                        if (input5 != null) {
                                                            i = C40030d.surname_georgian;
                                                            Input input6 = (Input) C6202b.m24689a(view2, i);
                                                            if (input6 != null) {
                                                                i = C40030d.third_progress_badge;
                                                                ProgressBarView progressBarView3 = (ProgressBarView) C6202b.m24689a(view2, i);
                                                                if (progressBarView3 != null) {
                                                                    return new C40178e(stateView, constraintLayout, fixedButtonView, input, linearLayout, progressBarView, input2, input3, textView, input4, frameLayout, button, progressBarView2, stateView, input5, input6, progressBarView3);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static C40178e m116420d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.fragment_fill_other_person_insurance_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116419a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f95478d;
    }
}
