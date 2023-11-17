package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fx0.C32025e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: jx0.h */
public final class C36823h implements C6201a {

    /* renamed from: d */
    private final LayerView f88863d;

    private C36823h(LayerView layerView) {
        this.f88863d = layerView;
    }

    /* renamed from: a */
    public static C36823h m109104a(View view) {
        if (view != null) {
            return new C36823h((LayerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36823h m109105d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.icon_payment_form_element_amount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109104a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88863d;
    }
}
