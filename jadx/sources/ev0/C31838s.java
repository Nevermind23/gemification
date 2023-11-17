package ev0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bv0.C31204d;
import bv0.C31205e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ev0.s */
public final class C31838s implements C6201a {

    /* renamed from: d */
    private final LayerView f78538d;

    /* renamed from: e */
    public final PageDescriptionView f78539e;

    private C31838s(LayerView layerView, PageDescriptionView pageDescriptionView) {
        this.f78538d = layerView;
        this.f78539e = pageDescriptionView;
    }

    /* renamed from: a */
    public static C31838s m94141a(View view) {
        int i = C31204d.f77516Q;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            return new C31838s((LayerView) view, pageDescriptionView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31838s m94142d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31205e.item_layout_operations_permission_denied, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94141a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f78538d;
    }
}
