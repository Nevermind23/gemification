package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import np0.C37440f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: sp0.o */
public final class C38496o implements C6201a {

    /* renamed from: d */
    private final LayerView f92260d;

    private C38496o(LayerView layerView) {
        this.f92260d = layerView;
    }

    /* renamed from: a */
    public static C38496o m112998a(View view) {
        if (view != null) {
            return new C38496o((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C38496o m112999d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_activation_details_bottom_border, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m112998a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f92260d;
    }
}
