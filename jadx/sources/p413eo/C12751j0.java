package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.j0 */
public final class C12751j0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37759d;

    /* renamed from: e */
    public final TwoLineReverseTextItem f37760e;

    /* renamed from: f */
    public final LayerView f37761f;

    /* renamed from: g */
    public final View f37762g;

    private C12751j0(LayerView layerView, TwoLineReverseTextItem twoLineReverseTextItem, LayerView layerView2, View view) {
        this.f37759d = layerView;
        this.f37760e = twoLineReverseTextItem;
        this.f37761f = layerView2;
        this.f37762g = view;
    }

    /* renamed from: a */
    public static C12751j0 m48398a(View view) {
        int i = C10114f.benef_info;
        TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
        if (twoLineReverseTextItem != null) {
            LayerView layerView = (LayerView) view;
            int i2 = C10114f.f27944Y;
            View a = C6202b.m24689a(view, i2);
            if (a != null) {
                return new C12751j0(layerView, twoLineReverseTextItem, layerView, a);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12751j0 m48399d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_benefit_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48398a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37759d;
    }
}
