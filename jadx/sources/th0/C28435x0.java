package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: th0.x0 */
public final class C28435x0 implements C6201a {

    /* renamed from: d */
    private final LayerView f72232d;

    /* renamed from: e */
    public final LayerView f72233e;

    private C28435x0(LayerView layerView, LayerView layerView2) {
        this.f72232d = layerView;
        this.f72233e = layerView2;
    }

    /* renamed from: a */
    public static C28435x0 m87263a(View view) {
        if (view != null) {
            LayerView layerView = (LayerView) view;
            return new C28435x0(layerView, layerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28435x0 m87264d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_transaction_bottom_layer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87263a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f72232d;
    }
}
