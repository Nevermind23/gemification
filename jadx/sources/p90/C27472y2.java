package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.y2 */
public final class C27472y2 implements C6201a {

    /* renamed from: d */
    private final LayerView f70256d;

    /* renamed from: e */
    public final FrameLayout f70257e;

    /* renamed from: f */
    public final LayerView f70258f;

    /* renamed from: g */
    public final TextView f70259g;

    /* renamed from: h */
    public final ImageView f70260h;

    /* renamed from: i */
    public final TextView f70261i;

    private C27472y2(LayerView layerView, FrameLayout frameLayout, LayerView layerView2, TextView textView, ImageView imageView, TextView textView2) {
        this.f70256d = layerView;
        this.f70257e = frameLayout;
        this.f70258f = layerView2;
        this.f70259g = textView;
        this.f70260h = imageView;
        this.f70261i = textView2;
    }

    /* renamed from: a */
    public static C27472y2 m85195a(View view) {
        int i = C10322k.button_no;
        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
        if (frameLayout != null) {
            i = C10322k.button_yes;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C10322k.f28833fb;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.main_image;
                    ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                    if (imageView != null) {
                        i = C10322k.f28721Dx;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            return new C27472y2((LayerView) view, frameLayout, layerView, textView, imageView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27472y2 m85196d(LayoutInflater layoutInflater) {
        return m85197e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27472y2 m85197e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.dialog_fragment_amex_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85195a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f70256d;
    }
}
