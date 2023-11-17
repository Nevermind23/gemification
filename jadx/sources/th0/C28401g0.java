package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27010e;
import oh0.C27011f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: th0.g0 */
public final class C28401g0 implements C6201a {

    /* renamed from: d */
    private final LayerView f72024d;

    /* renamed from: e */
    public final LayerView f72025e;

    /* renamed from: f */
    public final PageDescriptionView f72026f;

    /* renamed from: g */
    public final EmptyWidget f72027g;

    private C28401g0(LayerView layerView, LayerView layerView2, PageDescriptionView pageDescriptionView, EmptyWidget emptyWidget) {
        this.f72024d = layerView;
        this.f72025e = layerView2;
        this.f72026f = pageDescriptionView;
        this.f72027g = emptyWidget;
    }

    /* renamed from: a */
    public static C28401g0 m87125a(View view) {
        LayerView layerView = (LayerView) view;
        int i = C27010e.empty_transactions_page_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C27010e.empty_transactions_widget;
            EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
            if (emptyWidget != null) {
                return new C28401g0(layerView, layerView, pageDescriptionView, emptyWidget);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28401g0 m87126d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_gift_card_empty_transaction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87125a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f72024d;
    }
}
