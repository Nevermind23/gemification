package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.z4 */
public final class C10062z4 implements C6201a {

    /* renamed from: d */
    private final LayerView f27817d;

    /* renamed from: e */
    public final AppCompatImageView f27818e;

    /* renamed from: f */
    public final AppCompatImageView f27819f;

    /* renamed from: g */
    public final LayerView f27820g;

    /* renamed from: h */
    public final AppCompatTextView f27821h;

    private C10062z4(LayerView layerView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LayerView layerView2, AppCompatTextView appCompatTextView) {
        this.f27817d = layerView;
        this.f27818e = appCompatImageView;
        this.f27819f = appCompatImageView2;
        this.f27820g = layerView2;
        this.f27821h = appCompatTextView;
    }

    /* renamed from: a */
    public static C10062z4 m36907a(View view) {
        int i = C17782g.left_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.f49770k7;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView2 != null) {
                LayerView layerView = (LayerView) view;
                i = C17782g.f49681D8;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    return new C10062z4(layerView, appCompatImageView, appCompatImageView2, layerView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10062z4 m36908d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_rectangle_small_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36907a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27817d;
    }
}
