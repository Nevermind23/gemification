package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: iy0.s0 */
public final class C36633s0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88415d;

    private C36633s0(LayerView layerView) {
        this.f88415d = layerView;
    }

    /* renamed from: a */
    public static C36633s0 m108667a(View view) {
        if (view != null) {
            return new C36633s0((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36633s0 m108668d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_operations_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108667a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88415d;
    }
}
