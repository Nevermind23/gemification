package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25187g;
import ie0.C25188h;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ue0.t0 */
public final class C28753t0 implements C6201a {

    /* renamed from: d */
    private final LayerView f73464d;

    /* renamed from: e */
    public final CheckboxView f73465e;

    /* renamed from: f */
    public final CheckboxView f73466f;

    /* renamed from: g */
    public final PageDescriptionView f73467g;

    private C28753t0(LayerView layerView, CheckboxView checkboxView, CheckboxView checkboxView2, PageDescriptionView pageDescriptionView) {
        this.f73464d = layerView;
        this.f73465e = checkboxView;
        this.f73466f = checkboxView2;
        this.f73467g = pageDescriptionView;
    }

    /* renamed from: a */
    public static C28753t0 m88141a(View view) {
        int i = C25187g.checkbox_agree;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C25187g.checkbox_agree_terms;
            CheckboxView checkboxView2 = (CheckboxView) C6202b.m24689a(view, i);
            if (checkboxView2 != null) {
                i = C25187g.f64683T0;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    return new C28753t0((LayerView) view, checkboxView, checkboxView2, pageDescriptionView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28753t0 m88142d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_gt_start_investing_terms, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88141a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f73464d;
    }
}
