package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: iy0.u0 */
public final class C36639u0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88435d;

    private C36639u0(LayerView layerView) {
        this.f88435d = layerView;
    }

    /* renamed from: a */
    public static C36639u0 m108691a(View view) {
        if (view != null) {
            return new C36639u0((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36639u0 m108692d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_operations_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108691a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88435d;
    }
}
