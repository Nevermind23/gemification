package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: iy0.m0 */
public final class C36615m0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88328d;

    private C36615m0(LayerView layerView) {
        this.f88328d = layerView;
    }

    /* renamed from: a */
    public static C36615m0 m108593a(View view) {
        if (view != null) {
            return new C36615m0((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36615m0 m108594d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_linked_loans_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108593a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88328d;
    }
}
