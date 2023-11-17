package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.n */
public final class C9971n implements C6201a {

    /* renamed from: d */
    private final View f27281d;

    /* renamed from: e */
    public final AppCompatImageView f27282e;

    /* renamed from: f */
    public final LayerView f27283f;

    /* renamed from: g */
    public final TextView f27284g;

    private C9971n(View view, AppCompatImageView appCompatImageView, LayerView layerView, TextView textView) {
        this.f27281d = view;
        this.f27282e = appCompatImageView;
        this.f27283f = layerView;
        this.f27284g = textView;
    }

    /* renamed from: a */
    public static C9971n m36573a(View view) {
        int i = C17782g.info_bubble_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.info_bubble_layer_view;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.info_bubble_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C9971n(view, appCompatImageView, layerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9971n m36574c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.item_info_bubble, viewGroup);
            return m36573a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27281d;
    }
}
