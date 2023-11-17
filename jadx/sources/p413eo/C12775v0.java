package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.v0 */
public final class C12775v0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37878d;

    /* renamed from: e */
    public final LinearLayout f37879e;

    private C12775v0(LayerView layerView, LinearLayout linearLayout) {
        this.f37878d = layerView;
        this.f37879e = linearLayout;
    }

    /* renamed from: a */
    public static C12775v0 m48499a(View view) {
        int i = C10114f.f27942X;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            return new C12775v0((LayerView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12775v0 m48500d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_application_result_details, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48499a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37878d;
    }
}
