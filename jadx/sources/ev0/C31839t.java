package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;

/* renamed from: ev0.t */
public final class C31839t implements C6201a {

    /* renamed from: d */
    private final LayerView f78540d;

    /* renamed from: e */
    public final View f78541e;

    /* renamed from: f */
    public final TwoLineTextItem f78542f;

    private C31839t(LayerView layerView, View view, TwoLineTextItem twoLineTextItem) {
        this.f78540d = layerView;
        this.f78541e = view;
        this.f78542f = twoLineTextItem;
    }

    /* renamed from: a */
    public static C31839t m94145a(View view) {
        int i = C31204d.f77521V;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            i = C31204d.two_line_item;
            TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem != null) {
                return new C31839t((LayerView) view, a, twoLineTextItem);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31839t m94146d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_open_bank_account, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94145a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f78540d;
    }
}
