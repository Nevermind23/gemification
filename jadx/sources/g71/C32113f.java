package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: g71.f */
public final class C32113f implements C6201a {

    /* renamed from: d */
    private final StateView f78977d;

    /* renamed from: e */
    public final LinearLayout f78978e;

    /* renamed from: f */
    public final ConstraintLayout f78979f;

    /* renamed from: g */
    public final ConstraintLayout f78980g;

    /* renamed from: h */
    public final LoadingView f78981h;

    /* renamed from: i */
    public final LoadingView f78982i;

    /* renamed from: j */
    public final LoadingView f78983j;

    /* renamed from: k */
    public final StateView f78984k;

    /* renamed from: l */
    public final PageDescriptionView f78985l;

    /* renamed from: m */
    public final PageDescriptionView f78986m;

    /* renamed from: n */
    public final FixedButtonView f78987n;

    /* renamed from: o */
    public final RecyclerView f78988o;

    /* renamed from: p */
    public final Button f78989p;

    private C32113f(StateView stateView, LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LoadingView loadingView, LoadingView loadingView2, LoadingView loadingView3, StateView stateView2, PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2, FixedButtonView fixedButtonView, RecyclerView recyclerView, Button button) {
        this.f78977d = stateView;
        this.f78978e = linearLayout;
        this.f78979f = constraintLayout;
        this.f78980g = constraintLayout2;
        this.f78981h = loadingView;
        this.f78982i = loadingView2;
        this.f78983j = loadingView3;
        this.f78984k = stateView2;
        this.f78985l = pageDescriptionView;
        this.f78986m = pageDescriptionView2;
        this.f78987n = fixedButtonView;
        this.f78988o = recyclerView;
        this.f78989p = button;
    }

    /* renamed from: a */
    public static C32113f m94585a(View view) {
        View view2 = view;
        int i = C31284d.f77705q;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
        if (linearLayout != null) {
            i = C31284d.f77709u;
            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
            if (constraintLayout != null) {
                i = C31284d.f77697C;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) C6202b.m24689a(view2, i);
                if (constraintLayout2 != null) {
                    i = C31284d.loading_cell_1;
                    LoadingView loadingView = (LoadingView) C6202b.m24689a(view2, i);
                    if (loadingView != null) {
                        i = C31284d.loading_cell_2;
                        LoadingView loadingView2 = (LoadingView) C6202b.m24689a(view2, i);
                        if (loadingView2 != null) {
                            i = C31284d.loading_cell_3;
                            LoadingView loadingView3 = (LoadingView) C6202b.m24689a(view2, i);
                            if (loadingView3 != null) {
                                StateView stateView = (StateView) view2;
                                i = C31284d.tc_pass_types_page_description;
                                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                                if (pageDescriptionView != null) {
                                    i = C31284d.transport_card_error_page_description;
                                    PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view2, i);
                                    if (pageDescriptionView2 != null) {
                                        i = C31284d.transport_card_pass_types_continue_btn;
                                        FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
                                        if (fixedButtonView != null) {
                                            i = C31284d.transportCardPassTypesRecyclerView;
                                            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
                                            if (recyclerView != null) {
                                                i = C31284d.transport_card_pass_types_refresh;
                                                Button button = (Button) C6202b.m24689a(view2, i);
                                                if (button != null) {
                                                    return new C32113f(stateView, linearLayout, constraintLayout, constraintLayout2, loadingView, loadingView2, loadingView3, stateView, pageDescriptionView, pageDescriptionView2, fixedButtonView, recyclerView, button);
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
    public static C32113f m94586d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.dialog_select_transport_card_pass_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94585a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f78977d;
    }
}
