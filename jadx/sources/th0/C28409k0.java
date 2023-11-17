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
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: th0.k0 */
public final class C28409k0 implements C6201a {

    /* renamed from: d */
    private final LayerView f72097d;

    /* renamed from: e */
    public final EmptyWidget f72098e;

    /* renamed from: f */
    public final TwoLineTextItem f72099f;

    /* renamed from: g */
    public final TwoLineTextItem f72100g;

    /* renamed from: h */
    public final AppCompatImageView f72101h;

    /* renamed from: i */
    public final TwoLineTextItem f72102i;

    /* renamed from: j */
    public final AppCompatImageView f72103j;

    /* renamed from: k */
    public final LayerView f72104k;

    /* renamed from: l */
    public final TextView f72105l;

    /* renamed from: m */
    public final TwoLineTextItem f72106m;

    /* renamed from: n */
    public final ListItem f72107n;

    private C28409k0(LayerView layerView, EmptyWidget emptyWidget, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, AppCompatImageView appCompatImageView, TwoLineTextItem twoLineTextItem3, AppCompatImageView appCompatImageView2, LayerView layerView2, TextView textView, TwoLineTextItem twoLineTextItem4, ListItem listItem) {
        this.f72097d = layerView;
        this.f72098e = emptyWidget;
        this.f72099f = twoLineTextItem;
        this.f72100g = twoLineTextItem2;
        this.f72101h = appCompatImageView;
        this.f72102i = twoLineTextItem3;
        this.f72103j = appCompatImageView2;
        this.f72104k = layerView2;
        this.f72105l = textView;
        this.f72106m = twoLineTextItem4;
        this.f72107n = listItem;
    }

    /* renamed from: a */
    public static C28409k0 m87157a(View view) {
        int i = C27010e.empty_widget_title;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C27010e.gift_card_amount_value;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                i = C27010e.gift_card_sender_number;
                TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem2 != null) {
                    i = C27010e.gift_card_store_image_view;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        i = C27010e.gift_card_store_two_line_text;
                        TwoLineTextItem twoLineTextItem3 = (TwoLineTextItem) C6202b.m24689a(view, i);
                        if (twoLineTextItem3 != null) {
                            i = C27010e.gift_card_terms_icon;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView2 != null) {
                                i = C27010e.gift_card_terms_icon_layer;
                                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                                if (layerView != null) {
                                    i = C27010e.gift_card_terms_text;
                                    TextView textView = (TextView) C6202b.m24689a(view, i);
                                    if (textView != null) {
                                        i = C27010e.gift_card_validity_text;
                                        TwoLineTextItem twoLineTextItem4 = (TwoLineTextItem) C6202b.m24689a(view, i);
                                        if (twoLineTextItem4 != null) {
                                            i = C27010e.terms_list_item_container;
                                            ListItem listItem = (ListItem) C6202b.m24689a(view, i);
                                            if (listItem != null) {
                                                return new C28409k0((LayerView) view, emptyWidget, twoLineTextItem, twoLineTextItem2, appCompatImageView, twoLineTextItem3, appCompatImageView2, layerView, textView, twoLineTextItem4, listItem);
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
    public static C28409k0 m87158d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_offers_and_applications_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87157a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f72097d;
    }
}
