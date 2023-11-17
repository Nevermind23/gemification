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

/* renamed from: ev0.y */
public final class C31844y implements C6201a {

    /* renamed from: d */
    private final LayerView f78550d;

    /* renamed from: e */
    public final Button f78551e;

    private C31844y(LayerView layerView, Button button) {
        this.f78550d = layerView;
        this.f78551e = button;
    }

    /* renamed from: a */
    public static C31844y m94165a(View view) {
        int i = C31204d.f77520U;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C31844y((LayerView) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31844y m94166d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_operations_paging_page_load_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94165a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f78550d;
    }
}
