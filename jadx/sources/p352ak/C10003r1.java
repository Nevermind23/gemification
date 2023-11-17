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

/* renamed from: ak.r1 */
public final class C10003r1 implements C6201a {

    /* renamed from: d */
    private final LayerView f27458d;

    /* renamed from: e */
    public final AppCompatImageView f27459e;

    private C10003r1(LayerView layerView, AppCompatImageView appCompatImageView) {
        this.f27458d = layerView;
        this.f27459e = appCompatImageView;
    }

    /* renamed from: a */
    public static C10003r1 m36688a(View view) {
        int i = C17782g.button_icon_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C10003r1((LayerView) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10003r1 m36689d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_smal_ovall_thumbnail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36688a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27458d;
    }
}
