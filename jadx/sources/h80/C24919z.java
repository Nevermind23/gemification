package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.z */
public final class C24919z implements C6201a {

    /* renamed from: d */
    private final LayerView f64080d;

    /* renamed from: e */
    public final Button f64081e;

    private C24919z(LayerView layerView, Button button) {
        this.f64080d = layerView;
        this.f64081e = button;
    }

    /* renamed from: a */
    public static C24919z m79661a(View view) {
        int i = C28606b.f72599i;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C24919z((LayerView) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24919z m79662d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.item_result_secondary_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79661a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64080d;
    }
}
