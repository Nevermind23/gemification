package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import da0.C19951e;
import da0.C19952f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ha0.y */
public final class C24948y implements C6201a {

    /* renamed from: d */
    private final LayerView f64262d;

    /* renamed from: e */
    public final Button f64263e;

    /* renamed from: f */
    public final InlineFeedback f64264f;

    /* renamed from: g */
    public final PageDescriptionView f64265g;

    private C24948y(LayerView layerView, Button button, InlineFeedback inlineFeedback, PageDescriptionView pageDescriptionView) {
        this.f64262d = layerView;
        this.f64263e = button;
        this.f64264f = inlineFeedback;
        this.f64265g = pageDescriptionView;
    }

    /* renamed from: a */
    public static C24948y m79772a(View view) {
        int i = C19951e.advice_deposit_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C19951e.f54522Y;
            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
            if (inlineFeedback != null) {
                i = C19951e.f54530k0;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    return new C24948y((LayerView) view, button, inlineFeedback, pageDescriptionView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C24948y m79773d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.list_item_deposit_type_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79772a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f64262d;
    }
}
