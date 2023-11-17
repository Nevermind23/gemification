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

/* renamed from: ak.l3 */
public final class C9959l3 implements C6201a {

    /* renamed from: d */
    private final LayerView f27238d;

    /* renamed from: e */
    public final LayerView f27239e;

    /* renamed from: f */
    public final AppCompatImageView f27240f;

    /* renamed from: g */
    public final AppCompatImageView f27241g;

    private C9959l3(LayerView layerView, LayerView layerView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.f27238d = layerView;
        this.f27239e = layerView2;
        this.f27240f = appCompatImageView;
        this.f27241g = appCompatImageView2;
    }

    /* renamed from: a */
    public static C9959l3 m36526a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C17782g.plus;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.thumbnail;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView2 != null) {
                return new C9959l3(layerView, layerView, appCompatImageView, appCompatImageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9959l3 m36527d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_image_chooser, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36526a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27238d;
    }
}
