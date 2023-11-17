package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: g71.k */
public final class C32118k implements C6201a {

    /* renamed from: d */
    private final StateView f79022d;

    /* renamed from: e */
    public final RecyclerView f79023e;

    /* renamed from: f */
    public final ConstraintLayout f79024f;

    /* renamed from: g */
    public final PageDescriptionView f79025g;

    /* renamed from: h */
    public final LayerView f79026h;

    /* renamed from: i */
    public final LinearLayout f79027i;

    /* renamed from: j */
    public final SwipeRefreshLayout f79028j;

    /* renamed from: k */
    public final FixedButtonView f79029k;

    /* renamed from: l */
    public final FixedButtonView f79030l;

    /* renamed from: m */
    public final TextView f79031m;

    /* renamed from: n */
    public final TextView f79032n;

    /* renamed from: o */
    public final TextView f79033o;

    /* renamed from: p */
    public final TextView f79034p;

    /* renamed from: q */
    public final PageDescriptionView f79035q;

    /* renamed from: r */
    public final InlineFeedback f79036r;

    /* renamed from: s */
    public final LayerView f79037s;

    /* renamed from: t */
    public final LayerView f79038t;

    /* renamed from: u */
    public final LayerView f79039u;

    /* renamed from: v */
    public final LayerView f79040v;

    /* renamed from: w */
    public final ConstraintLayout f79041w;

    /* renamed from: x */
    public final Button f79042x;

    private C32118k(StateView stateView, RecyclerView recyclerView, ConstraintLayout constraintLayout, PageDescriptionView pageDescriptionView, LayerView layerView, LinearLayout linearLayout, SwipeRefreshLayout swipeRefreshLayout, FixedButtonView fixedButtonView, FixedButtonView fixedButtonView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, PageDescriptionView pageDescriptionView2, InlineFeedback inlineFeedback, LayerView layerView2, LayerView layerView3, LayerView layerView4, LayerView layerView5, ConstraintLayout constraintLayout2, Button button) {
        this.f79022d = stateView;
        this.f79023e = recyclerView;
        this.f79024f = constraintLayout;
        this.f79025g = pageDescriptionView;
        this.f79026h = layerView;
        this.f79027i = linearLayout;
        this.f79028j = swipeRefreshLayout;
        this.f79029k = fixedButtonView;
        this.f79030l = fixedButtonView2;
        this.f79031m = textView;
        this.f79032n = textView2;
        this.f79033o = textView3;
        this.f79034p = textView4;
        this.f79035q = pageDescriptionView2;
        this.f79036r = inlineFeedback;
        this.f79037s = layerView2;
        this.f79038t = layerView3;
        this.f79039u = layerView4;
        this.f79040v = layerView5;
        this.f79041w = constraintLayout2;
        this.f79042x = button;
    }

    /* renamed from: a */
    public static C32118k m94605a(View view) {
        View view2 = view;
        int i = C31284d.active_passes;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
        if (recyclerView != null) {
            i = C31284d.f77710v;
            ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view2, i);
            if (constraintLayout != null) {
                i = C31284d.f77711w;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view2, i);
                if (pageDescriptionView != null) {
                    i = C31284d.f77699G;
                    LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                    if (layerView != null) {
                        i = C31284d.no_content_layout;
                        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                        if (linearLayout != null) {
                            i = C31284d.f77704S;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C6202b.m24689a(view2, i);
                            if (swipeRefreshLayout != null) {
                                i = C31284d.tc_buy_button;
                                FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
                                if (fixedButtonView != null) {
                                    i = C31284d.tc_continue_btn;
                                    FixedButtonView fixedButtonView2 = (FixedButtonView) C6202b.m24689a(view2, i);
                                    if (fixedButtonView2 != null) {
                                        i = C31284d.tc_info_1;
                                        TextView textView = (TextView) C6202b.m24689a(view2, i);
                                        if (textView != null) {
                                            i = C31284d.tc_info_2;
                                            TextView textView2 = (TextView) C6202b.m24689a(view2, i);
                                            if (textView2 != null) {
                                                i = C31284d.tc_info_3;
                                                TextView textView3 = (TextView) C6202b.m24689a(view2, i);
                                                if (textView3 != null) {
                                                    i = C31284d.tc_info_4;
                                                    TextView textView4 = (TextView) C6202b.m24689a(view2, i);
                                                    if (textView4 != null) {
                                                        i = C31284d.tc_info_page_description;
                                                        PageDescriptionView pageDescriptionView2 = (PageDescriptionView) C6202b.m24689a(view2, i);
                                                        if (pageDescriptionView2 != null) {
                                                            i = C31284d.tc_inline_feedback;
                                                            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view2, i);
                                                            if (inlineFeedback != null) {
                                                                i = C31284d.tc_layer_view_1;
                                                                LayerView layerView2 = (LayerView) C6202b.m24689a(view2, i);
                                                                if (layerView2 != null) {
                                                                    i = C31284d.tc_layer_view_2;
                                                                    LayerView layerView3 = (LayerView) C6202b.m24689a(view2, i);
                                                                    if (layerView3 != null) {
                                                                        i = C31284d.tc_layer_view_3;
                                                                        LayerView layerView4 = (LayerView) C6202b.m24689a(view2, i);
                                                                        if (layerView4 != null) {
                                                                            i = C31284d.tc_layer_view_4;
                                                                            LayerView layerView5 = (LayerView) C6202b.m24689a(view2, i);
                                                                            if (layerView5 != null) {
                                                                                i = C31284d.tc_layout_content;
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) C6202b.m24689a(view2, i);
                                                                                if (constraintLayout2 != null) {
                                                                                    i = C31284d.tc_refresh_button;
                                                                                    Button button = (Button) C6202b.m24689a(view2, i);
                                                                                    if (button != null) {
                                                                                        return new C32118k((StateView) view2, recyclerView, constraintLayout, pageDescriptionView, layerView, linearLayout, swipeRefreshLayout, fixedButtonView, fixedButtonView2, textView, textView2, textView3, textView4, pageDescriptionView2, inlineFeedback, layerView2, layerView3, layerView4, layerView5, constraintLayout2, button);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32118k m94606d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.fragment_transport_card_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94605a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f79022d;
    }
}
