package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ue0.r0 */
public final class C28749r0 implements C6201a {

    /* renamed from: d */
    private final LayerView f73448d;

    private C28749r0(LayerView layerView) {
        this.f73448d = layerView;
    }

    /* renamed from: a */
    public static C28749r0 m88123a(View view) {
        if (view != null) {
            return new C28749r0((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28749r0 m88124d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_gt_start_investing_section_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88123a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f73448d;
    }
}
