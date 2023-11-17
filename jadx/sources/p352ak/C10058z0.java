package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.z0 */
public final class C10058z0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27793d;

    /* renamed from: e */
    public final AppCompatImageView f27794e;

    /* renamed from: f */
    public final AppCompatTextView f27795f;

    /* renamed from: g */
    public final LayerView f27796g;

    private C10058z0(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, LayerView layerView) {
        this.f27793d = linearLayout;
        this.f27794e = appCompatImageView;
        this.f27795f = appCompatTextView;
        this.f27796g = layerView;
    }

    /* renamed from: a */
    public static C10058z0 m36893a(View view) {
        int i = C17782g.f49762h;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.action_type_text;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.f49772m4;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    return new C10058z0((LinearLayout) view, appCompatImageView, appCompatTextView, layerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10058z0 m36894d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_action, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36893a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27793d;
    }
}
