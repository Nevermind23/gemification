package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: iy0.t0 */
public final class C36636t0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88430d;

    private C36636t0(LayerView layerView) {
        this.f88430d = layerView;
    }

    /* renamed from: a */
    public static C36636t0 m108679a(View view) {
        if (view != null) {
            return new C36636t0((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36636t0 m108680d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_operations_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108679a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88430d;
    }
}
