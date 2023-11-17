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

/* renamed from: eo.f0 */
public final class C12742f0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37718d;

    /* renamed from: e */
    public final TextView f37719e;

    /* renamed from: f */
    public final TextView f37720f;

    /* renamed from: g */
    public final ImageView f37721g;

    private C12742f0(LayerView layerView, TextView textView, TextView textView2, ImageView imageView) {
        this.f37718d = layerView;
        this.f37719e = textView;
        this.f37720f = textView2;
        this.f37721g = imageView;
    }

    /* renamed from: a */
    public static C12742f0 m48361a(View view) {
        int i = C10114f.become_solo_description;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10114f.become_solo_text;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C10114f.solo_image;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    return new C12742f0((LayerView) view, textView, textView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12742f0 m48362d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_become_solo_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48361a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37718d;
    }
}
