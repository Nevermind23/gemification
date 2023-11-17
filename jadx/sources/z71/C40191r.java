package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.r */
public final class C40191r implements C6201a {

    /* renamed from: d */
    private final LayerView f95558d;

    /* renamed from: e */
    public final TwoLineTextItem f95559e;

    /* renamed from: f */
    public final TwoLineTextItem f95560f;

    /* renamed from: g */
    public final EmptyWidget f95561g;

    private C40191r(LayerView layerView, TwoLineTextItem twoLineTextItem, TwoLineTextItem twoLineTextItem2, EmptyWidget emptyWidget) {
        this.f95558d = layerView;
        this.f95559e = twoLineTextItem;
        this.f95560f = twoLineTextItem2;
        this.f95561g = emptyWidget;
    }

    /* renamed from: a */
    public static C40191r m116471a(View view) {
        int i = C40030d.f95097W;
        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view, i);
        if (twoLineTextItem != null) {
            i = C40030d.personal_number;
            TwoLineTextItem twoLineTextItem2 = (TwoLineTextItem) C6202b.m24689a(view, i);
            if (twoLineTextItem2 != null) {
                i = C40030d.f95123z0;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                if (emptyWidget != null) {
                    return new C40191r((LayerView) view, twoLineTextItem, twoLineTextItem2, emptyWidget);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40191r m116472d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_insurance_details_personal_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116471a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f95558d;
    }
}
