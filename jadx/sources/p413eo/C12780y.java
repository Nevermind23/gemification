package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.y */
public final class C12780y implements C6201a {

    /* renamed from: d */
    private final LayerView f37892d;

    /* renamed from: e */
    public final TextView f37893e;

    /* renamed from: f */
    public final TextView f37894f;

    private C12780y(LayerView layerView, TextView textView, TextView textView2) {
        this.f37892d = layerView;
        this.f37893e = textView;
        this.f37894f = textView2;
    }

    /* renamed from: a */
    public static C12780y m48519a(View view) {
        int i = C10114f.payment_type_amount;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10114f.payment_type_desc;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                return new C12780y((LayerView) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12780y m48520d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.item_application_first_stage_payment_type_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48519a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37892d;
    }
}
