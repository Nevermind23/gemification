package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ev0.r */
public final class C31837r implements C6201a {

    /* renamed from: d */
    private final LayerView f78536d;

    /* renamed from: e */
    public final Button f78537e;

    private C31837r(LayerView layerView, Button button) {
        this.f78536d = layerView;
        this.f78537e = button;
    }

    /* renamed from: a */
    public static C31837r m94137a(View view) {
        int i = C31204d.f77519T;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C31837r((LayerView) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31837r m94138d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_layout_operations_loading_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94137a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f78536d;
    }
}
