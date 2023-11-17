package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.t */
public final class C16466t implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46612d;

    /* renamed from: e */
    public final PageDescriptionView f46613e;

    /* renamed from: f */
    public final Button f46614f;

    private C16466t(LinearLayout linearLayout, PageDescriptionView pageDescriptionView, Button button) {
        this.f46612d = linearLayout;
        this.f46613e = pageDescriptionView;
        this.f46614f = button;
    }

    /* renamed from: a */
    public static C16466t m58669a(View view) {
        int i = C15526d.f44081p0;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C15526d.f44052G1;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                return new C16466t((LinearLayout) view, pageDescriptionView, button);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16466t m58670d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.item_providers_load_error, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58669a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46612d;
    }
}
