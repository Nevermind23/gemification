package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.s6 */
public final class C27422s6 implements C6201a {

    /* renamed from: d */
    private final LayerView f69796d;

    /* renamed from: e */
    public final View f69797e;

    /* renamed from: f */
    public final TextView f69798f;

    /* renamed from: g */
    public final ImageView f69799g;

    private C27422s6(LayerView layerView, View view, TextView textView, ImageView imageView) {
        this.f69796d = layerView;
        this.f69797e = view;
        this.f69798f = textView;
        this.f69799g = imageView;
    }

    /* renamed from: a */
    public static C27422s6 m84998a(View view) {
        int i = C10322k.item_transfer_within_bog_divider;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10322k.item_transfer_within_bog_text;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.item_transfer_within_bog_type_icon;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    return new C27422s6((LayerView) view, a, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27422s6 m84999d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_transfer_within_bog_list_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84998a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f69796d;
    }
}
