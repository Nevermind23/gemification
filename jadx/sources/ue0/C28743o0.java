package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ue0.o0 */
public final class C28743o0 implements C6201a {

    /* renamed from: d */
    private final LayerView f73402d;

    /* renamed from: e */
    public final PageDescriptionView f73403e;

    private C28743o0(LayerView layerView, PageDescriptionView pageDescriptionView) {
        this.f73402d = layerView;
        this.f73403e = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28743o0 m88097a(View view) {
        int i = C25187g.f64683T0;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            return new C28743o0((LayerView) view, pageDescriptionView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28743o0 m88098d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_gt_introduction_slide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88097a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f73402d;
    }
}
