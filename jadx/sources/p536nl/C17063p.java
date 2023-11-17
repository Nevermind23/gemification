package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p480jl.C16214e;

/* renamed from: nl.p */
public final class C17063p implements C6201a {

    /* renamed from: d */
    private final LayerView f47666d;

    private C17063p(LayerView layerView) {
        this.f47666d = layerView;
    }

    /* renamed from: a */
    public static C17063p m59958a(View view) {
        if (view != null) {
            return new C17063p((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C17063p m59959d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_schedule_bottom_layer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59958a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f47666d;
    }
}
