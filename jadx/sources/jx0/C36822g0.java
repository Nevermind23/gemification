package jx0;

import android.view.View;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: jx0.g0 */
public final class C36822g0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88861d;

    /* renamed from: e */
    public final LayerView f88862e;

    private C36822g0(LayerView layerView, LayerView layerView2) {
        this.f88861d = layerView;
        this.f88862e = layerView2;
    }

    /* renamed from: a */
    public static C36822g0 m109101a(View view) {
        if (view != null) {
            LayerView layerView = (LayerView) view;
            return new C36822g0(layerView, layerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88861d;
    }
}
