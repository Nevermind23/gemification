package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.accountpicker.AccountPickerView;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.progressbar.ProgressBarView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.g */
public final class C40180g implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f95500d;

    /* renamed from: e */
    public final AccountPickerView f95501e;

    /* renamed from: f */
    public final TwoLineTextItem f95502f;

    /* renamed from: g */
    public final TwoLineTextItem f95503g;

    /* renamed from: h */
    public final TwoLineTextItem f95504h;

    /* renamed from: i */
    public final TwoLineTextItem f95505i;

    /* renamed from: j */
    public final ProgressBarView f95506j;

    /* renamed from: k */
    public final EmptyWidget f95507k;

    /* renamed from: l */
    public final TwoLineTextItem f95508l;

    /* renamed from: m */
    public final TwoLineTextItem f95509m;

    /* renamed from: n */
    public final FixedButtonView f95510n;

    /* renamed from: o */
    public final TwoLineTextItem f95511o;

    /* renamed from: p */
    public final TwoLineTextItem f95512p;

    /* renamed from: q */
    public final FrameLayout f95513q;

    /* renamed from: r */
    public final TwoLineTextItem f95514r;

    /* renamed from: s */
    public final ProgressBarView f95515s;

    /* renamed from: t */
    public final TwoLineTextItem f95516t;

    /* renamed from: u */
    public final CheckboxView f95517u;

    /* renamed from: v */
    public final FrameLayout f95518v;

    /* renamed from: w */
    public final ProgressBarView f95519w;

    private C40180g(ConstraintLayout constraintLayout, AccountPickerView accountPickerView, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, ProgressBarView progressBarView, EmptyWidget emptyWidget, TwoLineTextItem twoLineTextItem5, TwoLineTextItem twoLineTextItem6, FixedButtonView fixedButtonView, TwoLineTextItem twoLineTextItem7, TwoLineTextItem twoLineTextItem8, FrameLayout frameLayout, TwoLineTextItem twoLineTextItem9, ProgressBarView progressBarView2, TwoLineTextItem twoLineTextItem10, CheckboxView checkboxView, FrameLayout frameLayout2, ProgressBarView progressBarView3) {
        this.f95500d = constraintLayout;
        this.f95501e = accountPickerView;
        this.f95502f = twoLineTextItem;
        this.f95503g = twoLineTextItem2;
        this.f95504h = twoLineTextItem3;
        this.f95505i = twoLineTextItem4;
        this.f95506j = progressBarView;
        this.f95507k = emptyWidget;
        this.f95508l = twoLineTextItem5;
        this.f95509m = twoLineTextItem6;
        this.f95510n = fixedButtonView;
        this.f95511o = twoLineTextItem7;
        this.f95512p = twoLineTextItem8;
        this.f95513q = frameLayout;
        this.f95514r = twoLineTextItem9;
        this.f95515s = progressBarView2;
        this.f95516t = twoLineTextItem10;
        this.f95517u = checkboxView;
        this.f95518v = frameLayout2;
        this.f95519w = progressBarView3;
    }

    /* renamed from: a */
    public static C40180g m116427a(View view) {
        View view2 = view;
        int i = C40030d.f95100b;
        AccountPickerView accountPickerView = (AccountPickerView) C6202b.m24689a(view2, i);
        if (accountPickerView != null) {
            i = C40030d.company;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view2, i);
            if (twoLineTextItem != null) {
                i = C40030d.f95117v;
                TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                if (twoLineTextItem2 != null) {
                    i = C40030d.endDate;
                    TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                    if (twoLineTextItem3 != null) {
                        i = C40030d.first_name;
                        TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                        if (twoLineTextItem4 != null) {
                            i = C40030d.first_progress_badge;
                            ProgressBarView progressBarView = (ProgressBarView) C6202b.m24689a(view2, i);
                            if (progressBarView != null) {
                                i = C40030d.insured_person_info;
                                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view2, i);
                                if (emptyWidget != null) {
                                    i = C40030d.last_name;
                                    TwoLineTextItem twoLineTextItem5 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                    if (twoLineTextItem5 != null) {
                                        i = C40030d.max_limit;
                                        TwoLineTextItem twoLineTextItem6 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                        if (twoLineTextItem6 != null) {
                                            i = C40030d.f95101b0;
                                            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
                                            if (fixedButtonView != null) {
                                                i = C40030d.personal_id;
                                                TwoLineTextItem twoLineTextItem7 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                                if (twoLineTextItem7 != null) {
                                                    i = C40030d.price;
                                                    TwoLineTextItem twoLineTextItem8 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                                    if (twoLineTextItem8 != null) {
                                                        i = C40030d.f95103i0;
                                                        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view2, i);
                                                        if (frameLayout != null) {
                                                            i = C40030d.risk_insurance;
                                                            TwoLineTextItem twoLineTextItem9 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                                            if (twoLineTextItem9 != null) {
                                                                i = C40030d.second_progress_badge;
                                                                ProgressBarView progressBarView2 = (ProgressBarView) C6202b.m24689a(view2, i);
                                                                if (progressBarView2 != null) {
                                                                    i = C40030d.startDate;
                                                                    TwoLineTextItem twoLineTextItem10 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                                                    if (twoLineTextItem10 != null) {
                                                                        i = C40030d.f95119w0;
                                                                        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view2, i);
                                                                        if (checkboxView != null) {
                                                                            i = C40030d.f95121x0;
                                                                            FrameLayout frameLayout2 = (FrameLayout) C6202b.m24689a(view2, i);
                                                                            if (frameLayout2 != null) {
                                                                                i = C40030d.third_progress_badge;
                                                                                ProgressBarView progressBarView3 = (ProgressBarView) C6202b.m24689a(view2, i);
                                                                                if (progressBarView3 != null) {
                                                                                    return new C40180g((ConstraintLayout) view2, accountPickerView, twoLineTextItem, twoLineTextItem2, twoLineTextItem3, twoLineTextItem4, progressBarView, emptyWidget, twoLineTextItem5, twoLineTextItem6, fixedButtonView, twoLineTextItem7, twoLineTextItem8, frameLayout, twoLineTextItem9, progressBarView2, twoLineTextItem10, checkboxView, frameLayout2, progressBarView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40180g m116428d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.fragment_insurance_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116427a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f95500d;
    }
}
