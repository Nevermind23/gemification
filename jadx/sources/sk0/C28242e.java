package sk0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ok0.C27030f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: sk0.e */
public final class C28242e implements C6201a {

    /* renamed from: d */
    private final LayerView f71658d;

    /* renamed from: e */
    public final LayerView f71659e;

    private C28242e(LayerView layerView, LayerView layerView2) {
        this.f71658d = layerView;
        this.f71659e = layerView2;
    }

    /* renamed from: a */
    public static C28242e m86790a(View view) {
        if (view != null) {
            LayerView layerView = (LayerView) view;
            return new C28242e(layerView, layerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28242e m86791d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27030f.item_list_search_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m86790a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f71658d;
    }
}
