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

/* renamed from: ak.b1 */
public final class C9877b1 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f26792d;

    /* renamed from: e */
    public final AppCompatTextView f26793e;

    /* renamed from: f */
    public final AppCompatTextView f26794f;

    /* renamed from: g */
    public final LayerView f26795g;

    /* renamed from: h */
    public final AppCompatImageView f26796h;

    private C9877b1(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LayerView layerView, AppCompatImageView appCompatImageView) {
        this.f26792d = linearLayout;
        this.f26793e = appCompatTextView;
        this.f26794f = appCompatTextView2;
        this.f26795g = layerView;
        this.f26796h = appCompatImageView;
    }

    /* renamed from: a */
    public static C9877b1 m36228a(View view) {
        int i = C17782g.f49703L;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49709N0;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.f49772m4;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C17782g.f49787r4;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                    if (appCompatImageView != null) {
                        return new C9877b1((LinearLayout) view, appCompatTextView, appCompatTextView2, layerView, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9877b1 m36229d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_action_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36228a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f26792d;
    }
}
