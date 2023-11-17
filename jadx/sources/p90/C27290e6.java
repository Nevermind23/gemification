package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.e6 */
public final class C27290e6 implements C6201a {

    /* renamed from: d */
    private final LayerView f68652d;

    /* renamed from: e */
    public final RecyclerView f68653e;

    /* renamed from: f */
    public final EmptyWidget f68654f;

    private C27290e6(LayerView layerView, RecyclerView recyclerView, EmptyWidget emptyWidget) {
        this.f68652d = layerView;
        this.f68653e = recyclerView;
        this.f68654f = emptyWidget;
    }

    /* renamed from: a */
    public static C27290e6 m84461a(View view) {
        int i = C10322k.nbo_content_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C10322k.nbo_content_title;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                return new C27290e6((LayerView) view, recyclerView, emptyWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27290e6 m84462d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_nbo_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84461a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f68652d;
    }
}
