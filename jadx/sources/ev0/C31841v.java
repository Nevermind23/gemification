package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31205e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ev0.v */
public final class C31841v implements C6201a {

    /* renamed from: d */
    private final LayerView f78545d;

    private C31841v(LayerView layerView) {
        this.f78545d = layerView;
    }

    /* renamed from: a */
    public static C31841v m94153a(View view) {
        if (view != null) {
            return new C31841v((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31841v m94154d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_open_bank_accounts_loading, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94153a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f78545d;
    }
}
