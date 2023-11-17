package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.x0 */
public final class C12779x0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37889d;

    /* renamed from: e */
    public final EmptyWidget f37890e;

    /* renamed from: f */
    public final RecyclerView f37891f;

    private C12779x0(LayerView layerView, EmptyWidget emptyWidget, RecyclerView recyclerView) {
        this.f37889d = layerView;
        this.f37890e = emptyWidget;
        this.f37891f = recyclerView;
    }

    /* renamed from: a */
    public static C12779x0 m48515a(View view) {
        int i = C10114f.f27962l0;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C10114f.f27950c1;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C12779x0((LayerView) view, emptyWidget, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12779x0 m48516d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_benefits_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48515a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37889d;
    }
}
