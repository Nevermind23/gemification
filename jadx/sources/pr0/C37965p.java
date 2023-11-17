package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import lr0.C37131f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: pr0.p */
public final class C37965p implements C6201a {

    /* renamed from: d */
    private final LayerView f91244d;

    /* renamed from: e */
    public final LayerView f91245e;

    private C37965p(LayerView layerView, LayerView layerView2) {
        this.f91244d = layerView;
        this.f91245e = layerView2;
    }

    /* renamed from: a */
    public static C37965p m111605a(View view) {
        if (view != null) {
            LayerView layerView = (LayerView) view;
            return new C37965p(layerView, layerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C37965p m111606d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.item_loan_history_schedule_layer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111605a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f91244d;
    }
}
