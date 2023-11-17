package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: iy0.v0 */
public final class C36642v0 implements C6201a {

    /* renamed from: d */
    private final LayerView f88441d;

    /* renamed from: e */
    public final Button f88442e;

    private C36642v0(LayerView layerView, Button button) {
        this.f88441d = layerView;
        this.f88442e = button;
    }

    /* renamed from: a */
    public static C36642v0 m108703a(View view) {
        int i = C36271e.f87506Z1;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C36642v0((LayerView) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36642v0 m108704d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_operations_loading_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108703a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88441d;
    }
}
