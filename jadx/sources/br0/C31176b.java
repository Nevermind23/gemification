package br0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import xq0.C39835a;
import xq0.C39836b;

/* renamed from: br0.b */
public final class C31176b implements C6201a {

    /* renamed from: d */
    private final LinearLayout f77442d;

    /* renamed from: e */
    public final Button f77443e;

    /* renamed from: f */
    public final PageDescriptionView f77444f;

    private C31176b(LinearLayout linearLayout, Button button, PageDescriptionView pageDescriptionView) {
        this.f77442d = linearLayout;
        this.f77443e = button;
        this.f77444f = pageDescriptionView;
    }

    /* renamed from: a */
    public static C31176b m92709a(View view) {
        int i = C39835a.add_real_estate_button;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C39835a.f94551e;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                return new C31176b((LinearLayout) view, button, pageDescriptionView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C31176b m92710d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39836b.action_sheet_secured_loan_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92709a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f77442d;
    }
}
