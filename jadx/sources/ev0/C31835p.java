package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ev0.p */
public final class C31835p implements C6201a {

    /* renamed from: d */
    private final LayerView f78534d;

    private C31835p(LayerView layerView) {
        this.f78534d = layerView;
    }

    /* renamed from: a */
    public static C31835p m94129a(View view) {
        if (view != null) {
            return new C31835p((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31835p m94130d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_last_operation_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94129a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f78534d;
    }
}
