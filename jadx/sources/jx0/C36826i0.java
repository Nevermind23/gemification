package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: jx0.i0 */
public final class C36826i0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88868d;

    /* renamed from: e */
    public final AppCompatImageView f88869e;

    private C36826i0(LayerView layerView, AppCompatImageView appCompatImageView) {
        this.f88868d = layerView;
        this.f88869e = appCompatImageView;
    }

    /* renamed from: a */
    public static C36826i0 m109116a(View view) {
        int i = C32024d.f78860y;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C36826i0((LayerView) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36826i0 m109117d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.view_input_end_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109116a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88868d;
    }
}
