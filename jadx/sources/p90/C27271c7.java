package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.c7 */
public final class C27271c7 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68489d;

    /* renamed from: e */
    public final ImageView f68490e;

    /* renamed from: f */
    public final LayerView f68491f;

    /* renamed from: g */
    public final TextView f68492g;

    private C27271c7(LinearLayout linearLayout, ImageView imageView, LayerView layerView, TextView textView) {
        this.f68489d = linearLayout;
        this.f68490e = imageView;
        this.f68491f = layerView;
        this.f68492g = textView;
    }

    /* renamed from: a */
    public static C27271c7 m84384a(View view) {
        int i = C10322k.remittance_item_icon;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.remittance_item_icon_layer;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C10322k.remittance_item_name;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C27271c7((LinearLayout) view, imageView, layerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27271c7 m84385d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.layout_money_transfer_type_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84384a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68489d;
    }
}
