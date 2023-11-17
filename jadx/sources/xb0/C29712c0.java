package xb0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import rb0.C27985d;

/* renamed from: xb0.c0 */
public final class C29712c0 implements C6201a {

    /* renamed from: d */
    private final LayerView f74984d;

    /* renamed from: e */
    public final EmptyWidget f74985e;

    /* renamed from: f */
    public final RecyclerView f74986f;

    private C29712c0(LayerView layerView, EmptyWidget emptyWidget, RecyclerView recyclerView) {
        this.f74984d = layerView;
        this.f74985e = emptyWidget;
        this.f74986f = recyclerView;
    }

    /* renamed from: a */
    public static C29712c0 m90214a(View view) {
        int i = C27985d.f71271V;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C27985d.f71273Y;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C29712c0((LayerView) view, emptyWidget, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f74984d;
    }
}
