package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p480jl.C16214e;

/* renamed from: nl.s */
public final class C17066s implements C6201a {

    /* renamed from: d */
    private final LayerView f47672d;

    private C17066s(LayerView layerView) {
        this.f47672d = layerView;
    }

    /* renamed from: a */
    public static C17066s m59970a(View view) {
        if (view != null) {
            return new C17066s((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C17066s m59971d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_schedule_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59970a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f47672d;
    }
}
