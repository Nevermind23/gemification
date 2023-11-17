package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.k0 */
public final class C12753k0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37765d;

    /* renamed from: e */
    public final LayerView f37766e;

    /* renamed from: f */
    public final View f37767f;

    /* renamed from: g */
    public final ImageView f37768g;

    /* renamed from: h */
    public final TextView f37769h;

    /* renamed from: i */
    public final TextView f37770i;

    private C12753k0(LayerView layerView, LayerView layerView2, View view, ImageView imageView, TextView textView, TextView textView2) {
        this.f37765d = layerView;
        this.f37766e = layerView2;
        this.f37767f = view;
        this.f37768g = imageView;
        this.f37769h = textView;
        this.f37770i = textView2;
    }

    /* renamed from: a */
    public static C12753k0 m48406a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C10114f.f27944Y;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C10114f.info_link_icon;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10114f.info_link_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10114f.info_link_title;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        return new C12753k0(layerView, layerView, a, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12753k0 m48407d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_benefit_link, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48406a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37765d;
    }
}
