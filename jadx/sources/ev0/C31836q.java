package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ev0.q */
public final class C31836q implements C6201a {

    /* renamed from: d */
    private final LayerView f78535d;

    private C31836q(LayerView layerView) {
        this.f78535d = layerView;
    }

    /* renamed from: a */
    public static C31836q m94133a(View view) {
        if (view != null) {
            return new C31836q((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31836q m94134d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_layout_no_operations, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94133a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f78535d;
    }
}
