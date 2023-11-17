package h80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import u70.C28606b;
import u70.C28607c;

/* renamed from: h80.s */
public final class C24912s implements C6201a {

    /* renamed from: d */
    private final LayerView f64053d;

    /* renamed from: e */
    public final LayerView f64054e;

    /* renamed from: f */
    public final TextView f64055f;

    /* renamed from: g */
    public final PageState f64056g;

    private C24912s(LayerView layerView, LayerView layerView2, TextView textView, PageState pageState) {
        this.f64053d = layerView;
        this.f64054e = layerView2;
        this.f64055f = textView;
        this.f64056g = pageState;
    }

    /* renamed from: a */
    public static C24912s m79633a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C28606b.f72566A;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C28606b.f72603n0;
            PageState pageState = (PageState) C6202b.m24689a(view, i);
            if (pageState != null) {
                return new C24912s(layerView, layerView, textView, pageState);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24912s m79634d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28607c.item_result_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79633a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64053d;
    }
}
