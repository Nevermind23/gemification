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

/* renamed from: ak.g1 */
public final class C9917g1 implements C6201a {

    /* renamed from: d */
    private final LayerView f27017d;

    /* renamed from: e */
    public final AppCompatImageView f27018e;

    private C9917g1(LayerView layerView, AppCompatImageView appCompatImageView) {
        this.f27017d = layerView;
        this.f27018e = appCompatImageView;
    }

    /* renamed from: a */
    public static C9917g1 m36376a(View view) {
        int i = C17782g.f49802v2;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            return new C9917g1((LayerView) view, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9917g1 m36377d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_delete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36376a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f27017d;
    }
}
