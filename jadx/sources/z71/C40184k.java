package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.toggle.ToggleView;
import y71.C40030d;
import y71.C40031e;

/* renamed from: z71.k */
public final class C40184k implements C6201a {

    /* renamed from: d */
    private final LinearLayout f95537d;

    /* renamed from: e */
    public final TwoLineReverseTextItem f95538e;

    /* renamed from: f */
    public final LayerView f95539f;

    /* renamed from: g */
    public final ListItem f95540g;

    /* renamed from: h */
    public final ToggleView f95541h;

    /* renamed from: i */
    public final PageDescriptionView f95542i;

    private C40184k(LinearLayout linearLayout, TwoLineReverseTextItem twoLineReverseTextItem, LayerView layerView, ListItem listItem, ToggleView toggleView, PageDescriptionView pageDescriptionView) {
        this.f95537d = linearLayout;
        this.f95538e = twoLineReverseTextItem;
        this.f95539f = layerView;
        this.f95540g = listItem;
        this.f95541h = toggleView;
        this.f95542i = pageDescriptionView;
    }

    /* renamed from: a */
    public static C40184k m116443a(View view) {
        int i = C40030d.additional_insurance_text;
        TwoLineReverseTextItem twoLineReverseTextItem = (TwoLineReverseTextItem) C6202b.m24689a(view, i);
        if (twoLineReverseTextItem != null) {
            i = C40030d.choose_additional_insurance_layer;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C40030d.f95094S;
                ListItem listItem = (ListItem) C6202b.m24689a(view, i);
                if (listItem != null) {
                    i = C40030d.f95089A0;
                    ToggleView toggleView = (ToggleView) C6202b.m24689a(view, i);
                    if (toggleView != null) {
                        i = C40030d.travel_insurance_page_description_view;
                        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                        if (pageDescriptionView != null) {
                            return new C40184k((LinearLayout) view, twoLineReverseTextItem, layerView, listItem, toggleView, pageDescriptionView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C40184k m116444d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_header_insurance_providers, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116443a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f95537d;
    }
}
