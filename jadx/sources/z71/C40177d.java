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
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.d */
public final class C40177d implements C6201a {

    /* renamed from: d */
    private final StateView f95458d;

    /* renamed from: e */
    public final EmptyWidget f95459e;

    /* renamed from: f */
    public final ConstraintLayout f95460f;

    /* renamed from: g */
    public final FixedButtonView f95461g;

    /* renamed from: h */
    public final ChipGroup f95462h;

    /* renamed from: i */
    public final Input f95463i;

    /* renamed from: j */
    public final Input f95464j;

    /* renamed from: k */
    public final LinearLayout f95465k;

    /* renamed from: l */
    public final ProgressBarView f95466l;

    /* renamed from: m */
    public final TextView f95467m;

    /* renamed from: n */
    public final TextView f95468n;

    /* renamed from: o */
    public final TextView f95469o;

    /* renamed from: p */
    public final Input f95470p;

    /* renamed from: q */
    public final Input f95471q;

    /* renamed from: r */
    public final FrameLayout f95472r;

    /* renamed from: s */
    public final Button f95473s;

    /* renamed from: t */
    public final ProgressBarView f95474t;

    /* renamed from: u */
    public final Input f95475u;

    /* renamed from: v */
    public final StateView f95476v;

    /* renamed from: w */
    public final ProgressBarView f95477w;

    private C40177d(StateView stateView, EmptyWidget emptyWidget, ConstraintLayout constraintLayout, FixedButtonView fixedButtonView, ChipGroup chipGroup, Input input, Input input2, LinearLayout linearLayout, ProgressBarView progressBarView, TextView textView, TextView textView2, TextView textView3, Input input3, Input input4, FrameLayout frameLayout, Button button, ProgressBarView progressBarView2, Input input5, StateView stateView2, ProgressBarView progressBarView3) {
        this.f95458d = stateView;
        this.f95459e = emptyWidget;
        this.f95460f = constraintLayout;
        this.f95461g = fixedButtonView;
        this.f95462h = chipGroup;
        this.f95463i = input;
        this.f95464j = input2;
        this.f95465k = linearLayout;
        this.f95466l = progressBarView;
        this.f95467m = textView;
        this.f95468n = textView2;
        this.f95469o = textView3;
        this.f95470p = input3;
        this.f95471q = input4;
        this.f95472r = frameLayout;
        this.f95473s = button;
        this.f95474t = progressBarView2;
        this.f95475u = input5;
        this.f95476v = stateView2;
        this.f95477w = progressBarView3;
    }

    /* renamed from: a */
    public static C40177d m116415a(View view) {
        View view2 = view;
        int i = C40030d.contact_info_title;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view2, i);
        if (emptyWidget != null) {
            i = C40030d.f95112s;
            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
            if (constraintLayout != null) {
                i = C40030d.f95114t;
                FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
                if (fixedButtonView != null) {
                    i = C40030d.f95116u;
                    ChipGroup chipGroup = (ChipGroup) C6202b.m24689a(view2, i);
                    if (chipGroup != null) {
                        i = C40030d.f95122y;
                        Input input = (Input) C6202b.m24689a(view2, i);
                        if (input != null) {
                            i = C40030d.f95088A;
                            Input input2 = (Input) C6202b.m24689a(view2, i);
                            if (input2 != null) {
                                i = C40030d.f95093D;
                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                                if (linearLayout != null) {
                                    i = C40030d.first_progress_badge;
                                    ProgressBarView progressBarView = (ProgressBarView) C6202b.m24689a(view2, i);
                                    if (progressBarView != null) {
                                        i = C40030d.limit;
                                        TextView textView = (TextView) C6202b.m24689a(view2, i);
                                        if (textView != null) {
                                            i = C40030d.limit_header;
                                            TextView textView2 = (TextView) C6202b.m24689a(view2, i);
                                            if (textView2 != null) {
                                                i = C40030d.limit_suffix;
                                                TextView textView3 = (TextView) C6202b.m24689a(view2, i);
                                                if (textView3 != null) {
                                                    i = C40030d.f95096V;
                                                    Input input3 = (Input) C6202b.m24689a(view2, i);
                                                    if (input3 != null) {
                                                        i = C40030d.person_select_box;
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
                                                                        i = C40030d.f95113s0;
                                                                        Input input5 = (Input) C6202b.m24689a(view2, i);
                                                                        if (input5 != null) {
                                                                            StateView stateView = (StateView) view2;
                                                                            i = C40030d.third_progress_badge;
                                                                            ProgressBarView progressBarView3 = (ProgressBarView) C6202b.m24689a(view2, i);
                                                                            if (progressBarView3 != null) {
                                                                                return new C40177d(stateView, emptyWidget, constraintLayout, fixedButtonView, chipGroup, input, input2, linearLayout, progressBarView, textView, textView2, textView3, input3, input4, frameLayout, button, progressBarView2, input5, stateView, progressBarView3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40177d m116416d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.fragment_fill_insurance_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116415a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f95458d;
    }
}
