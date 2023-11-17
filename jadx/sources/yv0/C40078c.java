package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import uv0.C39106c;
import uv0.C39107d;

/* renamed from: yv0.c */
public final class C40078c implements C6201a {

    /* renamed from: d */
    private final StateView f95256d;

    /* renamed from: e */
    public final Input f95257e;

    /* renamed from: f */
    public final CreditCardSmallPickerView f95258f;

    /* renamed from: g */
    public final EmptyWidget f95259g;

    /* renamed from: h */
    public final EmptyWidget f95260h;

    /* renamed from: i */
    public final EmptyWidget f95261i;

    /* renamed from: j */
    public final ConstraintLayout f95262j;

    /* renamed from: k */
    public final PageDescriptionView f95263k;

    /* renamed from: l */
    public final Input f95264l;

    /* renamed from: m */
    public final LayerView f95265m;

    /* renamed from: n */
    public final ConstraintLayout f95266n;

    /* renamed from: o */
    public final LoadingView f95267o;

    /* renamed from: p */
    public final Input f95268p;

    /* renamed from: q */
    public final FixedButtonView f95269q;

    /* renamed from: r */
    public final Button f95270r;

    /* renamed from: s */
    public final RecyclerView f95271s;

    /* renamed from: t */
    public final ScrollView f95272t;

    /* renamed from: u */
    public final StateView f95273u;

    private C40078c(StateView stateView, Input input, CreditCardSmallPickerView creditCardSmallPickerView, EmptyWidget emptyWidget, EmptyWidget emptyWidget2, EmptyWidget emptyWidget3, ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, Input input2, LayerView layerView, ConstraintLayout constraintLayout2, LoadingView loadingView, Input input3, FixedButtonView fixedButtonView, Button button, RecyclerView recyclerView, ScrollView scrollView, StateView stateView2) {
        this.f95256d = stateView;
        this.f95257e = input;
        this.f95258f = creditCardSmallPickerView;
        this.f95259g = emptyWidget;
        this.f95260h = emptyWidget2;
        this.f95261i = emptyWidget3;
        this.f95262j = constraintLayout;
        this.f95263k = pageDescriptionView;
        this.f95264l = input2;
        this.f95265m = layerView;
        this.f95266n = constraintLayout2;
        this.f95267o = loadingView;
        this.f95268p = input3;
        this.f95269q = fixedButtonView;
        this.f95270r = button;
        this.f95271s = recyclerView;
        this.f95272t = scrollView;
        this.f95273u = stateView2;
    }

    /* renamed from: a */
    public static C40078c m116117a(View view) {
        View view2 = view;
        int i = C39106c.f93249d;
        Input input = (Input) C6202b.m24689a(view2, i);
        if (input != null) {
            i = C39106c.f93250e;
            CreditCardSmallPickerView creditCardSmallPickerView = (CreditCardSmallPickerView) C6202b.m24689a(view2, i);
            if (creditCardSmallPickerView != null) {
                i = C39106c.empty_widget_contacts;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view2, i);
                if (emptyWidget != null) {
                    i = C39106c.empty_widget_from;
                    EmptyWidget emptyWidget2 = (EmptyWidget) C6202b.m24689a(view2, i);
                    if (emptyWidget2 != null) {
                        i = C39106c.empty_widget_to;
                        EmptyWidget emptyWidget3 = (EmptyWidget) C6202b.m24689a(view2, i);
                        if (emptyWidget3 != null) {
                            i = C39106c.f93252j;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
                            if (constraintLayout != null) {
                                i = C39106c.f93253k;
                                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                                if (pageDescriptionView != null) {
                                    i = C39106c.f93254l;
                                    Input input2 = (Input) C6202b.m24689a(view2, i);
                                    if (input2 != null) {
                                        i = C39106c.layer_data;
                                        LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                                        if (layerView != null) {
                                            i = C39106c.layout_content;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C6202b.m24689a(view2, i);
                                            if (constraintLayout2 != null) {
                                                i = C39106c.f93255p;
                                                LoadingView loadingView = (LoadingView) C6202b.m24689a(view2, i);
                                                if (loadingView != null) {
                                                    i = C39106c.p2p_input_destination;
                                                    Input input3 = (Input) C6202b.m24689a(view2, i);
                                                    if (input3 != null) {
                                                        i = C39106c.p2p_transfer_money;
                                                        FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
                                                        if (fixedButtonView != null) {
                                                            i = C39106c.f93246E;
                                                            Button button = (Button) C6202b.m24689a(view2, i);
                                                            if (button != null) {
                                                                i = C39106c.rv_contacts;
                                                                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
                                                                if (recyclerView != null) {
                                                                    i = C39106c.f93247H;
                                                                    ScrollView scrollView = (ScrollView) C6202b.m24689a(view2, i);
                                                                    if (scrollView != null) {
                                                                        StateView stateView = (StateView) view2;
                                                                        return new C40078c(stateView, input, creditCardSmallPickerView, emptyWidget, emptyWidget2, emptyWidget3, constraintLayout, pageDescriptionView, input2, layerView, constraintLayout2, loadingView, input3, fixedButtonView, button, recyclerView, scrollView, stateView);
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
    public static C40078c m116118d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.fragment_p2p_send, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116117a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f95256d;
    }
}
