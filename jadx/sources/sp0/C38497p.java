package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: sp0.p */
public final class C38497p implements C6201a {

    /* renamed from: d */
    private final LayerView f92261d;

    /* renamed from: e */
    public final EmptyWidget f92262e;

    private C38497p(LayerView layerView, EmptyWidget emptyWidget) {
        this.f92261d = layerView;
        this.f92262e = emptyWidget;
    }

    /* renamed from: a */
    public static C38497p m113002a(View view) {
        int i = C37439e.f89990P;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            return new C38497p((LayerView) view, emptyWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38497p m113003d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_activation_details_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113002a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f92261d;
    }
}
