package yv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
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

/* renamed from: yv0.f */
public final class C40081f implements C6201a {

    /* renamed from: d */
    private final StateView f95284d;

    /* renamed from: e */
    public final ConstraintLayout f95285e;

    /* renamed from: f */
    public final PageDescriptionView f95286f;

    /* renamed from: g */
    public final LayerView f95287g;

    /* renamed from: h */
    public final ConstraintLayout f95288h;

    /* renamed from: i */
    public final LoadingView f95289i;

    /* renamed from: j */
    public final Input f95290j;

    /* renamed from: k */
    public final FixedButtonView f95291k;

    /* renamed from: l */
    public final CreditCardSmallPickerView f95292l;

    /* renamed from: m */
    public final EmptyWidget f95293m;

    /* renamed from: n */
    public final Button f95294n;

    /* renamed from: o */
    public final StateView f95295o;

    private C40081f(StateView stateView, ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, LayerView layerView, ConstraintLayout constraintLayout2, LoadingView loadingView, Input input, FixedButtonView fixedButtonView, CreditCardSmallPickerView creditCardSmallPickerView, EmptyWidget emptyWidget, Button button, StateView stateView2) {
        this.f95284d = stateView;
        this.f95285e = constraintLayout;
        this.f95286f = pageDescriptionView;
        this.f95287g = layerView;
        this.f95288h = constraintLayout2;
        this.f95289i = loadingView;
        this.f95290j = input;
        this.f95291k = fixedButtonView;
        this.f95292l = creditCardSmallPickerView;
        this.f95293m = emptyWidget;
        this.f95294n = button;
        this.f95295o = stateView2;
    }

    /* renamed from: a */
    public static C40081f m116129a(View view) {
        int i = C39106c.f93252j;
        ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
        if (constraintLayout != null) {
            i = C39106c.f93253k;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C39106c.inputs_layer;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C39106c.layout_content;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C6202b.m24689a(view, i);
                    if (constraintLayout2 != null) {
                        i = C39106c.f93255p;
                        LoadingView loadingView = (LoadingView) C6202b.m24689a(view, i);
                        if (loadingView != null) {
                            i = C39106c.p2p_top_up_amount_input;
                            Input input = (Input) C6202b.m24689a(view, i);
                            if (input != null) {
                                i = C39106c.p2p_top_up_btn;
                                FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
                                if (fixedButtonView != null) {
                                    i = C39106c.p2p_top_up_card_picker;
                                    CreditCardSmallPickerView creditCardSmallPickerView = (CreditCardSmallPickerView) C6202b.m24689a(view, i);
                                    if (creditCardSmallPickerView != null) {
                                        i = C39106c.p2p_top_up_empty_widget;
                                        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                                        if (emptyWidget != null) {
                                            i = C39106c.f93246E;
                                            Button button = (Button) C6202b.m24689a(view, i);
                                            if (button != null) {
                                                StateView stateView = (StateView) view;
                                                return new C40081f(stateView, constraintLayout, pageDescriptionView, layerView, constraintLayout2, loadingView, input, fixedButtonView, creditCardSmallPickerView, emptyWidget, button, stateView);
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
    public static C40081f m116130d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39107d.fragment_p2p_tupup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116129a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f95284d;
    }
}
