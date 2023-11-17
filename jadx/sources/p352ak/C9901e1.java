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

/* renamed from: ak.e1 */
public final class C9901e1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f26924d;

    /* renamed from: e */
    public final AppCompatTextView f26925e;

    /* renamed from: f */
    public final AppCompatTextView f26926f;

    /* renamed from: g */
    public final AppCompatImageView f26927g;

    /* renamed from: h */
    public final LayerView f26928h;

    private C9901e1(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, AppCompatImageView appCompatImageView, LayerView layerView) {
        this.f26924d = constraintLayout;
        this.f26925e = appCompatTextView;
        this.f26926f = appCompatTextView2;
        this.f26927g = appCompatImageView;
        this.f26928h = layerView;
    }

    /* renamed from: a */
    public static C9901e1 m36317a(View view) {
        int i = C17782g.f49703L;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49709N0;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C17782g.f49744Y3;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.f49767j5;
                    LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                    if (layerView != null) {
                        return new C9901e1((ConstraintLayout) view, appCompatTextView, appCompatTextView2, appCompatImageView, layerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9901e1 m36318d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_close_action_icon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36317a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f26924d;
    }
}
