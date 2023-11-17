package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: iy0.a0 */
public final class C36579a0 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f88139d;

    /* renamed from: e */
    public final Button f88140e;

    private C36579a0(LinearLayout linearLayout, Button button) {
        this.f88139d = linearLayout;
        this.f88140e = button;
    }

    /* renamed from: a */
    public static C36579a0 m108441a(View view) {
        int i = C36271e.f87505Y1;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            return new C36579a0((LinearLayout) view, button);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36579a0 m108442d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.grid_item_products_loading_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108441a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f88139d;
    }
}
