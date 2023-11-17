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

/* renamed from: ak.x1 */
public final class C10045x1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f27723d;

    /* renamed from: e */
    public final AppCompatImageView f27724e;

    /* renamed from: f */
    public final LayerView f27725f;

    /* renamed from: g */
    public final AppCompatTextView f27726g;

    private C10045x1(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LayerView layerView, AppCompatTextView appCompatTextView) {
        this.f27723d = linearLayout;
        this.f27724e = appCompatImageView;
        this.f27725f = layerView;
        this.f27726g = appCompatTextView;
    }

    /* renamed from: a */
    public static C10045x1 m36843a(View view) {
        int i = C17782g.button_swipe_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C17782g.button_swipe_layer_view;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C17782g.button_swipe_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    return new C10045x1((LinearLayout) view, appCompatImageView, layerView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10045x1 m36844d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_swipe, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36843a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f27723d;
    }
}
