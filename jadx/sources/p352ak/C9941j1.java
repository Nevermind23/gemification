package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.j1 */
public final class C9941j1 implements C6201a {

    /* renamed from: d */
    private final LayerView f27134d;

    /* renamed from: e */
    public final AppCompatImageView f27135e;

    private C9941j1(LayerView layerView, AppCompatImageView appCompatImageView) {
        this.f27134d = layerView;
        this.f27135e = appCompatImageView;
    }

    /* renamed from: a */
    public static C9941j1 m36461a(View view) {
        int i = C17782g.button_icon_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C9941j1((LayerView) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9941j1 m36462d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_icon_smal_ovall, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36461a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27134d;
    }
}
