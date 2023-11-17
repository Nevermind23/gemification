package p536nl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ExpandableItemView;
import p480jl.C16213d;
import p480jl.C16214e;

/* renamed from: nl.q */
public final class C17064q implements C6201a {

    /* renamed from: d */
    private final LayerView f47667d;

    /* renamed from: e */
    public final ExpandableItemView f47668e;

    private C17064q(LayerView layerView, ExpandableItemView expandableItemView) {
        this.f47667d = layerView;
        this.f47668e = expandableItemView;
    }

    /* renamed from: a */
    public static C17064q m59962a(View view) {
        int i = C16213d.expandable_item;
        ExpandableItemView expandableItemView = (ExpandableItemView) C6202b.m24689a(view, i);
        if (expandableItemView != null) {
            return new C17064q((LayerView) view, expandableItemView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17064q m59963d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16214e.item_bnpl_schedule_expandable, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m59962a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f47667d;
    }
}
