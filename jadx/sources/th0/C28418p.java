package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagestate.PageState;

/* renamed from: th0.p */
public final class C28418p implements C6201a {

    /* renamed from: d */
    private final ScrollView f72160d;

    /* renamed from: e */
    public final LayerView f72161e;

    /* renamed from: f */
    public final LinearLayout f72162f;

    /* renamed from: g */
    public final EmptyWidget f72163g;

    /* renamed from: h */
    public final TwoLineTextItem f72164h;

    /* renamed from: i */
    public final TwoLineTextItem f72165i;

    /* renamed from: j */
    public final AppCompatImageView f72166j;

    /* renamed from: k */
    public final TwoLineTextItem f72167k;

    /* renamed from: l */
    public final TwoLineTextItem f72168l;

    /* renamed from: m */
    public final ScrollView f72169m;

    /* renamed from: n */
    public final LinearLayout f72170n;

    /* renamed from: o */
    public final TextView f72171o;

    /* renamed from: p */
    public final PageState f72172p;

    /* renamed from: q */
    public final LayerView f72173q;

    /* renamed from: r */
    public final LinearLayout f72174r;

    /* renamed from: s */
    public final Button f72175s;

    /* renamed from: t */
    public final AppCompatImageView f72176t;

    /* renamed from: u */
    public final LayerView f72177u;

    /* renamed from: v */
    public final TextView f72178v;

    private C28418p(ScrollView scrollView, LayerView layerView, LinearLayout linearLayout, EmptyWidget emptyWidget, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, AppCompatImageView appCompatImageView, TwoLineTextItem twoLineTextItem3, TwoLineTextItem twoLineTextItem4, ScrollView scrollView2, LinearLayout linearLayout2, TextView textView, PageState pageState, LayerView layerView2, LinearLayout linearLayout3, Button button, AppCompatImageView appCompatImageView2, LayerView layerView3, TextView textView2) {
        this.f72160d = scrollView;
        this.f72161e = layerView;
        this.f72162f = linearLayout;
        this.f72163g = emptyWidget;
        this.f72164h = twoLineTextItem;
        this.f72165i = twoLineTextItem2;
        this.f72166j = appCompatImageView;
        this.f72167k = twoLineTextItem3;
        this.f72168l = twoLineTextItem4;
        this.f72169m = scrollView2;
        this.f72170n = linearLayout2;
        this.f72171o = textView;
        this.f72172p = pageState;
        this.f72173q = layerView2;
        this.f72174r = linearLayout3;
        this.f72175s = button;
        this.f72176t = appCompatImageView2;
        this.f72177u = layerView3;
        this.f72178v = textView2;
    }

    /* renamed from: a */
    public static C28418p m87193a(View view) {
        View view2 = view;
        int i = C27010e.details_layer_container;
        LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
        if (layerView != null) {
            i = C27010e.details_linear_container;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
            if (linearLayout != null) {
                i = C27010e.empty_widget_title;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view2, i);
                if (emptyWidget != null) {
                    i = C27010e.gift_card_amount_two_line_text;
                    TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view2, i);
                    if (twoLineTextItem != null) {
                        i = C27010e.gift_card_mobile_number_two_line_text;
                        TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                        if (twoLineTextItem2 != null) {
                            i = C27010e.gift_card_store_image_view;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view2, i);
                            if (appCompatImageView != null) {
                                i = C27010e.gift_card_store_two_line_text;
                                TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                if (twoLineTextItem3 != null) {
                                    i = C27010e.gift_card_validity_two_line_text;
                                    TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view2, i);
                                    if (twoLineTextItem4 != null) {
                                        ScrollView scrollView = (ScrollView) view2;
                                        i = C27010e.gift_cards_success_container;
                                        LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view2, i);
                                        if (linearLayout2 != null) {
                                            i = C27010e.information_text_view;
                                            TextView textView = (TextView) C6202b.m24689a(view2, i);
                                            if (textView != null) {
                                                i = C27010e.f67835v1;
                                                PageState pageState = (PageState) C6202b.m24689a(view2, i);
                                                if (pageState != null) {
                                                    i = C27010e.page_state_layer_container;
                                                    LayerView layerView2 = (LayerView) C6202b.m24689a(view2, i);
                                                    if (layerView2 != null) {
                                                        i = C27010e.page_state_linear_container;
                                                        LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view2, i);
                                                        if (linearLayout3 != null) {
                                                            i = C27010e.f67796F1;
                                                            Button button = (Button) C6202b.m24689a(view2, i);
                                                            if (button != null) {
                                                                i = C27010e.terms_conditions_image_view;
                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view2, i);
                                                                if (appCompatImageView2 != null) {
                                                                    i = C27010e.terms_icon_layer_container;
                                                                    LayerView layerView3 = (LayerView) C6202b.m24689a(view2, i);
                                                                    if (layerView3 != null) {
                                                                        i = C27010e.terms_text_view;
                                                                        TextView textView2 = (TextView) C6202b.m24689a(view2, i);
                                                                        if (textView2 != null) {
                                                                            return new C28418p(scrollView, layerView, linearLayout, emptyWidget, twoLineTextItem, twoLineTextItem2, appCompatImageView, twoLineTextItem3, twoLineTextItem4, scrollView, linearLayout2, textView, pageState, layerView2, linearLayout3, button, appCompatImageView2, layerView3, textView2);
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
    public static C28418p m87194d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.fragment_gift_cards_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87193a(inflate);
    }

    /* renamed from: c */
    public ScrollView mo3946b() {
        return this.f72160d;
    }
}
