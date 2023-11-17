package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: th0.d0 */
public final class C28395d0 implements C6201a {

    /* renamed from: d */
    private final LayerView f71998d;

    /* renamed from: e */
    public final EmptyWidget f71999e;

    /* renamed from: f */
    public final TwoLineTextItem f72000f;

    /* renamed from: g */
    public final AppCompatImageView f72001g;

    /* renamed from: h */
    public final TwoLineTextItem f72002h;

    /* renamed from: i */
    public final TextView f72003i;

    /* renamed from: j */
    public final AppCompatImageView f72004j;

    /* renamed from: k */
    public final LayerView f72005k;

    /* renamed from: l */
    public final TextView f72006l;

    /* renamed from: m */
    public final TwoLineTextItem f72007m;

    /* renamed from: n */
    public final ListItem f72008n;

    /* renamed from: o */
    public final InlineFeedback2 f72009o;

    private C28395d0(LayerView layerView, EmptyWidget emptyWidget, TwoLineTextItem twoLineTextItem, AppCompatImageView appCompatImageView, TwoLineTextItem twoLineTextItem2, TextView textView, AppCompatImageView appCompatImageView2, LayerView layerView2, TextView textView2, TwoLineTextItem twoLineTextItem3, ListItem listItem, InlineFeedback2 inlineFeedback2) {
        this.f71998d = layerView;
        this.f71999e = emptyWidget;
        this.f72000f = twoLineTextItem;
        this.f72001g = appCompatImageView;
        this.f72002h = twoLineTextItem2;
        this.f72003i = textView;
        this.f72004j = appCompatImageView2;
        this.f72005k = layerView2;
        this.f72006l = textView2;
        this.f72007m = twoLineTextItem3;
        this.f72008n = listItem;
        this.f72009o = inlineFeedback2;
    }

    /* renamed from: a */
    public static C28395d0 m87100a(View view) {
        int i = C27010e.empty_widget_title;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C27010e.gift_card_sender;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                i = C27010e.gift_card_store_image_view;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C27010e.gift_card_store_two_line_text;
                    TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                    if (twoLineTextItem2 != null) {
                        i = C27010e.gift_card_stores_text;
                        TextView textView = (TextView) C6202b.m24689a(view, i);
                        if (textView != null) {
                            i = C27010e.gift_card_terms_icon;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView2 != null) {
                                i = C27010e.gift_card_terms_icon_layer;
                                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                                if (layerView != null) {
                                    i = C27010e.gift_card_terms_text;
                                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                                    if (textView2 != null) {
                                        i = C27010e.gift_card_validity;
                                        TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                        if (twoLineTextItem3 != null) {
                                            i = C27010e.stores_list_item_container;
                                            ListItem listItem = (ListItem) C6202b.m24689a(view, i);
                                            if (listItem != null) {
                                                i = C27010e.terms_feedback;
                                                InlineFeedback2 inlineFeedback2 = (InlineFeedback2) C6202b.m24689a(view, i);
                                                if (inlineFeedback2 != null) {
                                                    return new C28395d0((LayerView) view, emptyWidget, twoLineTextItem, appCompatImageView, twoLineTextItem2, textView, appCompatImageView2, layerView, textView2, twoLineTextItem3, listItem, inlineFeedback2);
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
    public static C28395d0 m87101d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87100a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f71998d;
    }
}
