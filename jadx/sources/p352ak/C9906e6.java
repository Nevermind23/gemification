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

/* renamed from: ak.e6 */
public final class C9906e6 implements C6201a {

    /* renamed from: d */
    private final LayerView f26967d;

    /* renamed from: e */
    public final LayerView f26968e;

    /* renamed from: f */
    public final AppCompatImageView f26969f;

    private C9906e6(LayerView layerView, LayerView layerView2, AppCompatImageView appCompatImageView) {
        this.f26967d = layerView;
        this.f26968e = layerView2;
        this.f26969f = appCompatImageView;
    }

    /* renamed from: a */
    public static C9906e6 m36334a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C17782g.thumbnail;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C9906e6(layerView, layerView, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9906e6 m36335d(LayoutInflater layoutInflater) {
        return m36336e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C9906e6 m36336e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_thumbnail_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36334a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f26967d;
    }
}
