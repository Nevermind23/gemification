package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.y */
public final class C24918y implements C6201a {

    /* renamed from: d */
    private final LayerView f64075d;

    /* renamed from: e */
    public final Button f64076e;

    /* renamed from: f */
    public final LayerView f64077f;

    /* renamed from: g */
    public final RecyclerView f64078g;

    /* renamed from: h */
    public final TextView f64079h;

    private C24918y(LayerView layerView, Button button, LayerView layerView2, RecyclerView recyclerView, TextView textView) {
        this.f64075d = layerView;
        this.f64076e = button;
        this.f64077f = layerView2;
        this.f64078g = recyclerView;
        this.f64079h = textView;
    }

    /* renamed from: a */
    public static C24918y m79657a(View view) {
        int i = C28606b.add_income_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            LayerView layerView = (LayerView) view;
            i = C28606b.f72613x0;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C28606b.f72585P0;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    return new C24918y(layerView, button, layerView, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24918y m79658d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.item_result_salaries_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79657a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64075d;
    }
}
