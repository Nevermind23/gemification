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

/* renamed from: eo.x */
public final class C12778x implements C6201a {

    /* renamed from: d */
    private final LayerView f37887d;

    /* renamed from: e */
    public final LinearLayout f37888e;

    private C12778x(LayerView layerView, LinearLayout linearLayout) {
        this.f37887d = layerView;
        this.f37888e = linearLayout;
    }

    /* renamed from: a */
    public static C12778x m48511a(View view) {
        int i = C10114f.f27932O;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            return new C12778x((LayerView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12778x m48512d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_application_first_stage_payment_type_choice, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48511a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37887d;
    }
}
