package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ue0.b1 */
public final class C28714b1 implements C6201a {

    /* renamed from: d */
    private final LayerView f73142d;

    private C28714b1(LayerView layerView) {
        this.f73142d = layerView;
    }

    /* renamed from: a */
    public static C28714b1 m87973a(View view) {
        if (view != null) {
            return new C28714b1((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28714b1 m87974d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.layout_search_symbol_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87973a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f73142d;
    }
}
