package il0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import el0.C20264b;
import el0.C20265c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: il0.d */
public final class C25227d implements C6201a {

    /* renamed from: d */
    private final LayerView f64803d;

    /* renamed from: e */
    public final EmptyWidget f64804e;

    private C25227d(LayerView layerView, EmptyWidget emptyWidget) {
        this.f64803d = layerView;
        this.f64804e = emptyWidget;
    }

    /* renamed from: a */
    public static C25227d m80305a(View view) {
        int i = C20264b.f55168m;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            return new C25227d((LayerView) view, emptyWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C25227d m80306d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C20265c.item_insurance_polices_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80305a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64803d;
    }
}
