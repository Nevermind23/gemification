package il0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import el0.C20264b;
import el0.C20265c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: il0.e */
public final class C25228e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64805d;

    /* renamed from: e */
    public final PageDescriptionView f64806e;

    /* renamed from: f */
    public final Button f64807f;

    private C25228e(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, Button button) {
        this.f64805d = linearLayout;
        this.f64806e = pageDescriptionView;
        this.f64807f = button;
    }

    /* renamed from: a */
    public static C25228e m80309a(View view) {
        int i = C20264b.error_desc;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C20264b.f55165j;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C25228e((LinearLayout) view, pageDescriptionView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C25228e m80310d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C20265c.item_insurance_polices_reload, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80309a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64805d;
    }
}
