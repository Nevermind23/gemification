package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: th0.a0 */
public final class C28389a0 implements C6201a {

    /* renamed from: d */
    private final LayerView f71975d;

    /* renamed from: e */
    public final LinearLayout f71976e;

    /* renamed from: f */
    public final LayerView f71977f;

    /* renamed from: g */
    public final TwoLineTextItem f71978g;

    /* renamed from: h */
    public final AppCompatImageView f71979h;

    private C28389a0(LayerView layerView, LinearLayout linearLayout, LayerView layerView2, TwoLineTextItem twoLineTextItem, AppCompatImageView appCompatImageView) {
        this.f71975d = layerView;
        this.f71976e = linearLayout;
        this.f71977f = layerView2;
        this.f71978g = twoLineTextItem;
        this.f71979h = appCompatImageView;
    }

    /* renamed from: a */
    public static C28389a0 m87076a(View view) {
        int i = C27010e.gift_card_code_banner_container;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C27010e.gift_card_code_layer_container;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C27010e.gift_card_code_two_line_text;
                TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
                if (twoLineTextItem != null) {
                    i = C27010e.terms_conditions_image_view;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        return new C28389a0((LayerView) view, linearLayout, layerView, twoLineTextItem, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28389a0 m87077d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_code_banner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87076a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f71975d;
    }
}
