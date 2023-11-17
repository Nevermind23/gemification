package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.r6 */
public final class C27413r6 implements C6201a {

    /* renamed from: d */
    private final LayerView f69693d;

    /* renamed from: e */
    public final EmptyWidget f69694e;

    private C27413r6(LayerView layerView, EmptyWidget emptyWidget) {
        this.f69693d = layerView;
        this.f69694e = emptyWidget;
    }

    /* renamed from: a */
    public static C27413r6 m84958a(View view) {
        int i = C10322k.transfer_list_type_header_text;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            return new C27413r6((LayerView) view, emptyWidget);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27413r6 m84959d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_transfer_list_type_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84958a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f69693d;
    }
}
