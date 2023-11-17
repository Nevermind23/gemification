package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36272f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: iy0.z0 */
public final class C36654z0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88474d;

    private C36654z0(LayerView layerView) {
        this.f88474d = layerView;
    }

    /* renamed from: a */
    public static C36654z0 m108750a(View view) {
        if (view != null) {
            return new C36654z0((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36654z0 m108751d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_stud_dep_info_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108750a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88474d;
    }
}
