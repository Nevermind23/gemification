package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.o */
public final class C40188o implements C6201a {

    /* renamed from: d */
    private final LayerView f95551d;

    /* renamed from: e */
    public final RecyclerView f95552e;

    /* renamed from: f */
    public final EmptyWidget f95553f;

    private C40188o(LayerView layerView, RecyclerView recyclerView, EmptyWidget emptyWidget) {
        this.f95551d = layerView;
        this.f95552e = recyclerView;
        this.f95553f = emptyWidget;
    }

    /* renamed from: a */
    public static C40188o m116459a(View view) {
        int i = C40030d.contact_inner_recycler;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            i = C40030d.f95123z0;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                return new C40188o((LayerView) view, recyclerView, emptyWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40188o m116460d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_insurance_details_contact_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116459a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f95551d;
    }
}
