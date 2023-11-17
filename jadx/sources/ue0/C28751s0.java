package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: ue0.s0 */
public final class C28751s0 implements C6201a {

    /* renamed from: d */
    private final LayerView f73456d;

    /* renamed from: e */
    public final EmptyWidget f73457e;

    private C28751s0(LayerView layerView, EmptyWidget emptyWidget) {
        this.f73456d = layerView;
        this.f73457e = emptyWidget;
    }

    /* renamed from: a */
    public static C28751s0 m88132a(View view) {
        int i = C25187g.f64716r4;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            return new C28751s0((LayerView) view, emptyWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28751s0 m88133d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_gt_start_investing_section_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88132a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f73456d;
    }
}
