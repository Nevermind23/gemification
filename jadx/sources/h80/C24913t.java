package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.t */
public final class C24913t implements C6201a {

    /* renamed from: d */
    private final LayerView f64057d;

    /* renamed from: e */
    public final TextGroupView f64058e;

    /* renamed from: f */
    public final TextGroupView f64059f;

    /* renamed from: g */
    public final LinearLayout f64060g;

    private C24913t(LayerView layerView, TextGroupView textGroupView, TextGroupView textGroupView2, LinearLayout linearLayout) {
        this.f64057d = layerView;
        this.f64058e = textGroupView;
        this.f64059f = textGroupView2;
        this.f64060g = linearLayout;
    }

    /* renamed from: a */
    public static C24913t m79637a(View view) {
        int i = C28606b.offer_amount;
        TextGroupView textGroupView = (TextGroupView) C6202b.m24689a(view, i);
        if (textGroupView != null) {
            i = C28606b.requested_amount;
            TextGroupView textGroupView2 = (TextGroupView) C6202b.m24689a(view, i);
            if (textGroupView2 != null) {
                i = C28606b.f72583O0;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    return new C24913t((LayerView) view, textGroupView, textGroupView2, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24913t m79638d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.item_result_loan_amount_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79637a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64057d;
    }
}
