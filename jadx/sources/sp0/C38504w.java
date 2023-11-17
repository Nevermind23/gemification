package sp0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import np0.C37439e;
import np0.C37440f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;

/* renamed from: sp0.w */
public final class C38504w implements C6201a {

    /* renamed from: d */
    private final LayerView f92296d;

    /* renamed from: e */
    public final EmptyWidget f92297e;

    /* renamed from: f */
    public final TextImageCardView f92298f;

    private C38504w(LayerView layerView, EmptyWidget emptyWidget, TextImageCardView textImageCardView) {
        this.f92296d = layerView;
        this.f92297e = emptyWidget;
        this.f92298f = textImageCardView;
    }

    /* renamed from: a */
    public static C38504w m113030a(View view) {
        int i = C37439e.f89990P;
        EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
        if (emptyWidget != null) {
            i = C37439e.offer_card;
            TextImageCardView textImageCardView = (TextImageCardView) C6202b.m24689a(view, i);
            if (textImageCardView != null) {
                return new C38504w((LayerView) view, emptyWidget, textImageCardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C38504w m113031d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37440f.item_offer_loan_subtype, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m113030a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f92296d;
    }
}
