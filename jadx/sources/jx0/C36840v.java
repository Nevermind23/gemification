package jx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import fx0.C32024d;
import fx0.C32025e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: jx0.v */
public final class C36840v implements C6201a {

    /* renamed from: d */
    private final LayerView f88908d;

    /* renamed from: e */
    public final RecyclerView f88909e;

    /* renamed from: f */
    public final TextView f88910f;

    private C36840v(LayerView layerView, RecyclerView recyclerView, TextView textView) {
        this.f88908d = layerView;
        this.f88909e = recyclerView;
        this.f88910f = textView;
    }

    /* renamed from: a */
    public static C36840v m109172a(View view) {
        int i = C32024d.f78852p;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C32024d.f78859x;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                return new C36840v((LayerView) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36840v m109173d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32025e.item_payment_form_element_contacts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m109172a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f88908d;
    }
}
