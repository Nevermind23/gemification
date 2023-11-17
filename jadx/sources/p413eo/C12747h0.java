package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.accordion.CheckBoxAccordionView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.h0 */
public final class C12747h0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37741d;

    /* renamed from: e */
    public final CheckBoxAccordionView f37742e;

    /* renamed from: f */
    public final LayerView f37743f;

    private C12747h0(LayerView layerView, CheckBoxAccordionView checkBoxAccordionView, LayerView layerView2) {
        this.f37741d = layerView;
        this.f37742e = checkBoxAccordionView;
        this.f37743f = layerView2;
    }

    /* renamed from: a */
    public static C12747h0 m48382a(View view) {
        int i = C10114f.accordion;
        CheckBoxAccordionView checkBoxAccordionView = (CheckBoxAccordionView) C6202b.m24689a(view, i);
        if (checkBoxAccordionView != null) {
            LayerView layerView = (LayerView) view;
            return new C12747h0(layerView, checkBoxAccordionView, layerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12747h0 m48383d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_benefit_accrodion, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48382a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37741d;
    }
}
