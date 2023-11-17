package xn0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import sn0.C17901e;
import sn0.C17902f;

/* renamed from: xn0.r */
public final class C18860r implements C6201a {

    /* renamed from: d */
    private final LayerView f52773d;

    /* renamed from: e */
    public final ImageView f52774e;

    private C18860r(LayerView layerView, ImageView imageView) {
        this.f52773d = layerView;
        this.f52774e = imageView;
    }

    /* renamed from: a */
    public static C18860r m63810a(View view) {
        int i = C17901e.f50952H;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            return new C18860r((LayerView) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C18860r m63811d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17902f.list_item_slider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m63810a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f52773d;
    }
}
