package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.j3 */
public final class C9943j3 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27144d;

    /* renamed from: e */
    public final LayerView f27145e;

    /* renamed from: f */
    public final ConstraintLayout f27146f;

    /* renamed from: g */
    public final AppCompatImageView f27147g;

    /* renamed from: h */
    public final AppCompatTextView f27148h;

    private C9943j3(ConstraintLayout constraintLayout, LayerView layerView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f27144d = constraintLayout;
        this.f27145e = layerView;
        this.f27146f = constraintLayout2;
        this.f27147g = appCompatImageView;
        this.f27148h = appCompatTextView;
    }

    /* renamed from: a */
    public static C9943j3 m36468a(View view) {
        int i = C17782g.hub_background;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = C17782g.hub_icon;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.hub_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    return new C9943j3(constraintLayout, layerView, constraintLayout, appCompatImageView, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9943j3 m36469d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_hub_action_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36468a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27144d;
    }
}
