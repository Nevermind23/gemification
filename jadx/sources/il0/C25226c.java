package il0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import el0.C20265c;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: il0.c */
public final class C25226c implements C6201a {

    /* renamed from: d */
    private final LayerView f64802d;

    private C25226c(LayerView layerView) {
        this.f64802d = layerView;
    }

    /* renamed from: a */
    public static C25226c m80301a(View view) {
        if (view != null) {
            return new C25226c((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C25226c m80302d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C20265c.item_insurance_polices_footer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80301a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64802d;
    }
}
