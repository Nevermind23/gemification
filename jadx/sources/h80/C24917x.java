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

/* renamed from: h80.x */
public final class C24917x implements C6201a {

    /* renamed from: d */
    private final LayerView f64073d;

    /* renamed from: e */
    public final Button f64074e;

    private C24917x(LayerView layerView, Button button) {
        this.f64073d = layerView;
        this.f64074e = button;
    }

    /* renamed from: a */
    public static C24917x m79653a(View view) {
        int i = C28606b.f72606r;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C24917x((LayerView) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24917x m79654d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.item_result_primary_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79653a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64073d;
    }
}
