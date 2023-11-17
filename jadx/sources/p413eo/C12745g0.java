package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.g0 */
public final class C12745g0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37732d;

    /* renamed from: e */
    public final LayerView f37733e;

    /* renamed from: f */
    public final AppCompatTextView f37734f;

    /* renamed from: g */
    public final AppCompatImageView f37735g;

    /* renamed from: h */
    public final LayerView f37736h;

    /* renamed from: i */
    public final AppCompatTextView f37737i;

    private C12745g0(LayerView layerView, LayerView layerView2, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, LayerView layerView3, AppCompatTextView appCompatTextView2) {
        this.f37732d = layerView;
        this.f37733e = layerView2;
        this.f37734f = appCompatTextView;
        this.f37735g = appCompatImageView;
        this.f37736h = layerView3;
        this.f37737i = appCompatTextView2;
    }

    /* renamed from: a */
    public static C12745g0 m48373a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C10114f.f27938S;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C10114f.f27964m0;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C10114f.layer;
                LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                if (layerView2 != null) {
                    i = C10114f.f27968q1;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        return new C12745g0(layerView, layerView, appCompatTextView, appCompatImageView, layerView2, appCompatTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12745g0 m48374d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_become_solo_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48373a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37732d;
    }
}
